package defpackage;

/* loaded from: classes.dex */
public abstract class hq8 {
    public tq8 b;
    public Boolean d;
    public final h7f a = new h7f();
    public int c = -1;

    public final void b(gq8 gq8Var) {
        this.a.b(gq8Var);
    }

    public String c() {
        throw new UnsupportedOperationException();
    }

    public long e() {
        return -1L;
    }

    public String f() {
        return i(p6l.a);
    }

    public String g() {
        throw new UnsupportedOperationException();
    }

    public String h() {
        return "";
    }

    public String i(p6l p6lVar) {
        throw new UnsupportedOperationException();
    }

    public boolean j() {
        return false;
    }

    public final boolean m() {
        Boolean boolValueOf = this.d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(z7h.s(i(p6l.a)));
            this.d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void n(int i, hq8 hq8Var) {
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((gq8) g7fVar.next()).r(i, hq8Var);
        }
    }

    public final void o(gq8 gq8Var) {
        this.a.c(gq8Var);
    }

    public void p() {
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((gq8) g7fVar.next()).Q(this);
        }
    }

    public void q(String str) {
        throw new UnsupportedOperationException();
    }

    public void r() {
        n(4, this);
    }
}
