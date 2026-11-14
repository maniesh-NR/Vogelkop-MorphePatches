package defpackage;

/* loaded from: classes.dex */
public final class dsg {
    public final String a;
    public final Long b;

    public dsg(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsg)) {
            return false;
        }
        dsg dsgVar = (dsg) obj;
        return this.a.equals(dsgVar.a) && this.b.equals(dsgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
