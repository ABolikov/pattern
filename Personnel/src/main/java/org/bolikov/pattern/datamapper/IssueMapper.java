package org.bolikov.pattern.datamapper;

import org.bolikov.pattern.entity.Issue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("SqlResolve")
public class IssueMapper {
    private final Connection connection;

    public IssueMapper(Connection connection) {
        this.connection = connection;
    }

    public Issue findById(String number) throws SQLException {
        PreparedStatement statement = connection
                .prepareStatement("SELECT number, title, body, categories, tags, priority, user, executor FROM issue WHERE number = ?");
        statement.setString(1, number);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Issue issue = Issue.builder()
                        .setNumber(resultSet.getString(1))
                        .setTitle(resultSet.getString(2))
                        .setBody(resultSet.getString(3))
//                        .setCategories(resultSet.getString(4))
//                        .setTags(resultSet.getString(5))
//                        .setPriority(resultSet.getString(6))
//                        .setUser(resultSet.getString(7))
//                        .setExecutor(resultSet.getString(8))
                        .build();
                return issue;
            }
        }
        throw new NullPointerException(number);
    }

    public void insert(Issue issue) {
    }

    public void update(Issue issue) {
    }

    public void delete(Issue issue) {
    }

}
