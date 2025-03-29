package com.recceda.common.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TokenRequest {
    private String password;
    private String email;
}
