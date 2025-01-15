package interp;

public class Binding {
    public final String name;
    public final Value value;

    public Binding(String name, Value value) {
        this.name = name;
        this.value = value;
    }
}