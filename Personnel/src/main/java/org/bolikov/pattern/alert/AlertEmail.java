package org.bolikov.pattern.alert;

import org.bolikov.pattern.Person;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class AlertEmail implements Alert {
    private Person executor;
    private Person user;
    private Session session;

    public AlertEmail(Person executor, Person user) {
        this.executor = executor;
        this.user = user;
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "localhost");
        this.session = Session.getDefaultInstance(properties);
    }

    @Override
    public void sendExecutorAlert() {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Issue@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(executor.getEmail()));
            message.setSubject("На вас назначена проблема пользователя");
            message.setContent("<h1>Оповещение на email</h1>", "text/html");
            Transport.send(message);
        } catch (MessagingException messagingException) {
            messagingException.printStackTrace();
        }
    }

    @Override
    public void sendUserAlert() {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Issue@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
            message.setSubject("Ваше обращение принято");
            message.setContent("<h1>Оповещение на email</h1>", "text/html");
            Transport.send(message);
        } catch (MessagingException messagingException) {
            messagingException.printStackTrace();
        }
    }
}
