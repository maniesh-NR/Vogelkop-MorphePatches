package defpackage;

import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class uxf {
    public static final txf a;
    public static final jxf b;

    static {
        txf txfVar = new txf((byte) 0);
        a = txfVar;
        l08 l08Var = l08.a;
        fsf fsfVar = fsf.a;
        b = new jxf(l08Var, 0, 0, 0, 0, 0, 0, n9a.m, new w6c((byte) 1), sgb.b(h.a), txfVar, ap5.b(0, 0, 0, 0, 15));
    }

    public static final long a(jxf jxfVar, int i) {
        long j = (((i * (jxfVar.b + r0)) + (-jxfVar.f)) + jxfVar.d) - jxfVar.c;
        int iG = (int) (jxfVar.e == fsf.b ? jxfVar.g() >> 32 : jxfVar.g() & 4294967295L);
        jxfVar.n.getClass();
        long jC = j - (iG - djh.c(0, 0, iG));
        if (jC < 0) {
            return 0L;
        }
        return jC;
    }
}
