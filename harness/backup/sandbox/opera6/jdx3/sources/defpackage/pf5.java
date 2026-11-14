package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class pf5 extends yf5 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final int d;
    public final int e;
    public final int f;

    public pf5(Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, Function0 function04) {
        super(function04);
        this.a = function0;
        this.b = function02;
        this.c = function03;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.yf5
    public final void content(wf5 wf5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1238432804);
        int i2 = (vt9Var.f(wf5Var) ? 4 : 2) | i | (vt9Var.h(this) ? 32 : 16);
        byte b = 0;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean zH = vt9Var.h(this) | ((i2 & 14) == 4);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new nf5(this, wf5Var, b);
                vt9Var.g0(objK);
            }
            yi4.g((Function0) objK, (c8e) null, false, false, 0L, (u8i) null, gyg.P(-285595174, new of5(this, wf5Var, b), vt9Var), vt9Var, 1572864, 62);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new of5(this, wf5Var, i);
        }
    }
}
