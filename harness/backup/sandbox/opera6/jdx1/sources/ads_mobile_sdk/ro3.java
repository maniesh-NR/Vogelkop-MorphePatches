package ads_mobile_sdk;

import androidx.webkit.WebViewCompat;
import defpackage.drj;
import defpackage.tso;
import defpackage.vkp;
import defpackage.ybh;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ro3 extends kuk implements Function2 {
    public cy0 a;
    public boolean b;
    public final /* synthetic */ uo3 c;
    public final /* synthetic */ bl1 d;
    public final /* synthetic */ kh3 e;
    public final /* synthetic */ ve2 f;
    public final /* synthetic */ v31 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ q70 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ cr3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro3(uo3 uo3Var, bl1 bl1Var, kh3 kh3Var, ve2 ve2Var, v31 v31Var, boolean z, q70 q70Var, String str, cr3 cr3Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.c = uo3Var;
        this.d = bl1Var;
        this.e = kh3Var;
        this.f = ve2Var;
        this.g = v31Var;
        this.h = z;
        this.i = q70Var;
        this.j = str;
        this.k = cr3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new ro3(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        rg3 rg3VarA;
        cy0 cy0Var;
        uo3 uo3Var = this.c;
        ek ekVar = uo3Var.p;
        px5 px5Var = px5.a;
        boolean z = this.b;
        if (!z) {
            ybh.y(obj);
            q70 q70Var = this.i;
            String str = this.j;
            cr3 cr3Var = this.k;
            WeakHashMap weakHashMap = hh3.a;
            rg3VarA = hh3.a(fw0.CUI_NAME_WEBVIEW_INITIALIZATION, l08.a, false);
            try {
                cy0 cy0Var2 = new cy0(uo3Var.d, uo3Var.c, uo3Var.b, q70Var, uo3Var.g, uo3Var.f, uo3Var.a, str, cr3Var, uo3Var.m, uo3Var.j, uo3Var.l, uo3Var.p);
                rg3VarA.close();
                ekVar.getClass();
                rl1.b = rl1.a.incrementAndGet();
                ji jiVar = new ji(ekVar, cy0Var2.l);
                se2 se2Var = uo3Var.q;
                this.a = cy0Var2;
                this.b = true;
                se2Var.getClass();
                if (se2.a(se2Var, cy0Var2, jiVar, this) == px5Var) {
                    return px5Var;
                }
                cy0Var = cy0Var2;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
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
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cy0 cy0Var3 = this.a;
            ybh.y(obj);
            cy0Var = cy0Var3;
        }
        bl1 kp3Var = this.d;
        if (kp3Var == null) {
            kp3Var = new kp3(cy0Var, uo3Var.e, this.e, uo3Var.h, uo3Var.b, uo3Var.l);
        }
        drj drjVar = ry0.v;
        nx5 nx5Var = uo3Var.b;
        ax0 ax0Var = uo3Var.h;
        k8 k8Var = uo3Var.f;
        qr0 qr0Var = uo3Var.l;
        d91 d91Var = uo3Var.r;
        vkp vkpVar = uo3Var.n;
        drjVar.getClass();
        cy0 cy0Var4 = cy0Var;
        ry0 ry0Var = new ry0(kp3Var, cy0Var4, nx5Var, ax0Var, k8Var, qr0Var, d91Var, vkpVar);
        os osVar = uo3Var.k.a;
        cy0Var4.addJavascriptInterface(new ke1(cy0Var4, this.e, this.f, this.g, (ux2) ((tso) osVar.a).get(), (k8) ((tso) osVar.b).get(), (qr0) ((tso) osVar.c).get()), "googleAdsJsInterface");
        cy0Var4.setWebViewClient(ry0Var);
        cy0Var4.z = ry0Var;
        cy0Var4.setWebChromeClient(new gx0(ry0Var));
        cy0Var4.y = kp3Var;
        if (!this.h) {
            qr0 qr0Var2 = uo3Var.l;
            qr0Var2.getClass();
            if (((Boolean) qr0Var2.a("creative_webview_init_set_profile:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
                ko3 ko3Var = uo3Var.m;
                ko3Var.getClass();
                try {
                    if (ko3Var.a()) {
                        fw0 fw0Var = fw0.CUI_NAME_WEBVIEW_PROFILE_SET;
                        WeakHashMap weakHashMap2 = hh3.a;
                        rg3VarA = hh3.a(fw0Var, l08.a, true);
                        try {
                            WebViewCompat.setProfile(cy0Var4, "GMA_WEBVIEW_PROFILE");
                            rg3VarA.close();
                            return cy0Var4;
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
                    }
                } catch (Exception unused) {
                }
            }
        }
        return cy0Var4;
    }
}
