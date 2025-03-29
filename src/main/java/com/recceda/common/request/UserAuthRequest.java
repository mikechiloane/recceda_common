package com.recceda.common.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserAuthRequest {

    private String email;
    private String password;
}
