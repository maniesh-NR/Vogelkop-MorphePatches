package defpackage;

/* loaded from: classes.dex */
public final class t89 extends awb {
    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        return Float.valueOf(l(zvbVar, f));
    }

    public final float k() {
        return l(this.c.h(), c());
    }

    public final float l(zvb zvbVar, float f) {
        float f2;
        Object obj = zvbVar.b;
        Object obj2 = zvbVar.b;
        if (obj == null || zvbVar.c == null) {
            qp2.n("Missing values for keyframe.");
            return 0.0f;
        }
        ua7 ua7Var = this.e;
        if (ua7Var != null) {
            f2 = f;
            Float f3 = (Float) ua7Var.z(zvbVar.g, zvbVar.h.floatValue(), (Float) obj2, (Float) zvbVar.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = zvbVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj2).floatValue();
            zvbVar.i = fFloatValue;
        }
        float fFloatValue2 = zvbVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) zvbVar.c).floatValue();
            zvbVar.j = fFloatValue2;
        }
        return l1e.d(fFloatValue, fFloatValue2, f2);
    }
}
