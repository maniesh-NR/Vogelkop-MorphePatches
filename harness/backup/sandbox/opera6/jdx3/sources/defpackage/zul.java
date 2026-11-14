package defpackage;

/* loaded from: classes.dex */
public final class zul {
    public final int a;
    public final int b;

    public zul(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zul)) {
            return false;
        }
        zul zulVar = (zul) obj;
        return this.a == zulVar.a && this.b == zulVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
