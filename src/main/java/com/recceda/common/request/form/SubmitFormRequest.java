package com.recceda.common.request.form;


import com.recceda.common.form.FormField;
import lombok.Data;

import java.util.List;

@Data
public class SubmitFormRequest {
    private List<FormField> fields;
    private String formId;
}
