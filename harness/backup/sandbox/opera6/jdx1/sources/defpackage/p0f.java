package defpackage;

/* loaded from: classes.dex */
public final class p0f extends j14 {
    public final String A;
    public final String B;
    public final String y;
    public final String z;

    public p0f(String str, String str2, String str3, String str4) {
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
    }

    @Override // defpackage.j14
    public final String Q() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0f)) {
            return false;
        }
        p0f p0fVar = (p0f) obj;
        return this.y.equals(p0fVar.y) && this.z.equals(p0fVar.z) && this.A.equals(p0fVar.A) && this.B.equals(p0fVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + z1m.f(z1m.f(this.y.hashCode() * 31, 31, this.z), 31, this.A);
    }

    public final String toString() {
        return sko.n(z1m.n("System(id=", this.y, ", title=", this.z, ", message="), this.A, ", link=", this.B, ")");
    }
}
