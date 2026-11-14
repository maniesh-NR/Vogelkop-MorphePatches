package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class wgl {
    public static final String a = c.n(10, "H");

    public static long a(ikl iklVar, n27 n27Var, mh9 mh9Var) {
        y81 y81VarB = b(iklVar, n27Var, mh9Var, 1, false);
        return (y7h.d(y81VarB.a.b()) << 32) | (y7h.d(y81VarB.f) & 4294967295L);
    }

    public static final y81 b(ikl iklVar, n27 n27Var, mh9 mh9Var, int i, boolean z) {
        String strP = CollectionsKt.P(djh.j(0, i), "\n", (CharSequence) null, (String) null, 0, new bvk((byte) 15), 30);
        l08 l08Var = l08.a;
        return new y81(new c91(strP, iklVar, l08Var, l08Var, mh9Var, n27Var, z), i, 1, ap5.b(0, 0, 0, 0, 15));
    }
}
