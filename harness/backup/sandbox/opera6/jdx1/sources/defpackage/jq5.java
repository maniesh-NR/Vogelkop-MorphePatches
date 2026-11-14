package defpackage;

import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class jq5 {
    public final ss3 a;
    public final nh4 b;

    public jq5(ss3 ss3Var, nh4 nh4Var) {
        this.a = ss3Var;
        this.b = nh4Var;
    }

    public final String toString() {
        nh4 nh4Var = this.b;
        jx5 jx5Var = nh4Var.e.get(jx5.c);
        String str = jx5Var != null ? jx5Var.b : null;
        return "Request@" + Integer.toString(hashCode(), CharsKt.checkRadix(16)) + (str != null ? sko.k("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + nh4Var + ")";
    }
}
