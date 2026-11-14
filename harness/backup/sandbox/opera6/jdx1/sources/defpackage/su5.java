package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class su5 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(vb4.d, vb4.e, vb4.f, vb4.g));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(wb4.d, wb4.a));
    public static final Set c;
    public static final Set d;

    static {
        ub4 ub4Var = ub4.e;
        ub4 ub4Var2 = ub4.d;
        ub4 ub4Var3 = ub4.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(ub4Var, ub4Var2, ub4Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(ub4Var2);
        enumSetCopyOf.remove(ub4Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125 A[PHI: r5
      0x0125: PHI (r5v3 char) = (r5v1 char), (r5v0 char) binds: [B:91:0x0123, B:81:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.uj4 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su5.a(uj4, boolean):boolean");
    }
}
