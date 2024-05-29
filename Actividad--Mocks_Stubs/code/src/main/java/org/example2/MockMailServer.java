package org.example2;

public class MockMailServer implements MailServer {
    @Override
    public boolean sendEmail(String sender, String receiver, String message) {
        if (sender != null || receiver != null){
            System.out.println("Correo de: " + sender + " para " + receiver);
            System.out.println("Mensaje: " + message);
            return true;
        }
        else {
            return false;
        }
    }
}
