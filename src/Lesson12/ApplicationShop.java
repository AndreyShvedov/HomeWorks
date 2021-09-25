package Lesson12;

public class ApplicationShop {
    public static void main(String[] args) {
        var shop = new Shop();

        shop.addProduct(new Product(1, "milk", 10));
        shop.addProduct(new Product(2, "bread", 12));
        shop.addProduct(new Product(3, "meat", 40));
        shop.addProduct(new Product(1, "milk", 10));
        shop.addProduct(new Product(4, "tomato", 5));

        shop.returnProdutcs();

        shop.deleteProdutc(3);
        shop.returnProdutcs();

        shop.editProdutc(1, new Product("bear", 22));
        shop.returnProdutcs();

        shop.sortPriceProduct();

        shop.sortIdProduct();


    }
}
