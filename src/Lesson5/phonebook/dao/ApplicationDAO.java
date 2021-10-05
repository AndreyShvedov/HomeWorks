package Lesson5.phonebook.dao;

import Lesson5.phonebook.entity.Application;

import Lesson5.phonebook.storage.Storage;

import java.io.File;
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
        for (Storage<Application> storage : this.storages) {
            storage.save(application);
        }
    }

    public void deleteFile() {
        new File("./applications.txt").delete();
    }
}
