package defpackage;

/* loaded from: classes.dex */
public final class rln extends m73 {
    public final qln b;

    public rln(qln qlnVar) {
        this.b = qlnVar;
    }

    @Override // defpackage.ysd
    public final void l(int i) {
        if (this.a || !j7c.a(i, 2)) {
            return;
        }
        qjn qjnVar = (qjn) this.b.h.g();
        if (!qjnVar.i || qjnVar.g == null) {
            return;
        }
        qjnVar.h = null;
        qjnVar.g = null;
        qjnVar.k = true;
        qjnVar.d();
    }
}
