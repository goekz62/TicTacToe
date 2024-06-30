import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Scanner scanner;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
        scanner = new Scanner(System.in);
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void start() {
        boolean keepPlaying = true;
        while (keepPlaying) {
            playGame();
            System.out.println("Play again? (yes/no):");
            String answer = scanner.next();
            keepPlaying = answer.equalsIgnoreCase("yes");
            if (keepPlaying) {
                board.clear();
            }
        }
        scanner.close();
    }

    private void playGame() {
        while (!board.isFull() && !hasWinner()) {
            board.print();
            makeMove();
            if (!hasWinner()) {
                switchCurrentPlayer();
            }
        }
        board.print();
        if (hasWinner()) {
            System.out.println("Player " + currentPlayer.getMarker() + " wins!");
        } else if (board.isFull()) {
            System.out.println("It's a draw!");
        }
    }

    public boolean hasWinner() {
        return board.hasWinner(currentPlayer.getMarker());
    }

    public void makeMove() {
        int x, y;
        do {
            System.out.println("Player " + currentPlayer.getMarker() + ", enter row (0-2) and column (0-2): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number!");
                scanner.next();
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (x < 0 || x > 2 || y < 0 || y > 2 || !board.isCellEmpty(x, y));
        board.place(x, y, currentPlayer.getMarker());
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

}
