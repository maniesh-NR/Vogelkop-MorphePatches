package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class nw3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ nw3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object get() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                return operaApplication.b();
            case 1:
                return operaApplication.N();
            case 2:
                return operaApplication.L().c;
            case 3:
                return operaApplication.L().d;
            case 4:
                return operaApplication.L().c;
            case 5:
                return ru9.c(operaApplication);
            case 6:
                return operaApplication.J();
            case 7:
                return operaApplication.c();
            case 8:
                return (xt8) operaApplication.r.I.get();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return operaApplication.E();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return operaApplication.S();
            case 11:
                return operaApplication.T();
            case 12:
                return operaApplication.M();
            case 13:
                return ru9.c(operaApplication);
            case 14:
                return operaApplication.R();
            case 15:
                return operaApplication.J();
            case 16:
                return operaApplication.L().c;
            case 17:
                return operaApplication.b();
            case SizeUtil.textSize0_1 /* 18 */:
                return operaApplication.L().c;
            case 19:
                return cqp.f0(operaApplication);
            case SizeUtil.textSize0 /* 20 */:
                return operaApplication.B();
            case 21:
                return (zv9) operaApplication.r.O.get();
            case SizeUtil.textSize1 /* 22 */:
                return operaApplication.y();
            case 23:
                return operaApplication.J();
            case SizeUtil.textSize2 /* 24 */:
                return operaApplication.B();
            case 25:
                return (xt8) operaApplication.r.I.get();
            case 26:
                return operaApplication.L().c;
            case 27:
                return Boolean.valueOf(((wvg) operaApplication.M().i.g()).b());
            case 28:
                return operaApplication.R();
            default:
                return operaApplication.L().c;
        }
    }
}
