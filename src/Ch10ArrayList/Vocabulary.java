package Ch10ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;

public class Vocabulary {

    public static ArrayList<String> getWords(Scanner input) {
        input.useDelimiter("[^a-zA-z']+");
        ArrayList<String> words = new ArrayList<>();
        while (input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);
        ArrayList<String> uniqueWords = new ArrayList<>();
        if (words.size() > 0) {
            for (int i = 1; i < words.size(); i++) {
                if (!words.get(i).equals(words.get(i - 1))) {
                    uniqueWords.add(words.get(i));
                }
            }
        }
        return uniqueWords;
    }

    public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> matches = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while ((i1 < list1.size()) && (i2 < list2.size())) {
            int comparison = list1.get(i1).compareTo(list2.get(i2));
            if (list1.get(i1).equals(list2.get(i2))) {
                matches.add(list1.get(i1));
                i1++;
                i2++;
            } else if (comparison < 0) {
                i1++;
            } else {
                i2++;
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        System.out.println(list1 + "\n" + list2);
    }

}
