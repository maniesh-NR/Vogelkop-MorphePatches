package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class dal {
    public boolean a;
    public float b;
    public final /* synthetic */ gal c;

    public dal(gal galVar) {
        this.c = galVar;
    }

    public final boolean a() {
        boolean z = this.a;
        gal galVar = this.c;
        if (!z || this.b >= 0.5f || galVar.f == 0.0f) {
            return z && this.b > 0.5f && galVar.f != 1.0f;
        }
        return true;
    }

    public final void b(int i, int[] iArr) {
        gal galVar = this.c;
        int i2 = galVar.f() ? -i : i;
        boolean z = i2 < 0 && galVar.f > 0.0f;
        boolean z2 = i2 > 0 && galVar.f < 1.0f;
        if (z || z2) {
            if (!this.a) {
                this.a = true;
                this.b = galVar.f;
                ValueAnimator valueAnimator = galVar.k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.a) {
                galVar.f = djh.b(galVar.f + (i2 / gal.w.l(galVar.c.a.getContext())), 0.0f, 1.0f);
                galVar.e();
                iArr[0] = i;
            }
        }
    }
}
