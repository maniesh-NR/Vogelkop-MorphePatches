package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.chromium.components.autofill.FormData;
import org.chromium.printing.Printable;

/* loaded from: classes.dex */
public final class l45 implements foa, dn, s37, hf3, mya, wom, Printable {
    public static volatile l45 d;
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final dpj g = new dpj(9);
    public Object a;
    public Object b;
    public Object c;

    public l45(Context context, byte b) {
        switch (b) {
            case SizeUtil.textSize2 /* 24 */:
                this.a = new j4c(new t1(context, (byte) 4), (byte) 0);
                this.b = new j4c(new t1(context, (byte) 5), (byte) 0);
                this.c = dj9.t(context);
                break;
            default:
                this.c = context.getApplicationContext();
                this.b = new HashSet();
                this.a = new HashMap();
                break;
        }
    }

    public l45(OperaApplication operaApplication, String str) {
        b59 b59VarL = w1h.l(operaApplication, vml.d, "breakpad", new bg1[0]);
        this.a = new Object();
        this.b = b59VarL;
        this.c = str;
    }

    public /* synthetic */ l45(Object obj, Object obj2, Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public l45(String str, Function0 function0, Function1 function1) {
        cam camVarE;
        this.a = function0;
        this.b = function1;
        s15 s15VarA = uqh.a(m45.class);
        try {
            ztb ztbVar = KTypeProjection.c;
            s15 s15VarA2 = uqh.a(l45.class);
            cub cubVar = cub.a;
            uqh.a.getClass();
            aam aamVar = new aam(s15VarA2);
            uqh.c(aamVar, uqh.d(Object.class));
            cam camVar = new cam(aamVar, Collections.EMPTY_LIST, 0);
            ztbVar.getClass();
            camVarE = uqh.e(m45.class, ztb.a(camVar));
        } catch (Throwable unused) {
            camVarE = null;
        }
        this.c = new jf2(str, new x9m(s15VarA, camVarE));
    }

    public /* synthetic */ l45(boolean z, Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static l45 G(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new l45(context, (byte) 1);
                }
            }
        }
        return d;
    }

    public static String I(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static p12 S(String str, zjh zjhVar, String str2) {
        return new p12(str, zjhVar.a, zjhVar.c, zjhVar.e, zjhVar.g, zjhVar.j, zjhVar.s, str2);
    }

    public static int T(String str) {
        if ("original".equals(str)) {
            return 1;
        }
        return "transcoded".equals(str) ? 2 : 3;
    }

    public static Uri f(Uri uri, Map map) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Set setN = wqm.n(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            if (!setN.contains(entry.getKey())) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builderBuildUpon.build();
    }

    public static void g(Context context, String str, y66 y66Var) {
        y66Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, (ServiceConnection) y66Var, 33);
    }

    public static Uri o(URL url, String str) {
        return new Uri.Builder().scheme(url.getProtocol()).encodedAuthority(url.getAuthority()).encodedPath(url.getPath()).appendEncodedPath("news/detail").appendEncodedPath(str).build();
    }

    public static Uri r(String str, Integer num, String str2, List list, String str3) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            return uri;
        }
        ArrayMap arrayMap = new ArrayMap(0);
        arrayMap.put(Constants.Params.CLIENT, "opera");
        if (num != null) {
            arrayMap.put("like_count", String.valueOf(num));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayMap.put("like_status", str2);
        }
        if (list != null) {
            arrayMap.put("like_list", TextUtils.join("-", list));
        }
        if (str3 != null) {
            arrayMap.put("uid", str3);
        }
        return f(uri, arrayMap);
    }

    public static Uri x(Uri uri, Context context, long j, String str, l0c l0cVar) {
        String str2;
        HashMap map = new HashMap();
        map.put("features", String.valueOf(j));
        map.put("abgroup", v1.u(context).x());
        map.put(Constants.Params.CLIENT, "opera");
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        e00 e00VarD = operaApplication.d();
        if (operaApplication.J().u("personalized_ads") && !e00VarD.b().b && (str2 = e00VarD.b().a) != null) {
            map.put("gaid", str2);
        }
        if (str != null) {
            map.put("config_bundle", str);
        }
        if (l0cVar != null) {
            map.put("language", l0cVar.b);
            map.put(Constants.Keys.COUNTRY, l0cVar.a);
        }
        return f(uri, map);
    }

    public final String A() {
        String str = (String) ((j4c) this.a).get();
        if ((str == null || str.length() == 0) && ((str = (String) ((j4c) this.b).get()) == null || str.length() == 0)) {
            str = ((cj9) ((dj9) this.c).i()).a;
        }
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }

    public final awc B() {
        awc awcVar;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((auj) this.c)) {
            awcVar = (awc) this.b;
            if (awcVar == null || localeList != ((LocaleList) this.a)) {
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new yvc(localeList.get(i)));
                }
                awcVar = new awc(arrayList);
                this.a = localeList;
                this.b = awcVar;
            }
        }
        return awcVar;
    }

    public final long C() {
        lp6 lp6Var = (lp6) this.c;
        if (lp6Var != null) {
            return lp6Var.d;
        }
        return -1L;
    }

    @Override // defpackage.hf3
    public final void D() {
    }

    @Override // defpackage.hf3
    public final void E() {
        Duration durationPlusDays;
        skm skmVar = (skm) ((qb7) this.c).b;
        String str = (String) this.a;
        if (str != null) {
            x5f x5fVar = (x5f) skmVar;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.D(zpaVar).x(9, str);
            x5fVar.U0(x56VarF);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        xlk xlkVar = ((amk) this.b).c;
        String str2 = xlkVar.e;
        wlk wlkVar = xlkVar.a;
        if (wlkVar == null) {
            durationPlusDays = Duration.ZERO;
        } else {
            o9g o9gVar = wlkVar.c;
            durationPlusDays = Duration.ofDays(o9gVar.a * 365).plusDays(o9gVar.b * 30).plusDays(o9gVar.c * 7).plusDays(o9gVar.d);
        }
        x5f x5fVar2 = (x5f) skmVar;
        x5fVar2.getClass();
        zpa zpaVar2 = x5fVar2.d;
        x56 x56VarF2 = zpa.F();
        e66 e66Var = new ck0(zpaVar2, x56VarF2).i().a;
        e66Var.p(24, 1, jCurrentTimeMillis);
        if (str2 == null) {
            str2 = "";
        }
        e66Var.y(25, str2);
        e66Var.p(26, 1, durationPlusDays.toDays());
        x5fVar2.U0(x56VarF2);
    }

    public final int F(short s) {
        return (((FormData) this.a).a << 16) | s;
    }

    public final qxd H(String str) {
        if (!((ConcurrentHashMap) this.c).containsKey(str)) {
            synchronized (this) {
                if (!((ConcurrentHashMap) this.c).containsKey(str)) {
                    try {
                        for (udg udgVar : zxd.a(((yxd) this.a).Q(str))) {
                            bpd bpdVar = (bpd) this.b;
                            f1p f1pVar = (f1p) bpdVar.c;
                            if (((String) ((o9d) f1pVar.b).l(udgVar)).equals("001")) {
                                ((f1p) bpdVar.b).l(udgVar);
                            } else {
                                f1pVar.l(udgVar);
                            }
                        }
                        ((ConcurrentHashMap) this.c).put(str, str);
                    } catch (IllegalArgumentException | IllegalStateException e2) {
                        throw new IllegalStateException("Failed to read file ".concat(str), e2);
                    }
                }
            }
        }
        return (bpd) this.b;
    }

    public final HashSet J() {
        HashSet hashSet;
        synchronized (this.a) {
            String[] strArrSplit = TextUtils.split(((SharedPreferences) ((b59) this.b).get()).getString(((String) this.c).concat("upload.stamps"), ""), ",");
            hashSet = new HashSet();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : strArrSplit) {
                Long lValueOf = Long.valueOf(str);
                if (jCurrentTimeMillis >= lValueOf.longValue() && lValueOf.longValue() > jCurrentTimeMillis - 604800000) {
                    hashSet.add(lValueOf);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: s1g */
    public final void K(oc6 oc6Var, Uri uri, Map map, long j, long j2, g5h g5hVar) throws s1g {
        cn8 cn8Var;
        lp6 lp6Var = new lp6(oc6Var, j, j2);
        this.c = lp6Var;
        if (((cn8) this.b) != null) {
            return;
        }
        cn8[] cn8VarArrF = ((fn8) this.a).f(uri, map);
        z0b z0bVarQ = h1b.q(cn8VarArrF.length);
        boolean z = true;
        z = true;
        if (cn8VarArrF.length == 1) {
            cn8Var = cn8VarArrF[0];
            this.b = cn8Var;
        } else {
            int length = cn8VarArrF.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                cn8 cn8Var2 = cn8VarArrF[i];
                try {
                } catch (EOFException unused) {
                    if (((cn8) this.b) != null || lp6Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (((cn8) this.b) == null && lp6Var.d != j) {
                        z = false;
                    }
                    z4o.H(z);
                    lp6Var.f = 0;
                    throw th;
                }
                if (cn8Var2.a(lp6Var)) {
                    this.b = cn8Var2;
                    lp6Var.f = 0;
                    break;
                } else {
                    z0bVarQ.e(cn8Var2.c());
                    boolean z2 = ((cn8) this.b) != null || lp6Var.d == j;
                    z4o.H(z2);
                    lp6Var.f = 0;
                    i++;
                }
            }
            cn8 cn8Var3 = (cn8) this.b;
            if (cn8Var3 == null) {
                String str = "None of the available extractors (" + new r40(", ", (byte) 3).b(nb6.W(new b10(z ? (byte) 1 : (byte) 0), h1b.t(cn8VarArrF))) + ") could read the stream.";
                uri.getClass();
                throw new vmm(str, z0bVarQ.g());
            }
            cn8Var = cn8Var3;
        }
        cn8Var.d(g5hVar);
    }

    public final void L() {
        s6h s6hVar = (s6h) this.b;
        z99 z99Var = new z99(qbe.t(ma9.b(((pad) s6hVar.a).k(), new zp6((byte) 4, null, s6hVar))), new yf((byte) 18, (mt5) null, this), (byte) 2);
        ndc ndcVar = (ndc) this.a;
        j14.Y(scd.D(z99Var, ndcVar.getLifecycle()), cqp.V(ndcVar.getLifecycle()));
    }

    public final void M(tw1 tw1Var, String str) {
        Boolean bool = (Boolean) this.c;
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            w(tw1Var, str);
        } else {
            if (Intrinsics.a(bool, Boolean.FALSE)) {
                return;
            }
            if (bool == null) {
                ((ArrayList) this.b).add(new sw1(tw1Var, str));
            } else {
                h9o.p();
            }
        }
    }

    public final void N(h01 h01Var) {
        fjg fjgVar = (fjg) ((HashMap) this.a).remove(h01Var);
        fjgVar.getClass();
        ws6 ws6Var = (ws6) ((xs6) this.c).n.get(fjgVar);
        if (ws6Var != null) {
            synchronized (ws6Var) {
                ws6Var.d--;
            }
        }
    }

    public final void O(String str) {
        if (str != null) {
            this.a = str;
        } else {
            t3p.q("Null backendName");
        }
    }

    public final void P(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void Q(int i) throws GeneralSecurityException {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(sko.i(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.b = Integer.valueOf(i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList R(d5o r48, java.lang.String r49, long r50) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l45.R(d5o, java.lang.String, long):java.util.ArrayList");
    }

    public final msh U(String str, zjh zjhVar, String str2, long j, nb8 nb8Var) {
        Uri uri;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        String str5 = zjhVar.q;
        String[] strArr = zjhVar.o;
        String str6 = zjhVar.i;
        if (str5 != null && zjhVar.g != null && str6 != null && strArr != null && strArr.length != 0 && !TextUtils.isEmpty(strArr[0]) && (uri = Uri.parse(strArr[0])) != null) {
            esg esgVar = zjhVar.f;
            if (esgVar != null) {
                String str7 = (String) esgVar.b;
                str4 = (String) esgVar.c;
                str3 = str7;
            } else {
                str3 = null;
                str4 = null;
            }
            r05 r05Var = zjhVar.k;
            if (r05Var != null) {
                int i4 = r05Var.b;
                int i5 = r05Var.c;
                int i6 = r05Var.d;
                i = i4;
                arrayList = (ArrayList) r05Var.e;
                i2 = i5;
                i3 = i6;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                arrayList = null;
            }
            Uri uri2 = Uri.parse(str6);
            if (uri2 != null) {
                String str8 = zjhVar.m;
                String[] strArr2 = wqm.a;
                return new msh(zjhVar.q, zjhVar.r, zjhVar.n, uri, T(zjhVar.h), q(zjhVar), uri2, a26.d0(str8), a26.d0(zjhVar.t), zjhVar.p, j, str3, str4, i, i2, i3, arrayList, zjhVar.b, S(str, zjhVar, str2), zjhVar.C, zjhVar.D, zjhVar.l, (qre) this.c, zjhVar.F, nb8Var);
            }
        }
        return null;
    }

    public final d9i V(String str, zjh zjhVar, String str2, long j) {
        String str3 = zjhVar.q;
        xlg xlgVar = zjhVar.F;
        if (TextUtils.isEmpty(str3) || xlgVar == null) {
            return null;
        }
        String str4 = zjhVar.q;
        String str5 = zjhVar.n;
        String str6 = (String) xlgVar.c.get(0);
        String[] strArr = wqm.a;
        return new d9i(str4, str5, a26.d0(str6), a26.d0(zjhVar.m), zjhVar.p, j, a26.d0(zjhVar.t), S(str, zjhVar, str2), (qre) this.c, zjhVar.F);
    }

    public final rre W(String str, zjh zjhVar, String str2, long j, boolean z) {
        Uri uri;
        Uri uri2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        String str5 = zjhVar.q;
        String str6 = zjhVar.A;
        String[] strArr = zjhVar.o;
        String str7 = zjhVar.i;
        if (str5 != null && zjhVar.g != null && str7 != null && strArr != null && strArr.length != 0 && !TextUtils.isEmpty(strArr[0]) && str6 != null && (uri = Uri.parse(strArr[0])) != null && (uri2 = Uri.parse(str6)) != null) {
            String str8 = zjhVar.B;
            String[] strArr2 = wqm.a;
            a26.d0(str8);
            esg esgVar = zjhVar.f;
            if (esgVar != null) {
                String str9 = (String) esgVar.b;
                str4 = (String) esgVar.c;
                str3 = str9;
            } else {
                str3 = null;
                str4 = null;
            }
            r05 r05Var = zjhVar.k;
            if (r05Var != null) {
                int i4 = r05Var.b;
                int i5 = r05Var.c;
                int i6 = r05Var.d;
                i = i4;
                arrayList = (ArrayList) r05Var.e;
                i2 = i5;
                i3 = i6;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                arrayList = null;
            }
            Uri uri3 = Uri.parse(str7);
            if (uri3 != null) {
                return new rre(zjhVar.q, zjhVar.r, zjhVar.n, uri, T(zjhVar.h), q(zjhVar), uri3, a26.d0(zjhVar.m), a26.d0(zjhVar.t), zjhVar.p, j, str3, str4, i, i2, i3, arrayList, zjhVar.b, uri2, S(str, zjhVar, str2), zjhVar.C, zjhVar.D, zjhVar.l, z, (qre) this.c, zjhVar.F);
            }
        }
        return null;
    }

    public final ure X(String str, zjh zjhVar, String str2, long j) {
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        String str5 = zjhVar.q;
        h4n h4nVar = zjhVar.v;
        String str6 = zjhVar.i;
        String[] strArr = zjhVar.o;
        if (str5 != null && zjhVar.g != null && str6 != null && strArr != null && strArr.length != 0 && strArr[0] != null && h4nVar != null) {
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str7 : strArr) {
                String[] strArr2 = wqm.a;
                Uri uriD0 = a26.d0(str7);
                if (uriD0 != null) {
                    arrayList2.add(uriD0);
                }
            }
            if (!arrayList2.isEmpty()) {
                esg esgVar = zjhVar.f;
                if (esgVar != null) {
                    String str8 = (String) esgVar.b;
                    str4 = (String) esgVar.c;
                    str3 = str8;
                } else {
                    str3 = null;
                    str4 = null;
                }
                r05 r05Var = zjhVar.k;
                if (r05Var != null) {
                    int i4 = r05Var.b;
                    int i5 = r05Var.c;
                    int i6 = r05Var.d;
                    i = i4;
                    arrayList = (ArrayList) r05Var.e;
                    i2 = i5;
                    i3 = i6;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    arrayList = null;
                }
                String str9 = zjhVar.m;
                String[] strArr3 = wqm.a;
                Uri uriD02 = a26.d0(str9);
                Uri uriD03 = a26.d0(zjhVar.t);
                Uri uri = Uri.parse(str6);
                if (uri != null) {
                    return new ure(zjhVar.q, zjhVar.r, zjhVar.n, uri, uriD02, uriD03, zjhVar.p, j, str3, str4, i, i2, i3, arrayList, zjhVar.b, arrayList2, h4nVar.a, h4nVar.b, h4nVar.c, h4nVar.d, h4nVar.e, h4nVar.f, a26.d0(zjhVar.A), h4nVar.g, zjhVar.w, S(str, zjhVar, str2), zjhVar.C, zjhVar.D, zjhVar.l, (qre) this.c);
                }
            }
        }
        return null;
    }

    @Override // org.chromium.printing.Printable
    public final String a() {
        return (String) this.c;
    }

    @Override // org.chromium.printing.Printable
    public final boolean b() {
        ChromiumContent chromiumContent = (ChromiumContent) ((WeakReference) this.a).get();
        return (chromiumContent == null || chromiumContent.h() || chromiumContent.o.n(chromiumContent)) ? false : true;
    }

    @Override // defpackage.wom
    public final void c() {
        synchronized (this.a) {
            HashSet hashSetJ = J();
            hashSetJ.add(Long.valueOf(System.currentTimeMillis()));
            ((SharedPreferences) ((b59) this.b).get()).edit().putString(((String) this.c).concat("upload.stamps"), TextUtils.join(",", hashSetJ)).commit();
        }
    }

    @Override // defpackage.wom
    public final boolean d() {
        return J().size() >= 10;
    }

    public final void destroy() {
        ((AudioManager) this.a).unregisterAudioDeviceCallback((vf2) this.c);
    }

    public final void e(pna pnaVar, Object obj) {
        m45 m45Var = (m45) obj;
        jf2 jf2Var = m45Var.a;
        k45 k45Var = new k45(pnaVar, m45Var.b);
        m45Var.c.invoke(k45Var);
        m45Var.d = k45Var.d;
        ArrayList arrayList = k45Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            jga jgaVar = (jga) obj2;
            jgaVar.a.m(pnaVar, jgaVar.b);
        }
    }

    public final jf2 getKey() {
        return (jf2) this.c;
    }

    @Override // org.chromium.printing.Printable
    public final String getTitle() {
        ChromiumContent chromiumContent = (ChromiumContent) ((WeakReference) this.a).get();
        if (chromiumContent != null) {
            String strP = chromiumContent.p();
            if (!TextUtils.isEmpty(strP)) {
                return strP;
            }
            String strA = UrlMangler.a(chromiumContent.r(), "article_share_url");
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        return (String) this.b;
    }

    public final n20 h() {
        Integer num = (Integer) this.a;
        if (num == null) {
            t3p.w("key size not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            t3p.w("tag size not set");
            return null;
        }
        if (((m20) this.c) != null) {
            return new n20(num.intValue(), ((Integer) this.b).intValue(), (m20) this.c);
        }
        t3p.w("variant not set");
        return null;
    }

    @Override // defpackage.dn
    public final void i() {
        chb chbVar = (chb) this.a;
        w06 w06Var = chbVar.d;
        q00 q00Var = (q00) this.c;
        if (w06Var.d() || !s00.q(w06Var, 2)) {
            v50 v50VarP = s00.p(w06Var);
            q00Var.b(false, "Unsupported type #" + ((int) v50VarP.a), false, v50VarP, null);
            return;
        }
        String str = (String) this.b;
        dl dlVar = q00Var.d;
        p00 p00Var = new p00();
        int i = s00.w + 1;
        s00.w = i;
        q00Var.d(new h10(chbVar, str, dlVar, p00Var, i, q00Var.l.h, ap.a(chbVar.e)));
    }

    @Override // org.chromium.printing.Printable
    public final boolean j(int i, int i2) {
        if (b()) {
            return N.M$0a8QHM(((ChromiumContent) ((WeakReference) this.a).get()).e(), i, i2);
        }
        return false;
    }

    public final Object k(Function1 function1) {
        Object objInvoke = ((Function0) this.a).invoke();
        function1.invoke(objInvoke);
        return new m45((jf2) this.c, objInvoke, (Function1) this.b);
    }

    public final n40 l() {
        i4d i4dVar;
        m54 m54VarB;
        s40 s40Var = (s40) this.a;
        if (s40Var == null || (i4dVar = (i4d) this.b) == null) {
            t3p.w("Cannot build without parameters and/or key material");
            return null;
        }
        if (s40Var.a != ((m54) i4dVar.b).a.length) {
            t3p.w("Key size mismatch");
            return null;
        }
        if (s40Var.a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((s40) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        r40 r40Var = ((s40) this.a).b;
        if (r40Var == r40.e) {
            m54VarB = juf.a;
        } else if (r40Var == r40.d) {
            m54VarB = juf.a(((Integer) this.c).intValue());
        } else {
            if (r40Var != r40.c) {
                j9h.u(((s40) this.a).b, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            m54VarB = juf.b(((Integer) this.c).intValue());
        }
        return new n40((s40) this.a, (i4d) this.b, m54VarB, (Integer) this.c);
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        Bitmap bitmapCopy;
        esg esgVar = (esg) this.a;
        c84 c84Var = new c84((String) this.b, bitmap);
        ((d84) esgVar.b).a = c84Var;
        r9i r9iVar = (r9i) esgVar.c;
        Bitmap bitmap2 = bitmap.isRecycled() ? null : bitmap;
        if (bitmap2 != null && (bitmapCopy = bitmap2.copy(bitmap2.getConfig(), false)) != null) {
            ((qie) r9iVar.e).n(new oml(((umi) r9iVar.d).c(new k3(r9iVar, bitmapCopy, c84Var, (byte) 17))), null);
        }
        ((wx) this.c).run(bitmap);
    }

    public final dp2 n() {
        String strConcat = ((String) this.a) == null ? " backendName" : "";
        if (((myg) this.c) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new dp2((String) this.a, (byte[]) this.b, (myg) this.c);
        }
        qp2.n("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.dn
    public final void p(bm bmVar) {
        ((q00) this.c).b(bmVar == bm.d, bmVar.c, false, v50.k, null);
    }

    public final Uri q(zjh zjhVar) {
        Uri uriO;
        qtm qtmVar = (qtm) this.b;
        if (TextUtils.isEmpty(zjhVar.E)) {
            uriO = o(qtmVar.a.b, zjhVar.b);
        } else {
            uriO = Uri.parse(zjhVar.E);
        }
        return x(uriO, (Context) this.a, qtmVar.b, qtmVar.c, qtmVar.a.e);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void s(Bundle bundle) throws e22, ClassNotFoundException {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(2132017557);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (v7b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    t((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new e22(e2);
            }
        }
    }

    public final Object t(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = (HashMap) this.a;
        if (Trace.isEnabled()) {
            try {
                String simpleName = cls.getSimpleName();
                String strSubstring = simpleName.length() <= 127 ? simpleName : null;
                if (strSubstring == null) {
                    strSubstring = simpleName.substring(0, 127);
                }
                Trace.beginSection(strSubstring);
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                v7b v7bVar = (v7b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = v7bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            t(cls2, hashSet);
                        }
                    }
                }
                objCreate = v7bVar.create((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th) {
                throw new e22(th);
            }
        }
        return objCreate;
    }

    @Override // defpackage.mya
    public final void u(int i) {
        ((wx) this.c).run(null);
    }

    @Override // defpackage.hf3
    public final void v() {
    }

    public final void w(tw1 tw1Var, String str) {
        int length = str.length();
        x5f x5fVar = (x5f) this.a;
        String str2 = tw1Var.a;
        byte b = 29;
        if (length == 0) {
            x5fVar.T0(new tx0(str2, b));
        } else {
            x5fVar.T0(new tx0(sko.k(str2, ":", str), b));
        }
    }

    public final vg y() {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            return new vg(jCurrentTimeMillis - ((SharedPreferences) ((b59) this.a).get()).getLong("LastActiveTimeStamp", 0L) <= 21600000, ((ni6) this.b).a(jCurrentTimeMillis));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ArrayList z() {
        if (((ArrayList) this.b) == null) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = (ArrayList) this.a;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                String host = Uri.parse(str).getHost();
                hashSet.add(new c01(str, host, host != null ? (String) N.MnEPjazD(host, true) : null));
                if (host != null) {
                    hashSet2.add(host);
                }
            }
            for (String str2 : Arrays.asList((String[]) N.M9qRRZZC())) {
                String host2 = Uri.parse(str2).getHost();
                hashSet.add(new c01(str2, host2, host2 != null ? (String) N.MnEPjazD(host2, true) : null));
                if (host2 != null) {
                    hashSet2.add(host2);
                }
            }
            for (String str3 : hj.a(3)) {
                if (!hashSet2.contains(str3)) {
                    hashSet.add(new c01(new Uri.Builder().scheme("http").authority(str3).build().toString(), str3, (String) N.MnEPjazD(str3, true)));
                    hashSet2.add(str3);
                }
            }
            ArrayList arrayList2 = new ArrayList(hashSet);
            Collections.sort(arrayList2, new c9((byte) 3));
            this.b = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((ArrayList) this.b).add(((c01) obj2).a);
            }
        }
        return (ArrayList) this.b;
    }
}
