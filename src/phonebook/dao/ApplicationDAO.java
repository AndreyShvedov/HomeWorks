package phonebook.dao;

import phonebook.entity.Application;
import phonebook.entity.Person;
import phonebook.storage.Storage;

import java.util.List;

public class ApplicationDAO {
    private List<Storage<Application>> storages;

    public ApplicationDAO(List<Storage<Application>> storages) {
        this.storages = storages;
    }

    public List<Application> findAll() {
        var storage = this.storages.get(0);
        return storage.findAll();
    }

    public void save(Application application) {
        for (int i = 0; i < this.storages.size(); i++) {
            this.storages.get(i).save(application);
        }
    }
}
