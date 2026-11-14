package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gx implements zw5 {
    public final zw5 a;
    public final float b;

    public gx(float f, zw5 zw5Var) {
        while (zw5Var instanceof gx) {
            zw5Var = ((gx) zw5Var).a;
            f += ((gx) zw5Var).b;
        }
        this.a = zw5Var;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return this.a.equals(gxVar.a) && this.b == gxVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
