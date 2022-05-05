class LRUCache {
    HashMap<Integer,Integer> cache;
    int currSize=0;
    int cap;
    
    public LRUCache(int capacity) {
        if(capacity > 0){
            cap=capacity;
            currSize=0;
            cache=new LinkedHashMap<Integer,Integer>();
        }
        
    }
    
    public int get(int key) {
        Integer val = cache.get(key);
        if(val != null){
            cache.remove(key);
            cache.put(key,val);
        }else{
            //System.out.println("==== get : "+key +" : "+val);
            return -1;
        }
        //System.out.println("==== get : "+key +" : "+val);
        return val;
    }
    
    public void put(int key, int value) {
        //System.out.println("==== add key :"+key);
        //System.out.println(cache.entrySet());
        if(cache.containsKey(key)){
            cache.remove(key);
            cache.put(key,value);
            return;
        }
        if(currSize >= cap){
            //System.out.println(cache.entrySet().iterator().next().getKey());
            
            int ind = cache.entrySet().iterator().next().getKey();
            cache.remove(ind);
        }
        cache.put(key,value);
        currSize += 1;
        //System.out.println(cache.entrySet());
        //add recently used
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
