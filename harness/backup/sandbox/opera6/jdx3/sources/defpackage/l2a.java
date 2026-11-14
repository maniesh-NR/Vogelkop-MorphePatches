package defpackage;

/* loaded from: classes.dex */
public final class l2a {
    public final int a;
    public final float b;

    public l2a(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a)) {
            return false;
        }
        l2a l2aVar = (l2a) obj;
        return this.a == l2aVar.a && Float.compare(this.b, l2aVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
