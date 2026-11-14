package defpackage;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class iq4 extends hyf {
    public final j71 f;
    public final long g;

    public iq4(j71 j71Var) {
        this.f = j71Var;
        Bitmap bitmap = j71Var.a;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        this.g = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
    }

    @Override // defpackage.hyf
    public final long h() {
        return this.g;
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        j71 j71Var = this.f;
        int iMin = Math.min(j71Var.a.getWidth(), j71Var.a.getHeight());
        d91 d91VarA = f91.a();
        voh vohVarA = bwg.a(0L, mk7Var.e());
        u6g[] u6gVarArr = u6g.a;
        RectF rectF = d91VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            d91VarA.b = rectF;
        }
        rectF.set(vohVarA.a, vohVarA.b, vohVarA.c, vohVarA.d);
        d91VarA.a.addOval(d91VarA.b, Path.Direction.CCW);
        d5o d5oVarS0 = mk7Var.s0();
        long jD = d5oVarS0.D();
        d5oVarS0.A().j();
        try {
            ((d5o) ((wth) d5oVarS0.a).b).A().n(d91VarA);
            j71 j71Var2 = this.f;
            long height = (((j71Var.a.getHeight() - iMin) / 2) & 4294967295L) | (((j71Var2.a.getWidth() - iMin) / 2) << 32);
            long j = iMin;
            mk7.e0(mk7Var, j71Var2, height, (j << 32) | (j & 4294967295L), (zed.b(Float.intBitsToFloat((int) (mk7Var.e() >> 32))) << 32) | (zed.b(Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L))) & 4294967295L), 0.0f, null, 0, 1000);
        } finally {
            am2.w(d5oVarS0, jD);
        }
    }
}
