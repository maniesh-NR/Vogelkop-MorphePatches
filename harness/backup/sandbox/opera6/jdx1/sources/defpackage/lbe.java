package defpackage;

/* loaded from: classes.dex */
public final class lbe {
    public Class a;
    public Class b;
    public Class c;

    public lbe(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lbe.class != obj.getClass()) {
            return false;
        }
        lbe lbeVar = (lbe) obj;
        return this.a.equals(lbeVar.a) && this.b.equals(lbeVar.b) && rm5.h(this.c, lbeVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
