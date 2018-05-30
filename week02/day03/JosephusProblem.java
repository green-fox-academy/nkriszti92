package week02.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are playing the game?");
        int players = scanner.nextInt();

        System.out.println("The winning seat is: " + JosephusProblem(players));
    }

    public static int JosephusProblem(int nPeople) {
        ArrayList<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= nPeople; i++) {
            seats.add(i);
        }

        int distance = 1;
        while (seats.size() > 1) {
            if (distance >= seats.size()) {
                distance -= seats.size();
            }
            seats.remove(distance);
            distance++;
        }

        int winnerSeat = seats.get(0);
        return winnerSeat;
    }
}
