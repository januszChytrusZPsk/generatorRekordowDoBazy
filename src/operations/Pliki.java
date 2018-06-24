package operations;

import java.io.*;
import java.util.ArrayList;

public class Pliki {

    public boolean zapiszPlik(String nazwaPliku, String tresc) {

        PrintWriter out = null;
        try {
            out = new PrintWriter(nazwaPliku);
            out.println(tresc);
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return true;
    }

    public void odczyt(String filePath, ArrayList<String> imiona ) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String textLine = bufferedReader.readLine();
            do {
                imiona.add(textLine);

                textLine = bufferedReader.readLine();
            } while (textLine != null);
        } finally {
            bufferedReader.close();
        }
    }

}
