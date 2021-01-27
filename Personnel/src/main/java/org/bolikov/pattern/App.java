package org.bolikov.pattern;

import org.bolikov.pattern.user_message.Issue;

public class App {
    public static void main(String[] args) {
        Issue test = Issue.builder().setTitle("Тест").setBody("Тело").build();
        System.out.println(test);
    }
}
