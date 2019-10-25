public class GenericClass<T> {
    private T barang;
 
    public void set(T barang) {
        this.barang = barang;
    }
    public T get() {
        return barang;
    }
}