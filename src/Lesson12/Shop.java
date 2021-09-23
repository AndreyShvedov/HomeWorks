package Lesson12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Shop {
    private Map<Integer, Product> productstList = new HashMap<>();

    //Добавляет товар в магазин
    public void addProduct(Product product) {
        productstList.putIfAbsent(product.getId(), product);
    }

    //Возвращает список товаров
    public void returnProdutcs() {
        System.out.println(productstList.values());
    }

    //Удаляет товар из списка
    public void deleteProdutc(Integer id) {
        productstList.remove(id);
    }

    //Редактивание списка товаров
    public void editProdutc(Integer id, Product product) {
        var product1 = new Product(id, product.getName(), product.getPrice());
        productstList.replace(id, product1);
    }

    //Сортировка списка товаров по цене
    public void sortPriceProduct() {
        var pcomp = new PriceComparator();
        TreeSet<Product> product = new TreeSet<>(pcomp);
        product.addAll(productstList.values());

        for (Product p : product) {
            System.out.println(p);
        }
    }

    //Сортировка списка товаров по id
    public void sortIdProduct() {
        var pcomp = new IdComparator();
        TreeSet<Product> product = new TreeSet<>(pcomp);
        product.addAll(productstList.values());

        for (Product p : product) {
            System.out.println(p);
        }

    }
}

