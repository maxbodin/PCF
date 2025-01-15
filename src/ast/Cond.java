package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class Cond extends Term {
    private final Term test, thenBranch, elseBranch;

    public Cond(Term test, Term thenBranch, Term elseBranch) {
        this.test = test;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    @Override
    public Value interp(Env e) {
        IntVal testVal = (IntVal) test.interp(e);

        if (testVal.value == 0) {
            return thenBranch.interp(e);
        } else {
            return elseBranch.interp(e);
        }
    }
}

