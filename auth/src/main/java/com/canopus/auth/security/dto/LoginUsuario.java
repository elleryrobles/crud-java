package com.canopus.auth.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUsuario {
    @NotBlank
    private String nombreUsuario;

    @NotBlank
    private String password;
}
