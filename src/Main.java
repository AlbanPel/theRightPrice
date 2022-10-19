import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] categories = {"Vêtement de 5€ - 200€", "Voiture de 5 000€ - 75 000€", "Immobilier de 90 000€ - 500 000€"};
        int cat = new Random().nextInt(0,3);
        int price;
        if (cat == 0) {
           price = new Random().nextInt(5, 200);
        } else if (cat == 1) {
           price = new Random().nextInt(5000, 75000);
        }else {
           price = new Random().nextInt(90000, 500000);
        }
        int myPrice = 0;

        System.out.println("Entrez le juste prix ! indice => " + categories[cat]);
        int tryAgain = 0;
        while (price != myPrice){
            Scanner myProposition = new Scanner(System.in);

            if (price > myPrice  && myPrice !=0){
                System.out.println("C'est plus !");
            } else if (myPrice == 0){
                System.out.println("Bonne chance");
            }
            else {
                System.out.println("C'est moins !");
            }
            myPrice = myProposition.nextInt();
            tryAgain++;
        }
        System.out.print("Bravo ! vous avez trouvé le juste prix : " + price + "$");

        System.out.println(" en " + tryAgain + " fois");

    }
}