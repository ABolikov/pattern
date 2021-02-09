package org.bolikov.pattern;

import org.bolikov.pattern.message.Issue;
import org.bolikov.pattern.message.Message;

public class App {
    public static void main(String[] args) {
        Message message = new Message();
        message.send(Issue.builder().setTitle("Тест").setBody("Тело").build());
    }
}
