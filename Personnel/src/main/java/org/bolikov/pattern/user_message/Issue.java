package org.bolikov.pattern.user_message;

import org.bolikov.pattern.Person;
import org.bolikov.pattern.user_message.parameters.Category;
import org.bolikov.pattern.user_message.parameters.Priority;
import org.bolikov.pattern.user_message.parameters.Tag;

import java.util.Arrays;
import java.util.List;

public class Issue {

    private String title;
    private String body;
    private List<Category> categories;
    private List<Tag> tags;

    private Priority priority;
    private Person user;
    private Person executor;

    public Issue(String title, String body, List<Category> categories, List<Tag> tags,
                 Priority priority, Person user, Person executor) {
        this.title = title;
        this.body = body;
        this.categories = categories;
        this.tags = tags;
        this.priority = priority;
        this.user = user;
        this.executor = executor;
    }

    public static Issue.IssueBuilder builder() {
        return new Issue.IssueBuilder();
    }

    @Override
    public String toString() {
        return "Issue{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", categories=" + categories +
                ", tags=" + tags +
                ", priority=" + priority +
                ", user=" + user +
                ", executor=" + executor +
                '}';
    }

    public static class IssueBuilder {
        private String title;
        private String body;
        private List<Category> categories;
        private List<Tag> tags;

        private Priority priority;
        private Person user;
        private Person executor;

        IssueBuilder() {
        }

        public Issue.IssueBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Issue.IssueBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public Issue.IssueBuilder setCategories(Category... categories) {
            this.categories = Arrays.asList(categories);
            return this;
        }

        public Issue.IssueBuilder setTags(Tag... tags) {
            this.tags = Arrays.asList(tags);
            return this;
        }

        public Issue.IssueBuilder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Issue.IssueBuilder setUser(Person person) {
            this.user = person;
            return this;
        }

        public Issue.IssueBuilder setExecutor(Person person) {
            this.executor = person;
            return this;
        }

        public Issue build() {
            return new Issue(this.title, this.body, this.categories, this.tags, this.priority, this.user, this.executor);
        }

    }

}