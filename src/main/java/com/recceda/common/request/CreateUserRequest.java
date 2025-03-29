package com.recceda.common.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class CreateUserRequest {

    @NotBlank
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String password;

}

