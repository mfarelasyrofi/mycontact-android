package com.farel.mycontact.model;

import java.util.List;

public class ResponseData {
    public String value;
    public  String message;
    public List<Contact> result;

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public List<Contact> getResult() {
        return result;
    }
}
