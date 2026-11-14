package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class zzm extends a73 {
    public final Object i;

    public zzm(ua7 ua7Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(ua7Var);
        this.i = obj;
    }

    @Override // defpackage.a73
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.a73
    public final Object e() {
        ua7 ua7Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return ua7Var.z(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        return e();
    }

    @Override // defpackage.a73
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.a73
    public final void i(float f) {
        this.d = f;
    }
}
