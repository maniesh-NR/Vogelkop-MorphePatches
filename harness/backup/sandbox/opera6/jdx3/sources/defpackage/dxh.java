package defpackage;

/* loaded from: classes.dex */
public final class dxh extends cxh {
    public final int a;

    public dxh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxh) && this.a == ((dxh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
