package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class rfa extends uhi {
    public final Map H;
    public vl7 I;

    public rfa(l45 l45Var, em7 em7Var, am7 am7Var, Map map) {
        super(l45Var, em7Var, am7Var);
        this.H = map;
    }

    @Override // defpackage.uhi
    public final oj9 p(oj9 oj9Var) {
        vl7 vl7Var;
        vl7 vl7Var2 = this.I;
        if (vl7Var2 == null) {
            vl7Var2 = oj9Var.r;
        }
        if (vl7Var2 != null && (vl7Var = (vl7) this.H.get(vl7Var2.c)) != null) {
            vl7Var2 = vl7Var;
        }
        lxd lxdVar = oj9Var.l;
        lxd lxdVar2 = null;
        if (lxdVar != null) {
            jxd[] jxdVarArr = lxdVar.a;
            int length = jxdVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                jxd jxdVar = jxdVarArr[i2];
                if ((jxdVar instanceof wyg) && "com.apple.streaming.transportStreamTimestamp".equals(((wyg) jxdVar).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    jxd[] jxdVarArr2 = new jxd[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            jxdVarArr2[i < i2 ? i : i - 1] = jxdVarArr[i];
                        }
                        i++;
                    }
                    lxdVar2 = new lxd(jxdVarArr2);
                }
                lxdVar = lxdVar2;
            }
        } else {
            lxdVar = lxdVar2;
        }
        if (vl7Var2 != oj9Var.r || lxdVar != oj9Var.l) {
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.q = vl7Var2;
            nj9VarA.k = lxdVar;
            oj9Var = new oj9(nj9VarA);
        }
        return super.p(oj9Var);
    }
}
