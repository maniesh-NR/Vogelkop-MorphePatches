package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i9g extends xjh {
    public static final String c;
    public final float b;

    static {
        String str = tym.a;
        c = "1";
    }

    public i9g() {
        this.b = -1.0f;
    }

    public i9g(float f) {
        z4o.v("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // defpackage.xjh
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.xjh
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(xjh.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i9g) {
            return this.b == ((i9g) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }
}
