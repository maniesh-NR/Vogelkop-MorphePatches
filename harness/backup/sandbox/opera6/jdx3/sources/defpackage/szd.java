package defpackage;

/* loaded from: classes.dex */
public final class szd extends tzd {
    public final int a;
    public final float b;

    public szd(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szd)) {
            return false;
        }
        szd szdVar = (szd) obj;
        return this.a == szdVar.a && Float.compare(this.b, szdVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
