package defpackage;

/* loaded from: classes.dex */
public final class spj {
    public final String a;
    public final String b;
    public final String c;

    public spj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spj)) {
            return false;
        }
        spj spjVar = (spj) obj;
        return this.a.equals(spjVar.a) && this.b.equals(spjVar.b) && this.c.equals(spjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return z1m.l(z1m.n("Skill(name=", this.a, ", description=", this.b, ", prompt="), this.c, ")");
    }
}
