package defpackage;

import com.leanplum.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lgs1;", "Lvf5;", "<init>", "()V", "Lks1;", Constants.Params.STATE, "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class gs1 extends vf5 {
    public final zyk a = z4c.b(new t2(this, (byte) 7));

    @Override // defpackage.vf5
    public final void g0(Function0 function0, ih5 ih5Var, int i) {
        Object obj;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-47626129);
        int i2 = (vt9Var.h(function0) ? 4 : 2) | i | (vt9Var.f(this) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            zyk zykVar = this.a;
            ks1 ks1Var = (ks1) dyg.h(((ms1) zykVar.getValue()).f, vt9Var).getValue();
            ms1 ms1Var = (ms1) zykVar.getValue();
            boolean zH = vt9Var.h(ms1Var);
            Object objK = vt9Var.K();
            Object obj2 = hh5.a;
            if (zH || objK == obj2) {
                obj = obj2;
                objK = new r2(1, ms1Var, ms1.class, "select", "select(Lcom/opera/android/settings/SettingsManager$AppFont;)V", 0, (byte) 9);
                vt9Var.g0(objK);
            } else {
                obj = obj2;
            }
            Function1 function1 = (mtb) objK;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objK2 = vt9Var.K();
            if (z || objK2 == obj) {
                objK2 = new x2(this, function0, (byte) 15);
                vt9Var.g0(objK2);
            }
            aib.a(ks1Var, function1, (Function0) objK2, function0, vt9Var, 8 | ((i2 << 9) & 7168));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(this, function0, i, (byte) 4);
        }
    }
}
