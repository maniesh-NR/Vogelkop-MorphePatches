package defpackage;

/* loaded from: classes.dex */
public final class zc extends bd {
    public final pc a;

    public zc(pc pcVar) {
        this.a = pcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc) && this.a == ((zc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
