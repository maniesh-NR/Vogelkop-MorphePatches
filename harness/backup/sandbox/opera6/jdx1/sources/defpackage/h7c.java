package defpackage;

/* loaded from: classes.dex */
public final class h7c implements c2o {
    public r94 a;
    public t0g b;
    public final t0g c = hyg.k(Boolean.FALSE);

    public final long a() {
        t0g t0gVarK = this.b;
        if (t0gVarK == null) {
            r94 r94Var = this.a;
            t0gVarK = hyg.k(r94Var != null ? (g37) r94Var.invoke() : g37.c);
            this.b = t0gVarK;
            this.a = null;
        }
        return ((g37) t0gVarK.getValue()).a;
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
