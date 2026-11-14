package defpackage;

/* loaded from: classes.dex */
public final class kmc implements zmc {
    public final lmc a;

    public kmc(lmc lmcVar) {
        this.a = lmcVar;
    }

    @Override // defpackage.zmc
    public final lmc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kmc) && this.a.equals(((kmc) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
