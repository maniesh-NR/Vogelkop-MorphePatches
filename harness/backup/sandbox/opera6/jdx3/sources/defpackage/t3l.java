package defpackage;

/* loaded from: classes.dex */
public final class t3l implements u3l {
    public final gsi d;
    public final fsi e;

    public t3l(gsi gsiVar, fsi fsiVar) {
        this.d = gsiVar;
        this.e = fsiVar;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        return this.d.a(b2lVar) || this.e.a(b2lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3l)) {
            return false;
        }
        t3l t3lVar = (t3l) obj;
        return this.d.equals(t3lVar.d) && this.e.equals(t3lVar.e);
    }

    public final int hashCode() {
        return this.e.d.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
