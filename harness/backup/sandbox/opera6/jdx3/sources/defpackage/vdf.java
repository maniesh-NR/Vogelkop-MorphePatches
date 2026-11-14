package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import com.opera.android.autofill.PasswordImporter;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.browser.OperaDownloadManagerDelegate;
import com.opera.android.custom_views.OperaEditText;
import com.opera.android.pushmessaging.GCMBackgroundService;
import com.opera.android.settings.cleardata.OnboardingProfileReset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import org.chromium.components.background_task_scheduler.TaskInfo;
import org.chromium.components.background_task_scheduler.a;
import org.chromium.components.background_task_scheduler.b;
import org.chromium.ui.base.WindowAndroid;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class vdf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vdf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        int i2;
        byte b = this.a;
        final byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                OnboardingProfileReset.Request request = (OnboardingProfileReset.Request) obj;
                request.c = null;
                long j = request.e;
                if (j != 0) {
                    N.M0DYcGoV(j);
                    request.e = 0L;
                }
                oml omlVar = request.c;
                if (omlVar != null) {
                    omlVar.cancel(false);
                    request.c = null;
                }
                int i3 = request.d + 1;
                request.d = i3;
                if (i3 < 3) {
                    request.a();
                    return;
                }
                return;
            case 1:
                rn rnVar = (rn) obj;
                if (oo8.r) {
                    rnVar.b(false, bqi.n("ads provider not available", ((oo8) rnVar.l).g), false, null, null);
                    return;
                } else {
                    rnVar.g();
                    return;
                }
            case 2:
                int i4 = OperaAutofillIntentDispatcherActivity.i;
                ((OperaAutofillIntentDispatcherActivity) obj).t(null);
                return;
            case 3:
                OperaDownloadManagerDelegate.TargetCallback targetCallback = (OperaDownloadManagerDelegate.TargetCallback) obj;
                N.MkE07MDU(targetCallback, targetCallback.a, "");
                return;
            case 4:
                bq1 bq1Var = (OperaEditText) obj;
                int i5 = OperaEditText.r;
                if (bq1Var.isEnabled() && bq1Var.isAttachedToWindow()) {
                    l5b l5bVar = q9n.c;
                    q9n.G(bq1Var.getContext(), bq1Var);
                    return;
                }
                return;
            case 5:
                ((ukf) obj).c();
                return;
            case 6:
                rth rthVar = (rth) obj;
                try {
                    String string = rthVar.f.getString("from");
                    Intent intent = new Intent();
                    intent.putExtras(rthVar.f);
                    es9 es9Var = new es9(string, intent.getExtras());
                    String str = es9Var.a;
                    String str2 = es9Var.b;
                    synchronized (e7d.a) {
                        i = e7d.b;
                    }
                    if (i == 3) {
                        z = false;
                    } else {
                        String strU = sko.u(str2, str);
                        boolean zI = wyh.I(strU);
                        String str3 = es9Var.f;
                        z = zI && !(str3 != null && !str3.equals("normal") && str3.equals("high"));
                        if (z) {
                            SharedPreferences sharedPreferences = t8.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0);
                            try {
                                JSONArray jSONArray = new JSONArray(sharedPreferences.getString(strU, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI));
                                String str4 = es9Var.d;
                                if (str4 != null) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                        JSONObject jSONObject = jSONArray.getJSONObject(i6);
                                        if (jSONObject.optString("collapseKey", null).equals(str4)) {
                                            jSONObject.optString("senderId", null);
                                        } else {
                                            jSONArray2.put(jSONObject);
                                        }
                                    }
                                    jSONArray = jSONArray2;
                                }
                                if (jSONArray.length() == 3) {
                                    jSONArray.getJSONObject(0).optString("senderId", null);
                                    JSONArray jSONArray3 = new JSONArray();
                                    for (int i7 = 1; i7 < 3; i7++) {
                                        jSONArray3.put(jSONArray.get(i7));
                                    }
                                    jSONArray = jSONArray3;
                                }
                                jSONArray.put((JSONObject) es9Var.b(new i06((byte) 11)));
                                sharedPreferences.edit().putString(strU, jSONArray.toString()).apply();
                                wyh.X(strU, true);
                            } catch (JSONException e) {
                                e.getMessage();
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    String str5 = es9Var.f;
                    if (str5 != null && !str5.equals("normal") && str5.equals("high")) {
                        String strU2 = sko.u(str2, str);
                        tgk tgkVarL = tgk.l();
                        try {
                            b = (t8.a.getSharedPreferences("org.chromium.components.gcm_driver.subscription_flags", 0).getInt(strU2, 0) & 2) == 2 ? (byte) 1 : (byte) 0;
                            tgkVarL.close();
                            if (b != 0) {
                                try {
                                    Context context = t8.a;
                                    Intent intent2 = new Intent(context, (Class<?>) GCMBackgroundService.class);
                                    intent2.putExtras((Bundle) es9Var.b(new hv5()));
                                    context.startService(intent2);
                                    return;
                                } catch (IllegalStateException unused) {
                                }
                            }
                        } finally {
                        }
                    }
                    Bundle bundle = (Bundle) es9Var.b(new hv5());
                    PersistableBundle persistableBundle = new PersistableBundle();
                    HashSet hashSet = new HashSet();
                    for (String str6 : bundle.keySet()) {
                        Object obj2 = bundle.get(str6);
                        if (obj2 == null) {
                            persistableBundle.putString(str6, null);
                        } else if (obj2 instanceof Boolean) {
                            persistableBundle.putBoolean(str6, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof boolean[]) {
                            persistableBundle.putBooleanArray(str6, (boolean[]) obj2);
                        } else if (obj2 instanceof Double) {
                            persistableBundle.putDouble(str6, ((Double) obj2).doubleValue());
                        } else if (obj2 instanceof double[]) {
                            persistableBundle.putDoubleArray(str6, (double[]) obj2);
                        } else if (obj2 instanceof Integer) {
                            persistableBundle.putInt(str6, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof int[]) {
                            persistableBundle.putIntArray(str6, (int[]) obj2);
                        } else if (obj2 instanceof Long) {
                            persistableBundle.putLong(str6, ((Long) obj2).longValue());
                        } else if (obj2 instanceof long[]) {
                            persistableBundle.putLongArray(str6, (long[]) obj2);
                        } else if (obj2 instanceof String) {
                            persistableBundle.putString(str6, (String) obj2);
                        } else if (obj2 instanceof String[]) {
                            persistableBundle.putStringArray(str6, (String[]) obj2);
                        } else {
                            hashSet.add(str6);
                        }
                    }
                    if (hashSet.size() > 0) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                        }
                    }
                    wcl wclVar = new wcl();
                    wclVar.b = 0L;
                    wclVar.d = true;
                    a aVar = new a(1, new b(wclVar));
                    aVar.b = persistableBundle;
                    ((u03) p37.J()).b(t8.a, new TaskInfo(aVar));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            case 7:
                jlf jlfVar = (jlf) obj;
                ArrayList arrayList = new ArrayList();
                synchronized (jlfVar.b) {
                    SharedPreferences sharedPreferences2 = (SharedPreferences) jlfVar.c.get();
                    for (String str7 : sharedPreferences2.getAll().keySet()) {
                        if (str7.startsWith("failure_") && (i2 = sharedPreferences2.getInt(str7, 0)) != 0) {
                            try {
                                if (Integer.parseInt(str7.substring(8)) != 0) {
                                    throw new IllegalArgumentException();
                                    break;
                                } else {
                                    ng0 ng0Var = ng0.a;
                                    while (true) {
                                        int i8 = i2 - 1;
                                        if (i2 > 0) {
                                            arrayList.add(ng0Var);
                                            i2 = i8;
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException unused3) {
                                continue;
                            }
                        }
                    }
                    sharedPreferences2.edit().clear().apply();
                }
                if (arrayList.size() > 0) {
                    jlfVar.a.run(arrayList);
                    return;
                }
                return;
            case 8:
                OperaMediaRouteButton operaMediaRouteButton = (OperaMediaRouteButton) obj;
                cnf cnfVar = OperaMediaRouteButton.p;
                r16 r16Var = operaMediaRouteButton.e;
                Context context2 = operaMediaRouteButton.getContext();
                r16Var.getClass();
                if (fr3.Q(context2, "android.permission.ACCESS_LOCAL_NETWORK")) {
                    operaMediaRouteButton.g();
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                zsf zsfVar = (zsf) obj;
                synchronized (zsfVar.i) {
                    zsfVar.d(false);
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((kwf) obj).b();
                return;
            case 11:
                ((gyf) obj).a();
                return;
            case 12:
                ((myf) obj).d();
                return;
            case 13:
                qt8 qt8Var = (qt8) obj;
                List list = Collections.EMPTY_LIST;
                yv4 yv4Var = (yv4) qt8Var.f;
                if (yv4Var != null) {
                    qt8Var.f = null;
                    yv4Var.d(list);
                    return;
                }
                return;
            case 14:
                PasswordImporter passwordImporter = (PasswordImporter) obj;
                long j2 = passwordImporter.c;
                if (j2 != 0) {
                    N.MZLGJDmT(j2);
                    passwordImporter.c = 0L;
                    return;
                }
                return;
            case 15:
                PasswordManager.a(new o8f((o16) obj, (byte) 12));
                return;
            case 16:
                x5g x5gVar = (x5g) obj;
                x5gVar.a(null);
                x5gVar.c();
                PasswordManager passwordManager = x5gVar.a;
                o8f o8fVar = new o8f(x5gVar, (byte) 13);
                passwordManager.getClass();
                N.MwwLnzkg(o8fVar, new ArrayList());
                return;
            case 17:
                ((t6g) obj).h();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                final vl6 vl6Var = (vl6) obj;
                vl6Var.e = null;
                z77 z77VarU = sfe.U((fp1) vl6Var.c);
                if (z77VarU != null) {
                    rxh rxhVar = new rxh(2132021626);
                    dkj dkjVar = new dkj() { // from class: x8g
                        @Override // defpackage.dkj
                        public final void a() {
                            byte b3 = b;
                            vl6 vl6Var2 = vl6Var;
                            switch (b3) {
                                case 0:
                                    vl6Var2.R();
                                    wwc.i((Context) vl6Var2.b, (String) vl6Var2.d);
                                    break;
                                default:
                                    zhj.a(new a0c(), 4099).c((fp1) vl6Var2.c);
                                    break;
                            }
                        }
                    };
                    dkj dkjVar2 = new dkj() { // from class: x8g
                        @Override // defpackage.dkj
                        public final void a() {
                            byte b3 = b2;
                            vl6 vl6Var2 = vl6Var;
                            switch (b3) {
                                case 0:
                                    vl6Var2.R();
                                    wwc.i((Context) vl6Var2.b, (String) vl6Var2.d);
                                    break;
                                default:
                                    zhj.a(new a0c(), 4099).c((fp1) vl6Var2.c);
                                    break;
                            }
                        }
                    };
                    gkj gkjVar = new gkj(false, false);
                    gkjVar.a = null;
                    gkjVar.b = null;
                    gkjVar.c = null;
                    gkjVar.d = null;
                    gkjVar.e = null;
                    gkjVar.f = null;
                    gkjVar.g = null;
                    gkjVar.h = dkjVar;
                    gkjVar.i = dkjVar2;
                    gkjVar.j = null;
                    gkjVar.k = 2132022059;
                    gkjVar.l = 2132020043;
                    gkjVar.m = 2132021627;
                    gkjVar.n = true;
                    gkjVar.o = rxhVar;
                    z77VarU.b(gkjVar, ijm.b);
                    return;
                }
                return;
            case 19:
                ((s9g) obj).f.forEach(new qg2((byte) 10));
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((aag) obj).a();
                return;
            case 21:
                ((mgf) obj).a();
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((a32) obj).a();
                return;
            case 23:
                tn tnVar = (tn) obj;
                WindowAndroid windowAndroid = (WindowAndroid) tnVar.b;
                List list2 = (List) tnVar.c;
                boolean zIsEmpty = f03.A(windowAndroid, (String[]) list2.toArray(new String[list2.size()])).isEmpty();
                bag bagVar = (bag) tnVar.d;
                if (zIsEmpty) {
                    bagVar.t();
                    return;
                } else {
                    bagVar.s();
                    return;
                }
            case SizeUtil.textSize2 /* 24 */:
                yqd yqdVar = (yqd) obj;
                s9g.h.e(false);
                if (yqdVar != null) {
                    yqdVar.run();
                    return;
                }
                return;
            case 25:
                ((qag) obj).c();
                return;
            case 26:
                ((beg) ((it5) obj).b).i();
                return;
            case 27:
                ((big) obj).m--;
                return;
            case 28:
                ((mig) obj).j();
                return;
            default:
                ((uig) obj).p();
                return;
        }
    }
}
