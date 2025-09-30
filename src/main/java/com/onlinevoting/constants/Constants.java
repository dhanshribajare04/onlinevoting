package com.onlinevoting.constants;

public interface Constants {

     static final String USER_NOT_FOUND = "User not found with email: ";
     static final String OTP_ALREADY_SENT = "Otp already sent please check your email to login.";
     static final String OTP_EXPIRED = "Otp expired please generate a new one.";
     static final String USER_NOT_ACTIVE = "User not active please contact admin.";
     static final String OTP_SENT_SUCCESS = "Otp sent successfully to your email.";
     static final String USER_LOGIN_SUCCESS = "User logged in successfully.";
     static final String USER_NOT_ACTIVE_MESSAGE = "Your account has been created but is not yet active. Please wait for document verification and officer approval. Your account will be activated within 24 hours after approval.";
     static final String USER_REGISTRATION_TEMPLATE = "user_create_success.ftl";
     static final String SUBJECT = "Registration Successful";
     static final String INVALID_OTP = "No valid OTP found for user %s ";
     static final String USER_ALREADY_EXIST = "User with account for email %s already exists.";
     static final String USER_DOES_NOT_EXIST = "User with account for ID %s does not exist.";
     static final String USER_NOT_FOUND_WITH_EMAILID = "User not found with email ID: %s";
}
