package interp;

import ast.Term;

public class Closure extends Value {
    private final String param;
    private final Term body;
    private final Env env;

    public Closure(String param, Term body, Env env) {
        this.param = param;
        this.body = body;
        this.env = env;
    }

    public Value apply(Value arg) {
        Env newEnv = env.add(param, arg);
        return body.interp(newEnv);
    }
}
