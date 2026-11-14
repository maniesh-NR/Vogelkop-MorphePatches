package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class thg {
    public static final thg d = new thg(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = tym.a;
        e = "0";
        f = "1";
    }

    public thg(float f2) {
        this(f2, 1.0f);
    }

    public thg(float f2, float f3) {
        z4o.w(f2 > 0.0f);
        z4o.w(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && thg.class == obj.getClass()) {
            thg thgVar = (thg) obj;
            if (this.a == thgVar.a && this.b == thgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = tym.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
