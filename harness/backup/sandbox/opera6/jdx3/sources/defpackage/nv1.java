package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.account.push.AccountPushManager;
import com.opera.android.bookmarks.h;
import com.opera.android.oauth2.OAuth2Account;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class nv1 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ nv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get() {
        u7k u7kVar;
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 5;
        byte b4 = 12;
        byte b5 = 9;
        final byte b6 = 2;
        final byte b7 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        xv1 xv1Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(nr8.e(xv1Var.a));
            case 1:
                Context context = xv1Var.a;
                synchronized (cqp.class) {
                    u7kVar = cqp.a;
                    if (u7kVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        u7k u7kVar2 = new u7k(new n0c(context, false));
                        cqp.a = u7kVar2;
                        u7kVar = u7kVar2;
                    }
                }
                return (rsp) ((cpp) u7kVar.a).mo1zza();
            case 2:
                return Boolean.valueOf(!ru9.c(xv1Var.a).a.getBoolean("vpn_pro.kill_switch.on", false));
            case 3:
                return zi4.A(xv1Var.a);
            case 4:
                return new vwn(xv1Var.a);
            case 5:
                ui3 ui3Var = zi3.k;
                return no7.n(xv1Var.a, io7.E, zi3.l);
            case 6:
                return new wun(xv1Var.a, vml.d);
            case 7:
                OperaApplication operaApplication = xv1Var.a;
                dj9 dj9VarT = dj9.t(operaApplication);
                nx5 nx5Var = (nx5) xv1Var.i.get();
                wjh wjhVar = vml.e;
                jg8 jg8Var = (jg8) wjhVar.d;
                ii iiVar = xne.b;
                uu1 uu1Var = new uu1((byte) 6);
                z4k z4kVar = new z4k((Object) e3j.t(operaApplication), (byte) 14);
                w6j w6jVar = new w6j((jg8) wjhVar.d, dj9VarT, operaApplication);
                auj aujVar = new auj((byte) 9);
                jon jonVar = new jon(dj9VarT);
                u8k u8kVar = (u8k) operaApplication.I.get();
                j4c j4cVar = xv1Var.i0;
                plh plhVar = ((lpe) j4cVar.get()).r;
                v1 v1VarU = v1.u(operaApplication);
                u7k u7kVar3 = new u7k();
                u7kVar3.a = z4c.b(new uef(u8kVar, plhVar, v1VarU, (byte) 10));
                g7l g7lVar = new g7l(operaApplication.J());
                x0f x0fVar = (x0f) xv1Var.l0.get();
                plh plhVar2 = ((lpe) j4cVar.get()).r;
                final w7j w7jVar = new w7j();
                w7jVar.a = x0fVar;
                w7jVar.b = plhVar2;
                final byte b8 = 0;
                w7jVar.c = z4c.b(new Function0() { // from class: son
                    public final Object invoke() {
                        byte b9 = b8;
                        w7j w7jVar2 = w7jVar;
                        switch (b9) {
                            case 0:
                                return qbe.t(new yc1(xf8.t(((x0f) w7jVar2.a).a("weather_forecast")), (byte) 25));
                            default:
                                return qbe.t(new ya9(new z78((plh) w7jVar2.b, (byte) 10), new yc1(xf8.t(((x0f) w7jVar2.a).a("weather_alerts")), (byte) 24), new pr6(3, null, (byte) 1), (byte) 0));
                        }
                    }
                });
                final byte b9 = 1;
                w7jVar.d = z4c.b(new Function0() { // from class: son
                    public final Object invoke() {
                        byte b92 = b9;
                        w7j w7jVar2 = w7jVar;
                        switch (b92) {
                            case 0:
                                return qbe.t(new yc1(xf8.t(((x0f) w7jVar2.a).a("weather_forecast")), (byte) 25));
                            default:
                                return qbe.t(new ya9(new z78((plh) w7jVar2.b, (byte) 10), new yc1(xf8.t(((x0f) w7jVar2.a).a("weather_alerts")), (byte) 24), new pr6(3, null, (byte) 1), (byte) 0));
                        }
                    }
                });
                return new lz6(operaApplication, nx5Var, jg8Var, iiVar, uu1Var, z4kVar, w6jVar, aujVar, jonVar, u7kVar3, g7lVar, w7jVar, new oji(xv1Var.V), new bon(), operaApplication.L().c, new u74(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(operaApplication) == 0 ? new k5o(operaApplication) : new pad(operaApplication)));
            case 8:
                umi umiVar = vml.d;
                OperaApplication operaApplication2 = xv1Var.a;
                mcj mcjVar = new mcj((Context) operaApplication2, umiVar);
                shf shfVar = new shf(new wth(operaApplication2, b5), umiVar, xne.b);
                m59 m59Var = new m59(umiVar, mcjVar);
                xbf xbfVar = new xbf(operaApplication2.b(), new wv1(new li(operaApplication2, OperaApplication.class, "clientTokenManager", "getClientTokenManager()Lcom/opera/android/oauth2/ClientTokenManager;", 0, (byte) 7), (byte) 0));
                nv1 nv1Var = new nv1(xv1Var, b6);
                return new slk(m59Var, new tmk(mcjVar, shfVar, xbfVar, e82.E(new String[]{"premium", "premium_beta"}), new dnj(m59Var, (byte) 20), nv1Var), new py9(mcjVar, shfVar, xbfVar, new nv1(xv1Var, (byte) 3), operaApplication2.D()), xbfVar, ((AccountPushManager) operaApplication2.r.c.get()).a(0), new zkk(operaApplication2.L().d), nv1Var, (nx5) xv1Var.i.get());
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new evn(xv1Var.a.L().c);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                OperaApplication operaApplication3 = xv1Var.a;
                wjh wjhVar2 = vml.e;
                r16 r16Var = ngh.a;
                return new b1o(operaApplication3, wjhVar2, new m91(operaApplication3, wjhVar2, (byte) 15), (br6) xv1Var.h0.get(), new jv1(xv1Var, (byte) 16));
            case 11:
                UserManager userManager = (UserManager) xv1Var.a.getSystemService("user");
                return Boolean.valueOf(userManager != null ? userManager.isSystemUser() : false);
            case 12:
                OperaApplication operaApplication4 = xv1Var.a;
                OAuth2Account oAuth2Account = ((db) xv1Var.b.get()).c;
                return new f84(operaApplication4, oAuth2Account != null ? ((SharedPreferences) oAuth2Account.a.a.get()).getString("profile_picture", null) : null, vml.d, zsd.b);
            case 13:
                OperaApplication operaApplication5 = xv1Var.a;
                Class<OperaApplication> cls = OperaApplication.class;
                int i = 0;
                return new si3(operaApplication5, new uu1(b2), new wv1(new li(operaApplication5, cls, "blockList", "getBlockList()Lcom/opera/android/browser/blocklist/pushed/PushedBlockLists;", i, (byte) 1), (byte) 0), new nv1(xv1Var, b3), new uu1((byte) 11), xne.b, xv1Var.u, operaApplication5.r.P0, new uu1(b4), new wv1(new li(operaApplication5, cls, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", i, (byte) 2), (byte) 0), new wv1(new li(operaApplication5, cls, "pushedContentHandler", "getPushedContentHandler()Lcom/opera/android/PushedContentHandler;", i, (byte) 3), (byte) 0));
            case 14:
                return new h(xv1Var.a.N(), ((lpe) xv1Var.i0.get()).c);
            case 15:
                return new in3(xv1Var.a.g());
            case 16:
                return new a55(new pjn(e3j.t(xv1Var.a), (byte) 26));
            case 17:
                int i2 = swk.e;
                OperaApplication operaApplication6 = xv1Var.a;
                umi umiVar2 = vml.d;
                return new swk(w1h.l(operaApplication6, umiVar2, "startpage.sync", new bg1[0]), umiVar2);
            case SizeUtil.textSize0_1 /* 18 */:
                d75 d75Var = c75.k;
                OperaApplication operaApplication7 = xv1Var.a;
                Class<OperaApplication> cls2 = OperaApplication.class;
                int i3 = 0;
                return new r65(operaApplication7, new vx((c75) no7.n(operaApplication7, c75.l, c75.n), b3), new jv1(xv1Var, objArr == true ? 1 : 0), new jv1(xv1Var, b7), new wv1(new li(operaApplication7, cls2, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", i3, (byte) 4), (byte) 0), new wv1(new li(operaApplication7, cls2, "unfilteredUsageReporter", "getUnfilteredUsageReporter()Lcom/opera/android/analytics/UnfilteredUsageReporter;", i3, (byte) 5), (byte) 0), new d7h(new jv1(xv1Var, b6), new wv1(new li(operaApplication7, cls2, "unfilteredUsageReporter", "getUnfilteredUsageReporter()Lcom/opera/android/analytics/UnfilteredUsageReporter;", i3, (byte) 6), (byte) 0), (byte) 9), vml.d);
            case 19:
                return new AccountPushManager(e3j.t(xv1Var.a));
            case SizeUtil.textSize0 /* 20 */:
                return new jk5(xv1Var.a, new pv1(xv1Var, objArr2 == true ? 1 : 0));
            case 21:
                OperaApplication operaApplication8 = xv1Var.a;
                return new ku5(operaApplication8, operaApplication8.L().c);
            case SizeUtil.textSize1 /* 22 */:
                eri.a.getClass();
                kze kzeVar = new kze(cri.b);
                xv1Var.a.I().F(new kv1(kzeVar, objArr3 == true ? 1 : 0));
                return kzeVar;
            case 23:
                OperaApplication operaApplication9 = xv1Var.a;
                return new u0a(operaApplication9.I(), xf8.u(((lpe) operaApplication9.A.get()).s));
            case SizeUtil.textSize2 /* 24 */:
                return new gc7(xv1Var.a);
            case 25:
                OperaApplication operaApplication10 = xv1Var.a;
                return new wc7(operaApplication10.J(), operaApplication10.R());
            case 26:
                OperaApplication operaApplication11 = xv1Var.a;
                return new sf7(operaApplication11, vml.d, operaApplication11.R());
            case 27:
                OperaApplication operaApplication12 = xv1Var.a;
                return new ag7(operaApplication12.m().a, vml.d, operaApplication12);
            case 28:
                OperaApplication operaApplication13 = xv1Var.a;
                return new i88((jg8) vml.e.d, dj9.t(operaApplication13), operaApplication13);
            default:
                OperaApplication operaApplication14 = xv1Var.a;
                i88 i88Var = (i88) xv1Var.E.get();
                wjh wjhVar3 = vml.e;
                x77 x77Var = new x77(operaApplication14, (jg8) wjhVar3.d);
                j4c j4cVar2 = xv1Var.i0;
                final plh plhVar3 = ((lpe) j4cVar2.get()).v;
                g77 g77Var = new g77();
                final Object[] objArr6 = objArr5 == true ? 1 : 0;
                g77Var.a = z4c.b(new Function0() { // from class: w78
                    public final Object invoke() {
                        byte b10 = objArr6;
                        plh plhVar4 = plhVar3;
                        switch (b10) {
                            case 0:
                                return qbe.t(new z78(plhVar4, (byte) 0));
                            case 1:
                                return qbe.t(new z78(plhVar4, (byte) 1));
                            default:
                                return qbe.t(new z78(plhVar4, (byte) 2));
                        }
                    }
                });
                g77Var.b = z4c.b(new Function0() { // from class: w78
                    public final Object invoke() {
                        byte b10 = b7;
                        plh plhVar4 = plhVar3;
                        switch (b10) {
                            case 0:
                                return qbe.t(new z78(plhVar4, (byte) 0));
                            case 1:
                                return qbe.t(new z78(plhVar4, (byte) 1));
                            default:
                                return qbe.t(new z78(plhVar4, (byte) 2));
                        }
                    }
                });
                g77Var.c = z4c.b(new Function0() { // from class: w78
                    public final Object invoke() {
                        byte b10 = b6;
                        plh plhVar4 = plhVar3;
                        switch (b10) {
                            case 0:
                                return qbe.t(new z78(plhVar4, (byte) 0));
                            case 1:
                                return qbe.t(new z78(plhVar4, (byte) 1));
                            default:
                                return qbe.t(new z78(plhVar4, (byte) 2));
                        }
                    }
                });
                return new dp6(operaApplication14, i88Var, x77Var, g77Var, new eq6(new jv1(xv1Var, (byte) 4)), xne.b, new i06(b4), new iv1(xv1Var, b6), xv1Var.s0, new k51((byte) 22), new bpd(((lpe) j4cVar2.get()).v), new hv5(), new lv1(xv1Var, objArr4 == true ? 1 : 0), new k5o(operaApplication14, (jg8) wjhVar3.d), new f1p((byte) 15));
        }
    }
}
