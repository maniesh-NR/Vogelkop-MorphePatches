package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class p31 extends b8e implements ms3, i0j, tub, e3c, u5m {
    public final z3 o = new z3(this, (byte) 17);
    public final /* synthetic */ v31 p;

    public p31(v31 v31Var) {
        this.p = v31Var;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
    }

    @Override // defpackage.tub
    public final boolean V(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.A(ifgVarN.a, ifgVarN.b, n08.a, this.o, new f4(ifgVarN, (byte) 1));
    }

    @Override // defpackage.tub
    public final boolean c0(KeyEvent keyEvent) {
        lf9 lf9Var;
        v31 v31Var = this.p;
        o31 o31Var = v31Var.x0;
        gg9 gg9Var = v31Var.l;
        int[] iArr = ag9.a;
        long jS = uup.s(keyEvent);
        if (jub.a(jS, jub.b)) {
            lf9Var = new lf9(2);
        } else if (jub.a(jS, jub.c)) {
            lf9Var = new lf9(1);
        } else if (jub.a(jS, jub.p)) {
            lf9Var = new lf9(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            lf9Var = jub.a(jS, jub.g) ? new lf9(4) : jub.a(jS, jub.f) ? new lf9(3) : (jub.a(jS, jub.d) || jub.a(jS, jub.C)) ? new lf9(5) : (jub.a(jS, jub.e) || jub.a(jS, jub.D)) ? new lf9(6) : (jub.a(jS, jub.h) || jub.a(jS, jub.r) || jub.a(jS, jub.E)) ? new lf9(7) : (jub.a(jS, jub.a) || jub.a(jS, jub.u)) ? new lf9(8) : null;
        }
        if (lf9Var != null) {
            byte b = lf9Var.a;
            if (uup.t(keyEvent) == 2) {
                vg9 vg9VarF = gg9Var.f();
                if (vg9VarF != null && vg9VarF.o && v31Var.A(b)) {
                    o31Var.invoke(lf9Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolE = gg9Var.e(b, v31Var.i(), new z3(lf9Var, (byte) 16));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    o31Var.invoke(lf9Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (b != 1 && b != 2) {
                    return false;
                }
                Integer numC = ag9.c(b);
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) v31Var.getRootView(), v31Var, numC != null ? numC.intValue() : 2);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(v31Var)) {
                    return gg9Var.h(b);
                }
            }
        }
        return false;
    }

    @Override // defpackage.ms3
    public final Object d0(wye wyeVar, gb3 gb3Var, nt5 nt5Var) {
        long jU = wyeVar.U(0L);
        voh vohVar = (voh) gb3Var.invoke();
        voh vohVarI = vohVar != null ? vohVar.i(jU) : null;
        if (vohVarI != null) {
            this.p.requestRectangleOnScreen(new Rect((int) vohVarI.a, (int) vohVarI.b, (int) vohVarI.c, (int) vohVarI.d), false);
        }
        return Unit.a;
    }

    @Override // defpackage.u5m
    public final Object h() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
