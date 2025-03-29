package com.recceda.common.response.form;

import com.recceda.common.form.FormField;
import lombok.Data;

import java.util.List;

@Data
public class FormResponse {
    private String formId;
    private String formName;
    private List<FormField> fields;

}
