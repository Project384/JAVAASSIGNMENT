// Write a program to demonstrate encapsulation in Java.
public class code1 {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        if (price>0) {
            this.price=price;
        }
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        code1 product=new code1();

        product.setBrand("LYNIX");
        product.setPrice(15600);

        System.out.println("Brand: " + product.getBrand());
        System.out.println("Price: " + product.getPrice());
    }
}
