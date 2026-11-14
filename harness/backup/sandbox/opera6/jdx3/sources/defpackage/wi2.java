package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class wi2 extends lj2 {
    public static SettingsManager j;
    public static ulp k;
    public static boolean l;
    public static boolean n;
    public static final wi2 i = new wi2();
    public static long m = -1;

    @Override // defpackage.lj2
    public final void a() {
        if (n) {
            return;
        }
        ulp ulpVar = k;
        if (ulpVar == null) {
            ulpVar = null;
        }
        ulpVar.getClass();
        m = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    @Override // defpackage.lj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r9, zy9 r10, java.lang.Runnable r11) {
        /*
            r8 = this;
            com.opera.android.settings.SettingsManager r8 = defpackage.wi2.j
            r0 = 0
            if (r8 != 0) goto L6
            r8 = r0
        L6:
            n7j r8 = r8.p()
            int r1 = r8.ordinal()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L42
            long r4 = defpackage.wi2.m
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L20
            defpackage.wi2.n = r2
        L1e:
            r2 = r3
            goto L48
        L20:
            int r8 = r8.d
            long r4 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            long r4 = r8.toMillis(r4)
            ulp r8 = defpackage.wi2.k
            if (r8 == 0) goto L2e
            r0 = r8
        L2e:
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            long r6 = defpackage.wi2.m
            long r6 = r6 + r4
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L3d
            r2 = r3
        L3d:
            r8 = r2 ^ 1
            defpackage.wi2.n = r8
            goto L48
        L42:
            defpackage.wi2.n = r2
            goto L48
        L45:
            defpackage.wi2.n = r2
            goto L1e
        L48:
            if (r2 == 0) goto L56
            kj2 r8 = new kj2
            r0 = 2132020340(0x7f140c74, float:1.967904E38)
            r8.<init>(r9, r0, r10, r11)
            r8.e()
            return
        L56:
            r10.Y()
            if (r11 == 0) goto L5e
            r11.run()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi2.c(android.content.Context, zy9, java.lang.Runnable):void");
    }
}
