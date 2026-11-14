package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class ji implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ ji(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object get() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) ((yk6) operaApplication.e().get()).i.g();
                bool.getClass();
                return bool;
            case 1:
                return Boolean.valueOf(operaApplication.s().t());
            case 2:
                return Boolean.valueOf(((k3i) operaApplication.D.get()).b());
            case 3:
                int i = BrowserActivity.E1;
                return operaApplication.A();
            case 4:
                int i2 = BrowserActivity.E1;
                return operaApplication.A();
            case 5:
                int i3 = BrowserActivity.E1;
                return operaApplication.A();
            case 6:
                int i4 = BrowserActivity.E1;
                return operaApplication.b();
            case 7:
                int i5 = BrowserActivity.E1;
                return operaApplication.b();
            case 8:
                int i6 = BrowserActivity.E1;
                return cqp.f0(operaApplication);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i7 = BrowserActivity.E1;
                return operaApplication.q().b(d59.d);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i8 = BrowserActivity.E1;
                return ((k3i) operaApplication.D.get()).a();
            case 11:
                int i9 = BrowserActivity.E1;
                return xf8.u(((dp6) operaApplication.v.get()).b().t());
            case 12:
                int i10 = BrowserActivity.E1;
                return operaApplication.r().j;
            case 13:
                return tvg.t(operaApplication);
            case 14:
                return cxc.t(operaApplication);
            case 15:
                return dj9.t(operaApplication);
            case 16:
                return operaApplication.b();
            case 17:
                return cqp.f0(operaApplication);
            case SizeUtil.textSize0_1 /* 18 */:
                return ru9.c(operaApplication);
            case 19:
                return operaApplication.b();
            case SizeUtil.textSize0 /* 20 */:
                return ru9.c(operaApplication);
            case 21:
                return (zgf) operaApplication.r.p0.get();
            case SizeUtil.textSize1 /* 22 */:
                return operaApplication.J();
            case 23:
                return operaApplication.L().c;
            case SizeUtil.textSize2 /* 24 */:
                return operaApplication.L().d;
            case 25:
                return operaApplication.y().c();
            case 26:
                return (vnj) operaApplication.r.R0.get();
            case 27:
                return operaApplication.b();
            case 28:
                return operaApplication.N();
            default:
                return (n6g) operaApplication.r.q0.get();
        }
    }
}
