class MyHashMap {

    private final List<int[]> res;

    public MyHashMap() {
        res = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for (int[] list: res) {
        if (list[0] == key) list[1] = value;
       }
        res.add(new int[]{key, value});
    }
    
    public int get(int key) {
       for (int[] list: res) {
        if (list[0] == key) return list[1];
       }
       return -1;
    }
    
    public void remove(int key) {
        res.removeIf(list -> list[0] == key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */