package defpackage;

/* loaded from: classes.dex */
public final class r3l implements u3l {
    public final int d;

    public r3l(int i) {
        this.d = i;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        return ((d7l) b2lVar).j.a().d == this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3l) && this.d == ((r3l) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return "";
    }
}
