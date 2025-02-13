package org.karrabo.notification.sercvices.email;

import org.karrabo.notification.datas.dto.request.EmailRequest;
import org.karrabo.notification.datas.dto.response.EmailResponse;
import org.karrabo.notification.exceptions.EmailServiceException;

public interface EmailService {
    EmailResponse sendMail(EmailRequest request) throws EmailServiceException;

}
