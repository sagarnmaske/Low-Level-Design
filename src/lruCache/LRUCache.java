package lruCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int limit;
    Map<Integer, Node> nodeMap;
    Node head;
    Node tail;
    int count;

    LRUCache(int limit) {
        this.limit = limit;
        nodeMap = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        count = 0;
    }

    public void add(int key, int value) {
        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            removeNode(node);
            node.val = value;
            addNode(node);
        } else {
            Node node = new Node(key, value);
            nodeMap.put(key, node);
            addNode(node);
            count++;
            if (count > limit) {
                Node tailNode = tail.prev;
                nodeMap.remove(tailNode.key);
                removeNode(tailNode);
            }
        }
    }

    public int get(int key) {
        if (nodeMap.containsKey(key)) {
            System.out.println("Get Key: " + key + ",Value:" + nodeMap.get(key).val);
            return nodeMap.get(key).val;
        }
        System.out.println("Get Key: " + key + ",Value:" + -1);
        return -1;
    }

    private void addNode(Node node) {
        Node nextNode = head.next;
        node.next = nextNode;
        nextNode.prev = node;
        node.prev = head;
        head.next = node;
        System.out.println("Key:" + node.key + ",Value:" + node.val + "  Added");
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        System.out.println("Key:" + node.key + ",Value:" + node.val + "  Removed");
    }

    public static class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            prev = null;
            next = null;
        }
    }
}
