package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class nfg extends Surface {
    public static byte d;
    public static boolean e;
    public final boolean a;
    public final mfg b;
    public boolean c;

    public nfg(mfg mfgVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = mfgVar;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a() {
        /*
            java.lang.Class<nfg> r0 = defpackage.nfg.class
            monitor-enter(r0)
            boolean r1 = defpackage.nfg.e     // Catch: java.lang.Throwable -> L41
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L38
            java.lang.String r1 = "EGL_EXT_protected_content"
            boolean r1 = defpackage.fr3.P(r1)     // Catch: qy9 -> L1d java.lang.Throwable -> L41
            if (r1 == 0) goto L33
            java.lang.String r1 = "EGL_KHR_surfaceless_context"
            boolean r1 = defpackage.fr3.P(r1)     // Catch: qy9 -> L1d java.lang.Throwable -> L41
            if (r1 == 0) goto L1b
            r1 = r3
            goto L34
        L1b:
            r1 = 2
            goto L34
        L1d:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "Failed to determine secure mode due to GL error: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L41
            r4.append(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L41
            defpackage.w7d.q(r1)     // Catch: java.lang.Throwable -> L41
        L33:
            r1 = r2
        L34:
            defpackage.nfg.d = r1     // Catch: java.lang.Throwable -> L41
            defpackage.nfg.e = r3     // Catch: java.lang.Throwable -> L41
        L38:
            byte r1 = defpackage.nfg.d     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3d
            r2 = r3
        L3d:
            monitor-exit(r0)
            return r2
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
        L41:
            r1 = move-exception
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfg.a():boolean");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                mfg mfgVar = this.b;
                mfgVar.b.getClass();
                mfgVar.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
