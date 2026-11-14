package defpackage;

/* loaded from: classes.dex */
public final class f5h {
    public final int a;
    public final boolean b;

    public f5h(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f5h.class != obj.getClass()) {
            return false;
        }
        f5h f5hVar = (f5h) obj;
        return this.a == f5hVar.a && this.b == f5hVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
