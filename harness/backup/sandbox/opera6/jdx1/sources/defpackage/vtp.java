package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.PathInterpolator;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class vtp {
    public static final ue5 a = new ue5(-1282644630, new q92((byte) 16), false);
    public static final ue5 b = new ue5(2073376192, new bf5((byte) 7), false);
    public static final xm5 c;
    public static final gd7 d;
    public static final gd7 e;
    public static final int[] f;
    public static final Object g;
    public static final Object h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;
    public static b59 m;
    public static boolean n;

    static {
        new ue5(-919406708, new q92((byte) 17), false);
        c = new xm5((Object) null);
        byte b2 = 4;
        d = new gd7("NULL", b2);
        e = new gd7("UNINITIALIZED", b2);
        f = new int[]{-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
        g = new Object();
        h = new Object();
        i = new Object();
        j = new Object();
        k = new Object();
        l = new Object();
    }

    public static final void A(rdc rdcVar) {
        if (((pcc) rdcVar.c) == pcc.b) {
            rdcVar.onCreate();
        }
    }

    public static final void B(rdc rdcVar) {
        Z(rdcVar);
        if (((pcc) rdcVar.c) == pcc.c) {
            rdcVar.onDestroy();
        }
    }

    public static final c8e C(c8e c8eVar) {
        return c8eVar.d(new q77());
    }

    public static final void D(Throwable th, mt5 mt5Var) throws Throwable {
        if (th instanceof ha7) {
            th = ((ha7) th).a;
        }
        p0i p0iVar = t0i.b;
        mt5Var.resumeWith(new q0i(th));
        throw th;
    }

    public static long E(int i2, int i3, int i4, int i5) throws pxb {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    ap5.l(i7);
                    t3p.v();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return ap5.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long F(int i2, int i3, int i4, int i5) throws pxb {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    ap5.l(i7);
                    t3p.v();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return ap5.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static String G(int i2, Context context) {
        String[] strArr = OperaApplication.K;
        context.getApplicationContext().J().n("version_code");
        int iA = vep.A(i2);
        if (iA == 0) {
            return H(context, false);
        }
        if (iA == 1) {
            return H(context, false).replace("utm_source", "utmcsr").replace("utm_campaign", "utmccn").replace("utm_medium", "utmcmd").replace("utm_term", "utmctr").replace("utm_content", "utmcct");
        }
        if (iA == 2) {
            return N(L(context).getString("install_intent_referrer", null), false);
        }
        if (iA != 3) {
            return null;
        }
        return J(context);
    }

    public static String H(Context context, boolean z) {
        String str;
        if (s6e.b(context).c()) {
            vq8 vq8Var = s6e.b(context).b;
            str = vq8Var != null ? (String) vq8Var.i : "";
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = etg.a(context);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = L(context).getString("install_referrer", null);
        if (!TextUtils.isEmpty(string)) {
            return N(string, z);
        }
        String strJ = J(context);
        String strA0 = oup.a0(4, strJ);
        u1b u1bVar = gc7.c;
        if ("google_play".equals(strA0)) {
            String strN = N(L(context).getString("install_intent_referrer", null), z);
            if (!TextUtils.isEmpty(strN)) {
                return strN;
            }
        }
        return strJ;
    }

    public static final List I(SettingsManager settingsManager, fw3 fw3Var) {
        String strZ = settingsManager.z("toolbar_bottom_actions");
        if (strZ.length() == 0) {
            return dq3.a(fw3Var);
        }
        ArrayList arrayList = dq3.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = StringsKt.Y(strZ, new String[]{","}, 0, 6).iterator();
        while (it.hasNext()) {
            try {
                arrayList2.add(pc.C.get(Integer.parseInt((String) it.next())));
            } catch (Exception unused) {
                arrayList2 = null;
            }
        }
        return arrayList2 == null ? dq3.a(fw3Var) : arrayList2;
    }

    public static String J(Context context) {
        String string = L(context).getString("distribution_install_referrer", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String[] strArr = OperaApplication.K;
        fc7 fc7Var = (fc7) context.getApplicationContext().l().b.get();
        String str = "utm_source=" + fc7Var.a + "&utm_campaign=" + fc7Var.b + "&utm_medium=" + fc7Var.c;
        if (n) {
            L(context).edit().putString("distribution_install_referrer", str).apply();
        }
        return str;
    }

    public static int K(int i2, String str) {
        str.getClass();
        switch (str) {
            case "gb-eng":
                return 2131231543;
            case "gb-sct":
                return 2131231544;
            case "ad":
                return 2131231481;
            case "ae":
                return 2131231482;
            case "af":
                return 2131231483;
            case "ag":
                return 2131231484;
            case "al":
                return 2131231485;
            case "am":
                return 2131231486;
            case "ao":
                return 2131231487;
            case "ar":
                return 2131231488;
            case "at":
                return 2131231489;
            case "au":
                return 2131231490;
            case "az":
                return 2131231491;
            case "ba":
                return 2131231492;
            case "bb":
                return 2131231493;
            case "bd":
                return 2131231494;
            case "be":
                return 2131231495;
            case "bf":
                return 2131231496;
            case "bg":
                return 2131231497;
            case "bh":
                return 2131231498;
            case "bi":
                return 2131231499;
            case "bj":
                return 2131231500;
            case "bn":
                return 2131231501;
            case "bo":
                return 2131231502;
            case "br":
                return 2131231503;
            case "bs":
                return 2131231504;
            case "bt":
                return 2131231505;
            case "bw":
                return 2131231506;
            case "by":
                return 2131231507;
            case "bz":
                return 2131231508;
            case "ca":
                return 2131231509;
            case "cd":
                return 2131231510;
            case "cf":
                return 2131231511;
            case "cg":
                return 2131231512;
            case "ch":
                return 2131231513;
            case "ci":
                return 2131231514;
            case "cl":
                return 2131231515;
            case "cm":
                return 2131231516;
            case "cn":
                return 2131231517;
            case "co":
                return 2131231518;
            case "cr":
                return 2131231519;
            case "cu":
                return 2131231520;
            case "cv":
                return 2131231521;
            case "cw":
                return 2131231522;
            case "cy":
                return 2131231523;
            case "cz":
                return 2131231524;
            case "de":
                return 2131231525;
            case "dj":
                return 2131231526;
            case "dk":
                return 2131231527;
            case "dm":
                return 2131231528;
            case "do":
                return 2131231529;
            case "dz":
                return 2131231530;
            case "ec":
                return 2131231531;
            case "ee":
                return 2131231532;
            case "eg":
                return 2131231533;
            case "er":
                return 2131231534;
            case "es":
                return 2131231535;
            case "et":
                return 2131231536;
            case "fi":
                return 2131231537;
            case "fj":
                return 2131231538;
            case "fm":
                return 2131231539;
            case "fr":
            case "gp":
                return 2131231540;
            case "ga":
                return 2131231541;
            case "gb":
                return 2131231542;
            case "gd":
                return 2131231545;
            case "ge":
                return 2131231546;
            case "gh":
                return 2131231547;
            case "gm":
                return 2131231548;
            case "gn":
                return 2131231549;
            case "gq":
                return 2131231550;
            case "gr":
                return 2131231551;
            case "gt":
                return 2131231552;
            case "gw":
                return 2131231553;
            case "gy":
                return 2131231554;
            case "hk":
                return 2131231555;
            case "hn":
                return 2131231556;
            case "hr":
                return 2131231557;
            case "ht":
                return 2131231558;
            case "hu":
                return 2131231559;
            case "id":
                return 2131231560;
            case "ie":
                return 2131231561;
            case "il":
                return 2131231562;
            case "in":
                return 2131231563;
            case "iq":
                return 2131231564;
            case "ir":
                return 2131231565;
            case "is":
                return 2131231566;
            case "it":
                return 2131231567;
            case "jm":
                return 2131231568;
            case "jo":
                return 2131231569;
            case "jp":
                return 2131231570;
            case "ke":
                return 2131231571;
            case "kg":
                return 2131231572;
            case "kh":
                return 2131231573;
            case "ki":
                return 2131231574;
            case "km":
                return 2131231575;
            case "kn":
                return 2131231576;
            case "kp":
                return 2131231577;
            case "kr":
                return 2131231578;
            case "kw":
                return 2131231579;
            case "kz":
                return 2131231580;
            case "la":
                return 2131231581;
            case "lb":
                return 2131231582;
            case "lc":
                return 2131231583;
            case "li":
                return 2131231584;
            case "lk":
                return 2131231585;
            case "lr":
                return 2131231586;
            case "ls":
                return 2131231587;
            case "lt":
                return 2131231588;
            case "lu":
                return 2131231589;
            case "lv":
                return 2131231590;
            case "ly":
                return 2131231591;
            case "ma":
                return 2131231592;
            case "mc":
                return 2131231593;
            case "md":
                return 2131231594;
            case "me":
                return 2131231595;
            case "mg":
                return 2131231596;
            case "mh":
                return 2131231597;
            case "mk":
                return 2131231598;
            case "ml":
                return 2131231599;
            case "mm":
                return 2131231600;
            case "mn":
                return 2131231601;
            case "mr":
                return 2131231602;
            case "mt":
                return 2131231603;
            case "mu":
                return 2131231604;
            case "mv":
                return 2131231606;
            case "mw":
                return 2131231607;
            case "mx":
                return 2131231608;
            case "my":
                return 2131231609;
            case "mz":
                return 2131231610;
            case "na":
                return 2131231611;
            case "ne":
                return 2131231612;
            case "ng":
                return 2131231613;
            case "ni":
                return 2131231614;
            case "nl":
                return 2131231615;
            case "no":
                return 2131231616;
            case "np":
                return 2131231617;
            case "nr":
                return 2131231618;
            case "nz":
                return 2131231619;
            case "om":
                return 2131231620;
            case "pa":
                return 2131231621;
            case "pe":
                return 2131231622;
            case "pg":
                return 2131231623;
            case "ph":
                return 2131231624;
            case "pk":
                return 2131231625;
            case "pl":
                return 2131231628;
            case "pr":
                return 2131231629;
            case "pt":
                return 2131231630;
            case "pw":
                return 2131231631;
            case "py":
                return 2131231632;
            case "qa":
                return 2131231633;
            case "ro":
                return 2131231634;
            case "rs":
                return 2131231635;
            case "ru":
                return 2131231636;
            case "rw":
                return 2131231637;
            case "sa":
                return 2131231638;
            case "sb":
                return 2131231639;
            case "sc":
                return 2131231640;
            case "sd":
                return 2131231641;
            case "se":
                return 2131231642;
            case "sg":
                return 2131231643;
            case "si":
                return 2131231644;
            case "sk":
                return 2131231645;
            case "sl":
                return 2131231646;
            case "sm":
                return 2131231647;
            case "sn":
                return 2131231648;
            case "so":
                return 2131231650;
            case "sr":
                return 2131231651;
            case "ss":
                return 2131231652;
            case "st":
                return 2131231653;
            case "sv":
                return 2131231654;
            case "sy":
                return 2131231655;
            case "sz":
                return 2131231656;
            case "td":
                return 2131231657;
            case "tg":
                return 2131231658;
            case "th":
                return 2131231659;
            case "tj":
                return 2131231660;
            case "tl":
                return 2131231661;
            case "tm":
                return 2131231662;
            case "tn":
                return 2131231663;
            case "to":
                return 2131231664;
            case "tr":
                return 2131231665;
            case "tt":
                return 2131231666;
            case "tv":
                return 2131231667;
            case "tz":
                return 2131231668;
            case "ua":
                return 2131231669;
            case "ug":
                return 2131231670;
            case "us":
                return 2131231671;
            case "uy":
                return 2131231672;
            case "uz":
                return 2131231673;
            case "va":
                return 2131231674;
            case "vc":
                return 2131231675;
            case "ve":
                return 2131231677;
            case "vn":
                return 2131231678;
            case "vu":
                return 2131231679;
            case "ws":
                return 2131231680;
            case "ye":
                return 2131231681;
            case "za":
                return 2131231682;
            case "zm":
                return 2131231683;
            case "zw":
                return 2131231684;
            default:
                return i2;
        }
    }

    public static SharedPreferences L(Context context) {
        b59 b59Var = m;
        return b59Var != null ? (SharedPreferences) b59Var.get() : context.getSharedPreferences("install_referrer", 0);
    }

    public static final boolean M(Fragment fragment) {
        return fragment.isDetached() || !fragment.isAdded() || fragment.isRemoving();
    }

    public static String N(String str, boolean z) {
        if (z) {
            return str;
        }
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (oup.Y(4, str) == null) {
            if (str.contains("gclid=")) {
                str2 = "DOL-632_google";
            } else if (str.contains("tiktok") || str.contains("tt_cid=")) {
                str2 = "DOL-632_tiktok";
            } else if (str.contains("moloco")) {
                str2 = "DOL-632_moloco";
            } else if (str.contains("Liftoff")) {
                str2 = "DOL-632_liftoff";
            }
            if (str2 != null) {
                StringBuilder sbR = p3p.r("utm_source=", str2);
                if (!str.isEmpty() && !str.startsWith("&")) {
                    sbR.append('&');
                }
                sbR.append(str);
                return sbR.toString();
            }
        }
        return str;
    }

    public static final Object Q(RealCall realCall, Function1 function1, Function1 function12, int i2, long j2, long j3, long j4) throws InterruptedException {
        tpl tplVar = tpl.a;
        tih tihVar = uih.a;
        sc5 sc5VarA = tplVar.a();
        RealCall realCallClone = realCall;
        int i3 = 0;
        while (true) {
            try {
                return function1.invoke(realCallClone.execute());
            } catch (IOException e2) {
                i3++;
                long jC = spl.c(((spl) tplVar.a()).a, sc5VarA);
                if (i3 >= i2 || pn7.c(jC, j2) >= 0) {
                    return function12.invoke(e2);
                }
                Thread.sleep(pn7.f(u(i3, j3, j4, tihVar)));
                realCallClone = realCallClone.clone();
            }
        }
        return function12.invoke(e2);
    }

    public static /* synthetic */ Object R(RealCall realCall, Function1 function1, Function1 function12, int i2, long j2, int i3) {
        long jX0;
        if ((i3 & 8) != 0) {
            i2 = 4;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            on7 on7Var = pn7.b;
            jX0 = cs5.x0(30, un7.e);
        } else {
            jX0 = j2;
        }
        on7 on7Var2 = pn7.b;
        un7 un7Var = un7.e;
        return Q(realCall, function1, function12, i4, jX0, cs5.x0(1, un7Var), cs5.x0(10, un7Var));
    }

    public static void S(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(rfp.o(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e2) {
                b0(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                b0(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                b0(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                b0(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static final void T(rdc rdcVar) {
        X(rdcVar);
        if (((pcc) rdcVar.c) == pcc.d) {
            rdcVar.onResume();
        }
    }

    public static final void U(SettingsManager settingsManager, ArrayList arrayList) {
        ArrayList arrayList2 = dq3.a;
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(Integer.valueOf(((pc) obj).ordinal()));
        }
        settingsManager.Y("toolbar_bottom_actions", CollectionsKt.P(arrayList3, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(android.os.Bundle r3, androidx.fragment.app.Fragment r4, java.lang.String r5) {
        /*
            androidx.fragment.app.w r4 = r4.getParentFragmentManager()
            java.util.Map r0 = r4.n
            java.lang.Object r0 = r0.get(r5)
            zl9 r0 = (defpackage.zl9) r0
            if (r0 == 0) goto L20
            qcc r1 = defpackage.qcc.d
            tcc r2 = r0.a
            qdc r2 = (defpackage.qdc) r2
            qcc r2 = r2.i
            boolean r1 = r2.d(r1)
            if (r1 == 0) goto L20
            r0.X(r3, r5)
            goto L25
        L20:
            java.util.Map r4 = r4.m
            r4.put(r5, r3)
        L25:
            r4 = 2
            boolean r4 = androidx.fragment.app.w.N(r4)
            if (r4 == 0) goto L2f
            java.util.Objects.toString(r3)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtp.V(android.os.Bundle, androidx.fragment.app.Fragment, java.lang.String):void");
    }

    public static void W(Window window, int i2) {
        if (i2 == 0) {
            window.setSoftInputMode(16);
        } else {
            if (i2 != 2) {
                return;
            }
            window.setSoftInputMode(36);
        }
    }

    public static final void X(rdc rdcVar) {
        A(rdcVar);
        if (((pcc) rdcVar.c) == pcc.c) {
            rdcVar.onStart();
        }
    }

    public static final void Y(Function2 function2, g4 g4Var, g4 g4Var2) throws Throwable {
        try {
            mt5 mt5VarB = hib.b(hib.a(g4Var, g4Var2, function2));
            p0i p0iVar = t0i.b;
            c26.J(mt5VarB, Unit.a);
        } catch (Throwable th) {
            D(th, g4Var2);
            throw null;
        }
    }

    public static final void Z(rdc rdcVar) {
        if (((pcc) rdcVar.c) == pcc.e) {
            rdcVar.onPause();
        }
        if (((pcc) rdcVar.c) == pcc.d) {
            rdcVar.onStop();
        }
    }

    public static final void a(e2e e2eVar, mk8 mk8Var, Function1 function1, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1250823927);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(e2eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(mk8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function1) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? 2048 : 1024;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ec ecVar = e2eVar.a.k;
            String str = ecVar != null ? ecVar.a : null;
            if (ecVar == null || str == null) {
                vt9Var.W(-158604167);
                vt9Var.p(false);
            } else {
                vt9Var.W(-159038539);
                boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                Object objK = vt9Var.K();
                if (z || objK == hh5.a) {
                    objK = new x1e(function1, e2eVar, (byte) 1);
                    vt9Var.g0(objK);
                }
                yi4.a((Function0) objK, c8eVar2, false, (paj) null, z14.b(b24.a(vt9Var), mk8Var.a, mk8Var.b, 0L, 0L, 12), (e24) null, (go3) null, (zvf) null, gyg.P(2120857940, new h23(str, (byte) 2), vt9Var), vt9Var, ((i3 >> 6) & 112) | 805306368, 492);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0(e2eVar, mk8Var, function1, c8eVar, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a0(java.lang.Long r8, java.lang.String r9, o29 r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtp.a0(java.lang.Long, java.lang.String, o29):boolean");
    }

    public static final void b(int i2, ih5 ih5Var, int i3) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1896168565);
        int i4 = (vt9Var.d(i2) ? 4 : 2) | i3;
        if (vt9Var.N(i4 & 1, (i4 & 3) != 2)) {
            o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            wta.b(iza.a((dl7) tk7.a.getValue(), vt9Var), "Boost icon", null, 0L, vt9Var, 56, 12);
            ocp.c(vt9Var, mpj.l(z7eVar, 8.0f));
            ijl.b("+" + i2 + "x", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, 0, 24576, 114686);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new gda(i2, i3, (byte) 2);
        }
    }

    public static void b0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static final void c(Function0 function0, y77 y77Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        byte b2;
        Object i51Var;
        Function0 function02 = function0;
        y77 y77Var2 = y77Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(826668973);
        int i3 = (vt9Var.h(function02) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(y77Var2) ? 32 : 16;
        }
        int i4 = i3;
        if (vt9Var.N(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) vt9Var.j(j41.f);
            n27 n27Var = (n27) vt9Var.j(mi5.h);
            d2c d2cVar = (d2c) vt9Var.j(mi5.n);
            tt9 tt9VarB = mkh.B(vt9Var);
            afe afeVarO = hyg.o(ue5Var, vt9Var);
            Object[] objArr = new Object[0];
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            Object obj = objK;
            if (objK == zpaVar) {
                lb lbVar = new lb((byte) 11);
                vt9Var.g0(lbVar);
                obj = lbVar;
            }
            UUID uuid = (UUID) w1h.t(objArr, (Function0) obj, vt9Var);
            boolean zF = vt9Var.f(view) | vt9Var.f(n27Var) | vt9Var.d(y77Var2.g) | vt9Var.f(null);
            Object objK2 = vt9Var.K();
            if (zF || objK2 == zpaVar) {
                g87 g87Var = new g87(function02, y77Var2, view, d2cVar, n27Var, uuid);
                b2 = 1;
                ue5 ue5Var2 = new ue5(-1338939603, new g51(afeVarO, b), true);
                v77 v77Var = g87Var.h;
                v77Var.l(tt9VarB);
                v77Var.i.setValue(ue5Var2);
                v77Var.m = true;
                v77Var.d();
                vt9Var.g0(g87Var);
                objK2 = g87Var;
            } else {
                b2 = 1;
            }
            g87 g87Var2 = (g87) objK2;
            boolean zH = vt9Var.h(g87Var2);
            Object objK3 = vt9Var.K();
            Object obj2 = objK3;
            if (zH || objK3 == zpaVar) {
                h51 h51Var = new h51(g87Var2, b);
                vt9Var.g0(h51Var);
                obj2 = h51Var;
            }
            rm5.b(g87Var2, (Function1) obj2, vt9Var);
            int i5 = (vt9Var.h(g87Var2) ? 1 : 0) | ((i4 & 14) == 4 ? b2 : (byte) 0) | ((i4 & 112) == 32 ? b2 : (byte) 0) | (vt9Var.d(d2cVar.ordinal()) ? 1 : 0);
            Object objK4 = vt9Var.K();
            if (i5 != 0 || objK4 == zpaVar) {
                i51Var = new i51((Object) g87Var2, (Object) function0, (Object) y77Var, (Object) d2cVar, (byte) 0);
                function02 = function0;
                y77Var2 = y77Var;
                vt9Var.g0(i51Var);
            } else {
                function02 = function0;
                i51Var = objK4;
                y77Var2 = y77Var;
            }
            rm5.L(vt9Var, (Function0) i51Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j51(function02, y77Var2, ue5Var, i2);
        }
    }

    public static final void d(c8e c8eVar, Function2 function2, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1090521195);
        int i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2 | (vt9Var.h(function2) ? 32 : 16);
        byte b2 = 3;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = m51.b;
                vt9Var.g0(objK);
            }
            tfd tfdVar = (tfd) objK;
            int i4 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            int i5 = ((i4 << 6) & 896) | 6;
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            function2.invoke(vt9Var, Integer.valueOf((i5 >> 6) & 14));
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(c8eVar, function2, i2, b2);
        }
    }

    public static final void e(c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-269135724);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 3;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            z14 z14VarA = b24.a(vt9Var);
            hp7 hp7Var = lk8.a;
            z14 z14VarB = z14.b(z14VarA, 0L, 0L, ((kk8) vt9Var.j(hp7Var)).i, ((kk8) vt9Var.j(hp7Var)).j, 3);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new uuc((byte) 8);
                vt9Var.g0(objK);
            }
            yi4.a((Function0) objK, c8eVar, false, (paj) null, z14VarB, (e24) null, (go3) null, (zvf) null, p37.a, vt9Var, ((i3 << 3) & 112) | 805306758, 488);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ul4(c8eVar, i2, b2);
        }
    }

    public static final void f(c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2060614671);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            z14 z14VarA = b24.a(vt9Var);
            hp7 hp7Var = lk8.a;
            z14 z14VarB = z14.b(z14VarA, 0L, 0L, ((kk8) vt9Var.j(hp7Var)).i, ((kk8) vt9Var.j(hp7Var)).j, 3);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new uuc((byte) 9);
                vt9Var.g0(objK);
            }
            yi4.a((Function0) objK, c8eVar, false, (paj) null, z14VarB, (e24) null, (go3) null, (zvf) null, p37.b, vt9Var, ((i3 << 3) & 112) | 805306758, 488);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ul4(c8eVar, i2, b2);
        }
    }

    public static final void g(u6c u6cVar, Object obj, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(18254458);
        int i3 = (vt9Var.f(u6cVar) ? 4 : 2) | i2 | (vt9Var.h(obj) ? 32 : 16);
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = luj.b(new nda(u6cVar, b2));
                vt9Var.g0(objK);
            }
            if (((Boolean) ((iak) objK).getValue()).booleanValue()) {
                vt9Var.W(-1642000818);
                boolean z = (i3 & 14) == 4;
                Object objK2 = vt9Var.K();
                if (z || objK2 == zpaVar) {
                    objK2 = new mda(u6cVar, null, b2);
                    vt9Var.g0(objK2);
                }
                rm5.e(vt9Var, obj, (Function2) objK2);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1641791320);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kx0(u6cVar, obj, i2, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final void h(e2e e2eVar, mk8 mk8Var, Function1 function1, c8e c8eVar, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1293345425);
        int i3 = i2 | (vt9Var.f(e2eVar) ? 4 : 2) | (vt9Var.f(mk8Var) ? 32 : 16) | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(c8eVar) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = e2eVar.c.ordinal();
            if (iOrdinal == 0) {
                vt9Var.W(-1659397140);
                a(e2eVar, mk8Var, function1, c8eVar, vt9Var, i3 & 8190);
                vt9Var.p(false);
            } else if (iOrdinal == 1) {
                vt9Var.W(-1659394096);
                e(c8eVar, vt9Var, (i3 >> 9) & 14);
                vt9Var.p(false);
            } else {
                if (iOrdinal != 2) {
                    throw fki.m(vt9Var, -1659399195, false);
                }
                vt9Var.W(-1659391854);
                f(c8eVar, vt9Var, (i3 >> 9) & 14);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(e2eVar, mk8Var, function1, c8eVar, i2, (byte) 9);
        }
    }

    public static final void i(mk8 mk8Var, e2e e2eVar, Function1 function1, Function1 function12, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1078914287);
        int i3 = (vt9Var.f(mk8Var) ? 4 : 2) | i2 | (vt9Var.f(e2eVar) ? 32 : 16) | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function12) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            kfo.c(aq5.a.a(new u95(mk8Var.d)), gyg.P(-1641062353, new w1e(c8eVar, e2eVar, mk8Var, function12, function1), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w1e(mk8Var, e2eVar, function1, function12, c8eVar, i2);
        }
    }

    public static final void j(final Function0 function0, final String str, c8e c8eVar, ikl iklVar, u8i u8iVar, gyi gyiVar, final boolean z, float f2, hyf hyfVar, go3 go3Var, ih5 ih5Var, final int i2, final int i3) {
        int i4;
        c8e c8eVar2;
        int i5;
        final ikl iklVar2;
        final gyi gyiVar2;
        final float f3;
        final hyf hyfVar2;
        final go3 go3Var2;
        final c8e c8eVar3;
        final u8i u8iVar2;
        ikl iklVar3;
        gyi gyiVar3;
        c8e c8eVar4;
        final hyf hyfVarH0;
        u8i u8iVar3;
        go3 go3VarG;
        int i6;
        final float f4;
        go3 go3Var3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-995181356);
        if ((i2 & 6) == 0) {
            i4 = i2 | (vt9Var.h(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i4 | (vt9Var.f(str) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i7 | 384;
            c8eVar2 = c8eVar;
        } else {
            c8eVar2 = c8eVar;
            i5 = i7 | (vt9Var.f(c8eVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        }
        int i9 = i5 | 74752;
        if ((i2 & 1572864) == 0) {
            i9 |= vt9Var.g(z) ? 1048576 : 524288;
        }
        int i10 = i9 | 851443712;
        byte b2 = 0;
        if (vt9Var.N(i10 & 1, (306783379 & i10) != 306783378)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                if (i8 != 0) {
                    c8eVar2 = z7e.b;
                }
                unf unfVar = pof.a;
                iklVar3 = pof.b(vt9Var).m;
                u8i u8iVar4 = zjf.a;
                akf akfVarA = pof.a(vt9Var);
                gyiVar3 = akfVarA.j;
                s7 s7Var = akfVarA.a;
                if (gyiVar3 == null) {
                    gyi gyiVar4 = new gyi(s7Var.k(), s7Var.w(), s7Var.w(), s7Var.w(), s7Var.k(), s7Var.d(), s7Var.d(), s7Var.d(), s7Var.x(), s7Var.d(), s7Var.n(), s7Var.n(), s7Var.n());
                    akfVarA.j = gyiVar4;
                    gyiVar3 = gyiVar4;
                }
                c8eVar4 = c8eVar2;
                hyfVarH0 = phj.h0(vt9Var, 2131232018);
                u8iVar3 = u8iVar4;
                go3VarG = cqp.G(pof.a(vt9Var).a.M(), 1.0f);
                i6 = i10 & (-235404289);
                f4 = 18.0f;
            } else {
                vt9Var.Q();
                iklVar3 = iklVar;
                u8iVar3 = u8iVar;
                gyiVar3 = gyiVar;
                go3VarG = go3Var;
                i6 = i10 & (-235404289);
                c8eVar4 = c8eVar2;
                f4 = f2;
                hyfVarH0 = hyfVar;
            }
            vt9Var.q();
            ue5 ue5Var = null;
            if (z) {
                vt9Var.W(712284761);
                ue5 ue5VarP = gyg.P(-623379204, new Function2() { // from class: nkf
                    public final Object invoke(Object obj, Object obj2) {
                        ih5 ih5Var2 = (ih5) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        vt9 vt9Var2 = (vt9) ih5Var2;
                        if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            c8e c8eVarH = mpj.h(z7e.b, f4);
                            vt9Var2.W(-2066952029);
                            long j2 = ((u95) vt9Var2.j(aq5.a)).a;
                            vt9Var2.p(false);
                            wta.b(hyfVarH0, null, c8eVarH, j2, vt9Var2, 8, 0);
                        } else {
                            vt9Var2.Q();
                        }
                        return Unit.a;
                    }
                }, vt9Var);
                vt9Var.p(false);
                go3Var3 = null;
                ue5Var = ue5VarP;
            } else {
                vt9Var.W(712619282);
                vt9Var.p(false);
                go3Var3 = go3VarG;
            }
            int i11 = ((i6 >> 18) & 14) | 384;
            int i12 = i6 << 3;
            hyf hyfVar3 = hyfVarH0;
            ey4.b(z, function0, gyg.P(1826980033, new okf(str, iklVar3, b2), vt9Var), c8eVar4, false, ue5Var, u8iVar3, gyiVar3, null, go3Var3, vt9Var, i11 | (i12 & 112) | (i12 & 7168), 2640);
            f3 = f4;
            iklVar2 = iklVar3;
            c8eVar3 = c8eVar4;
            u8iVar2 = u8iVar3;
            gyiVar2 = gyiVar3;
            go3Var2 = go3VarG;
            hyfVar2 = hyfVar3;
        } else {
            vt9Var.Q();
            iklVar2 = iklVar;
            gyiVar2 = gyiVar;
            f3 = f2;
            hyfVar2 = hyfVar;
            go3Var2 = go3Var;
            c8eVar3 = c8eVar2;
            u8iVar2 = u8iVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: pkf
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vtp.j(function0, str, c8eVar3, iklVar2, u8iVar2, gyiVar2, z, f3, hyfVar2, go3Var2, (ih5) obj, aoh.m(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static String k(String str) {
        return sko.u(str, "cpdEndTime");
    }

    public static JSONObject l(String str, vho vhoVar) throws JSONException {
        long j2;
        long j3;
        lho lhoVarA = vhoVar.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", vhoVar.a);
        xho xhoVar = lhoVarA.a;
        jSONObject.put("title", xhoVar.d);
        jSONObject.put("titleColorLight", xhoVar.L);
        jSONObject.put("titleColorDark", xhoVar.M);
        jSONObject.put("description", xhoVar.e);
        jSONObject.put("descriptionColorLight", xhoVar.N);
        jSONObject.put("descriptionColorDark", xhoVar.O);
        jSONObject.put("expandable", xhoVar.V);
        jSONObject.put("iconUrlLight", xhoVar.H);
        jSONObject.put("iconUrlDark", xhoVar.I);
        jSONObject.put("imageUrlLight", xhoVar.J);
        jSONObject.put("imageUrlDark", xhoVar.K);
        jSONObject.put("backgroundUrlLight", xhoVar.P);
        jSONObject.put("backgroundUrlDark", xhoVar.Q);
        jSONObject.put("ctaButtonVisible", xhoVar.f);
        jSONObject.put("ctaButtonText", xhoVar.g);
        jSONObject.put("ctaButtonTextColorLight", xhoVar.R);
        jSONObject.put("ctaButtonTextColorDark", xhoVar.S);
        jSONObject.put("ctaButtonBgColorLight", xhoVar.T);
        jSONObject.put("ctaButtonBgColorDark", xhoVar.U);
        ArrayList arrayList = lhoVarA.d;
        Object obj = lhoVarA.b;
        Object obj2 = lhoVarA.c;
        Object obj3 = lhoVarA.g;
        int iB = z1m.b(lhoVarA.e);
        double d2 = lhoVarA.h;
        long j4 = vhoVar.d;
        long j5 = vhoVar.c;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("placementId", str);
        jSONObject2.put("creative", jSONObject);
        if (m5h.d(arrayList)) {
            j2 = j5;
        } else {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList.get(i2);
                int i3 = i2 + 1;
                pho phoVar = (pho) obj4;
                ArrayList arrayList2 = arrayList;
                JSONObject jSONObject3 = new JSONObject();
                int i4 = size;
                jSONObject3.put("eventType", sko.x(phoVar.a));
                ArrayList arrayList3 = phoVar.b;
                if (m5h.d(arrayList3)) {
                    j3 = j5;
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    int size2 = arrayList3.size();
                    j3 = j5;
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj5 = arrayList3.get(i5);
                        i5++;
                        jSONArray2.put((String) obj5);
                    }
                    jSONObject3.put("urls", jSONArray2);
                }
                jSONArray.put(jSONObject3);
                size = i4;
                arrayList = arrayList2;
                i2 = i3;
                j5 = j3;
            }
            j2 = j5;
            jSONObject2.put("adTrackers", jSONArray);
        }
        jSONObject2.put("clickUrl", obj);
        jSONObject2.put("deepLink", obj2);
        jSONObject2.put("adChoiceUrl", obj3);
        jSONObject2.put("clickType", iB);
        jSONObject2.put("ecpm", d2);
        jSONObject2.put("endTime", j4);
        jSONObject2.put("expireTimestamp", j2);
        return jSONObject2;
    }

    public static void m(g94 g94Var, qio qioVar) {
        gxo.c(new fmn(g94Var, qioVar, (byte) 20));
    }

    public static vrg n(srg srgVar, srg srgVar2) {
        srgVar.getClass();
        return new vrg(Arrays.asList(srgVar, srgVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(okhttp3.internal.connection.RealCall r14, int r15, long r16, long r18, long r20, nt5 r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof defpackage.qoe
            if (r1 == 0) goto L16
            r1 = r0
            qoe r1 = (defpackage.qoe) r1
            int r2 = r1.u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.u = r2
        L14:
            r13 = r1
            goto L1c
        L16:
            qoe r1 = new qoe
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r13.t
            px5 r1 = px5.a
            int r2 = r13.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            defpackage.ybh.y(r0)
            t0i r0 = (t0i) r0
            java.lang.Object r14 = r0.a
            return r14
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r14)
            return r3
        L36:
            defpackage.ybh.y(r0)
            r13.u = r4
            tpl r10 = tpl.a
            ypa r11 = new ypa
            r0 = 2
            r11.<init>(r0, r3, r4)
            tih r12 = uih.a
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
            java.lang.Object r14 = q(r2, r3, r4, r6, r8, r10, r11, r12, r13)
            if (r14 != r1) goto L54
            return r1
        L54:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtp.o(okhttp3.internal.connection.RealCall, int, long, long, long, nt5):java.lang.Object");
    }

    public static /* synthetic */ Object p(RealCall realCall, nt5 nt5Var) {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        return o(realCall, 4, cs5.x0(30, un7Var), cs5.x0(1, un7Var), cs5.x0(10, un7Var), nt5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0131 -> B:40:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(okhttp3.internal.connection.RealCall r21, int r22, long r23, long r25, long r27, defpackage.upl r29, ypa r30, uih r31, nt5 r32) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtp.q(okhttp3.internal.connection.RealCall, int, long, long, long, upl, ypa, uih, nt5):java.lang.Object");
    }

    public static String r(String str) {
        return sko.u(str, "cpdFingerprint");
    }

    public static void s(vho vhoVar) {
        w06 w06Var = vhoVar.a;
        w06Var.getClass();
        if (!(w06Var instanceof n06) || sjo.o() >= vhoVar.d) {
            return;
        }
        gxo.a(new ttn(vhoVar, (byte) 22));
    }

    public static File t(String str) {
        File fileB = sjo.b(3);
        if (fileB == null) {
            return null;
        }
        return new File(fileB.getAbsolutePath(), str);
    }

    public static final long u(int i2, long j2, long j3, uih uihVar) {
        on7 on7Var = pn7.b;
        return djh.f(new pn7(pn7.m(cs5.y0(1 << (i2 - 1), un7.e), cs5.x0(uihVar.l(1000), un7.d))), new pn7(j2), new pn7(j3)).a;
    }

    public static final void v(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                wf8.a(th, th2);
            }
        }
    }

    public static final boolean w(rh7 rh7Var, long j2) {
        if (!rh7Var.a.n) {
            return false;
        }
        j8b j8bVar = (j8b) ui6.e0(rh7Var).F.b;
        if (!j8bVar.b0.n) {
            return false;
        }
        long jU = j8bVar.U(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & 4294967295L));
        long j3 = rh7Var.q;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static v98 x(orb orbVar) {
        w98 w98Var;
        orb orbVarC = orbVar.c("appBar");
        String strE = orbVarC.e("title");
        orb orbVarI = orbVarC.i("trailingButton");
        z98 z98Var = null;
        x98 x98Var = orbVarI != null ? new x98(orbVarI.e("icon"), orbVarI.e("href")) : null;
        String strM = orbVarC.m("backButton", (String) null);
        if (strM != null) {
            w98[] w98VarArrValues = w98.values();
            int length = w98VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    w98Var = w98VarArrValues[i2];
                    if (w98Var != w98.b && strM.equals(w98Var.a)) {
                        break;
                    }
                    i2++;
                } else {
                    w98Var = w98.b;
                    break;
                }
            }
        } else {
            w98Var = null;
        }
        bp1 bp1Var = new bp1(strE, x98Var, w98Var);
        orb orbVarI2 = orbVar.i("user");
        aa8 aa8Var = orbVarI2 != null ? new aa8(orbVarI2.a.getBoolean("hasPlans")) : null;
        orb orbVarI3 = orbVar.i("plans");
        if (orbVarI3 != null) {
            orb orbVarI4 = orbVarI3.i("active");
            LinkedHashMap linkedHashMap = orbVarI4 != null ? new LinkedHashMap() : null;
            if (linkedHashMap != null && orbVarI4 != null) {
                Iterator<String> itKeys = orbVarI4.a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, fsp.o(orbVarI4.c(next)));
                }
            }
            orb orbVarI5 = orbVarI3.i("all");
            LinkedHashMap linkedHashMap2 = orbVarI5 != null ? new LinkedHashMap() : null;
            if (linkedHashMap2 != null && orbVarI5 != null) {
                Iterator<String> itKeys2 = orbVarI5.a.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    linkedHashMap2.put(next2, fsp.o(orbVarI5.c(next2)));
                }
            }
            z98Var = new z98(linkedHashMap, linkedHashMap2);
        }
        return new v98(bp1Var, aa8Var, z98Var);
    }

    public static final nz0 y(jm3 jm3Var, v5g v5gVar) {
        if (jm3Var.a) {
            if (v5gVar.a) {
                return new dc6(jm3Var.b, v5gVar.b);
            }
        } else if (!v5gVar.a) {
            return new yz5(false, false, (byte) 1);
        }
        return new ec6(jm3Var, v5gVar);
    }

    public static void z(float f2, float f3, float f4, float f5) {
        new PathInterpolator(f2, f3, f4, f5);
    }

    public final nq7 O(nq7 nq7Var, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || nq7Var.j()) {
            return nq7Var.a.m();
        }
        nq7 nq7VarP = P(nq7Var, bigInteger.abs());
        if (iSignum <= 0) {
            nq7VarP = nq7VarP.l();
        }
        p37.L(nq7VarP);
        return nq7VarP;
    }

    public abstract nq7 P(nq7 nq7Var, BigInteger bigInteger);
}
