package defpackage;

/* loaded from: classes.dex */
public final class ayj extends y7h {
    public final ixh d;
    public final ixh e;
    public final ixh f;
    public final umj g;
    public final boolean h;

    public ayj(ixh ixhVar, ixh ixhVar2, ixh ixhVar3, umj umjVar, boolean z) {
        this.d = ixhVar;
        this.e = ixhVar2;
        this.f = ixhVar3;
        this.g = umjVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayj)) {
            return false;
        }
        ayj ayjVar = (ayj) obj;
        return this.d.equals(ayjVar.d) && this.e.equals(ayjVar.e) && this.f.equals(ayjVar.f) && this.g == ayjVar.g && this.h == ayjVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + sko.d(this.f.d, sko.d(this.e.d, Float.hashCode(this.d.d) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
