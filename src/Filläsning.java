import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*

public class Filläsning {
    public static void main(String[] args) {
        BufferedReader inFile = openTextFileForReading("info.txt");
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outFile = openBinaryFileForWriting("info.dat");
        writeTextAsBinary(fileContent, outFile);
    }

    private static DataOutputStream openBinaryFileForWriting(String fileName) {
        DataOutputStream outFile;
        try {
            outFile = new DataOutputStream(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writing, using terminal instead.");
            outFile = new DataOutputStream(new OutputStream(System.out)
        }
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {
        ArrayList<String> text = new ArrayList<>();
        try {
            String line = inFile.readLine();
            while (line != null) {
                text.add(line);
                line = inFile.readLine();
            }

        } catch () {

        }
        return null;
    }

    private static void writeTextAsBinary(ArrayList<String> fileContent) {
        for (int i = 0; i < fileContent.size(); i++) {

        }
    }

    private static BufferedReader openTextFileForReading(String fileName) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {

        }
        return null;
    }
}
*/