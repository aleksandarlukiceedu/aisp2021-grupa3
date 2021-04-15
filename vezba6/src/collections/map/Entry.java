package collections.map;

class Entry<TKey, TValue> {
    private TKey key;
    private TValue value;
    private Entry<TKey, TValue> next;

    public Entry(TKey key, TValue value){
        this.key = key;
        this.value = value;
    }

    public Entry(TKey key, TValue value, Entry<TKey,TValue> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public TKey getKey() {
        return key;
    }

    public void setKey(TKey key) {
        this.key = key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }

    public Entry<TKey, TValue> getNext() {
        return next;
    }

    public void setNext(Entry<TKey, TValue> next) {
        this.next = next;
    }
}
