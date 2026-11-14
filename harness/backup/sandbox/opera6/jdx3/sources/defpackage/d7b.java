package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d7b {
    public final dfe a = new dfe(new b7b[16]);
    public final t0g b = hyg.k(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final t0g d = hyg.k(Boolean.TRUE);

    public final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-318043801);
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = hyg.k((Object) null);
                vt9Var.g0(objK);
            }
            afe afeVar = (afe) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                vt9Var.W(-144841960);
                boolean zH = vt9Var.h(this);
                Object objK2 = vt9Var.K();
                if (zH || objK2 == zpaVar) {
                    objK2 = new jj4(afeVar, this, (mt5) null, (byte) 10);
                    vt9Var.g0(objK2);
                }
                rm5.e(vt9Var, this, (Function2) objK2);
                vt9Var.p(false);
            } else {
                vt9Var.W(-143455237);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a7b(this, i, (byte) 0);
        }
    }
}
