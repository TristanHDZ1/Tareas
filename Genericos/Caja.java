import java.util.Arrays;

public class Caja<T> {
    private T[] content;
    public static final int CAPACIDAD = 10;

    public Caja() {
    }

    public Caja(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    public void add(int pos, T objeto){
        content [pos] = objeto;
    }

    public T get(int pos){
        return content[pos];
    }
}
