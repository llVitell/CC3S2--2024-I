package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {
    Printer printer = new Printer();
    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailDetails details) {
        printer.showInfo("Sending email to: " + details.getRecipientEmail());
        return new ResponseEntity<>("Email sent successfully to " + details.getRecipientEmail(), HttpStatus.OK);
    }
}

class EmailDetails {
    private String recipientEmail;
    private String messageBody;

    public String getRecipientEmail() {
        return recipientEmail;
    }
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    public String getMessageBody() {
        return messageBody;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
