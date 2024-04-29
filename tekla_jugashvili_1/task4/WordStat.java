package midterm.tekla_jugashvili_1.task4;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        WordStat wordStat = new WordStat(fantasyFormatData);

        wordStat.printWordStats();

        wordStat.writeToFile();
    }

    private List<String> words;

    public WordStat(List<String> words) {
        this.words = words;
    }

    public Set<String> getUniqueWords() {
        return new HashSet<>(words);
    }

    public Map<Integer, Integer> getWordLengthCounts() {
        return words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.summingInt(e -> 1)));
    }

    public void printWordStats() {
        Set<String> uniqueWords = getUniqueWords();
        System.out.println("Unique Words: " + uniqueWords);

        Map<Integer, Integer> lengthCounts = getWordLengthCounts();
        System.out.println("Word Length Counts: " + lengthCounts);
    }

    public void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("task4.txt", true))) {
            writer.println("Unique Words: " + getUniqueWords());
            writer.println(); // 
            writer.println("Word Length Counts: " + getWordLengthCounts());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
