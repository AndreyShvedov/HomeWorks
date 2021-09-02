package phonebook.dao;

import phonebook.entity.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PhonebookDAO {                                  //публичный класс
    private Person[] getAll(){                          //приватный метод, возвращает все геттеры Person
        Person[] people = null;

        try (var scanner= new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")){ //сканирование файла
            var content = scanner.next();                   //читаем весь файл
            var lines = content.split("\n");        //делаем отдельные строчки
            people = new Person[lines.length];                      //создаем массив
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                people[i] = p;
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return people;
    }

    private void saveAll(Person[] people) {
        this.deleteFile();

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null);
            this.save(people[i]);
        }
    }

    private void deleteFile() {
        new File("./phonebook.txt").delete();
    }

    public Person find(Integer id) {      //метод поиска
        try (var scanner= new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")){ //сканирование файла
            var content = scanner.next();
            var lines = content.split("\n");        //создание из строки отдельные элементы
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                if (p.getId().equals(id)){
                    return p;
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(int id) {             //метод
        Person[] people = this.getAll();
        for (int i = 0; i < people.length; i++) {
            if (people[i].getId().equals(id)){
                people[i] = null;
            }
        }
        this.saveAll(people);
    }



    public void save(Person person) {               //метод сохранения(записи)
        try (var fin = new FileOutputStream("./phonebook.txt", true)){            //запись в файл
            fin.write(person.getId().toString().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getFirstname().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getLastname().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write(person.getAge().toString().getBytes(StandardCharsets.UTF_8));
            fin.write(person.getPhoneNumber().getBytes(StandardCharsets.UTF_8));
            fin.write("/".getBytes(StandardCharsets.UTF_8));
            fin.write("\n".getBytes(StandardCharsets.UTF_8));
            fin.flush();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
