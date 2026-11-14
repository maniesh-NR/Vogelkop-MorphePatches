package defpackage;

/* loaded from: classes.dex */
public final class kv2 {
    public final pc a;

    public kv2(pc pcVar) {
        this.a = pcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv2) && this.a == ((kv2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
