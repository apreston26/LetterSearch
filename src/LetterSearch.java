public class LetterSearch {

    public static void main(String[] args) {
        String myWord = "apple";
        char myLetter = 'P';

        System.out.println("There are " + myMethod(myWord, myLetter) + " " + myLetter + "'s in the word " + myWord);
    }


    public static int myMethod(String word, char letter) {
        int lettersContained = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.toUpperCase().charAt(i)) {
                lettersContained++;
            } else if (letter == word.toLowerCase().charAt(i)) {
                lettersContained++;
            }
        }
        return lettersContained;
    }
}
