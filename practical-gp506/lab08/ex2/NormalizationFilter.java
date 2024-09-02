package lab08.ex2;

import java.text.Normalizer;

public class NormalizationFilter extends TextDecorator {

    private String currentString;
    public NormalizationFilter(Text text) {
        super(text);
    }
    
    @Override
    public boolean hasNext() {
        if (this.currentString == null || this.currentString.equals("")) {
            if(text.hasNext()){
                this.currentString = text.next();
            }

        }
        return !(this.currentString == null || this.currentString.equals(""));
    }

    @Override
    public String next() {
        String returnedWord = "";
        if(this.hasNext()){
            returnedWord = this.currentString.replaceAll("(?![@',&])\\p{Punct}", "");
            returnedWord = Normalizer.normalize(returnedWord, Normalizer.Form.NFD);
            returnedWord = returnedWord.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            this.currentString = "";

        }
        return returnedWord;
    }

    
}