public class Board {
    private char[][] cells = new char[3][3];

    public Board() {
        clear();
    }

    public boolean hasWinner(char marker) {
        // Prüfe jede Zeile
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] == marker && cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) {
                return true;
            }
        }
        // Prüfe jede Spalte
        for (int i = 0; i < 3; i++) {
            if (cells[0][i] == marker && cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) {
                return true;
            }
        }
        // Prüfe Diagonalen
        if (cells[0][0] == marker && cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
            return true;
        }
        if (cells[0][2] == marker && cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
            return true;
        }
        return false;
    }


    public boolean isCellEmpty(int x, int y) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3) {
            return cells[x][y] == ' ';
        } else {
            throw new IllegalArgumentException("Invalid board position");
        }
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)) {
            cells[x][y] = marker;
        } else {
            throw new IllegalArgumentException("Cell is already occupied");
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }
}
