package defpackage;

/* loaded from: classes.dex */
public abstract class d17 {
    public final short a;
    public boolean b;
    public final ig c = new ig((Object) this, (byte) 20);

    /* JADX WARN: Type inference failed for: r3v1, types: [int, short] */
    public d17(long j) {
        this.a = (int) j;
    }

    public final void a() {
        if (this.b) {
            this.b = false;
            vml.a(this.c);
        }
    }

    public abstract void b();

    public final void c() {
        a();
        b();
    }

    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        vml.d(this.c, this.a);
    }
}
