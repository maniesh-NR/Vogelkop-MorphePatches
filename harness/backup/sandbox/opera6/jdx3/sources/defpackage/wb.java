package defpackage;

/* loaded from: classes.dex */
public final class wb extends cb implements ywk, p5j {
    public final c4 a;

    public wb(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // defpackage.ywk
    public final void B() {
        h();
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        h();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("enable_sync")) {
            h();
        }
    }

    @Override // defpackage.cb
    public final void a() {
        h();
    }

    @Override // defpackage.cb
    public final void b() {
        h();
    }

    @Override // defpackage.cb
    public final void c() {
        h();
    }

    @Override // defpackage.cb
    public final void d(boolean z) {
        h();
    }

    @Override // defpackage.ywk
    public final void e(boolean z) {
    }

    @Override // defpackage.cb
    public final void f() {
        h();
    }

    @Override // defpackage.ywk
    public final void g() {
    }

    public final void h() {
        this.a.run();
    }
}
