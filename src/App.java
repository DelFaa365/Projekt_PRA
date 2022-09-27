import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vPenezence = 0;
        System.out.println("Zadej počet korun");
        vPenezence += sc.nextInt();
        System.out.println("Zadej počet dvoukorun");
        vPenezence += sc.nextInt()*2;
        System.out.println("Zadej počet pětikorun");
        vPenezence += sc.nextInt()*5;
        System.out.println("Zadej počet desetikorun");
        vPenezence += sc.nextInt()*10;
        System.out.println("Zadej počet dvacetikorun");
        vPenezence += sc.nextInt()*20;
        System.out.println("Zadej počet padesatikorun");
        vPenezence += sc.nextInt()*50;
        System.out.println("Zadej cenu položky");
        int cena = sc.nextInt();
        System.out.println(vPenezence);

        int zbytek = vPenezence - cena;
        if(zbytek <= 0){
            System.out.println("Nemáš dostatek peněz");
            return;
        }
        if(zbytek > 0){
            System.out.println("Máš dostatek peněz a ještě ti zbylo: " + zbytek);
        } else {
            System.out.println("Máš dostatek peněz");
        }
    }
}
