package defpackage;

/* loaded from: classes.dex */
public final class aom implements dom {
    public final int a;

    public aom(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aom) && this.a == ((aom) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
