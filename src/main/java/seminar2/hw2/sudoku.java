package seminar2.hw2;

import java.util.Arrays;

public class sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] testBoard) {
        if (!isValidRules(testBoard)) return false;

//      Проверяем строки
        for (char[] row : testBoard) {
            if (!isValidData(charToCharacter(row))) return false;
        }

//      Проверяем столбцы
        Character[] data = new Character[testBoard.length];
        for (int col = 0; col < testBoard.length; col++) {
            for (int row = 0; row < testBoard.length; row++) {
                data[row] = testBoard[row][col];
            }
            if (!isValidData(data)) return false;
        }
//      Проверяем 3x3 области
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                data[j] = testBoard[(i / 3) * 3 + j / 3][(i % 3) * 3 + j % 3];
            }
            if (!isValidData(data)) return false;
        }
        return true;
    }

    /**
     * Принимает доску и проверяет ее на соблюдение условий:
     * строк=9, столбцов=9, содержит только символы "123456789."
     * В случае выполнения условий возвращает true
     *
     * @param testBoard - char[][]
     * @return - boolean
     */
    public static boolean isValidRules(char[][] testBoard) {
        String validChar = "123456789.";

        if (testBoard.length != 9) return false;
        for (int i = 0; i < testBoard.length; i++) {
            if (testBoard[i].length != 9) return false;
            for (char element : testBoard[i]) {
                if (validChar.lastIndexOf(element) == -1) return false;
            }
        }
        return true;
    }

    /**
     * Принимает массив и возвращает true если в нем не повторяются цифры
     *
     * @param testBoard - Character[]
     * @return - boolean
     */
    public static boolean isValidData(Character[] testBoard) {
        int totalDigs = (int) Arrays.stream(testBoard)
                .filter(a -> a != '.')
                .count();
        int uniqeDigs = (int) Arrays.stream(testBoard)
                .filter(a -> a != '.')
                .distinct()
                .count();
        if (totalDigs != uniqeDigs) return false;
        return true;

    }

    /**
     * Предбразует char[] -> Character
     *
     * @param array - char[]
     * @return - Character[]
     */
    public static Character[] charToCharacter(char[] array) {
        Character[] characterArray = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            characterArray[i] = array[i];
        }
        return characterArray;
    }

}