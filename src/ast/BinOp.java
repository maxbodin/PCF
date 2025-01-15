package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class BinOp extends Term {
    public OP op;
    private final Term left, right;

    public BinOp(OP op, Term left, Term right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    public Value interp(Env e) {
        IntVal leftVal = (IntVal) left.interp(e);
        IntVal rightVal = (IntVal) right.interp(e);

        return switch (op) {
            case PLUS -> new IntVal(leftVal.value + rightVal.value);
            case MINUS -> new IntVal(leftVal.value - rightVal.value);
            case TIMES -> new IntVal(leftVal.value * rightVal.value);
            case DIVIDE -> {
                if (rightVal.value == 0) throw new ArithmeticException("Division by zero");
                yield new IntVal(leftVal.value / rightVal.value);
            }
        };
    }
}
