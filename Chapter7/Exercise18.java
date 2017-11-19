//        (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
//        answers the following questions:
//        a) How many games are won on the first roll, second roll, …, twentieth roll and after the
//        twentieth roll?
//        b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
//        twentieth roll?
//        c) What are the chances of winning at craps? [Note: You should discover that craps is one
//        of the fairest casino games. What do you suppose this means?]
//        d) What is the average length of a game of craps?
//        e) Do the chances of winning improve with the length of the game?

import java.security.SecureRandom;

public class Exercise18 {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status{CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args){
        Status gameStatus;
        int wins = 0, loses = 0;
        int[] roundsWon = new int[21];
        int[] roundsLost = new int[21];

        for (int i = 0; i < 1000000; i++) {
            int myPoint = 0;
            int sumOfDice = rollDice();
            int roundsCount = 1;

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d\n", myPoint);
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                roundsCount++;

                if (sumOfDice == myPoint)
                    gameStatus = Status.WON;
                else if (sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
            }

            if (gameStatus == Status.WON) {
                System.out.println("Player Wins.");

                if (roundsCount > 20) {
                    ++roundsWon[20];
                } else {
                    ++roundsWon[roundsCount - 1];
                }
                wins++;
            } else {
                System.out.println("Player Loses.");

                if (roundsCount > 20) {
                    ++roundsLost[20];
                } else {
                    ++roundsLost[roundsCount - 1];
                }

                loses++;
            }
        }

        System.out.println("\nGames statistics:\n" +
                "Won: " + wins +
                "\nLost: " + loses);
        displayRoundsStatistics(roundsWon, roundsLost);
    }

    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n",
                die1, die2, sum);

        return sum;
    }

    public static void displayRoundsStatistics(int[] roundsWon, int[] roundsLost) {
        System.out.println("\t\t\tWon\t\t\t\tLost");
        for (int i = 0; i < roundsWon.length; i++) {
            if (i == 20) {
                System.out.printf("Round %d+:\t%d\t\t\t%d\n", i, roundsWon[i], roundsLost[i]);
            } else {
                System.out.printf("Round %d:\t%d\t\t\t%d\n", i + 1, roundsWon[i], roundsLost[i]);
            }
        }
    }
}
