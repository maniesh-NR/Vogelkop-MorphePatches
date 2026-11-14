package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class qki {
    public final ijd a;
    public final pki b;

    public qki(ijd ijdVar) {
        this.a = ijdVar;
        this.b = new pki(ijdVar);
    }

    public final void a(Bundle bundle) {
        ijd ijdVar = this.a;
        rki rkiVar = (rki) ijdVar.d;
        if (!ijdVar.a) {
            ijdVar.b();
        }
        if (((qdc) rkiVar.getLifecycle()).i.d(qcc.d)) {
            rqd.e(((qdc) rkiVar.getLifecycle()).i, "performRestore cannot be called when owner is ");
            return;
        }
        if (ijdVar.b) {
            qp2.n("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleH = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleH = n1h.h(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        ijdVar.h = bundleH;
        ijdVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            ijd r0 = r0.a
            n08 r1 = n08.a
            r1.getClass()
            r1 = 0
            kotlin.Pair[] r2 = new kotlin.Pair[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            kotlin.Pair[] r2 = (kotlin.Pair[]) r2
            android.os.Bundle r2 = defpackage.ic4.m(r2)
            java.lang.Object r3 = r0.h
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L1f
            r2.putAll(r3)
        L1f:
            java.lang.Object r3 = r0.f
            ftj r3 = (ftj) r3
            monitor-enter(r3)
            java.lang.Object r0 = r0.g     // Catch: java.lang.Throwable -> L85
            see r0 = (defpackage.see) r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r4 = r0.b     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r5 = r0.c     // Catch: java.lang.Throwable -> L85
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L85
            int r6 = r0.length     // Catch: java.lang.Throwable -> L85
            int r6 = r6 + (-2)
            if (r6 < 0) goto L76
            r7 = r1
        L34:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L85
            long r10 = ~r8     // Catch: java.lang.Throwable -> L85
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L85
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r1
        L4e:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L85
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L85
            oki r13 = (defpackage.oki) r13     // Catch: java.lang.Throwable -> L85
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L85
            android.os.Bundle r13 = r13.a()     // Catch: java.lang.Throwable -> L85
            r2.putBundle(r14, r13)     // Catch: java.lang.Throwable -> L85
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L4e
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r6) goto L76
            int r7 = r7 + 1
            goto L34
        L76:
            monitor-exit(r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L84
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r1 = r18
            r1.putBundle(r0, r2)
        L84:
            return
        L85:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qki.b(android.os.Bundle):void");
    }
}
