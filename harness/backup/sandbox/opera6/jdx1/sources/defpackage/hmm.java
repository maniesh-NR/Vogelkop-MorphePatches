package defpackage;

/* loaded from: classes.dex */
public final class hmm {
    public static emm a(Object obj) {
        hv9 hv9Var = (hv9) obj;
        emm emmVar = hv9Var.unknownFields;
        if (emmVar != emm.f) {
            return emmVar;
        }
        emm emmVar2 = new emm(0, new int[8], new Object[8], true);
        hv9Var.unknownFields = emmVar2;
        return emmVar2;
    }

    public static boolean b(int i, r05 r05Var, Object obj) throws yib, cjb {
        int i2 = r05Var.b;
        s75 s75Var = (s75) r05Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            r05Var.q0(0);
            ((emm) obj).c(i3 << 3, Long.valueOf(s75Var.v()));
            return true;
        }
        if (i4 == 1) {
            r05Var.q0(1);
            ((emm) obj).c((i3 << 3) | 1, Long.valueOf(s75Var.s()));
            return true;
        }
        if (i4 == 2) {
            ((emm) obj).c((i3 << 3) | 2, r05Var.G());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw cjb.g();
            }
            r05Var.q0(5);
            ((emm) obj).c((i3 << 3) | 5, Integer.valueOf(s75Var.r()));
            return true;
        }
        emm emmVar = new emm(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new cjb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (r05Var.w() != Integer.MAX_VALUE && b(i7, r05Var, emmVar)) {
        }
        if (i6 != r05Var.b) {
            throw new cjb("Protocol message end-group tag did not match expected tag.");
        }
        if (emmVar.e) {
            emmVar.e = false;
        }
        ((emm) obj).c(i5 | 3, emmVar);
        return true;
    }
}
