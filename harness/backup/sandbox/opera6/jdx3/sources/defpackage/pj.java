package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pj extends q37 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj(int i, int[] iArr, byte b) {
        super(i, iArr);
        this.c = b;
    }

    public static boolean d(Context context, jy3 jy3Var) {
        int iOrdinal = jy3Var.ordinal();
        if (iOrdinal == 0) {
            return new yl6(context, vml.d).k();
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                String[] strArr = OperaApplication.K;
                return ((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).b();
            }
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                h9o.p();
                return false;
            }
        }
        return true;
    }

    public static boolean e(Context context) {
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        return settingsManagerJ.c() == b7j.c && settingsManagerJ.f() == e7j.c;
    }

    public static boolean f(Context context) {
        String[] strArr = OperaApplication.K;
        f8f f8fVar = (f8f) ((lpe) ((OperaApplication) context.getApplicationContext()).A.get()).c.getValue();
        return (f8fVar.f() || f8fVar.g()) ? false : true;
    }

    @Override // defpackage.q37, defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws eva {
        Object next;
        Object next2;
        byte b = this.c;
        int[] iArr = null;
        int i2 = this.a;
        switch (b) {
            case 0:
                if (g8fVar == g8f.a) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : map.entrySet()) {
                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (((l1b) map).containsKey("flash")) {
                        String str = (String) map.get("flash");
                        oj.c.getClass();
                        Iterator it = oj.e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((oj) next).a.equalsIgnoreCase(str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        oj ojVar = (oj) next;
                        if (ojVar != null) {
                            iArr = new int[]{ojVar.b};
                        }
                    }
                    Intent intentB = mdb.b(context);
                    intentB.setAction("android.intent.action.MAIN");
                    intentB.addCategory("android.intent.category.LAUNCHER");
                    intentB.putExtras(bundle);
                    if (iArr != null && iArr.length > 0) {
                        intentB.putExtra("VIEWS_TO_HIGHLIGHT", iArr);
                    }
                    intentB.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(i2));
                    intentB.setAction("ACTION_DESTINATION_VIEW");
                    context.startActivity(intentB);
                    return;
                }
                return;
            case 2:
                if (g8fVar == g8f.a) {
                    Bundle bundle2 = new Bundle();
                    for (Map.Entry entry2 : map.entrySet()) {
                        bundle2.putString((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    if (((l1b) map).containsKey("flash")) {
                        String str2 = (String) map.get("flash");
                        su1.c.getClass();
                        Iterator it2 = su1.e.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((su1) next2).a.equalsIgnoreCase(str2)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        su1 su1Var = (su1) next2;
                        if (su1Var != null) {
                            iArr = new int[]{su1Var.b};
                        }
                    }
                    Intent intentB2 = mdb.b(context);
                    intentB2.setAction("android.intent.action.MAIN");
                    intentB2.addCategory("android.intent.category.LAUNCHER");
                    intentB2.putExtras(bundle2);
                    if (iArr != null && iArr.length > 0) {
                        intentB2.putExtra("VIEWS_TO_HIGHLIGHT", iArr);
                    }
                    intentB2.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(i2));
                    intentB2.setAction("ACTION_DESTINATION_VIEW");
                    context.startActivity(intentB2);
                    return;
                }
                return;
            case 7:
                if (g8fVar == g8f.a && e(context)) {
                    psp pspVar = wo3.K;
                    uo3 uo3Var = uo3.DEEP_LINK;
                    pspVar.getClass();
                    Bundle bundleJ = psp.j(uo3Var);
                    Intent intentB3 = mdb.b(context);
                    intentB3.setAction("android.intent.action.MAIN");
                    intentB3.addCategory("android.intent.category.LAUNCHER");
                    intentB3.putExtras(bundleJ);
                    int[] iArr2 = this.b;
                    if (iArr2.length > 0) {
                        intentB3.putExtra("VIEWS_TO_HIGHLIGHT", iArr2);
                    }
                    intentB3.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(i2));
                    intentB3.setAction("ACTION_DESTINATION_VIEW");
                    context.startActivity(intentB3);
                    return;
                }
                return;
            case 8:
                if (((l1b) map).containsKey("flash")) {
                    String str3 = (String) map.get("flash");
                    jy3.c.getClass();
                    jy3 jy3VarY = y55.y(str3);
                    if (jy3VarY != null) {
                        if (!d(context, jy3VarY)) {
                            throw new eva(sko.j("Flash argument unsupported: ", str3));
                        }
                        iArr = new int[]{jy3VarY.b};
                    }
                }
                if (g8fVar == g8f.a) {
                    Bundle bundle3 = new Bundle();
                    for (Map.Entry entry3 : map.entrySet()) {
                        bundle3.putString((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    Intent intentB4 = mdb.b(context);
                    intentB4.setAction("android.intent.action.MAIN");
                    intentB4.addCategory("android.intent.category.LAUNCHER");
                    intentB4.putExtras(bundle3);
                    if (iArr != null && iArr.length > 0) {
                        intentB4.putExtra("VIEWS_TO_HIGHLIGHT", iArr);
                    }
                    intentB4.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(i2));
                    intentB4.setAction("ACTION_DESTINATION_VIEW");
                    context.startActivity(intentB4);
                    return;
                }
                return;
            case 14:
                String[] strArr = OperaApplication.K;
                if (((f8f) ((lpe) ((OperaApplication) context.getApplicationContext()).A.get()).c.getValue()).f()) {
                    return;
                }
                super.a(lqmVar, context, i, map, uri, g8fVar);
                return;
            case 15:
                if (f(context)) {
                    super.a(lqmVar, context, i, map, uri, g8fVar);
                    return;
                }
                return;
            case 16:
                String[] strArr2 = OperaApplication.K;
                if (((f8f) ((lpe) ((OperaApplication) context.getApplicationContext()).A.get()).c.getValue()).g()) {
                    return;
                }
                super.a(lqmVar, context, i, map, uri, g8fVar);
                return;
            case SizeUtil.textSize0 /* 20 */:
                if (g8fVar == g8f.a && i == 0 && "true".equals(map.get("enable_news"))) {
                    String[] strArr3 = OperaApplication.K;
                    SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
                    if (!settingsManagerJ.i("enable_newsfeed")) {
                        settingsManagerJ.V(1, "enable_newsfeed");
                    }
                }
                super.a(lqmVar, context, i, map, uri, g8fVar);
                return;
            case 26:
                String[] strArr4 = OperaApplication.K;
                if (!((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).b()) {
                    throw new eva("RewardsOfaLinkCallback not supported.");
                }
                super.a(lqmVar, context, i, map, uri, g8fVar);
                return;
            case 27:
                if (N.MphJ2uhp()) {
                    super.a(lqmVar, context, i, map, uri, g8fVar);
                    return;
                }
                return;
            default:
                super.a(lqmVar, context, i, map, uri, g8fVar);
                return;
        }
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        switch (this.c) {
            case 7:
                return Boolean.valueOf(e(context));
            case 8:
                if (l1bVar.containsKey("flash")) {
                    String str = (String) l1bVar.get("flash");
                    jy3.c.getClass();
                    jy3 jy3VarY = y55.y(str);
                    if (jy3VarY != null) {
                        return Boolean.valueOf(d(context, jy3VarY));
                    }
                }
                return Boolean.TRUE;
            case 12:
                return Boolean.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0);
            case 14:
                String[] strArr = OperaApplication.K;
                return Boolean.valueOf(!((f8f) ((lpe) ((OperaApplication) context.getApplicationContext()).A.get()).c.getValue()).f());
            case 15:
                return Boolean.valueOf(f(context));
            case 16:
                String[] strArr2 = OperaApplication.K;
                return Boolean.valueOf(!((f8f) ((lpe) ((OperaApplication) context.getApplicationContext()).A.get()).c.getValue()).g());
            case SizeUtil.textSize0_1 /* 18 */:
                String[] strArr3 = OperaApplication.K;
                m9c m9cVarU = ((OperaApplication) context.getApplicationContext()).u();
                if (((SharedPreferences) m9cVarU.b.get()).getBoolean("has_premium_subscription", false) && !Intrinsics.a(((SharedPreferences) m9cVarU.b.get()).getString("premium_subscription_source", null), "ofa_free_trial")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                String[] strArr4 = OperaApplication.K;
                return Boolean.valueOf(((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).b());
            default:
                return super.b(context, l1bVar, mt5Var);
        }
    }

    @Override // defpackage.h8f
    public final Object c(Context context, kk6 kk6Var) {
        k6l k6lVar;
        switch (this.c) {
            case 12:
                int iOrdinal = mom.a(context).a.ordinal();
                if (iOrdinal == 0) {
                    z = true;
                } else if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                return Boolean.valueOf(z);
            case 25:
                String[] strArr = OperaApplication.K;
                ode odeVar = ((m6l) ((OperaApplication) context.getApplicationContext()).r.e1.get()).a;
                if (odeVar.i() && (k6lVar = (k6l) odeVar.g()) != null) {
                    return Boolean.valueOf(k6lVar.n > 0);
                }
                return Boolean.FALSE;
            default:
                return super.c(context, kk6Var);
        }
    }
}
