package defpackage;

/* loaded from: classes.dex */
public final class f2f implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ g2f d;

    public f2f(nrl nrlVar, String str, int i, int i2, g2f g2fVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = g2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oya.b(this.a, this.b, this.c, 3072, 10, this.d);
    }
}
