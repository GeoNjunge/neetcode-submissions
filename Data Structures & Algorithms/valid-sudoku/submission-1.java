class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length;c++) {

                 if (board[r][c] == '.') {
                 continue;
                }
                char digit = board[r][c];
                int box = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(digit) ||
                    cols[c].contains(digit) ||
                    boxes[box].contains(digit)) {
                    return false;
                }

                rows[r].add(digit);
                cols[c].add(digit);
                boxes[box].add(digit);
            }
        }
        return true;
    }
}
