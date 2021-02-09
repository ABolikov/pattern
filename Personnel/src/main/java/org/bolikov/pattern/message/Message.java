package org.bolikov.pattern.message;

public class Message {
    public void send(SendMessageStrategy strategy) {
        strategy.send();
    }
}
