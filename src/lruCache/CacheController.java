package lruCache;

public class CacheController {

    public  static void controlLRUCache(){
        LRUCache lruCache = new LRUCache(3);
        //adding 1,1
        lruCache.add(1,1);

        //adding 2,2
        lruCache.add(2,2);

        //adding 3,3
        lruCache.add(3,3);

        //adding 4,4 1,1 will be removed
        lruCache.add(4,4);

        //1 key is already removed -1 will be output printed
        lruCache.get(1);

        // 2 will be the output
        lruCache.get(2);

        //2,6 value 2 will be replaced
        lruCache.add(2,6);

        //value 6 will be printed
        lruCache.get(2);
    }
}
