package defpackage;

/* loaded from: classes.dex */
public final class vf {
    public final pc a;

    public vf(pc pcVar) {
        this.a = pcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf) && this.a == ((vf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
