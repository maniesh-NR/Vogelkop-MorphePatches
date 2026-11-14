package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v05 {
    public final Rect a;
    public final int[] b;
    public final float[] c;

    public v05(Rect rect, int[] iArr, float[] fArr) {
        this.a = rect;
        this.b = iArr;
        this.c = fArr;
    }

    public static v05 a(v05 v05Var, Rect rect, int[] iArr, float[] fArr, int i) {
        if ((i & 1) != 0) {
            rect = v05Var.a;
        }
        if ((i & 2) != 0) {
            iArr = v05Var.b;
        }
        if ((i & 4) != 0) {
            fArr = v05Var.c;
        }
        v05Var.getClass();
        return new v05(rect, iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v05.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v05 v05Var = (v05) obj;
        return this.a.equals(v05Var.a) && Arrays.equals(this.b, v05Var.b) && Arrays.equals(this.c, v05Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
