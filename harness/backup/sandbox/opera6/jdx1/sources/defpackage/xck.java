package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class xck implements xs3 {
    public final Function0 b;
    public final d2c c;
    public final boolean d;
    public final xs3 e;

    public xck(Function0 function0, d2c d2cVar, boolean z, xs3 xs3Var) {
        this.b = function0;
        this.c = d2cVar;
        this.d = z;
        this.e = xs3Var;
    }

    @Override // defpackage.xs3
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.invoke()).intValue();
        boolean z = this.c == d2c.b;
        if (this.d || !z) {
            f -= fIntValue;
        }
        return this.e.a(f, f2, f3 - fIntValue);
    }
}
