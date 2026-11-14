package defpackage;

/* loaded from: classes.dex */
public final class i0c {
    public final szb a;
    public final int b;

    public i0c(szb szbVar, int i) {
        this.a = szbVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0c.class != obj.getClass()) {
            return false;
        }
        i0c i0cVar = (i0c) obj;
        return this.a == i0cVar.a && this.b == i0cVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
