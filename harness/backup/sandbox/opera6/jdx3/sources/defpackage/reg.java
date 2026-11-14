package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class reg extends yf5 {
    public final gb3 a;

    public reg(gb3 gb3Var) {
        this.a = gb3Var;
    }

    @Override // defpackage.yf5
    public final void content(wf5 wf5Var, ih5 ih5Var, int i) {
        zpa zpaVar;
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1073878856);
        int i3 = (vt9Var.f(wf5Var) ? 4 : 2) | i | (vt9Var.f(this) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = vt9Var.K();
            zpa zpaVar2 = hh5.a;
            if (z || objK == zpaVar2) {
                zpaVar = zpaVar2;
                i2 = i4;
                e6g e6gVar = new e6g(0, wf5Var, wf5.class, "cancel", "cancel()V", 0, (byte) 2);
                vt9Var.g0(e6gVar);
                objK = e6gVar;
            } else {
                i2 = i4;
                zpaVar = zpaVar2;
            }
            Function0 function0 = (mtb) objK;
            boolean z2 = ((i3 & 112) == 32) | (i2 == 4);
            Object objK2 = vt9Var.K();
            if (z2 || objK2 == zpaVar) {
                objK2 = new s4f(this, wf5Var, (byte) 8);
                vt9Var.g0(objK2);
            }
            cs5.h(function0, (Function0) objK2, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(this, wf5Var, i, (byte) 23);
        }
    }
}
