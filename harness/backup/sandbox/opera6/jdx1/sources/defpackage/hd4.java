package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hd4 {
    public final boolean a;
    public final sa2 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hd4(boolean r6, defpackage.sa2 r7, int r8, boolean r9, int r10) {
        /*
            r5 = this;
            r0 = r10 & 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r2
        Lf:
            r0 = r10 & 4
            if (r0 == 0) goto L1b
            sa2 r7 = new sa2
            id4[] r0 = defpackage.id4.a
            r0 = 7
            r7.<init>(r0, r2)
        L1b:
            r0 = r10 & 16
            if (r0 == 0) goto L20
            r8 = r2
        L20:
            r0 = r10 & 32
            if (r0 == 0) goto L5e
            java.util.Map r0 = defpackage.hb4.c
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r3 = "samsungexynos7870"
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r0, r3)
            if (r3 != 0) goto L5e
            java.lang.String r3 = "qcom"
            boolean r0 = kotlin.text.c.m(r0, r3, r1)
            if (r0 == 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 <= r3) goto L5e
        L3e:
            java.util.Map r0 = defpackage.hb4.d
            java.lang.String r3 = android.os.Build.BRAND
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L5c
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r3 = r3.toLowerCase(r4)
            boolean r0 = r0.contains(r3)
            if (r0 == r1) goto L5e
        L5c:
            r0 = r2
            goto L5f
        L5e:
            r0 = r1
        L5f:
            r3 = r10 & 64
            if (r3 == 0) goto L64
            r9 = r2
        L64:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L69
            r1 = r2
        L69:
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r5.c = r8
            r5.d = r0
            r5.e = r9
            r5.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd4.<init>(boolean, sa2, int, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd4)) {
            return false;
        }
        hd4 hd4Var = (hd4) obj;
        return this.a == hd4Var.a && Intrinsics.a(this.b, hd4Var.b) && this.c == hd4Var.c && this.d == hd4Var.d && this.e == hd4Var.e && this.f == hd4Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fki.k(fki.k(rfp.c(this.c, (this.b.hashCode() + fki.k(38347, 31, this.a)) * 961, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=" + this.a + ", awaitRepeatingRequestBeforeCapture=" + this.b + ", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=" + ((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')')) + ", closeCaptureSessionOnDisconnect=" + this.d + ", closeCameraDeviceOnClose=" + this.e + ", enableRestartDelays=" + this.f + ')';
    }
}
