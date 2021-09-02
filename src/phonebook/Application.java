package phonebook;

import phonebook.dao.PhonebookDAO;
import phonebook.mapper.inputMapper;

public class Application {                      //публичный работоспособный класс
    public static void main(String[] args) {
        var action = args[0];
        var dao = new PhonebookDAO();
        switch (action){
            case "generate" -> {
                var mapper = new inputMapper();
                for (int i = 0; i < 15; i++) {
                    dao.save(mapper.toEntity(args));    //задание переменной через класс mapper
                }
            }
            case "save" -> {
                var mapper = new inputMapper();
                dao.save(mapper.toEntity(args));           //задание переменной через класс mapper
            }
            case "delete" -> {
                dao.delete(Integer.parseInt(args[1]));
            }
            case "find" -> {
                var person = dao.find(Integer.parseInt(args[1])) ;
                if (person != null){
                    System.out.println(person);
                } else {
                    System.out.println("Person not found");
                }

            }
        }
    }
}
