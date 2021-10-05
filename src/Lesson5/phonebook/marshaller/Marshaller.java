package Lesson5.phonebook.marshaller;

import Lesson5.phonebook.entity.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public interface Marshaller {
    void setStream(FileOutputStream fin);

    void process(Object entity) throws IOException;

    void appendProcess(Object entity) throws IOException;

    List<Person> toJavaObject(File file) throws IOException;

    void toJSON (List<Person> list, File file) throws IOException;
}
