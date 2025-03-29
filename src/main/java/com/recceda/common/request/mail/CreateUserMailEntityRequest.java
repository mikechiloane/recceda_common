package com.recceda.common.request.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserMailEntityRequest {
    private String name;
    private String username;
    private String smtpHost;
    private String smtpPort;
    private String email;
    private String password;
}
