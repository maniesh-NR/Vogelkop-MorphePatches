package defpackage;

/* loaded from: classes.dex */
public final class gf7 implements fji {
    public final re7 a;

    public gf7(re7 re7Var) {
        this.a = re7Var;
    }

    @Override // defpackage.fji
    public final long b() {
        return this.a.j;
    }

    @Override // defpackage.fji
    public final String c() {
        return this.a.m;
    }

    @Override // defpackage.fji
    public final String d() {
        return this.a.p;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == gf7.class) {
            if (this.a == ((gf7) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fji
    public final String getFileName() {
        return this.a.f();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fji
    public final boolean i() {
        return this.a.i();
    }
}
