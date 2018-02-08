package ZbiorZadan.Z08TagiHTML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TagiHTML {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Programowanie\\!Kurs programowania\\TestFile.html");
        Scanner sc = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            //   System.out.println(line);
            sb.append("<").append(line.substring(line.indexOf('<') + 1, line.indexOf('>')).toUpperCase()).append(">");
            if (line.length() > sb.length()) {
                sb.append(line.substring(line.indexOf('>') + 1, line.lastIndexOf('<')));
                sb.append(line.substring(line.lastIndexOf('<'), line.lastIndexOf('>')).toUpperCase()).append('>');
            }
            System.out.println(sb);
            sb.setLength(0);
        }

    }
}