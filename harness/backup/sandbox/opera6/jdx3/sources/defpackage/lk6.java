package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class lk6 {
    public static final lk6 a = new lk6();
    public static final pj b;
    public static final Map c;

    static {
        pj pjVar = new pj(4, new int[0], (byte) 10);
        b = pjVar;
        int i = 1;
        int i2 = 21;
        c = rbd.c(new Pair[]{new Pair("ui/adblock", new pj(6, new int[0], (byte) 0)), new Pair("ui/app_icon", new pj(32, new int[0], (byte) 1)), new Pair("ui/appearance_settings", new pj(7, new int[0], (byte) 2)), new Pair("ui/ai_search", new ny0((byte) 0)), new Pair("ui/aria", new ny0((byte) 1)), new Pair("ui/autofill", new pj(13, new int[0], (byte) 5)), new Pair("ui/autofill/address/add", new pj(15, new int[0], (byte) 3)), new Pair("ui/autofill/card/add", new pj(14, new int[0], (byte) 4)), new Pair("ui/backup_wallet", new b13(true)), new Pair("ui/bookmarks", new pj(i, new int[0], (byte) 6)), new Pair("ui/browser_settings", new pj(38, new int[0], (byte) 8)), new Pair("ui/bundle", new av((byte) 1)), new Pair("ui/crypto_wallet", new b13(false)), new Pair("ui/datasavings", new pj(3, new int[0], (byte) 9)), new Pair("ui/default_browser", new cm6("ACTION_MAKE_DEFAULT_BROWSER_SHEET")), new Pair("ui/default_browser_view", pjVar), new Pair("ui/downloads", new pj(31, new int[0], (byte) 11)), new Pair("ui/edit_toolbar", new pj(26, new int[0], (byte) 7)), new Pair("ui/esim", new ny0((byte) 2)), new Pair("ui/esim/checkout/success", new e88((byte) 2)), new Pair("ui/flow", new pj(24, new int[0], (byte) 19)), new Pair("ui/giveaway", new xr((byte) 3)), new Pair("ui/history", new pj(2, new int[0], (byte) 13)), new Pair("ui/import_bookmarks", new pj(28, new int[0], (byte) 14)), new Pair("ui/import_chrome_data", new pj(34, new int[0], (byte) 15)), new Pair("ui/import_passwords", new pj(30, new int[0], (byte) 16)), new Pair("ui/jump", new av((byte) 3)), new Pair("ui/language_settings", new pj(20, new int[0], (byte) 17)), new Pair("ui/live_scores", new qqc((byte) 0)), new Pair("ui/live_scores/follow_match", new rqc((byte) 3)), new Pair("ui/live_scores/match", new qqc((byte) 3)), new Pair("ui/live_scores/competition", new qqc((byte) 1)), new Pair("ui/live_scores/team", new qqc((byte) 2)), new Pair("ui/manage_subscription", new pj(17, new int[0], (byte) 18)), new Pair("ui/news_settings", new pj(11, new int[0], (byte) 20)), new Pair("ui/nightmode", new pj(5, new int[0], (byte) 21)), new Pair("ui/offline_pages", new pj(23, new int[0], (byte) 22)), new Pair("ui/omnibar", new av((byte) 5)), new Pair("ui/passwords", new pj(25, new int[0], (byte) 23)), new Pair("ui/privacy", new pj(41, new int[0], (byte) 24)), new Pair("ui/rewards", new pj(36, new int[0], (byte) 26)), new Pair("ui/search_settings", new pj(i2, new int[0], (byte) 29)), new Pair("ui/search_settings/default", new pj(i2, new int[]{1}, (byte) 28)), new Pair("ui/start_page_settings", new y7k(39, new int[0], (byte) 0)), new Pair("ui/synced_speeddials", new y7k(29, new int[0], (byte) 1)), new Pair("ui/tabs", new y7k(35, new int[0], (byte) 2)), new Pair("ui/text_options", new y7k(8, new int[0], (byte) 3)), new Pair("ui/tracker_blocker", new y7k(18, new int[0], (byte) 4)), new Pair("ui/upgrade", new xr((byte) 4)), new Pair("ui/vpn_settings", new y7k(10, new int[0], (byte) 5)), new Pair("ui/wallpaper/gallery", new y7k(19, new int[0], (byte) 6)), new Pair("ui/sd_plus", new av((byte) 0)), new Pair("ui/private_tabs", new pj(33, new int[0], (byte) 25)), new Pair("ui/weather", new y7k(37, new int[0], (byte) 7)), new Pair("ui/gp_update", new pj(42, new int[0], (byte) 12)), new Pair("news/newsfeed", new av((byte) 4)), new Pair("data_plan/free_data", new av((byte) 2)), new Pair("system/add_ai_widget", new xr((byte) 0)), new Pair("system/add_search_widget", new xr((byte) 1)), new Pair("system/add_vpn_pro_widget", new xr((byte) 2)), new Pair("system/default_browser", new cm6("ACTION_MAKE_DEFAULT_BROWSER_SYSTEM")), new Pair("action/enable_live_score", new z08((byte) 1, i)), new Pair("action/enable_bottom_omnibar", new z08((byte) 0, 2)), new Pair("action/enable_news", new z08((byte) 2, 3)), new Pair("sdx", new pj(22, new int[0], (byte) 27))});
    }

    public static final boolean a(Uri uri, lqm lqmVar, int i, Context context) {
        return f(i, ik6.a, lqmVar, context, uri);
    }

    public static Uri b(Uri uri) {
        boolean z;
        try {
            String queryParameter = uri.getQueryParameter("dl");
            if (queryParameter == null) {
                return null;
            }
            String strH = mdb.h(queryParameter);
            String[] strArr = wqm.a;
            try {
                new URI(strH);
                z = true;
            } catch (URISyntaxException unused) {
                z = false;
            }
            if (z && strH.startsWith("ofa:")) {
                return Uri.parse(strH);
            }
            return null;
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public static ib0 c(int i) {
        if (i == 0) {
            return ib0.b;
        }
        if (i != 1) {
            if (i == 2) {
                return ib0.f;
            }
            if (i == 3) {
                return ib0.g;
            }
            if (i == 4) {
                return ib0.h;
            }
        }
        return ib0.e;
    }

    public static boolean f(int i, ik6 ik6Var, lqm lqmVar, Context context, Uri uri) {
        z0c z0cVarA;
        if (wqm.v(uri.toString())) {
            return g(i, ik6Var, lqmVar, context, uri);
        }
        if (!uri.toString().startsWith("market://")) {
            if (wqm.u(uri.toString())) {
                Uri uriB = b(uri);
                if (uriB != null) {
                    return g(2, ik6Var, lqmVar, context, uriB);
                }
                String[] strArr = OperaApplication.K;
                h(((OperaApplication) context.getApplicationContext()).L().c, uri.toString(), i, false);
                return false;
            }
            gpm gpmVarH = bwg.H(uri.toString());
            if (gpmVarH == null ? false : gpmVarH.i.a.equals("momi")) {
                gpm gpmVarH2 = bwg.H(uri.toString());
                if ((gpmVarH2 != null ? qs7.A(gpmVarH2) : null) != null) {
                    String[] strArr2 = OperaApplication.K;
                    if (((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).b()) {
                        if (ik6Var == ik6.a) {
                            h(((OperaApplication) context.getApplicationContext()).L().c, uri.toString(), i, true);
                            String string = uri.toString();
                            Bundle bundle = new Bundle();
                            bundle.putString("deep_link", string);
                            Intent intentB = mdb.b(context);
                            intentB.setAction("android.intent.action.MAIN");
                            intentB.addCategory("android.intent.category.LAUNCHER");
                            intentB.putExtras(bundle);
                            intentB.putExtra("DESTINATION_VIEW_ID", 41);
                            intentB.setAction("ACTION_DESTINATION_VIEW");
                            context.startActivity(intentB);
                        }
                    }
                }
                String[] strArr3 = OperaApplication.K;
                h(((OperaApplication) context.getApplicationContext()).L().c, uri.toString(), i, false);
                return false;
            }
            String[] strArr4 = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            if (ik6Var != ik6.b) {
                if (i == 0 && (z0cVarA = new c37(new t1(context.getApplicationContext(), (byte) 12), new rqd((byte) 26)).A(uri.toString())) != null) {
                    z0cVarA.h(new hu5((Object) context, (Object) lqmVar, (byte) 3));
                    return true;
                }
                xgf xgfVar = new xgf(uri.toString());
                xgfVar.m = lqmVar;
                xgfVar.n = true;
                zi4.u(context, xgfVar);
                return true;
            }
            try {
                new URI(uri.toString());
                return true;
            } catch (URISyntaxException unused) {
                if (i == 0) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    String path = uri.getPath();
                    Uri.Builder builderPath = builderBuildUpon.path(path != null ? new Regex("[{}]").replace(path, "_") : null);
                    String query = uri.getQuery();
                    try {
                        new URI(builderPath.query(query != null ? new Regex("[{}]").replace(query, "_") : null).build().toString());
                        return true;
                    } catch (URISyntaxException unused2) {
                        h(x5fVar, uri.toString(), i, false);
                        return false;
                    }
                }
                h(x5fVar, uri.toString(), i, false);
                return false;
            }
        }
        if (ik6Var != ik6.b) {
            boolean z = uup.z(context, uri);
            String[] strArr5 = OperaApplication.K;
            h(((OperaApplication) context.getApplicationContext()).L().c, uri.toString(), i, z);
            return z;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(int i, ik6 ik6Var, lqm lqmVar, Context context, Uri uri) throws gva {
        l1b l1bVar;
        ik6 ik6Var2;
        try {
            i8f i8fVarA = i8f.a(uri);
            l1bVar = i8fVarA.b;
            h8f h8fVar = (h8f) c.get(i8fVarA.a);
            try {
                if (h8fVar == null) {
                    throw new gva();
                }
                try {
                    ik6Var2 = ik6.b;
                } catch (eva unused) {
                } catch (fva unused2) {
                }
                try {
                    h8fVar.a(lqmVar, context, i, l1bVar, uri, ik6Var == ik6Var2 ? g8f.b : g8f.a);
                    if (ik6Var != ik6Var2) {
                        String[] strArr = OperaApplication.K;
                        ((OperaApplication) context.getApplicationContext()).L().c.K(uri.toString(), c(i), wqm.m(uri, "campaign"), wqm.m(uri, "source"), wqm.m(uri, "target"), true);
                    }
                    return true;
                } catch (eva unused3) {
                    throw new gva();
                } catch (fva unused4) {
                    throw new gva();
                } catch (gva unused5) {
                    l1bVar = uri;
                    if (ik6Var == ik6.a) {
                        b.a(lqmVar, context, i, n08.a, l1bVar, g8f.a);
                    }
                    String[] strArr2 = OperaApplication.K;
                    ((OperaApplication) context.getApplicationContext()).L().c.K(l1bVar.toString(), c(i), wqm.m(l1bVar, "campaign"), wqm.m(l1bVar, "source"), wqm.m(l1bVar, "target"), false);
                    return false;
                }
            } catch (gva unused6) {
            }
        } catch (gva unused7) {
            l1bVar = uri;
        }
    }

    public static void h(x5f x5fVar, String str, int i, boolean z) {
        ib0 ib0VarC = c(i);
        if (x5fVar.h) {
            x5fVar.K(str, ib0VarC, null, null, null, z);
        }
    }

    public final Enum d(Uri uri, Context context, nt5 nt5Var) {
        if (wqm.v(uri.toString())) {
            return e(uri, context, nt5Var);
        }
        if (wqm.u(uri.toString())) {
            Uri uriB = b(uri);
            return uriB == null ? jk6.d : e(uriB, context, nt5Var);
        }
        gpm gpmVarH = bwg.H(uri.toString());
        if (!(gpmVarH == null ? false : gpmVarH.i.a.equals("momi"))) {
            return jk6.a;
        }
        gpm gpmVarH2 = bwg.H(uri.toString());
        if ((gpmVarH2 == null ? null : qs7.A(gpmVarH2)) == null) {
            return jk6.d;
        }
        String[] strArr = OperaApplication.K;
        return ((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).b() ? jk6.a : jk6.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r6 == r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum e(android.net.Uri r7, android.content.Context r8, nt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.kk6
            if (r0 == 0) goto L13
            r0 = r9
            kk6 r0 = (defpackage.kk6) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            kk6 r0 = new kk6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.w
            px5 r9 = px5.a
            int r1 = r0.y
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            ybh.y(r6)     // Catch: defpackage.gva -> L91
            goto L83
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r4
        L31:
            h8f r7 = r0.v
            i8f r8 = r0.u
            android.content.Context r1 = r0.t
            ybh.y(r6)     // Catch: defpackage.gva -> L91
            r5 = r1
            r1 = r8
            r8 = r5
            goto L67
        L3e:
            ybh.y(r6)
            i8f r6 = defpackage.i8f.a(r7)     // Catch: defpackage.gva -> L91
            java.util.Map r7 = defpackage.lk6.c     // Catch: defpackage.gva -> L91
            java.lang.String r1 = r6.a     // Catch: defpackage.gva -> L91
            java.lang.Object r7 = r7.get(r1)     // Catch: defpackage.gva -> L91
            h8f r7 = (defpackage.h8f) r7     // Catch: defpackage.gva -> L91
            if (r7 != 0) goto L54
            jk6 r6 = defpackage.jk6.d     // Catch: defpackage.gva -> L91
            return r6
        L54:
            l1b r1 = r6.b     // Catch: defpackage.gva -> L91
            r0.t = r8     // Catch: defpackage.gva -> L91
            r0.u = r6     // Catch: defpackage.gva -> L91
            r0.v = r7     // Catch: defpackage.gva -> L91
            r0.y = r3     // Catch: defpackage.gva -> L91
            java.lang.Object r1 = r7.b(r8, r1, r0)     // Catch: defpackage.gva -> L91
            if (r1 == r9) goto L82
            r5 = r1
            r1 = r6
            r6 = r5
        L67:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: defpackage.gva -> L91
            boolean r6 = r6.booleanValue()     // Catch: defpackage.gva -> L91
            if (r6 != 0) goto L72
            jk6 r6 = defpackage.jk6.b     // Catch: defpackage.gva -> L91
            return r6
        L72:
            l1b r6 = r1.b     // Catch: defpackage.gva -> L91
            r0.t = r4     // Catch: defpackage.gva -> L91
            r0.u = r4     // Catch: defpackage.gva -> L91
            r0.v = r4     // Catch: defpackage.gva -> L91
            r0.y = r2     // Catch: defpackage.gva -> L91
            java.lang.Object r6 = r7.c(r8, r0)     // Catch: defpackage.gva -> L91
            if (r6 != r9) goto L83
        L82:
            return r9
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: defpackage.gva -> L91
            boolean r6 = r6.booleanValue()     // Catch: defpackage.gva -> L91
            if (r6 == 0) goto L8e
            jk6 r6 = defpackage.jk6.c     // Catch: defpackage.gva -> L91
            return r6
        L8e:
            jk6 r6 = defpackage.jk6.a     // Catch: defpackage.gva -> L91
            return r6
        L91:
            jk6 r6 = defpackage.jk6.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.e(android.net.Uri, android.content.Context, nt5):java.lang.Enum");
    }
}
