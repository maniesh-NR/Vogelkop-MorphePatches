package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.k3p;
import defpackage.p37;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class og extends h83 {
    public final Map f;
    public final Context g;
    public final ga3 h;
    public final long i;
    public final long j;

    public og(k3p k3pVar, rp1 rp1Var, Map map, Context context, ga3 ga3Var, l7 l7Var, th3 th3Var) {
        super("sQl0r6fAFbuiRCcit5u5BHDOrR2XPZLb0v619n7yDveBTFBh0qsw2WRwS5lJ8qr1", "CPYux07UMqok2uRowLl19+EBIA0qrZwhsEDL2e/zv50=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_APP_INFO_SIGNALS_TASK));
        this.g = context;
        this.f = map;
        this.h = ga3Var;
        this.i = l7Var.B();
        this.j = l7Var.F();
    }

    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) {
        pd pdVar;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String strP = "E";
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.f.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (pdVar = (pd) listenableFuture.get(this.i, TimeUnit.MILLISECONDS)) != null && pdVar.p().length() > 1)) {
                strP = pdVar.p();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strP.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!p37.y0(str)) {
                        strP = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        Long l = (Long) objArr[6];
        synchronized (k3pVar) {
            Object obj = objArr[4];
            String strEncodeToString = obj instanceof byte[] ? Base64.encodeToString(n63.c.g().c((byte[]) obj).getBytes(StandardCharsets.UTF_8), 11) : (String) obj;
            long jLongValue = ((Long) objArr[0]).longValue();
            k3pVar.b$1();
            pd pdVar2 = (pd) k3pVar.b;
            pdVar2.bitField0_ |= 536870912;
            pdVar2.vcdSignal_ = jLongValue;
            String str2 = (String) objArr[1];
            k3pVar.b$1();
            ((pd) k3pVar.b).k(str2);
            String str3 = (String) objArr[2];
            k3pVar.b$1();
            ((pd) k3pVar.b).e(str3);
            String str4 = (String) objArr[3];
            k3pVar.b$1();
            ((pd) k3pVar.b).h(str4);
            k3pVar.b$1();
            ((pd) k3pVar.b).f(strEncodeToString);
            k3pVar.b$1();
            ((pd) k3pVar.b).i(strP);
            if (bool != null) {
                int i = bool.booleanValue() ? 2 : 1;
                k3pVar.b$1();
                pd pdVar3 = (pd) k3pVar.b;
                pdVar3.getClass();
                pdVar3.launcherActivityEnabled_ = sko.a(i);
                pdVar3.bitField2_ |= 32;
            }
            if (l != null) {
                int i_a$1 = sko._a$1(l.intValue());
                if (i_a$1 == 0) {
                    throw null;
                }
                k3pVar.b$1();
                pd pdVar4 = (pd) k3pVar.b;
                pdVar4.getClass();
                pdVar4.isLauncherSignal_ = sko.a(i_a$1);
                pdVar4.bitField3_ |= 1024;
            }
        }
    }
}
