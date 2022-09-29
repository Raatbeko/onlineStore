package online.servise;

import online.dto.ClientRegisterDTO;
import org.springframework.http.ResponseEntity;

public interface ClientService {
    ResponseEntity<?> register(ClientRegisterDTO clientRegisterDTO, Long number);
}
