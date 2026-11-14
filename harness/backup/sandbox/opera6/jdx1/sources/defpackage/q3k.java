package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q3k extends xjh {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = tym.a;
        d = "1";
        e = "2";
    }

    public q3k(int i) {
        z4o.v("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    public q3k(int i, float f) {
        boolean z = false;
        z4o.v("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        z4o.v("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.xjh
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.xjh
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(xjh.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3k)) {
            return false;
        }
        q3k q3kVar = (q3k) obj;
        return this.b == q3kVar.b && this.c == q3kVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }
}
