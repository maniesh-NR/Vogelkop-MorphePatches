package defpackage;

import com.opera.android.OperaApplication;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class et3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ et3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 0;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                return operaApplication.s();
            case 1:
                return ((u8k) operaApplication.I.get()).b();
            case 2:
                return (eri) ((ize) operaApplication.r.y.get()).g();
            case 3:
                return (rnc) ((snc) operaApplication.r.W.get()).l.getValue();
            case 4:
                return ru9.c(operaApplication);
            case 5:
                return (u8k) operaApplication.I.get();
            case 6:
                return operaApplication.L().c;
            case 7:
                return (qtg) operaApplication.M().c.g.g();
            case 8:
                ke6 ke6Var = me6.d;
                xtb xtbVar = me6.a[0];
                return (qd6) ke6Var.a(operaApplication);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String[] strArr = OperaApplication.K;
                fl5 fl5Var = new fl5();
                fl5Var.a = 1000;
                fl5Var.b = (byte) 6;
                w17 w17Var = new w17();
                xv1 xv1Var = operaApplication.r;
                pkh pkhVar = new pkh(xv1Var.B0, xv1Var.D0);
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) w17Var.b;
                copyOnWriteArrayList.add(pkhVar);
                copyOnWriteArrayList.add(new ju9(vml.d, new fif(operaApplication, b2), new fif(operaApplication, (byte) 1)));
                copyOnWriteArrayList.add(new w17(operaApplication.v));
                fl5Var.c = w17Var;
                fl5Var.d = new z67((byte) 4);
                return new jl5(fl5Var);
            default:
                return operaApplication.b();
        }
    }
}
