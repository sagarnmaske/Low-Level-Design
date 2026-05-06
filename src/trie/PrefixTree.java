package trie;

public class PrefixTree {

    Node root;

    public PrefixTree() {
        root = new  Node();
    }

    public void addWord(String word) {
        Node current = root;
        for(char ch: word.toCharArray()) {
            int idx =  ch - 'a';
            if(current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            current = current.children[idx];
        }
        current.eow = true;
    }

    public boolean searchWord(String word) {
        Node  current = root;
        for(char ch: word.toCharArray()) {
            int idx =  ch - 'a';
            if(current.children[idx] == null) {
                return false;
            }
            current = current.children[idx];
        }

        return current.eow;
    }

    public class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            eow = false;
        }
    }
}


