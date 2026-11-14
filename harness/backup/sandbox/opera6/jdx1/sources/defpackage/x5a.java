package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class x5a implements dx7 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public hyl b;
    public final oam c;
    public final String d;
    public final g1g e;
    public final ahe f;
    public final boolean[] g = new boolean[4];
    public final w5a h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public x5a(oam oamVar, String str) {
        this.c = oamVar;
        this.d = str;
        w5a w5aVar = new w5a();
        w5aVar.d = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.h = w5aVar;
        if (oamVar != null) {
            this.f = new ahe(178);
            this.e = new g1g();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
    @Override // defpackage.dx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g1g r23) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5a.a(g1g):void");
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        this.b.getClass();
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.a = s7mVar.e;
        s7mVar.b();
        this.b = en8Var.track(s7mVar.d, 2);
        oam oamVar = this.c;
        if (oamVar != null) {
            oamVar.j(en8Var, s7mVar);
        }
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.dx7
    public final void seek() {
        qyn.o(this.g);
        w5a w5aVar = this.h;
        w5aVar.c = false;
        w5aVar.a = 0;
        w5aVar.b = 0;
        ahe aheVar = this.f;
        if (aheVar != null) {
            aheVar.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }
}
