package defpackage;

/* loaded from: classes.dex */
public final class olj implements zy {
    public final m43 a;
    public final r31 b;
    public final sn3 c;
    public final tji d;
    public boolean e;

    public olj(bz bzVar, m43 m43Var, r31 r31Var, sn3 sn3Var, tji tjiVar) {
        this.a = m43Var;
        this.b = r31Var;
        this.c = sn3Var;
        this.d = tjiVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        this.b.invoke(yzVar, Boolean.valueOf(this.a.b()), new q01(this, yzVar, false));
        return true;
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.invoke(str);
    }
}
