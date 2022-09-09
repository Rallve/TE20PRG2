import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class RandomImageGenerator {
    public static void main(String[] args) {
        fileSetup();
        generateImage();
    }

    private static void generateImage() {
        try {
            FileWriter writer = new FileWriter("test1.txt");
            Random r = new Random();
            int x;
            x = r.nextInt(0xffffff);
            writer.write(x);
            for (int i = 1; i < 1920 * 1080; i++) {
                x = r.nextInt(0xffffff);
                writer.write("\n" + x);
            }
            writer.close();
            System.out.println("Lyckades skriva i fil.");
        } catch (IOException e) {
            System.out.println("Ett fel uppstod med att skriva till fil.");
            e.printStackTrace();
        }
    }

    static void fileSetup() {
        File fil = new File("test1.txt");
        try {
            if (fil.createNewFile()) {
                System.out.println("Filen skapades: " + fil.getName());
            } else {
                System.out.println("Filen existerar redan.");
            }
        } catch (IOException e) {
            System.out.println("Ett fel uppstod.");
            e.printStackTrace();
        }
    }
}