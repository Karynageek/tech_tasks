package task01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 1.Write a program to find all distinct words from a text file. Ignore chars like ".,/-;:" and
 * Ignore case sensitivity.
 */

public class DistinctWords {

    public List<String> getDistinctWords(String fileName) {
        List<String> distinctWordList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis);
             BufferedReader br = new BufferedReader(new InputStreamReader(dis))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " .,/-;:");
                while (st.hasMoreTokens()) {
                    String temp = st.nextToken().toLowerCase();
                    if (!distinctWordList.contains(temp)) {
                        distinctWordList.add(temp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return distinctWordList;
    }

    public static void main(String[] args) {
        DistinctWords distFw = new DistinctWords();
        List<String> distinctWordList = distFw.getDistinctWords("src/task01/test.txt");
        for (String temp : distinctWordList) {
            System.out.println(temp);
        }
    }
}
