package lab08.ex2;

public class CapitalizationFilter extends TextDecorator {

    private String currentString;
    public CapitalizationFilter(Text text) {
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

    // coloca em maiúsculas o primeiro e último caracter do texto, e os restantes em minúsculas
    @Override
    public String next() {
        String returnedWord = "";
        if(this.hasNext()){
            String[] words = this.currentString.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (word.length() > 1) {
                    word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1).toLowerCase() + word.substring(word.length() - 1).toUpperCase();
                } else {
                    word = word.toUpperCase();
                }
                returnedWord += word + " ";
            }
            this.currentString = "";
        }
        return returnedWord;
    }
    
}