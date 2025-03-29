package com.recceda.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class TokenResponse {

    @NotBlank
    private String key;

    @NotBlank
    private String secret;
}
