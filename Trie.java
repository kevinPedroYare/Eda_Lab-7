// Trie.java
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.getChild(ch) == null) {
                current.setChild(ch, new TrieNode());
            }
            current = current.getChild(ch);
        }
        current.setEndOfWord(true);
    }

    public boolean search(String word) {
        TrieNode node = findNode(word);
        return node != null && node.isEndOfWord();
    }

    public boolean replace(String target, String replacement) {
        if (!search(target)) {
            return false;
        }
        delete(target);
        insert(replacement);
        return true;
    }

    private TrieNode findNode(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            current = current.getChild(ch);
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    private boolean delete(String word) {
        TrieNode node = findNode(word);
        if (node == null || !node.isEndOfWord()) {
            return false;
        }
        node.setEndOfWord(false);
        return true;
    }
}
