package Lesson12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private String t;

    LocalDateTime dateAndTime = LocalDateTime.now();
    String time = dateAndTime.format(DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss"));

    public Product(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.t = time;
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", time=" + t +
                '}';
    }
}
