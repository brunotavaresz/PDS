package lab12.ex1;

import java.util.ArrayList;

public class InsertionSort implements SortStrategy {

    @Override
    public void sort(ArrayList<Telemovel> telemoveis, String atributo) {

        for (int i = 1; i < telemoveis.size(); i++) {
            Telemovel key = telemoveis.get(i);
            int j = i - 1;
            while ((j > -1) && (telemoveis.get(j).getAtributo(atributo).compareTo(key.getAtributo(atributo)) > 0)) {
                telemoveis.set(j + 1, telemoveis.get(j));
                j--;
            }
        }

    }
}
