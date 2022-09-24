package online.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class ClientRegisterDTO {

    @NotBlank
    private String email;
    @NotBlank
    private String fullName;
    @NotBlank
    private String password;

}
