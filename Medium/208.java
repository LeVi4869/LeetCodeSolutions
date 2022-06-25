class TrieNode {
    public char val;
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}
class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    public void insert(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if(temp.children[c - 'a'] == null)  {
                temp.children[c - 'a'] = new TrieNode(c);
            }
            temp = temp.children[c - 'a'];
        }
        temp.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if(temp.children[c - 'a'] == null)  {
                return false;
            }
            temp = temp.children[c - 'a'];
        }
        return temp.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(int i = 0; i < prefix.length(); ++i) {
            char c = prefix.charAt(i);
            if(temp.children[c - 'a'] == null)  {
                return false;
            }
            temp = temp.children[c - 'a'];
        }
        return true;
    }
}