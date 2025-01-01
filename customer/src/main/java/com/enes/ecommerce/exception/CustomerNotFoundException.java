package com.enes.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;

    public CustomerNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
