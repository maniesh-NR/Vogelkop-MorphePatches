package defpackage;

import com.leanplum.messagetemplates.OperaSubscriptionDialogRequestKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class gda implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ gda(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ gda(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        byte b = this.a;
        int i = this.b;
        ih5 ih5Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                y9m.b(i, ih5Var, aoh.m(1));
                return Unit.a;
            case 1:
                int iIntValue = num.intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i2 = this.b;
                    if (i2 != 0) {
                        vt9Var.W(1855001278);
                        j = ((sa5) vt9Var.j(ua5.a)).a;
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(1855072268);
                        j = ((kk8) vt9Var.j(lk8.a)).j;
                        vt9Var.p(false);
                    }
                    f8c.j(i2, j, (c8e) null, vt9Var, 0);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            case 2:
                num.getClass();
                vtp.b(i, ih5Var, aoh.m(1));
                return Unit.a;
            default:
                return OperaSubscriptionDialogRequestKt.b(i, ih5Var, num.intValue());
        }
    }
}
