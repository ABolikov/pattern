package org.bolikov.pattern.alert;

import org.bolikov.pattern.Person;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class AlertDecorator implements Alert {
    private Person executor;
    private Person user;

    public AlertDecorator(Person executor, Person user) {
        this.executor = executor;
        this.user = user;
    }

    @Override
    public void sendExecutorAlert() {

    }

    @Override
    public void sendUserAlert() {

    }
}
