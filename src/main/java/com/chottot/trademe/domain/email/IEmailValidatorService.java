package com.chottot.trademe.domain.email;

import org.springframework.stereotype.Service;

@Service
public interface IEmailValidatorService {

    boolean isEmailAddressValid(EmailAddress emailAddress);

}
