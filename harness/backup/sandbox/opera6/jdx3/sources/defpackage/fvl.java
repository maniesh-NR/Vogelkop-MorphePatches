package defpackage;

/* loaded from: classes.dex */
public final class fvl {
    public static final fvl c = new fvl(0, 0.0f);
    public final int a;
    public final float b;

    public fvl(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean a() {
        return this.a > 0 && this.b > 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvl)) {
            return false;
        }
        fvl fvlVar = (fvl) obj;
        return this.a == fvlVar.a && Float.compare(this.b, fvlVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
