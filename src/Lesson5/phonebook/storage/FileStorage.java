package Lesson5.phonebook.storage;

import Lesson5.phonebook.entity.Person;
import Lesson5.phonebook.marshaller.Marshaller;
import json.Convertor;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileStorage<E> implements Storage<E> {
    private String filePath;
    private Marshaller marshaller;
    private Class<E> entityClass;

    public FileStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Class<E> getEntityClass() {
        return this.entityClass;
    }

    @Override
    public void setEntityClass(Class<E> clazz) {
        this.entityClass = clazz;
    }

    @Override
    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    @Override
    public String getFilePath() {
        return this.filePath;
    }

    @Override
    public void save(Object person) {
        List<Person>list = new ArrayList<>();
        File file = new File(this.filePath);
        try  {


            if(file.exists()){
                System.out.println(Convertor.toJavaObject());
                list = marshaller.toJavaObject(file);
                list.add((Person) person);
                marshaller.toJSON(list, file);
            }else {
                list.add((Person) person);
                marshaller.toJSON(list, file);
            }

//            fin.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
