import java.util.*;

class Scrabble {

    private String word;
    private static final Map<Character, Integer> lettersValues;

    static {
        Map<Character, Integer> pointsForLetters = new HashMap<Character, Integer>();

        pointsForLetters.put('A', 1);
        pointsForLetters.put('B', 3);
        pointsForLetters.put('C', 3);
        pointsForLetters.put('D', 2);
        pointsForLetters.put('E', 1);
        pointsForLetters.put('F', 4);
        pointsForLetters.put('G', 2);
        pointsForLetters.put('H', 4);
        pointsForLetters.put('I', 1);
        pointsForLetters.put('J', 8);
        pointsForLetters.put('K', 5);
        pointsForLetters.put('L', 1);
        pointsForLetters.put('M', 3);
        pointsForLetters.put('N', 1);
        pointsForLetters.put('O', 1);
        pointsForLetters.put('P', 3);
        pointsForLetters.put('Q', 10);
        pointsForLetters.put('R', 1);
        pointsForLetters.put('S', 1);
        pointsForLetters.put('T', 1);
        pointsForLetters.put('U', 1);
        pointsForLetters.put('V', 4);
        pointsForLetters.put('W', 4);
        pointsForLetters.put('X', 8);
        pointsForLetters.put('Y', 4);
        pointsForLetters.put('Z', 10);
        
        lettersValues = Collections.unmodifiableMap(pointsForLetters);
    }

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;

        if (this.word.length() == 0)
            return score;

        for (var character : this.word.toUpperCase().toCharArray()) {
            score += lettersValues.get(character);
        }

        return score;
    }
}
