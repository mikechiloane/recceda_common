package com.recceda.common.form;

import lombok.Data;

import java.util.List;

@Data
public class FormField {

    private String fieldId;
    private String fieldName;
    private FieldType fieldType;
    private String label;
    private String regex;
    private String placeholder;
    private boolean required;
    private List<String> options;
    private String defaultValue;
    private String value;

}