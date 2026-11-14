package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class a6a implements dx7 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final oam a;
    public final g1g b;
    public final boolean[] c = new boolean[4];
    public final y5a d;
    public final ahe e;
    public z5a f;
    public long g;
    public String h;
    public hyl i;
    public boolean j;
    public long k;

    public a6a(oam oamVar) {
        this.a = oamVar;
        y5a y5aVar = new y5a();
        y5aVar.e = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.d = y5aVar;
        this.k = -9223372036854775807L;
        this.e = new ahe(178);
        this.b = new g1g();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    @Override // defpackage.dx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g1g r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6a.a(g1g):void");
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            z5a z5aVar = this.f;
            z5aVar.b = false;
            z5aVar.c = false;
            z5aVar.d = false;
            z5aVar.e = -1;
        }
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.h = s7mVar.e;
        s7mVar.b();
        hyl hylVarTrack = en8Var.track(s7mVar.d, 2);
        this.i = hylVarTrack;
        this.f = new z5a(hylVarTrack);
        this.a.j(en8Var, s7mVar);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.dx7
    public final void seek() {
        qyn.o(this.c);
        y5a y5aVar = this.d;
        y5aVar.a = false;
        y5aVar.c = 0;
        y5aVar.b = (byte) 0;
        z5a z5aVar = this.f;
        if (z5aVar != null) {
            z5aVar.b = false;
            z5aVar.c = false;
            z5aVar.d = false;
            z5aVar.e = -1;
        }
        ahe aheVar = this.e;
        if (aheVar != null) {
            aheVar.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
