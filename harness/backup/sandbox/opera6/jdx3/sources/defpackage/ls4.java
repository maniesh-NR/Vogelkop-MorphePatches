package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ls4 {
    public static final fs4 h;
    public final isd a;
    public final jv1 b;
    public final Context c;
    public final ks4 d;
    public final pfe e;
    public final Object f;
    public hs4 g;

    static {
        ebb ebbVar = ebb.c;
        h = new fs4("", j06.n(0L, 0L), new byte[0]);
    }

    public ls4(Context context, wjh wjhVar, isd isdVar, jv1 jv1Var) {
        r16 r16Var = ngh.a;
        this.a = isdVar;
        this.b = jv1Var;
        this.c = context.getApplicationContext();
        this.d = new ks4(this, (jg8) wjhVar.d, (jg8) wjhVar.e);
        this.e = new pfe();
        this.f = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:29:0x006f, B:31:0x0073, B:33:0x0083, B:39:0x00cb, B:34:0x0094, B:35:0x00ab, B:37:0x00b1, B:46:0x00e8, B:47:0x00ef), top: B:52:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8 A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:29:0x006f, B:31:0x0073, B:33:0x0083, B:39:0x00cb, B:34:0x0094, B:35:0x00ab, B:37:0x00b1, B:46:0x00e8, B:47:0x00ef), top: B:52:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qa6 r11, nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls4.a(qa6, nt5):java.lang.Object");
    }

    public final byte[] b(cs4 cs4Var) {
        byte[] bArr;
        fs4 fs4Var;
        synchronized (this.f) {
            hs4 hs4Var = this.g;
            bArr = (hs4Var == null || (fs4Var = (fs4) hs4Var.a.get(cs4Var)) == null) ? null : fs4Var.c;
        }
        return bArr;
    }
}
