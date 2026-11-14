package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.history.HistoryManager;

/* loaded from: classes.dex */
public final /* synthetic */ class lw3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ lw3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object get() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                ebb ebbVar = ebb.c;
                return j06.m(u59.C(operaApplication).H().b);
            case 1:
                return operaApplication.b();
            case 2:
                return operaApplication.L().d;
            case 3:
                return operaApplication.M();
            case 4:
                return operaApplication.D();
            case 5:
                return operaApplication.L().c;
            case 6:
                return ru9.c(operaApplication);
            case 7:
                return operaApplication.z();
            case 8:
                return operaApplication.R();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (vk6) operaApplication.r.h.get();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return ((h0a) operaApplication.x.get()).d;
            case 11:
                return operaApplication.k();
            case 12:
                return operaApplication.O();
            case 13:
                return (wc7) operaApplication.r.B.get();
            case 14:
                return operaApplication.I();
            case 15:
                return operaApplication.y();
            case 16:
                return new bxk((Object) operaApplication.J(), (byte) 15);
            case 17:
                return cqp.e0(operaApplication);
            case SizeUtil.textSize0_1 /* 18 */:
                return (pqi) operaApplication.r.K0.get();
            case 19:
                return (som) operaApplication.r.b1.get();
            case SizeUtil.textSize0 /* 20 */:
                return operaApplication.s();
            case 21:
                return Boolean.valueOf(operaApplication.h().m());
            case SizeUtil.textSize1 /* 22 */:
                return dj9.t(operaApplication);
            case 23:
                return (ri3) ((si3) operaApplication.r.o.get()).t.getValue();
            case SizeUtil.textSize2 /* 24 */:
                return operaApplication.J();
            case 25:
                return ((k3i) operaApplication.D.get()).a();
            case 26:
                return (HistoryManager) operaApplication.r.R.get();
            case 27:
                return (f8f) ((lpe) operaApplication.A.get()).c.getValue();
            case 28:
                return operaApplication.F();
            default:
                return operaApplication.G();
        }
    }
}
