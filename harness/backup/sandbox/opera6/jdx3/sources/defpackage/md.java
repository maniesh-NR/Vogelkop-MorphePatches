package defpackage;

/* loaded from: classes.dex */
public final class md extends fe {
    public final boolean a;
    public final vr0 b;
    public final lxh c = new lxh(2131232034);
    public final rxh d = new rxh(2132018251);

    public md(boolean z, vr0 vr0Var) {
        this.a = z;
        this.b = vr0Var;
    }

    @Override // defpackage.fe
    public final b8h a() {
        return this.c;
    }

    @Override // defpackage.fe
    public final pxh b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof md) {
            md mdVar = (md) obj;
            return this.a == mdVar.a && this.b == mdVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
