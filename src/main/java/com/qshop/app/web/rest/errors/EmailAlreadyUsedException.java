package com.qshop.app.web.rest.errors;

public class EmailAlreadyUsedException extends BadRequestAlertException {

    public EmailAlreadyUsedException() {
        super("Email is already in use!", "userManagement", "emailexists");
    }
}
