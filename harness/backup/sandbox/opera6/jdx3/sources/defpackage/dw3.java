package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.h;

/* loaded from: classes.dex */
public final /* synthetic */ class dw3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ dw3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object get() {
        String str;
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                return ((lpe) operaApplication.A.get()).c;
            case 1:
                return operaApplication.J();
            case 2:
                return operaApplication.L().c;
            case 3:
                return operaApplication.L().d;
            case 4:
                return operaApplication.L().c;
            case 5:
                return operaApplication.L().d;
            case 6:
                return xf8.u(((lpe) operaApplication.A.get()).s);
            case 7:
                return ((h0a) operaApplication.x.get()).d;
            case 8:
                return operaApplication.h();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return operaApplication.m();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return operaApplication.L().c;
            case 11:
                return (rq8) operaApplication.r.G.get();
            case 12:
                return operaApplication.J();
            case 13:
                return operaApplication.L().d;
            case 14:
                return (zzj) operaApplication.r.U0.get();
            case 15:
                return operaApplication.o();
            case 16:
                return (h) operaApplication.g();
            case 17:
                return operaApplication.L().c;
            case SizeUtil.textSize0_1 /* 18 */:
                return operaApplication.J();
            case 19:
                return (String) operaApplication.y().f.g();
            case SizeUtil.textSize0 /* 20 */:
                return operaApplication.B();
            case 21:
                return operaApplication.v();
            case SizeUtil.textSize1 /* 22 */:
                return operaApplication.L().c;
            case 23:
                return (cs6) ((snc) operaApplication.r.W.get()).j.get();
            case SizeUtil.textSize2 /* 24 */:
                return (xoc) ((snc) operaApplication.r.W.get()).k.getValue();
            case 25:
                return (f3j) ((snc) operaApplication.r.W.get()).n.get();
            case 26:
                hs3.a.getClass();
                return n9a.t(operaApplication);
            case 27:
                jk5 jk5VarI = operaApplication.i();
                synchronized (jk5VarI.d) {
                    str = jk5VarI.e;
                }
                return str == null ? jk5VarI.a() : str;
            case 28:
                pcl pclVar = pcl.c;
                if (!operaApplication.J().i("eula_accepted.gdpr")) {
                    return pclVar;
                }
                String strD = jpo.D(operaApplication);
                return strD != null ? new pcl(strD) : operaApplication.J().u("personalized_ads") ? pcl.b : pclVar;
            default:
                return r9n.t(operaApplication).versionName;
        }
    }
}
