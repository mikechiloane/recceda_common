package com.recceda.common.request.form;

import lombok.Data;

import java.util.List;

@Data
public class CreateFormRequest {

    private String formName;
    private List<FormFieldRequest> fields;

    @Data
    public static class FormFieldRequest {

        private String fieldName;
        private String fieldType;
        private String label;
        private String regex;
        private String placeholder;
        private boolean required;
        private List<String> options;
        private String defaultValue;

    }
}