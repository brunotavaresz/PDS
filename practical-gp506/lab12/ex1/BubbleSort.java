package lab12.ex1;

import java.util.ArrayList;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(ArrayList<Telemovel> telemoveis, String atributo) {
        if (telemoveis == null || telemoveis.size() == 0) {
            return;
        }
        bubbleSort(telemoveis, atributo);
    }

    private void bubbleSort(ArrayList<Telemovel> telemoveis, String atributo) {
        int n = telemoveis.size();
        Telemovel temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareAttributes(telemoveis.get(j), telemoveis.get(j + 1), atributo) > 0) {
                    temp = telemoveis.get(j);
                    telemoveis.set(j, telemoveis.get(j + 1));
                    telemoveis.set(j + 1, temp);
                }
            }
        }
    }

    private int compareAttributes(Telemovel t1, Telemovel t2, String atributo) {
        switch (atributo) {
            case "nome":
                return t1.getNome().compareTo(t2.getNome());
            case "processador":
                return t1.getProcessador().compareTo(t2.getProcessador());
            case "preco":
                return Double.compare(t1.getPreco(), t2.getPreco());
            case "memoria":
                return Integer.compare(t1.getMemoria(), t2.getMemoria());
            case "camera":
                return Integer.compare(t1.getCamera(), t2.getCamera());
            default:
                throw new IllegalArgumentException("Invalid attribute: " + atributo);
        }
    }
}