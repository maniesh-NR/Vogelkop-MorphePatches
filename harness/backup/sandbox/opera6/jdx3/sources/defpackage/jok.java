package defpackage;

/* loaded from: classes.dex */
public final class jok extends gph implements Runnable {
    public boolean a;
    public final /* synthetic */ kok b;

    public jok(kok kokVar) {
        this.b = kokVar;
    }

    public final void b() {
        j();
    }

    public final void c(int i, int i2) {
        j();
    }

    public final void e(int i, int i2, Object obj) {
        j();
    }

    public final void f(int i, int i2) {
        j();
    }

    public final void g(int i, int i2) {
        j();
    }

    public final void h(int i, int i2) {
        j();
    }

    public final void j() {
        if (this.a) {
            return;
        }
        this.a = true;
        vml.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        kok kokVar = this.b;
        if (kokVar.q) {
            kokVar.s.d(kokVar.a);
        }
    }
}
