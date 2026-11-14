package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import defpackage.coh;
import defpackage.qqo;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bn0 {
    public final Context a;
    public final ah3 b;
    public final ux2 c;
    public final qr0 d;
    public final zyk e = z4c.b(new qqo(this, 8));
    public final pfe f = new pfe();
    public String g;

    public bn0(Context context, ah3 ah3Var, ux2 ux2Var, qr0 qr0Var) {
        this.a = context;
        this.b = ah3Var;
        this.c = ux2Var;
        this.d = qr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bn0 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.an0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.an0 r0 = (ads_mobile_sdk.an0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.an0 r0 = new ads_mobile_sdk.an0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.bn0 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.f
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            java.lang.String r0 = r5.g     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L5a
            java.lang.String r0 = "getGmpAppId"
            java.lang.Object r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e
            goto L58
        L57:
            r0 = r4
        L58:
            r5.g = r0     // Catch: java.lang.Throwable -> L5e
        L5a:
            r6.l(r4)
            return r0
        L5e:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bn0.a(ads_mobile_sdk.bn0, nt5):java.lang.Object");
    }

    public static Unit a(bn0 bn0Var, ym0 ym0Var, Bundle bundle, String str) {
        Unit unit;
        ux2 ux2Var = bn0Var.c;
        fw0 fw0Var = fw0.CUI_NAME_LOG_EVENT_TO_FIREBASE_ANALYTICS;
        l08 l08Var = l08.a;
        kh3 kh3VarE = coh.e();
        if (hh3.b().a == null) {
            wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3VarE);
            try {
                try {
                    if (bn0Var.e.getValue() != null) {
                        Method method = Class.forName(bn0Var.d.N()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle2 = bundle.getBundle(ym0Var.a);
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putLong("_aeid", Long.parseLong(str));
                        String str2 = ym0Var.a;
                        ym0 ym0Var2 = ym0.b;
                        if (str2.equals("_ac")) {
                            bundle2.putInt("_r", 1);
                        }
                        method.invoke(bn0Var.e.getValue(), "am", ym0Var.a, bundle2);
                    }
                } catch (Exception e) {
                    xh3.a("Exception while calling Firebase Analytics SDK logEvent method", e, 4);
                    bn0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + ym0Var, (Throwable) e);
                }
                unit = Unit.a;
                wk2VarA.close();
            } catch (Throwable th) {
                try {
                    wk2VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    wk2VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } finally {
                }
            }
        } else {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                try {
                    if (bn0Var.e.getValue() != null) {
                        Method method2 = Class.forName(bn0Var.d.N()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle3 = bundle.getBundle(ym0Var.a);
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putLong("_aeid", Long.parseLong(str));
                        String str3 = ym0Var.a;
                        ym0 ym0Var3 = ym0.b;
                        if (str3.equals("_ac")) {
                            bundle3.putInt("_r", 1);
                        }
                        method2.invoke(bn0Var.e.getValue(), "am", ym0Var.a, bundle3);
                    }
                } catch (Throwable th2) {
                    try {
                        rg3VarA.b(th2);
                        if (th2 instanceof iyo) {
                            throw th2;
                        }
                        rg3VarA.a(th2);
                        if (th2 instanceof kql) {
                            throw new uw0((kql) th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw new ou0(th2);
                        }
                        if (th2 instanceof mv0) {
                            throw th2;
                        }
                        throw new tu0(th2);
                    } finally {
                    }
                }
            } catch (Exception e2) {
                xh3.a("Exception while calling Firebase Analytics SDK logEvent method", e2, 4);
                bn0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + ym0Var, (Throwable) e2);
            }
            unit = Unit.a;
            rg3VarA.close();
        }
        return unit;
    }

    public final Object a(String str) {
        zyk zykVar = this.e;
        try {
            if (zykVar.getValue() != null) {
                return Class.forName(this.d.N()).getMethod(str, null).invoke(zykVar.getValue(), null);
            }
            return null;
        } catch (Exception e) {
            xh3.a("Exception while calling Firebase Analytics SDK method", e, 4);
            this.b.a("FirebaseAnalyticsAdapter.invokeMethod ".concat(str), (Throwable) e);
            return null;
        }
    }
}
