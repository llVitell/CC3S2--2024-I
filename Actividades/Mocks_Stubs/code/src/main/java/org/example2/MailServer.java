package org.example2;

public interface MailServer {
    /**
     * Genera un número aleatorio dentro del rango especificado.
     *
     * @param sender El que envia el correo
     * @param receiver El que recibe el correo
     * @param message Mensaje del correo
     */
    boolean sendEmail(String sender, String receiver, String message);
}
