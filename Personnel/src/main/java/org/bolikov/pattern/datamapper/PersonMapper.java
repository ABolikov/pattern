package org.bolikov.pattern.datamapper;

import org.bolikov.pattern.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("SqlResolve")
public class PersonMapper {
    private final Connection connection;

    public PersonMapper(Connection connection) {
        this.connection = connection;
    }

    public Person findById(String uuid) throws SQLException {
        PreparedStatement statement = connection
                .prepareStatement("SELECT uuid, login, password, email FROM person WHERE uuid = ?");
        statement.setString(1, uuid);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getString(1));
                person.setLogin(resultSet.getString(2));
                person.setPassword(resultSet.getString(3));
                person.setEmail(resultSet.getString(4));
                return person;
            }
        }
        throw new NullPointerException(uuid);
    }

    public void insert(Person person) {
    }

    public void update(Person person) {
    }

    public void delete(Person person) {
    }

}
