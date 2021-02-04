package org.bolikov.pattern.message;

import org.bolikov.pattern.Person;
import org.bolikov.pattern.message.parameters.Category;
import org.bolikov.pattern.message.parameters.Priority;
import org.bolikov.pattern.message.parameters.Tag;

import java.util.Arrays;
import java.util.List;

public class Offer implements SendMessageStrategy {

    private String title;
    private String body;
    private List<Category> categories;
    private List<Tag> tags;
    private Person user;

    public Offer(String title, String body, List<Category> categories, List<Tag> tags, Person user) {
        this.title = title;
        this.body = body;
        this.categories = categories;
        this.tags = tags;
        this.user = user;
    }

    public static Offer.OfferBuilder builder() {
        return new Offer.OfferBuilder();
    }

    @Override
    public String toString() {
        return "Offer{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", categories=" + categories +
                ", tags=" + tags +
                ", user=" + user +
                '}';
    }

    @Override
    public void send() {
        //Формирование Алерта для отправки на почту
        //Логика отправки самого сообщения  в узел по работе с предложениями
    }

    public static class OfferBuilder {
        private String title;
        private String body;
        private List<Category> categories;
        private List<Tag> tags;

        private Priority priority;
        private Person user;
        private Person executor;

        OfferBuilder() {
        }

        public Offer.OfferBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Offer.OfferBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public Offer.OfferBuilder setCategories(Category... categories) {
            this.categories = Arrays.asList(categories);
            return this;
        }

        public Offer.OfferBuilder setTags(Tag... tags) {
            this.tags = Arrays.asList(tags);
            return this;
        }

        public Offer.OfferBuilder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Offer.OfferBuilder setUser(Person person) {
            this.user = person;
            return this;
        }

        public Offer.OfferBuilder setExecutor(Person person) {
            this.executor = person;
            return this;
        }

        public Offer build() {
            return new Offer(this.title, this.body, this.categories, this.tags, this.user);
        }
    }
}
