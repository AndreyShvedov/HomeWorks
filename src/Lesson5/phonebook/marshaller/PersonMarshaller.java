package Lesson5.phonebook.marshaller;

import Lesson5.phonebook.entity.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersonMarshaller implements Marshaller {
    private FileOutputStream fout;
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void appendProcess(Object entity) throws IOException {
        var person = (Person) entity;
        var ois = new AppendObjectOutputStream(fout);
        ois.writeObject(person);
        ois.flush();

    }
    @Override
    public List<Person> toJavaObject(File file) throws IOException {
        return mapper.readValue(file, new TypeReference<List<Person>>(){});
    }

    @Override
    public void toJSON(List<Person> list, File file) throws IOException {
        mapper.writerWithDefaultPrettyPrinter();
        mapper.writeValue(file, list);
    }

    @Override
    public void setStream(FileOutputStream fin) {
        this.fout = fin;
    }

    @Override
    public void process(Object entity) throws IOException {
        var person = (Person) entity;
        var ois = new ObjectOutputStream(fout);
        ois.writeObject(person);
        ois.flush();
//        ois.close();




//        fin.write(person.getId().toString().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getFirstname().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getLastname().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getAge().toString().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getPhoneNumber().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getAddress().getBytes(StandardCharsets.UTF_8));
//        fin.write("\n".getBytes(StandardCharsets.UTF_8));
    }

}
