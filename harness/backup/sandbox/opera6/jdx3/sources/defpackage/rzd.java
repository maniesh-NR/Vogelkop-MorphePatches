package defpackage;

/* loaded from: classes.dex */
public final class rzd extends tzd {
    public final int a;
    public final float b;

    public rzd(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzd)) {
            return false;
        }
        rzd rzdVar = (rzd) obj;
        return this.a == rzdVar.a && Float.compare(this.b, rzdVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
