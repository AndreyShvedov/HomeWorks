package phonebook.storage;

import phonebook.entity.Person;

public interface Storage {
    default void save(Person save) {

    }

    void update(Person person);
}
