package parser;

import ast.*;

public class ASTVisitor extends PCFBaseVisitor<AST> {

    @Override
    public AST visitLit(PCFParser.LitContext ctx) {
        return new Lit(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitCond(PCFParser.CondContext ctx) {
        Term condition = (Term) visit(ctx.term(0));
        Term thenBranch = (Term) visit(ctx.term(1));
        Term elseBranch = (Term) visit(ctx.term(2));
        return new Cond(condition, thenBranch, elseBranch);
    }

    @Override
    public AST visitCondi(PCFParser.CondiContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public AST visitAdd(PCFParser.AddContext ctx) {
        return visit(ctx.addition());
    }

    @Override
    public AST visitAddition(PCFParser.AdditionContext ctx) {
        Term left = visit(ctx.multiplication(0));
        for (int i = 1; i < ctx.multiplication().size(); i++) {
            String opSymbol = ctx.getChild(2 * i - 1).getText();
            OP op = OP.parseOP(opSymbol);
            Term right = visit(ctx.multiplication(i));
            left = new BinOp(op, (Term) left, (Term) right);
        }
        return left;
    }

    @Override
    public AST visitMultiplication(PCFParser.MultiplicationContext ctx) {
        AST left = visit(ctx.atom(0));
        for (int i = 1; i < ctx.atom().size(); i++) {
            String opSymbol = ctx.getChild(2 * i - 1).getText(); // Symbole d'opération
            OP op = OP.parseOP(opSymbol);
            AST right = visit(ctx.atom(i));
            left = new BinOp(op, (Term) left, (Term) right);
        }
        return left;
    }

    @Override
    public AST visitParens(PCFParser.ParensContext ctx) {
        return visit(ctx.term());
    }
}

