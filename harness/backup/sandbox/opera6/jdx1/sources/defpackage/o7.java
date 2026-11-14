package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class o7 implements dx7 {
    public final /* synthetic */ byte a;
    public final bq4 b;
    public final g1g c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public hyl h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public oj9 m;
    public int n;
    public long o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o7(String str) {
        this(null, 0, str, (byte) 0);
        this.a = (byte) 0;
    }

    public o7(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                bq4 bq4Var = new bq4(new byte[16], 16);
                this.b = bq4Var;
                this.c = new g1g(bq4Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                bq4 bq4Var2 = new bq4(new byte[NotificationCompat.FLAG_HIGH_PRIORITY], NotificationCompat.FLAG_HIGH_PRIORITY);
                this.b = bq4Var2;
                this.c = new g1g(bq4Var2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    private final void e(boolean z) {
    }

    private final void f(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0407  */
    @Override // defpackage.dx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.g1g r34) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.a(g1g):void");
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        byte b = this.a;
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        switch (this.a) {
            case 0:
                s7mVar.a();
                s7mVar.b();
                this.g = s7mVar.e;
                s7mVar.b();
                this.h = en8Var.track(s7mVar.d, 1);
                break;
            default:
                s7mVar.a();
                s7mVar.b();
                this.g = s7mVar.e;
                s7mVar.b();
                this.h = en8Var.track(s7mVar.d, 1);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.dx7
    public final void seek() {
        switch (this.a) {
            case 0:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }
}
