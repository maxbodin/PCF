package ast;

//public abstract class Term extends AST {
//}

import interp.Env;
import interp.Value;

public abstract class Term {
    public abstract Value interp(Env e);
}
