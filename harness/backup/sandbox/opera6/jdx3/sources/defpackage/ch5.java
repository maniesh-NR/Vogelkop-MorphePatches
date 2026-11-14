package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ch5 extends d4 {
    public final t0g h;
    public boolean i;

    public ch5(Context context) {
        super(context);
        this.h = hyg.k((Object) null);
    }

    public final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(420213850);
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.h.getValue();
            if (function2 == null) {
                vt9Var.W(-1238823553);
            } else {
                vt9Var.W(98585282);
                function2.invoke(vt9Var, 0);
            }
            vt9Var.p(false);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new whf(this, i, (byte) 14);
        }
    }

    public final boolean g() {
        return this.i;
    }

    public final CharSequence getAccessibilityClassName() {
        return ch5.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Function2 function2) {
        this.i = true;
        this.h.setValue(function2);
        if (isAttachedToWindow()) {
            d();
        }
    }
}
