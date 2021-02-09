package org.bolikov.pattern.datamapper;

import org.bolikov.pattern.entity.Person;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapPerson {
    private static final Map<String, Person> personMap = new HashMap<>();

    public static void addPerson(Person person) {
        personMap.put(person.getUuid(), person);
    }

    public static Person getPerson(String uuid) {
        return personMap.get(uuid);
    }

}
