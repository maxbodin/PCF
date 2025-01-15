package interp;

import java.util.Optional;

public abstract class Env {
    // last() returns the last binding added to the environment
    abstract Binding last();
    // previous() returns the previous environment (used internally)
    abstract Env previous();
    // creates a new environment whose last binding is id = value
    public abstract Env add(String id, Value value);
    // returns the value of id if it exists, hence the use of Optional
    public abstract Optional<Value> lookup(String id);
}