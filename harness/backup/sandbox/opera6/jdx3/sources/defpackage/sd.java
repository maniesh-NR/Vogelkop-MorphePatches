package defpackage;

/* loaded from: classes.dex */
public final class sd extends fe {
    public final int a;
    public final lxh b = new lxh(2131232166);
    public final rxh c = new rxh(2132019213);

    public sd(int i) {
        this.a = i;
    }

    @Override // defpackage.fe
    public final b8h a() {
        return this.b;
    }

    @Override // defpackage.fe
    public final pxh b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd) && this.a == ((sd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
