package org.bolikov.pattern.alert;

import org.bolikov.pattern.Person;

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
