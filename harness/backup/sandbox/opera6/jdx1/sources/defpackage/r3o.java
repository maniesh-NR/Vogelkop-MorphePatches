package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r3o {
    public final gr3 a;
    public final float b;

    public r3o(Rect rect, float f) {
        this(new gr3(rect), f);
    }

    public r3o(gr3 gr3Var, float f) {
        this.a = gr3Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r3o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        r3o r3oVar = (r3o) obj;
        return Intrinsics.a(this.a, r3oVar.a) && this.b == r3oVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }
}
