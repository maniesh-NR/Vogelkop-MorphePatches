package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.opera.android.OperaApplication;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ty7 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Context v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty7(Context context, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Context context = this.v;
        switch (b) {
            case 0:
                return new ty7(context, mt5Var, (byte) 0);
            case 1:
                return new ty7(context, mt5Var, (byte) 1);
            case 2:
                ty7 ty7Var = new ty7(context, mt5Var, (byte) 2);
                ty7Var.u = ((Boolean) obj).booleanValue();
                return ty7Var;
            default:
                return new ty7(context, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ty7 ty7Var = new ty7(this.v, (mt5) obj2, (byte) 2);
                ty7Var.u = zBooleanValue;
                return ty7Var.invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objW;
        Object objZ;
        int iMin;
        String str;
        String id;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    n9a n9aVar = n9a.c;
                    Context context = this.v;
                    this.u = true;
                    if (n9aVar.v(context, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    String[] strArr = OperaApplication.K;
                    kze kzeVar = ((OperaApplication) this.v.getApplicationContext()).M().i;
                    xf xfVar = new xf(2, null, (byte) 17);
                    this.u = true;
                    objW = xf8.w(kzeVar, xfVar, this);
                    if (objW == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objW = obj;
                }
                return Boolean.valueOf(((wvg) objW).b());
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                pvf.a(this.v, RescheduleReceiver.class, this.u);
                return Unit.a;
            default:
                px5 px5Var4 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    cv6 cv6Var = bb7.a;
                    mr6 mr6Var = mr6.b;
                    uwo uwoVar = new uwo(this.v, null);
                    this.u = true;
                    objZ = na2.Z(mr6Var, uwoVar, this);
                    if (objZ == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objZ = obj;
                }
                swo swoVar = (swo) objZ;
                zyk zykVar = fap.a;
                Size sizeC = fap.c(this.v);
                String strK = lah.k(this.v);
                azo azoVar = swoVar.a;
                AdvertisingIdClient.Info info = epo.a;
                boolean zIsLimitAdTrackingEnabled = info != null ? info.isLimitAdTrackingEnabled() : false;
                Context applicationContext = this.v.getApplicationContext();
                int i = applicationContext.getResources().getConfiguration().smallestScreenWidthDp;
                Integer numValueOf = Integer.valueOf(i);
                if (i == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iMin = numValueOf.intValue();
                } else {
                    iMin = (int) (Math.min(r3.widthPixels, r3.heightPixels) / r8p.a(applicationContext).density);
                }
                int i2 = iMin >= 600 ? 5 : 4;
                String str2 = Build.MANUFACTURER;
                String str3 = Build.MODEL;
                String str4 = Build.VERSION.RELEASE;
                String str5 = Build.DEVICE;
                int width = sizeC.getWidth();
                int height = sizeC.getHeight();
                DisplayMetrics displayMetrics = this.v.getResources().getDisplayMetrics();
                int iSqrt = (int) Math.sqrt(displayMetrics.xdpi * displayMetrics.ydpi);
                float f = this.v.getResources().getDisplayMetrics().density;
                boolean z4 = swoVar.f;
                String language = Locale.getDefault().getLanguage();
                String str6 = swoVar.c;
                String str7 = swoVar.d;
                int i3 = swoVar.e.a;
                AdvertisingIdClient.Info info2 = epo.a;
                if (info2 != null && (id = info2.getId()) != null) {
                    str = str6;
                    String str8 = id.equals("00000000-0000-0000-0000-000000000000") ? null : id;
                    return new jzo(strK, azoVar, zIsLimitAdTrackingEnabled ? 1 : 0, i2, width, height, iSqrt, f, z4 ? 1 : 0, language, str, str7, i3, str8, swoVar.b);
                }
                str = str6;
                return new jzo(strK, azoVar, zIsLimitAdTrackingEnabled ? 1 : 0, i2, width, height, iSqrt, f, z4 ? 1 : 0, language, str, str7, i3, str8, swoVar.b);
        }
    }
}
