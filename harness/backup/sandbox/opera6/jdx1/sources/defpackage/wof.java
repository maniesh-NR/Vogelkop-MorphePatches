package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class wof implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ hyf c;
    public final /* synthetic */ String d;

    public /* synthetic */ wof(Function0 function0, hyf hyfVar, String str, byte b) {
        this.a = b;
        this.b = function0;
        this.c = hyfVar;
        this.d = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.d;
        hyf hyfVar = this.c;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f03.a(this.b, zi4.i(vt9Var), false, (pta) null, (paj) null, gyg.P(1101758357, new y6d(hyfVar, str, (byte) 3), vt9Var), vt9Var, 1572864, 60);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f03.a(this.b, zi4.i(vt9Var2), false, (pta) null, (paj) null, gyg.P(-1929504650, new y6d(hyfVar, str, b3), vt9Var2), vt9Var2, 1572864, 60);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    f03.a(this.b, zi4.i(vt9Var3), false, (pta) null, (paj) null, gyg.P(639066201, new y6d(hyfVar, str, b2), vt9Var3), vt9Var3, 1572864, 60);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
