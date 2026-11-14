package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class iya extends hyf {
    public final jva f;

    public iya(jva jvaVar) {
        this.f = jvaVar;
    }

    public final long h() {
        jva jvaVar = this.f;
        int width = jvaVar.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(jvaVar.getHeight() > 0 ? r6 : Float.NaN) & 4294967295L);
    }

    public final void i(mk7 mk7Var) {
        jva jvaVar = this.f;
        int width = jvaVar.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (mk7Var.e() >> 32)) / width : 1.0f;
        int height = jvaVar.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L)) / height : 1.0f;
        d5o d5oVarS0 = mk7Var.s0();
        long jD = d5oVarS0.D();
        d5oVarS0.A().j();
        try {
            ((wth) d5oVarS0.a).N(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            a31 a31VarA = mk7Var.s0().A();
            Canvas canvas = b31.a;
            jvaVar.c(a31VarA.a);
        } finally {
            am2.w(d5oVarS0, jD);
        }
    }
}
