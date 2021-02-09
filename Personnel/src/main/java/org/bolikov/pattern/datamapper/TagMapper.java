package org.bolikov.pattern.datamapper;

import org.bolikov.pattern.entity.parameters.Tag;

import java.sql.*;

@SuppressWarnings("SqlResolve")
public class TagMapper {
    private final Connection connection;

    public TagMapper(Connection connection) {
        this.connection = connection;
    }

    public Tag findByName(String name) throws SQLException {
        PreparedStatement statement = connection
                .prepareStatement("SELECT name, careate_tag FROM tag WHERE name = ?");
        statement.setString(1, name);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Tag tag = new Tag();
                tag.setTagName(resultSet.getString(1));
                tag.setCreateTag(Date.valueOf(resultSet.getString(2)));
                return tag;
            }
        }
        throw new NullPointerException(name);
    }

    public void insert(Tag tag) {
    }

    public void update(Tag tag) {
    }

    public void delete(Tag tag) {
    }

}
