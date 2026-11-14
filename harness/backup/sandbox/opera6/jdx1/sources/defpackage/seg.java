package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class seg implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ seg(Function0 function0, Function0 function02) {
        this.b = function0;
        this.c = function02;
    }

    public /* synthetic */ seg(Function0 function0, Function0 function02, int i) {
        this.b = function0;
        this.c = function02;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        byte b = this.a;
        Function0 function0 = this.c;
        Function0 function02 = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j14.h(null, new aif(phj.h0(vt9Var, 2131232181)), mzg.q(vt9Var, 2132020491), mzg.q(vt9Var, 2132020490), gyg.P(-1512896579, new is1(function02, (byte) 10), vt9Var), gyg.P(-294616962, new is1(function0, (byte) 11), vt9Var), 0L, 0L, 0, 0, 0, false, vt9Var, 221184, 4033);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                cs5.h(function02, function0, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
