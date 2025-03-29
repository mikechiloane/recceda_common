package com.recceda.common.request.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSendEmailRequest {
    private String to;
    private String subject;
    private String body;
}
