package ads_mobile_sdk;

import defpackage.x1p;

/* loaded from: classes.dex */
public final class ul0 {
    public static volatile ul0 a;
    public static volatile ul0 b;
    public static final ul0 c = new ul0();

    public static ul0 a() {
        ul0 ul0VarA;
        int i = qe.a;
        ul0 ul0Var = a;
        if (ul0Var != null) {
            return ul0Var;
        }
        synchronized (ul0.class) {
            ul0VarA = a;
            if (ul0VarA == null) {
                ul0VarA = tl0.a("getEmptyRegistry");
                if (ul0VarA == null) {
                    ul0VarA = c;
                }
                a = ul0VarA;
            }
        }
        return ul0VarA;
    }

    public static ul0 b() {
        ul0 ul0Var = b;
        if (ul0Var != null) {
            return ul0Var;
        }
        synchronized (ul0.class) {
            ul0 ul0Var2 = b;
            if (ul0Var2 != null) {
                return ul0Var2;
            }
            int i = qe.a;
            ul0 ul0VarA = tl0.a("loadGeneratedRegistry");
            if (ul0VarA == null && (ul0VarA = x1p.e()) == null && (ul0VarA = tl0.a("getEmptyRegistry")) == null) {
                ul0VarA = c;
            }
            b = ul0VarA;
            return ul0VarA;
        }
    }
}
