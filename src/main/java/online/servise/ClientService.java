package online.servise;

import lombok.RequiredArgsConstructor;
import online.entity.*;
import online.dto.*;
import online.repository.RoleRepository;
import online.repository.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final RoleRepository roleRepository;

    @Transactional
    public ResponseEntity<?> register(ClientRegisterDTO clientRegisterDTO, Long number) {

        if (userRepository.existsByEmail(clientRegisterDTO.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }
        User user = new User(
                clientRegisterDTO.getEmail(),
                encoder.encode(clientRegisterDTO.getPassword()));

        user.setFullName(clientRegisterDTO.getFullName());
        user.setRole(roleRepository.findById(number).get());

        Basket basket1 = new Basket();
        basket1.setUser(user);
        user.setBasket(basket1);
        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponse(
                String.format("User with email %s registered successfully!", user.getEmail())));
    }

}
