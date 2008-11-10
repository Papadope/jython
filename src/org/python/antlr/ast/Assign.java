// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Assign extends stmtType {
    public exprType[] targets;
    public exprType value;

    private final static String[] fields = new String[] {"targets", "value"};
    public String[] get_fields() { return fields; }

    public Assign(exprType[] targets, exprType value) {
        this.targets = targets;
        if (targets != null) {
            for(int itargets=0;itargets<targets.length;itargets++) {
                addChild(targets[itargets]);
            }
        }
        this.value = value;
        addChild(value);
    }

    public Assign(Token token, exprType[] targets, exprType value) {
        super(token);
        this.targets = targets;
        if (targets != null) {
            for(int itargets=0;itargets<targets.length;itargets++) {
                addChild(targets[itargets]);
            }
        }
        this.value = value;
        addChild(value);
    }

    public Assign(int ttype, Token token, exprType[] targets, exprType value) {
        super(ttype, token);
        this.targets = targets;
        if (targets != null) {
            for(int itargets=0;itargets<targets.length;itargets++) {
                addChild(targets[itargets]);
            }
        }
        this.value = value;
        addChild(value);
    }

    public Assign(PythonTree tree, exprType[] targets, exprType value) {
        super(tree);
        this.targets = targets;
        if (targets != null) {
            for(int itargets=0;itargets<targets.length;itargets++) {
                addChild(targets[itargets]);
            }
        }
        this.value = value;
        addChild(value);
    }

    public String toString() {
        return "Assign";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Assign(");
        sb.append("targets=");
        sb.append(dumpThis(targets));
        sb.append(",");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitAssign(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (targets != null) {
            for (int i = 0; i < targets.length; i++) {
                if (targets[i] != null)
                    targets[i].accept(visitor);
            }
        }
        if (value != null)
            value.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
