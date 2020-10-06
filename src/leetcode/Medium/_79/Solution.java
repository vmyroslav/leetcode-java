package leetcode.Medium._79;

// https://leetcode.com/problems/word-search/

public class Solution {
    //Time: O(M*N*S.length); Space: O(1)
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (exist(board, i, j, word, 0)) return true;
            }
        }

        return false;
    }

    private boolean exist(char[][] board, int i, int j, String word, int startIndex) {
        if (startIndex == word.length()) return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(startIndex)) {
            return false;
        }

        char visited = '#';
        board[i][j] = visited;

        boolean res = exist(board, i - 1, j, word, startIndex + 1) ||
                      exist(board, i + 1, j, word, startIndex + 1) ||
                      exist(board, i, j - 1, word, startIndex + 1) ||
                      exist(board, i, j + 1, word, startIndex + 1)
        ;

        board[i][j] = word.charAt(startIndex);

        return res;
    }
}
