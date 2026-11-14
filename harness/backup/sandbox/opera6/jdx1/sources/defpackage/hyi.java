package defpackage;

/* loaded from: classes.dex */
public final class hyi {
    public final float a;
    public final float b;

    public hyi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hyi)) {
            return false;
        }
        return gh7.b(0.0f, 0.0f) && gh7.b(0.0f, 0.0f) && gh7.b(0.0f, 0.0f) && gh7.b(this.a, ((hyi) obj).a) && gh7.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(this.a) * 31;
    }
}
