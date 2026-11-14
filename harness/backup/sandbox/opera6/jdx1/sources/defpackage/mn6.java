package defpackage;

/* loaded from: classes.dex */
public final class mn6 extends b8e implements lk7 {
    public final lde o;
    public boolean p;
    public boolean q;
    public boolean r;

    public mn6(lde ldeVar) {
        this.o = ldeVar;
    }

    @Override // defpackage.b8e
    public final void L0() {
        na2.B(H0(), null, null, new yf((byte) 11, null, this), 3);
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        o3cVar.a();
        uh4 uh4Var = o3cVar.a;
        if (this.p) {
            mk7.z0(o3cVar, u95.b(u95.b, 0.3f), uh4Var.e(), 0.0f, 122);
        } else if (this.q || this.r) {
            mk7.z0(o3cVar, u95.b(u95.b, 0.1f), uh4Var.e(), 0.0f, 122);
        }
    }
}
