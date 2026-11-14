package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class yf5 extends d63 {
    public static final int $stable = 8;

    @NotNull
    private final Function0<Unit> onShown;

    public /* synthetic */ yf5() {
        this(new mf5((byte) 9));
    }

    public yf5(Function0 function0) {
        this.onShown = function0;
    }

    public void content(wf5 wf5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1959971370);
        int i2 = (vt9Var.f(wf5Var) ? 4 : 2) | i | (vt9Var.f(this) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (z || objK == obj) {
                objK = new x2((Object) this, (Object) wf5Var, (byte) 6);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objK2 = vt9Var.K();
            if (z2 || objK2 == obj) {
                objK2 = new q3(this, wf5Var, (byte) 5);
                vt9Var.g0(objK2);
            }
            yi4.b(function0, (Function1) objK2, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(this, wf5Var, i, (byte) 0);
        }
    }

    @Override // defpackage.b87
    public rim createDialog(@NotNull Context context, b2l b2lVar) {
        Activity activity;
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = (Activity) context;
                break;
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return new tf5(activity, this.onShown, new ue5(-198511092, new fx0(this, new xf5(this), (byte) 16), true));
    }
}
