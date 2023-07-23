// TrieNode.java
class TrieNode {
    private TrieNode[] children;
    private boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // 26 letras del alfabeto inglés (puedes ajustarlo según tus necesidades)
        isEndOfWord = false;
    }

    public TrieNode getChild(char ch) {
        return children[ch - 'a'];
    }

    public void setChild(char ch, TrieNode node) {
        children[ch - 'a'] = node;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }
}
