package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zjn {
    public float a = 0.0f;
    public float b = 0.5f;
    public float c = 0.5f;

    public final float a(Rect rect, int i, int i2) {
        float fMax = Math.max(rect.width() / i, rect.height() / i2);
        float f = this.a;
        return f == 0.0f ? fMax : Math.max(fMax, f * fMax);
    }

    public final RectF b(Rect rect, int i, int i2) {
        float fA = a(rect, i, i2);
        int iRound = Math.round(i * fA) - rect.width();
        int iRound2 = Math.round(i2 * fA) - rect.height();
        float f = this.b * iRound;
        float f2 = this.c * iRound2;
        return new RectF(f, f2, rect.width() + f, rect.height() + f2);
    }

    public final void c(Rect rect, int i, int i2, float f, float f2) {
        float fA = a(rect, i, i2);
        float f3 = i;
        int iRound = Math.round(f3 * fA) - rect.width();
        float f4 = i2;
        int iRound2 = Math.round(f4 * fA) - rect.height();
        this.a = Math.max(1.0f, fA / Math.max(rect.width() / f3, rect.height() / f4));
        this.b = iRound == 0 ? 0.0f : nb6.i(f / iRound, 0.0f, 1.0f);
        this.c = iRound2 != 0 ? nb6.i(f2 / iRound2, 0.0f, 1.0f) : 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zjn.class == obj.getClass()) {
            zjn zjnVar = (zjn) obj;
            if (Float.compare(zjnVar.a, this.a) == 0 && Float.compare(zjnVar.b, this.b) == 0 && Float.compare(zjnVar.c, this.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
