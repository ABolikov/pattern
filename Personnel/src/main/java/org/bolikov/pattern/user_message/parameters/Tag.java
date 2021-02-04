package org.bolikov.pattern.user_message.parameters;

import java.util.Date;

public class Tag {
    private String tagName;
    private Date createTag;

    public Tag() {
    }

    public Tag(String tagName, Date createTag) {
        this.tagName = tagName;
        this.createTag = createTag;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Date getCreateTag() {
        return createTag;
    }

    public void setCreateTag(Date createTag) {
        this.createTag = createTag;
    }
}
