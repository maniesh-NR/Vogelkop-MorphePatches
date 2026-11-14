package defpackage;

import android.util.Pair;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class xl6 implements n5o, cy1, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5f b;

    public /* synthetic */ xl6(x5f x5fVar, byte b) {
        this.a = b;
        this.b = x5fVar;
    }

    @Override // defpackage.cy1
    public final void c() {
        this.b.R(12, null);
    }

    public final Object g(Object obj) {
        byte b = this.a;
        x5f x5fVar = this.b;
        switch (b) {
            case 0:
                Pair pair = (Pair) obj;
                kg0 kg0Var = (kg0) pair.first;
                long jLongValue = ((Long) pair.second).longValue();
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    b66 b66VarF = x56VarF.F(zpaVar);
                    b66VarF.getClass();
                    b66VarF.q(34, kg0Var != null ? 1 : 0, kg0Var);
                    if (jLongValue >= 0) {
                        b66VarF.p(35, 1, jLongValue);
                    }
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            default:
                fxd fxdVar = (fxd) obj;
                String str = fxdVar.a;
                String str2 = fxdVar.b;
                String str3 = fxdVar.c;
                String str4 = fxdVar.d;
                zpa zpaVar2 = x5fVar.d;
                if (str != null || str2 != null || str3 != null || str4 != null) {
                    x56 x56VarF2 = zpa.F();
                    in0 in0VarI = x56VarF2.I(zpaVar2);
                    ri0 ri0Var = (ri0) in0VarI.n(31);
                    if (ri0Var == null) {
                        in0VarI.q(31, 1, new ri0(2443, 1, 4));
                        ri0Var = (ri0) in0VarI.n(31);
                    }
                    if (str != null) {
                        ri0Var.x(0, str);
                    }
                    if (str2 != null) {
                        ri0Var.x(1, str2);
                    }
                    if (str3 != null) {
                        ri0Var.x(2, str3);
                    }
                    if (str4 != null) {
                        ri0Var.x(3, str4);
                    }
                    x5fVar.U0(x56VarF2);
                }
                ei0 ei0Var = fxdVar.e;
                x56 x56VarF3 = zpa.F();
                q56 q56VarZ = x56VarF3.z(zpaVar2);
                q56VarZ.getClass();
                q56VarZ.q(24, ei0Var != null ? 1 : 0, ei0Var);
                x5fVar.U0(x56VarF3);
                break;
        }
        return null;
    }

    public final void onSuccess(Object obj) {
        String str = (String) obj;
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        x5f x5fVar = this.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.D(zpaVar).x(8, str);
        x5fVar.U0(x56VarF);
    }
}
