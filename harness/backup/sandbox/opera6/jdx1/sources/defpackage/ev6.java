package defpackage;

/* loaded from: classes.dex */
public final class ev6 implements toi {
    public final /* synthetic */ fv6 a;

    public ev6(fv6 fv6Var) {
        this.a = fv6Var;
    }

    @Override // defpackage.toi
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        fv6 fv6Var = this.a;
        float fFloatValue = ((Number) fv6Var.a.invoke(Float.valueOf(f))).floatValue();
        fv6Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        fv6Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
