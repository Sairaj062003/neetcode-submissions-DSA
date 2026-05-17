class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean flagatend = false;
    String endword = "";
}

class Solution {

    List<String> result = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = new TrieNode();

        // Insert words into Trie
        for (int i = 0; i < words.length; i++) {
            addWord(words[i], root);
        }

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (root.children[board[i][j] - 'a'] != null) {
                    dfs(i, j, board, root);
                }
            }
        }

        return result;
    }

    public void addWord(String word, TrieNode root) {

        TrieNode cur = root;

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (cur.children[index] == null) {
                cur.children[index] = new TrieNode();
            }

            cur = cur.children[index];
        }

        cur.flagatend = true;
        cur.endword = word;
    }

    private void dfs(int i, int j, char[][] board, TrieNode node) {

        // Boundary check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return;
        }

        char ch = board[i][j];

        // Visited check
        if (ch == '#') {
            return;
        }

        TrieNode nextNode = node.children[ch - 'a'];

        // Character not found
        if (nextNode == null) {
            return;
        }

        // Word found
        if (nextNode.flagatend) {
            result.add(nextNode.endword);

            // Avoid duplicate words
            nextNode.flagatend = false;
        }

        // Mark visited
        board[i][j] = '#';

        dfs(i + 1, j, board, nextNode);
        dfs(i - 1, j, board, nextNode);
        dfs(i, j + 1, board, nextNode);
        dfs(i, j - 1, board, nextNode);

        // Backtrack
        board[i][j] = ch;
    }
}