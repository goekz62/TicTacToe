public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        while (!hasWinner() && !board.isFull()) {
            board.print();
            makeMove();
            switchCurrentPlayer();
        }
        board.print();
        if (hasWinner()) {
            switchCurrentPlayer();
            System.out.println("Player " + currentPlayer.getMarker() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean hasWinner() {
        // Winning logic here (omitted for brevity)
        return false;
    }

    public void makeMove() {
        // Logic to get user input and place marker
    }
}
