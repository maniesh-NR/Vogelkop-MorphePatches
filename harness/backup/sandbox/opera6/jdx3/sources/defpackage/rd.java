package defpackage;

/* loaded from: classes.dex */
public final class rd extends fe {
    public final int a;
    public final boolean b;
    public final lxh c = new lxh(2131231742);
    public final rxh d;

    public rd(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.d = new rxh(z ? 2132018740 : 2132018741);
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
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return this.a == rdVar.a && this.b == rdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
