import java.util.*;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(ordered(dominoes));
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static List<Domino> ordered(List<Domino> dominoes) {

        List<Domino> orderedDominoes = new ArrayList<Domino>();
        int[] firstDomino = dominoes.get(0).getValues();

        orderedDominoes.add(new Domino(firstDomino[0], firstDomino[1]));

        while (orderedDominoes.size() < dominoes.size()) {
            for (int i = 0; i < dominoes.size(); i++) {
                int[] domino = dominoes.get(i).getValues();
                if (firstDomino[1] == domino[0]) {
                    orderedDominoes.add(new Domino(domino[0], domino[1]));
                    firstDomino = domino;
                }

            }

        }
        return orderedDominoes;
    }
}