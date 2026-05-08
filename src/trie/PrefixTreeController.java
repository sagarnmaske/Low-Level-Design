package trie;

public class PrefixTreeController {

    public static void controlPrefixTree() {
        PrefixTree prefixTree = new PrefixTree();
        prefixTree.addWord("sagar");
        System.out.println(prefixTree.searchWord("sagar"));
        prefixTree.addWord("maske");
        System.out.println(prefixTree.searchWord("mask"));
        System.out.println(prefixTree.isPrefix("mask"));
        System.out.println(prefixTree.isPrefix("mad"));
    }
}
