package br.com.dio.hangman.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordBank {
    private static final List<String> WORDS = Arrays.asList(
            "banana", "abacaxi", "computador", "elefante", "girassol",
            "programacao", "java", "openai", "hangman", "desenvolvimento"
    );

    private static final Random RANDOM = new Random();

    public static String getRandomWord() {
        return WORDS.get(RANDOM.nextInt(WORDS.size()));
    }
}
