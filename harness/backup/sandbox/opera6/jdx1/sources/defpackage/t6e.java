package defpackage;

import android.content.Context;
import android.view.Window;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t6e extends d4 implements f87 {
    public final Window h;
    public final t0g i;
    public boolean j;

    public t6e(Context context, Window window) {
        super(context);
        this.h = window;
        this.i = hyg.k(if5.a);
    }

    @Override // defpackage.d4
    public final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(576708319);
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.i.getValue()).invoke(vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a7b(this, i, (byte) 17);
        }
    }

    @Override // defpackage.d4
    public final boolean g() {
        return this.j;
    }

    @Override // defpackage.f87
    public final Window getWindow() {
        return this.h;
    }
}
