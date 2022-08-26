import java.util.Scanner;

public class Samtalsapp {
    public static void main(String[] args) {
        String[] responses = {"Intressant", "Så bra", "Jättekul", "Jag håller med"};
        String output = "Tjenare";
        System.out.println("Tjenare");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            output += "\n" + input.nextLine();
            System.out.println(responses[(int) Math.floor(Math.random() * responses.length)]);
            if (Math.random() < 0.1) {
                System.out.println("Jag orkar inte prata med dig längre, hej då.");
                break;
            }
        }
        try {
            Thread.sleep(1000);
            System.out.println("\n Hela konversationen: \n" + output);
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");
        }
    }
}
