package lab08.ex2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("lab08/ex2/test.txt");
        Text text = new TextReader(myFile);

        System.out.println("Original text:");
        while (text.hasNext()) {
            System.out.println(text.next());
        }

        System.out.println("\nCapitalized text:");
        CapitalizationFilter capitalizationFilter = new CapitalizationFilter(new TextReader(myFile));
        while (capitalizationFilter.hasNext()) {
            System.out.println(capitalizationFilter.next());
        }

        System.out.println("\nNormalized text:");
        NormalizationFilter normalizationFilter = new NormalizationFilter(new TextReader(myFile));
        while (normalizationFilter.hasNext()) {
            System.out.println(normalizationFilter.next());
        }

        System.out.println("\nTerm text:");
        TermFilter termFilter = new TermFilter(new TextReader(myFile));
        while (termFilter.hasNext()) {
            System.out.println(termFilter.next());
        }
        
        System.out.println("\nVowel text:");
        VowelFilter vowelFilter = new VowelFilter(new TextReader(myFile));
        while (vowelFilter.hasNext()) {
            System.out.println(vowelFilter.next());
        }

        System.out.println("\nVowel and normalized and capitalized text:");
        CapitalizationFilter filtertotal = new CapitalizationFilter(new NormalizationFilter(new VowelFilter(new TextReader(myFile))));
        while (filtertotal.hasNext()) {
            System.out.println(filtertotal.next());
        }

        
    }
    
}
