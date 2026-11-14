package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rq6 {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public r16 a;
    public boolean b;

    public static void a(int i, ArrayList arrayList) {
        if (sgb.L(i, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final oj9 b(oj9 oj9Var) {
        if (!this.b || !this.a.b(oj9Var)) {
            return oj9Var;
        }
        nj9 nj9VarA = oj9Var.a();
        String str = oj9Var.k;
        nj9VarA.m = dzd.p("application/x-media3-cues");
        nj9VarA.K = this.a.l(oj9Var);
        StringBuilder sb = new StringBuilder();
        sb.append(oj9Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        nj9VarA.j = sb.toString();
        nj9VarA.r = Long.MAX_VALUE;
        return new oj9(nj9VarA);
    }
}
