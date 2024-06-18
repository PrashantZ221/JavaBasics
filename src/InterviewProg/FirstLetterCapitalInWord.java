package InterviewProg;

public class FirstLetterCapitalInWord {
    public static void main(String[] args) {
        String sentence = "I am a coder";
        char[] sentenceChar = sentence.toCharArray();

        for(int i=0; i< sentenceChar.length; i++){
            try {
                if (sentenceChar[i] == ' ')
                    sentenceChar[i + 1] = Character.toUpperCase(sentenceChar[i + 1]);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }

        String capitalized = new String(sentenceChar);
        System.out.println(capitalized);

    }
}
