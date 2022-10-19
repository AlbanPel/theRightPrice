import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String [] categories = {"Vêtement", "Voiture", "Immobilier"};
        int cat = new Random().nextInt(0,3);
        System.out.println(categories[cat]);
        int price;
        if (cat == 0) {
           price = new Random().nextInt(5, 200);
        } else if (cat == 1) {
           price = new Random().nextInt(5000, 75000);
        }else {
           price = new Random().nextInt(90000, 500000);
        }

        System.out.println(price);

    }
}