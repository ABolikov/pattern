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


/*public class BasicRequest2 {
    private String appkey;
    private String sessionID;

    BasicRequest2(String appkey, String sessionID) {
        this.appkey = appkey;
        this.sessionID = sessionID;
    }

    public static BasicRequest2.BasicRequest2Builder builder() {
        return new BasicRequest2.BasicRequest2Builder();
    }

    public static class BasicRequest2Builder {
        private String appkey;
        private String sessionID;

        BasicRequest2Builder() {
        }

        public BasicRequest2.BasicRequest2Builder appkey(String appkey) {
            this.appkey = appkey;
            return this;
        }

        public BasicRequest2.BasicRequest2Builder sessionID(String sessionID) {
            this.sessionID = sessionID;
            return this;
        }

        public BasicRequest2 build() {
            return new BasicRequest2(this.appkey, this.sessionID);
        }

        public String toString() {
            return "BasicRequest2.BasicRequest2Builder(appkey=" + this.appkey + ", sessionID=" + this.sessionID + ")";
        }
    }
}*/