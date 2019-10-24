package readerFile;

import java.io.*;
import java.util.*;



public class ReaderFile {


    public static void main(String[] args) throws FileNotFoundException {
        String pathFile = "/Users/kirilltokarev/IdeaProjects/Java2.0/src/readerFile/test.txt";
        Scanner scanner = new Scanner(new FileInputStream(pathFile));

        LinkedList<String> listWordsInFile = new LinkedList(); // список слов
        TreeMap<String, Integer> resultCountCoincidence = new TreeMap<>(); // сортированная мапа
        String word;

        while (scanner.hasNext()) {
            word = scanner.useDelimiter("\\s+").next();
            Integer count = resultCountCoincidence.get(word);
            if (count == null) {
                count = 0;
            }
            listWordsInFile.add(word); // добавляем в список по очередности слова из файла
            resultCountCoincidence.put(word, ++count); //считаем совпадения

        }
        System.out.println("Не отсортированные слова : \n" + listWordsInFile);
        Collections.sort(listWordsInFile);  // сортируем список
        System.out.println("\nОтсортированные слова : \n" + listWordsInFile);
        
        System.out.println("\nСтатистика совпадений : \n");
        resultCountCoincidence.forEach((k,v) -> System.out.println("Слово - "+ k + ": " + v));
        int maxCountWord = 0;
        String maxWord = "";
        for (String countWord:resultCountCoincidence.keySet()) {
            if (resultCountCoincidence.get(countWord) > maxCountWord){
                maxCountWord = resultCountCoincidence.get(countWord);
                maxWord = countWord;
            }
        }
        System.out.println("\nМаксимальное слово - " + maxWord + " и повторялось " + maxCountWord + " раз(а)");

    }

}
