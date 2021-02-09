package org.bolikov.pattern.entity.parameters;

public class Priority {
    private int id;
    private String priorityName;

    public Priority() {
    }

    public Priority(int id, String priorityName) {
        this.id = id;
        this.priorityName = priorityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priorityName='" + priorityName + '\'' +
                '}';
    }
}
