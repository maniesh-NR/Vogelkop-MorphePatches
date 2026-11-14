package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class g7h {
    public final g7c a;

    public g7h(Function0 function0) {
        this.a = new g7c(function0);
    }

    public k7h a(Object obj) {
        return new k7h(this, obj, obj == null, null, null, true);
    }

    public h0n b() {
        return this.a;
    }

    public final k7h c(Function1 function1) {
        return new k7h(this, null, false, null, function1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[PHI: r4
      0x0041: PHI (r4v2 sp7) = (r4v6 sp7), (r4v7 sp7) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h0n d(defpackage.k7h r3, h0n r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.sp7
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.e
            if (r2 == 0) goto L42
            r0 = r4
            sp7 r0 = (defpackage.sp7) r0
            t0g r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L42
        L16:
            boolean r2 = r4 instanceof defpackage.kbk
            if (r2 == 0) goto L35
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f
            if (r2 == 0) goto L42
        L22:
            boolean r2 = r3.e
            if (r2 != 0) goto L42
            java.lang.Object r2 = r3.a()
            kbk r4 = (defpackage.kbk) r4
            java.lang.Object r1 = r4.a
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r1)
            if (r2 == 0) goto L42
            goto L41
        L35:
            boolean r2 = r4 instanceof defpackage.zi5
            if (r2 == 0) goto L42
            kotlin.jvm.functions.Function1 r2 = r3.d
            zi5 r4 = (defpackage.zi5) r4
            kotlin.jvm.functions.Function1 r1 = r4.a
            if (r2 != r1) goto L42
        L41:
            r0 = r4
        L42:
            if (r0 != 0) goto L6f
            boolean r2 = r3.e
            if (r2 == 0) goto L5b
            sp7 r2 = new sp7
            java.lang.Object r4 = r3.f
            iuj r3 = r3.c
            if (r3 != 0) goto L52
            zpa r3 = zpa.k
        L52:
            t0g r0 = new t0g
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5b:
            kotlin.jvm.functions.Function1 r2 = r3.d
            if (r2 == 0) goto L65
            zi5 r3 = new zi5
            r3.<init>(r2)
            return r3
        L65:
            kbk r2 = new kbk
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7h.d(k7h, h0n):h0n");
    }
}
