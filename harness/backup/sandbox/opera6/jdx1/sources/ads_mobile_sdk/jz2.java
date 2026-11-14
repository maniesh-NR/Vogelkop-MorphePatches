package ads_mobile_sdk;

import android.content.pm.PackageManager;
import defpackage.dbp;
import defpackage.ecp;
import defpackage.jbp;
import defpackage.nuo;
import defpackage.vkp;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jz2 implements rko, jbp {
    public final vkp a;
    public final av2 b;
    public final qr0 c;
    public final fz2 d;
    public final pfe e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final dbp i;
    public final LinkedHashMap j;

    public jz2(String str, a2 a2Var, ax0 ax0Var, vkp vkpVar, av2 av2Var, qr0 qr0Var) {
        String str2;
        this.a = vkpVar;
        this.b = av2Var;
        this.c = qr0Var;
        fz2 fz2Var = a2Var.n0;
        this.d = fz2Var;
        this.e = new pfe();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        dbp dbpVarO = v60.o();
        dbpVarO.b$1();
        v60 v60Var = (v60) dbpVarO.b;
        v60Var.getClass();
        v60Var.type_ = 8;
        v60Var.bitField0_ |= 1;
        s61 s61Var = a2Var.I;
        String str3 = "";
        String str4 = (s61Var == null || (str4 = s61Var.c) == null) ? "" : str4;
        dbpVarO.b$1();
        ((v60) dbpVarO.b).d(str4);
        if (s61Var != null && (str2 = s61Var.c) != null) {
            str3 = str2;
        }
        dbpVarO.b$1();
        ((v60) dbpVarO.b).c(str3);
        ecp ecpVarO = o40.o();
        String str5 = fz2Var.a;
        ecpVarO.b$1();
        ((o40) ecpVarO.b).b(str5);
        o40 o40Var = (o40) ecpVarO.a();
        dbpVarO.b$1();
        ((v60) dbpVarO.b).a(o40Var);
        nuo nuoVarO = e60.o();
        nuoVarO.b$1();
        ((e60) nuoVarO.b).b(str);
        PackageManager packageManager = ax0Var.a.getPackageManager();
        boolean zIsInstantApp = packageManager != null ? packageManager.isInstantApp() : false;
        nuoVarO.b$1();
        e60 e60Var = (e60) nuoVarO.b;
        e60Var.bitField0_ |= 4;
        e60Var.isInstantApps_ = zIsInstantApp;
        e60 e60Var2 = (e60) nuoVarO.a();
        dbpVarO.b$1();
        ((v60) dbpVarO.b).a(e60Var2);
        this.i = dbpVarO;
        this.j = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.jz2 r8, java.lang.String r9, int r10, java.util.Map r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jz2.a(ads_mobile_sdk.jz2, java.lang.String, int, java.util.Map, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.jz2 r5, java.lang.String r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.iz2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.iz2 r0 = (ads_mobile_sdk.iz2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.iz2 r0 = new ads_mobile_sdk.iz2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.jz2 r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r7)
            pfe r7 = r5.e
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r5 = r7
        L4a:
            dbp r7 = r0.i     // Catch: java.lang.Throwable -> L5c
            r7.b$1()     // Catch: java.lang.Throwable -> L5c
            ads_mobile_sdk.ku0 r7 = r7.b     // Catch: java.lang.Throwable -> L5c
            ads_mobile_sdk.v60 r7 = (ads_mobile_sdk.v60) r7     // Catch: java.lang.Throwable -> L5c
            r7.b(r6)     // Catch: java.lang.Throwable -> L5c
            r5.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5c:
            r6 = move-exception
            r5.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jz2.a(ads_mobile_sdk.jz2, java.lang.String, nt5):java.lang.Object");
    }

    public final Object a(mt5 mt5Var) {
        Object objC = c(mt5Var);
        return objC == px5.a ? objC : Unit.a;
    }

    public final boolean a() {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        if (!((Boolean) qr0Var.a("gads:native_click_protection:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            av2 av2Var = av2.i;
            av2 av2Var2 = this.b;
            if (av2Var2 == av2Var || av2Var2 == av2.g) {
                return true;
            }
        }
        return !this.d.d || this.g.get();
    }

    public final Object b(String str, nt5 nt5Var) {
        xu0.b("Blocked click action", null);
        this.h.set(true);
        Object objA = a(this, str, 4, n08.a, nt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.jbp
    public final Object b(mt5 mt5Var) {
        Object objC = c(mt5Var);
        return objC == px5.a ? objC : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        if (defpackage.vkp.c(r9, r8, null, r0, 30) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mt5 r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jz2.c(mt5):java.lang.Object");
    }
}
