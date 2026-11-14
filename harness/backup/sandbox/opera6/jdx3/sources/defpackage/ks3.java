package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.icu.text.BreakIterator;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.leanplum.core.BuildConfig;
import com.leanplum.internal.Clock;
import com.opera.android.Lazy;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.crashhandler.OperaCrashKeys;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.stream.Stream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public final class ks3 implements km {
    public static volatile ks3 k;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public static final Object j = new Object();
    public static final r16 l = new r16();

    public /* synthetic */ ks3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    public static void B(String str, String str2) {
        E(new yo8(str, str2), Collections.EMPTY_MAP);
    }

    public static void D(Throwable th) {
        E(th, Collections.EMPTY_MAP);
    }

    public static void E(Throwable th, Map map) {
        synchronized (j) {
            ks3 ks3Var = k;
            wom womVar = (wom) ks3Var.h;
            if (!womVar.d()) {
                HashMap mapH = ks3Var.h();
                mapH.putAll(o((CopyOnWriteArraySet) ks3Var.f));
                mapH.putAll(map);
                e(mapH, th, true);
                try {
                    ((ExecutorService) ks3Var.a).execute(new bi2(ks3Var, mapH, (byte) 14));
                    womVar.c();
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public static void G(String str) {
        if (tz5.b.get() != null) {
            am2.x(tz5.c().edit().putString("crash.last.upload.status", "Error: ".concat(str)), "crash.last.upload.timestamp");
        }
    }

    public static void I(int i, String str) {
        ((OperaCrashKeys) k.c).a(i, str);
    }

    public static void e(HashMap map, Throwable th, boolean z) {
        String strB = veg.b(Log.getStackTraceString(th));
        if (z) {
            strB = sko.j("[INFO] ", strB);
        }
        map.put("exception_info", strB);
        map.put("IsJavaCrash", "1");
        map.put("IsInfoReport", z ? "1" : BuildConfig.BUILD_NUMBER);
    }

    public static HashMap o(Set set) {
        Map map;
        String[] strArr = OperaCrashKeys.c;
        HashMap map2 = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ym8 ym8Var = (ym8) it.next();
            if (ym8Var.b) {
                map = Collections.EMPTY_MAP;
            } else {
                ArrayList arrayListA = ym8.a(ym8Var.a);
                HashMap map3 = new HashMap(arrayListA.size());
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    yd2 yd2Var = (yd2) obj;
                    map3.put(strArr[yd2Var.a], yd2Var.b);
                }
                map = map3;
            }
            map2.putAll(map);
        }
        map2.put("CrashTime", Long.toString(System.currentTimeMillis() / 1000));
        if (tz5.b.get() != null) {
            map2.put(strArr[35], tz5.b());
        }
        return map2;
    }

    public final void A(yz yzVar) {
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.e) {
            return;
        }
        qk6VarD.e = true;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        dl dlVar = yzVar.o;
        q50 q50Var = dlVar.b;
        String str2 = dlVar.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.h, str, u50VarH, null, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void C(Throwable th) {
        HashMap mapH = h();
        mapH.putAll(o((CopyOnWriteArraySet) this.f));
        e(mapH, th, false);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(TextUtils.join("\n", k1g.w()));
        } catch (Throwable th2) {
            sb.append("[exception: ");
            sb.append(th2.getMessage());
            sb.append("]");
        }
        mapH.put("Logs", sb.toString());
        ((qz5) this.g).h(mapH);
    }

    public final void F(Throwable th) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            C(th);
        } catch (Throwable th2) {
            try {
                H(th2);
            } catch (Throwable th3) {
                if (threadPolicy != null) {
                    try {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
                if (vmPolicy != null) {
                    StrictMode.setVmPolicy(vmPolicy);
                }
                throw th3;
            }
        }
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void H(Throwable th) {
        String strConcat;
        wom womVar = (wom) this.i;
        if (womVar.d()) {
            return;
        }
        HashMap mapH = h();
        v61 v61Var = (v61) this.e;
        if (v61Var != null) {
            File cacheDir = v61Var.a.getCacheDir();
            if (cacheDir == null) {
                strConcat = "null";
            } else if (cacheDir.exists()) {
                strConcat = v61.c(cacheDir);
            } else {
                File parentFile = cacheDir.getParentFile();
                strConcat = (parentFile == null || !parentFile.exists()) ? "???" : "../".concat(v61.c(parentFile));
            }
            mapH.putAll(Collections.singletonMap("CacheDirStatus", strConcat));
        }
        mapH.putAll(o(Collections.EMPTY_SET));
        e(mapH, th, false);
        hvj hvjVar = new hvj(this);
        try {
            hvjVar.h(new URL("https://crashstats-collector.opera.com/collector/submit"));
            hvjVar.m(mapH);
            hvjVar.l();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            xvg.l(hvjVar);
            throw th2;
        }
        xvg.l(hvjVar);
        womVar.c();
    }

    public final void J(String str) {
        String strJoin;
        ldc ldcVar = (ldc) this.d;
        if (ldcVar == null) {
            return;
        }
        synchronized (ldcVar.b) {
            if (ldcVar.c.size() == 50) {
                ldcVar.c.removeLast();
            }
            ldcVar.c.addFirst(str + " (" + ((SimpleDateFormat) ldc.d.get()).format(new Date(System.currentTimeMillis())) + ")");
            synchronized (ldcVar.b) {
                try {
                    strJoin = TextUtils.join("\n", ldcVar.c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ldcVar.a.a(38, strJoin);
    }

    public final void K(cxj cxjVar, String str, String str2, int i, int i2) {
        List listC = cxjVar.c(i, i2);
        StringBuilder sb = cxjVar.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            Object obj = ((zwj) it.next()).a;
            if (obj instanceof ClickableSpan) {
                linkedHashSet.add(obj);
            }
        }
        if (linkedHashSet.size() > 0) {
            int i3 = 0;
            List listC2 = cxjVar.c(0, sb.length());
            String string = sb.toString();
            sb.setLength(0);
            cxjVar.b.clear();
            sb.append(string);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listC2) {
                if (!CollectionsKt.E(linkedHashSet, ((zwj) obj2).a)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                zwj zwjVar = (zwj) obj3;
                cxjVar.setSpan(zwjVar.a, zwjVar.b, zwjVar.c, zwjVar.d);
            }
        }
        cxjVar.setSpan(str == null ? ((jgc) this.h).a(str2, str2) : ((jgc) this.g).a(str, str2), i, i2, 17);
    }

    public final void L(pxh pxhVar) {
        if (((x0a) this.f) != null) {
            return;
        }
        x0a x0aVar = new x0a((zh7) ((ii) this.a).get(), (CoordinatorLayout) this.b, (ViewGroup) this.c, (qim) this.d, (kze) this.e, new tu7((Object) this, (byte) 21));
        this.f = x0aVar;
        ExtendedFloatingActionButton extendedFloatingActionButton = (View) x0aVar.e.e;
        extendedFloatingActionButton.setOnClickListener(new yk4((Object) this, (byte) 29));
        if (pxhVar != null) {
            extendedFloatingActionButton.setText(pxhVar.a(((ViewGroup) this.c).getResources()));
            if (!extendedFloatingActionButton.e0) {
                ok8 ok8Var = extendedFloatingActionButton.U;
                if (!ok8Var.n()) {
                    ok8Var.j();
                }
            }
            extendedFloatingActionButton.postDelayed((ld9) this.g, 5000L);
        } else {
            extendedFloatingActionButton.setText(null);
            if (extendedFloatingActionButton.e0) {
                ok8 ok8Var2 = extendedFloatingActionButton.T;
                if (!ok8Var2.n()) {
                    ok8Var2.j();
                }
            }
        }
        extendedFloatingActionButton.Q(0);
    }

    public final void a(yz yzVar, dl dlVar) {
        boolean z;
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.d) {
            z = false;
        } else {
            qk6VarD.d = true;
            z = true;
        }
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar2 = yzVar.o;
        q50 q50Var = dlVar2.b;
        String str2 = dlVar2.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h && z) {
            x5fVar.q(d60.f, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void b(yz yzVar, dl dlVar) {
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.j) {
            return;
        }
        qk6VarD.j = true;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar2 = yzVar.o;
        q50 q50Var = dlVar2.b;
        String str2 = dlVar2.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.o, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void c(dl dlVar) {
    }

    public final qk6 d(yz yzVar) {
        pk6 pk6Var = new pk6(yzVar);
        HashMap map = (HashMap) this.a;
        qk6 qk6Var = (qk6) map.get(pk6Var);
        if (qk6Var != null) {
            return qk6Var;
        }
        if (map.size() >= 250) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (((pk6) it.next()).a.get() == null) {
                    it.remove();
                }
            }
        }
        qk6 qk6Var2 = new qk6();
        map.put(pk6Var, qk6Var2);
        return qk6Var2;
    }

    public final void f(xuh xuhVar, eka ekaVar) {
        if (!(xuhVar instanceof dlj)) {
            if (xuhVar instanceof s7h) {
                nv6 nv6Var = (nv6) this.d;
                String str = ((s7h) xuhVar).a;
                x5f x5fVar = (x5f) nv6Var.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).j(new u5f(str, (byte) 0));
                    x5fVar.U0(x56VarF);
                }
            } else if (!(xuhVar instanceof zuh)) {
                h9o.p();
                return;
            }
        }
        ekaVar.n(new sw7(Unit.a));
    }

    public final void g(dic dicVar, PropertyModel propertyModel, View view) {
        dicVar.d(propertyModel, view);
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final HashMap h() {
        AtomicReferenceArray atomicReferenceArray = ((OperaCrashKeys) this.c).a;
        HashMap map = new HashMap(atomicReferenceArray.length());
        for (int i = 0; i < 50; i++) {
            String str = (String) atomicReferenceArray.get(i);
            if (str != null) {
                map.put(OperaCrashKeys.c[i], str);
            }
        }
        return map;
    }

    public final rmn i(gkn gknVar) {
        rmn rmnVar = (rmn) ((kze) this.h).g();
        qjn qjnVar = rmnVar.a;
        lkn lknVar = rmnVar.b;
        lkn lknVar2 = rmnVar.c;
        int i = gknVar.a.a;
        int i2 = gknVar.b.a;
        int i3 = gknVar.c.a;
        ikn iknVar = gknVar.d;
        return new rmn(qjnVar, lknVar, lknVar2, i, i2, i3, iknVar.a, iknVar, !p37.u0(i3), !p37.u0(r13.a), !p37.u0(r5.a), !p37.u0(iknVar.a));
    }

    public final void j(yz yzVar, hl hlVar) {
        d(yzVar);
        nn7 nn7Var = (nn7) this.b;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar = yzVar.o;
        q50 q50Var = dlVar.b;
        String str2 = dlVar.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.n, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void k(yz yzVar, dl dlVar) {
        boolean z;
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.c) {
            z = false;
        } else {
            z = true;
            qk6VarD.c = true;
        }
        long jUptimeMillis = qk6VarD.b == 0 ? -1L : SystemClock.uptimeMillis() - qk6VarD.b;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar2 = yzVar.o;
        q50 q50Var = dlVar2.b;
        String str2 = dlVar2.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(z ? d60.c : d60.d, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, jUptimeMillis, -1L, v50VarE, strJ);
        }
        if (z) {
            i5o i5oVar = (i5o) this.d;
            ((iy) i5oVar.a).d(new ky((Object) i5oVar, 2, (Object) yzVar, (Serializable) dlVar.c, (byte) 0));
        }
    }

    public final void l(yz yzVar) {
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.f) {
            return;
        }
        qk6VarD.f = true;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        dl dlVar = yzVar.o;
        q50 q50Var = dlVar.b;
        String str2 = dlVar.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.g, str, u50VarH, null, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final rmn m() {
        qjn qjnVar = (qjn) this.d;
        Context context = (Context) this.b;
        lkn lknVarA = qjnVar.a(0, context);
        lknVarA.c(context);
        lkn lknVarA2 = ((qjn) this.d).a(0, context);
        lknVarA2.c(context);
        xkn xknVar = ((qjn) this.d).a;
        int i = xknVar.d;
        int i2 = xknVar.f;
        int i3 = xknVar.e;
        boolean z = xknVar.g;
        boolean z2 = xknVar.h;
        return new rmn(qjnVar, lknVarA, lknVarA2, i, i, i2, i3, null, z, z2, z2, xknVar.i);
    }

    public final void n(yz yzVar, boolean z) {
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (z) {
            if (qk6VarD.h) {
                return;
            } else {
                qk6VarD.h = true;
            }
        } else if (qk6VarD.i) {
            return;
        } else {
            qk6VarD.i = true;
        }
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar = yzVar.o;
        q50 q50Var = dlVar.b;
        String str2 = dlVar.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(z ? d60.l : d60.m, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void p(yz yzVar, dl dlVar, boolean z) {
        boolean z2;
        boolean z3;
        o1 o1Var;
        int i;
        String str;
        String str2;
        q50 q50Var;
        int i2;
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        yo yoVar = yzVar.i;
        qk6VarD.b = SystemClock.uptimeMillis();
        if (qk6VarD.a) {
            z2 = false;
        } else {
            qk6VarD.a = true;
            z2 = true;
        }
        int iJ = nn7.j(yzVar);
        s9i s9iVar = (s9i) this.c;
        if (((SparseArray) s9iVar.d) == null) {
            ((i32) s9iVar.b).i();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        r59 r59Var = new r59(jCurrentTimeMillis);
        int iIndexOfKey = ((SparseArray) s9iVar.d).indexOfKey(iJ);
        SparseArray sparseArray = (SparseArray) s9iVar.d;
        if (iIndexOfKey < 0) {
            sparseArray.put(iJ, r59Var);
            z3 = true;
        } else {
            z3 = jCurrentTimeMillis - ((r59) sparseArray.valueAt(iIndexOfKey)).a >= Clock.MONTH_MILLIS;
            ((SparseArray) s9iVar.d).setValueAt(iIndexOfKey, r59Var);
        }
        if (((oml) s9iVar.e) == null) {
            oml omlVar = new oml(((umi) s9iVar.c).d(new bn7((Object) s9iVar, (byte) 27)));
            s9iVar.e = omlVar;
            omlVar.b(null, 5L, TimeUnit.MINUTES, null);
        }
        if (z3 || z2) {
            wjh wjhVar = (wjh) this.f;
            o59 o59Var = (o59) wjhVar.f;
            if (o59Var != null && o59Var.h <= -1) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                o59 o59Var2 = (o59) wjhVar.f;
                o59Var.h = jUptimeMillis - o59Var2.b;
                o59Var2.l = z;
                wjhVar.y(ie0.b);
            }
        }
        char c = z3 ? (char) 0 : z2 ? (char) 1 : (char) 2;
        if (z3 || z2) {
            s9i s9iVar2 = (s9i) this.e;
            il ilVar = (il) s9iVar2.e;
            if (ilVar == null) {
                ilVar = ((cy) ((vzk) s9iVar2.c).a).c().h;
                s9iVar2.e = ilVar;
            }
            if (ilVar != null && (o1Var = ilVar.f) != null && o1Var.b.equals(dlVar.c)) {
                ((i16) s9iVar2.b).y();
            }
        }
        if (yoVar != yo.FAKE_AD) {
            x5f x5fVar = (x5f) this.g;
            String str3 = yzVar.g;
            u50 u50VarH = yo.h(yoVar);
            String strG = yzVar.g();
            dl dlVar2 = yzVar.o;
            q50 q50Var2 = dlVar2.b;
            String str4 = dlVar2.c;
            q50 q50Var3 = yzVar.h().b;
            String str5 = yzVar.h().c;
            boolean zN = nn7Var.n(iJ);
            boolean z4 = z2;
            float fC = yzVar.r.c();
            v50 v50VarE = yzVar.e();
            String strJ = yzVar.j();
            if (x5fVar.h) {
                if (c == 0) {
                    q50Var = q50Var3;
                    i = iJ;
                    str = str4;
                    str2 = str5;
                    x5fVar.q(d60.i, str3, u50VarH, strG, q50Var2, str, q50Var, str2, i, zN, fC, -1L, -1L, v50VarE, strJ);
                    i2 = 1;
                } else {
                    i = iJ;
                    str = str4;
                    str2 = str5;
                    q50Var = q50Var3;
                    i2 = 1;
                    if (c == 1) {
                    }
                }
                x5fVar.q(d60.b, str3, u50VarH, strG, q50Var2, str, q50Var, str2, i, zN, fC, -1L, -1L, v50VarE, strJ);
            } else {
                i2 = 1;
            }
            if (z4) {
                i5o i5oVar = (i5o) this.d;
                ((iy) i5oVar.a).d(new ky((Object) i5oVar, i2, (Object) yzVar, (Serializable) dlVar.c, (byte) 0));
                int iJ2 = nn7.j(yzVar);
                nn7Var.m.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (nn7Var.r == null || nn7Var.p == null) {
                    nn7Var.n.add(new ln7(iJ2, jCurrentTimeMillis2));
                } else {
                    nn7Var.p(iJ2, jCurrentTimeMillis2);
                }
                ua7 ua7Var = (ua7) this.i;
                final String str6 = (String) y1j.d(new v39(new d82(Stream.of((Object[]) new String[]{yzVar.a, yzVar.b, yzVar.e, yzVar.h, yzVar.c, yzVar.d}).map(new m1e(new jkc(ua7Var, BreakIterator.getWordInstance(), (byte) 10), (byte) 0)), (byte) 4), false, new bli((byte) 13)));
                if (str6 == null || !((LinkedHashSet) ua7Var.c).add(yzVar.g)) {
                    return;
                }
                x5f x5fVar2 = (x5f) ua7Var.b;
                final String str7 = yzVar.g;
                final u50 u50VarH2 = yo.h(yoVar);
                final v50 v50VarE2 = yzVar.e();
                final String str8 = yzVar.a;
                final String str9 = yzVar.b;
                final String str10 = yzVar.h;
                String str11 = yzVar.d;
                if (str11 == null) {
                    str11 = yzVar.c;
                }
                final String str12 = str11;
                final String strF = yzVar.f();
                final String strJ2 = yzVar.j();
                final String strL = yzVar.l();
                x5fVar2.T0(new Function1() { // from class: r5f
                    /* JADX WARN: Type inference failed for: r0v0, types: [s5f] */
                    public final Object invoke(Object obj) {
                        if0 if0Var;
                        tb0 tb0VarC = ((ck0) obj).c();
                        final u50 u50Var = u50VarH2;
                        final v50 v50Var = v50VarE2;
                        final String str13 = str6;
                        final String str14 = str8;
                        final String str15 = str9;
                        final String str16 = str10;
                        final String str17 = str12;
                        final String str18 = strF;
                        final String str19 = strJ2;
                        final String str20 = strL;
                        ?? r0 = new Function1() { // from class: s5f
                            public final Object invoke(Object obj2) {
                                si0 si0Var = ((ti0) obj2).a;
                                si0Var.q(0, 1, u50Var);
                                v50 v50Var2 = v50Var;
                                if (v50Var2 != null) {
                                    si0Var.q(1, 1, v50Var2);
                                }
                                si0Var.x(2, str13);
                                si0Var.x(3, str14);
                                si0Var.x(4, str15);
                                String str21 = str16;
                                if (str21 != null) {
                                    si0Var.x(5, str21);
                                }
                                String str22 = str17;
                                if (str22 != null) {
                                    si0Var.x(6, str22);
                                }
                                String str23 = str18;
                                if (str23 != null) {
                                    si0Var.x(7, str23);
                                }
                                String str24 = str19;
                                if (str24 != null && str24.length() != 0) {
                                    si0Var.x(8, str24);
                                }
                                String str25 = str20;
                                if (str25 != null) {
                                    si0Var.x(9, str25);
                                }
                                return Unit.a;
                            }
                        };
                        tb0VarC.a.getClass();
                        si0 si0Var = new si0(2443, -1, 10);
                        q56 q56Var = tb0VarC.b;
                        Map map = (Map) q56Var.n(26);
                        if (map == null || map.isEmpty()) {
                            HashMap map2 = new HashMap();
                            q56Var.q(26, 1, map2);
                            if0Var = new if0(q56Var, 26, map2);
                        } else {
                            if0Var = new if0(q56Var, 26, map);
                        }
                        if0Var.put(str7, si0Var);
                        r0.invoke(new ti0(si0Var));
                        return Unit.a;
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0454 A[Catch: IOException -> 0x04b3, TryCatch #2 {IOException -> 0x04b3, blocks: (B:115:0x0440, B:116:0x044c, B:118:0x0454, B:121:0x046f, B:123:0x0474, B:125:0x047a, B:132:0x0492, B:133:0x049d, B:134:0x04a8), top: B:176:0x0440 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x046f A[Catch: IOException -> 0x04b3, TryCatch #2 {IOException -> 0x04b3, blocks: (B:115:0x0440, B:116:0x044c, B:118:0x0454, B:121:0x046f, B:123:0x0474, B:125:0x047a, B:132:0x0492, B:133:0x049d, B:134:0x04a8), top: B:176:0x0440 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047a A[Catch: IOException -> 0x04b3, TryCatch #2 {IOException -> 0x04b3, blocks: (B:115:0x0440, B:116:0x044c, B:118:0x0454, B:121:0x046f, B:123:0x0474, B:125:0x047a, B:132:0x0492, B:133:0x049d, B:134:0x04a8), top: B:176:0x0440 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0474 A[EDGE_INSN: B:211:0x0474->B:123:0x0474 BREAK  A[LOOP:8: B:116:0x044c->B:213:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(final defpackage.dp2 r49, int r50) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks3.q(dp2, int):void");
    }

    public final void r() {
        Context context = (Context) this.b;
        kze kzeVar = (kze) this.h;
        lh4 lh4Var = (lh4) this.i;
        if (lh4Var != null) {
            lh4Var.b = null;
        }
        final String str = (String) this.e;
        if (str == null || ((Rect) this.g).isEmpty() || ((Rect) this.f).isEmpty() || !((qjn) this.d).b()) {
            return;
        }
        final lkn lknVar = ((rmn) kzeVar.g()).c;
        lknVar.setBounds((Rect) this.f);
        final float fB = djh.b(((Rect) this.g).height() / ((Rect) this.f).height(), 0.0f, 1.0f);
        List list = a7k.m;
        final float fR = ddh.r(context, (kl5) ((tsd) this.c).g()) / ((Rect) this.f).height();
        final float fB2 = djh.b(context.getResources().getDimensionPixelSize(2131167589) / ((Rect) this.f).height(), 0.0f, 1.0f);
        ekn eknVar = (ekn) this.a;
        Rect rect = (Rect) this.f;
        zjn zjnVar = lknVar.i;
        float f = zjnVar.a;
        float f2 = zjnVar.b;
        float f3 = zjnVar.c;
        eknVar.b.i();
        gkn gknVar = (gkn) eknVar.a.get(new ckn(str, rect, fB, fB2, f, f2, f3));
        if (gknVar != null) {
            xf8.G0(kzeVar, i(gknVar));
            return;
        }
        this.i = new lh4(new Callback() { // from class: smn
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                gkn gknVar2 = (gkn) obj;
                if (gknVar2 == null) {
                    return;
                }
                ks3 ks3Var = this.a;
                ekn eknVar2 = (ekn) ks3Var.a;
                Rect rect2 = (Rect) ks3Var.f;
                zjn zjnVar2 = lknVar.i;
                float f4 = zjnVar2.a;
                float f5 = zjnVar2.b;
                float f6 = zjnVar2.c;
                dkn dknVar = eknVar2.b;
                dknVar.i();
                ckn cknVar = new ckn(str, rect2, fB, fB2, f4, f5, f6);
                yp9 yp9Var = eknVar2.a;
                if (!gknVar2.equals(yp9Var.get(cknVar))) {
                    yp9Var.put(cknVar, gknVar2);
                    dknVar.g(rbd.i(yp9Var));
                }
                xf8.G0((kze) ks3Var.h, ks3Var.i(gknVar2));
            }
        }, (byte) 0);
        umi umiVar = vml.d;
        ilm ilmVar = new ilm(this, (byte) 15);
        Bitmap bitmapU = z5i.u(61, 61, jkn.b);
        if (bitmapU == null) {
            ilmVar.run(null);
            return;
        }
        Rect bounds = lknVar.getBounds();
        Canvas canvas = new Canvas(bitmapU);
        canvas.scale(61.0f / bounds.width(), 61.0f / bounds.height());
        canvas.translate(-bounds.left, -bounds.top);
        lknVar.draw(canvas);
        nml nmlVarE = umiVar.e(new n5o() { // from class: fkn
            public final Object g(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                ikn iknVarB = jkn.b(bitmap);
                int iMax = Math.max(0, (int) Math.ceil(fB * 61.0f));
                ikn iknVarC = (iMax == 0 || iMax >= 61) ? iknVarB : jkn.c(jkn.a(bitmap, 0, 61, iMax));
                int iMax2 = Math.max(0, (int) Math.ceil(fR * 61.0f));
                ikn iknVarC2 = (iMax2 == 0 || iMax2 >= 61) ? iknVarB : jkn.c(jkn.a(bitmap, Math.min(iMax, 61 - iMax2), 61, iMax2));
                int iMax3 = Math.max(0, (int) Math.ceil(fB2 * 61.0f));
                return new gkn(iknVarC, iknVarC2, iknVarB, (iMax3 == 0 || iMax3 >= 61) ? iknVarB : jkn.c(jkn.a(bitmap, 61 - iMax3, 61, iMax3)));
            }
        });
        nmlVarE.b(umiVar.f(new roj(bitmapU, ilmVar, (byte) 12)));
        nmlVarE.a(bitmapU);
    }

    public final void s(yz yzVar) {
        nn7 nn7Var = (nn7) this.b;
        qk6 qk6VarD = d(yzVar);
        if (qk6VarD.g) {
            return;
        }
        qk6VarD.g = true;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar = yzVar.o;
        q50 q50Var = dlVar.b;
        String str2 = dlVar.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.k, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, -1L, v50VarE, strJ);
        }
    }

    public final void t(dl dlVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k73 u(java.lang.String r5, yma r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length()
            if (r1 >= r2) goto L1b
            char r2 = r5.charAt(r1)
            r3 = 32
            if (r2 == r3) goto L18
            char r2 = r5.charAt(r1)
            r3 = 10
            if (r2 != r3) goto L1b
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            java.lang.Object r2 = r4.d
            x77 r2 = (defpackage.x77) r2
            int r3 = r5.length()
            java.lang.CharSequence r3 = r5.subSequence(r1, r3)
            java.lang.String r3 = r3.toString()
            zc7 r2 = r2.j(r3)
            r4.z(r2)
            java.lang.Object r4 = r2.c
            k73 r4 = (defpackage.k73) r4
            boolean r2 = r4 instanceof szf
            if (r2 == 0) goto L47
            r2 = r4
            szf r2 = (szf) r2
            java.lang.Object r3 = r2.f
            k73 r3 = (defpackage.k73) r3
            if (r3 != 0) goto L47
            java.lang.Object r4 = r2.c
            k73 r4 = (defpackage.k73) r4
        L47:
            if (r1 <= 0) goto L5d
            nel r2 = new nel
            r2.<init>()
            java.lang.CharSequence r5 = r5.subSequence(r0, r1)
            java.lang.String r5 = r5.toString()
            r2.g = r5
            r6.l(r2)
        L5b:
            r6 = r4
            goto L5f
        L5d:
            r2 = r6
            goto L5b
        L5f:
            if (r6 == 0) goto L69
            java.lang.Object r4 = r6.f
            k73 r4 = (defpackage.k73) r4
            r2.l(r6)
            goto L5d
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks3.u(java.lang.String, yma):k73");
    }

    public final void v(xz xzVar, yz yzVar, dl dlVar) {
        hf0 hf0Var;
        int iOrdinal = xzVar.a.ordinal();
        o50 o50Var = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : o50.e : o50.d : o50.c : o50.b;
        if (o50Var == null) {
            return;
        }
        String strA = xzVar.a();
        String strB = xzVar.b();
        x5f x5fVar = (x5f) this.h;
        u50 u50VarH = yo.h(yzVar.i);
        String str = yzVar.g;
        String str2 = yzVar.a;
        String str3 = yzVar.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        p50 p50Var = new p50(2443, -1, 7);
        p50Var.q(0, 1, o50Var);
        p50Var.q(1, 1, u50VarH);
        p50Var.x(2, str);
        if (strA != null) {
            p50Var.q(3, 1, strA);
        }
        if (strB != null) {
            p50Var.x(4, strB);
        }
        p50Var.x(5, str2);
        p50Var.x(6, str3);
        de0 de0VarC = x56VarF.C(zpaVar);
        List list = (List) de0VarC.n(1);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            de0VarC.q(1, 1, arrayList);
            hf0Var = new hf0(de0VarC, 1, arrayList);
        } else {
            hf0Var = new hf0(de0VarC, 1, list);
        }
        hf0Var.add(p50Var);
        x5fVar.U0(x56VarF);
    }

    public final k6g w() {
        return new k6g(((dw3) this.a).b.J(), (PasswordManager) ((Lazy) this.b).get(), (x5g) ((Lazy) this.i).get(), (yu2) ((Lazy) this.c).get(), ((ji) this.d).b.N(), ((ji) this.e).b.b(), (yv3) this.f, (n6g) ((ji) this.g).get(), (cq5) ((dw3) this.h).get());
    }

    public final void x(yz yzVar, dl dlVar) {
        nn7 nn7Var = (nn7) this.b;
        long jUptimeMillis = -1;
        if (yzVar.j == rm.INTERSTITIAL) {
            qk6 qk6VarD = d(yzVar);
            if (qk6VarD.b != 0) {
                jUptimeMillis = SystemClock.uptimeMillis() - qk6VarD.b;
            }
        }
        long j2 = jUptimeMillis;
        int iJ = nn7.j(yzVar);
        x5f x5fVar = (x5f) this.g;
        String str = yzVar.g;
        u50 u50VarH = yo.h(yzVar.i);
        String strG = yzVar.g();
        dl dlVar2 = yzVar.o;
        q50 q50Var = dlVar2.b;
        String str2 = dlVar2.c;
        q50 q50Var2 = yzVar.h().b;
        String str3 = yzVar.h().c;
        boolean zN = nn7Var.n(iJ);
        float fC = yzVar.r.c();
        v50 v50VarE = yzVar.e();
        String strJ = yzVar.j();
        if (x5fVar.h) {
            x5fVar.q(d60.j, str, u50VarH, strG, q50Var, str2, q50Var2, str3, iJ, zN, fC, -1L, j2, v50VarE, strJ);
        }
    }

    public final void y(mma mmaVar, IntRange intRange, IntRange intRange2) {
        yma ymaVar;
        String str = mmaVar.g;
        nel nelVar = new nel();
        nelVar.g = str.subSequence(0, ((a) intRange).a).toString();
        yma ymaVar2 = new yma();
        ymaVar2.g = StringsKt.d0(str, intRange);
        if (intRange2.isEmpty()) {
            ymaVar = null;
        } else {
            ymaVar = new yma();
            ymaVar.g = StringsKt.d0(str, intRange2);
        }
        if (nelVar.g.length() == 0) {
            mmaVar.m(ymaVar2);
        } else {
            mmaVar.m(nelVar);
            nelVar.l(ymaVar2);
        }
        k73 k73VarU = u(str.subSequence(((a) intRange).b + 1, intRange2.isEmpty() ? str.length() : ((a) intRange2).a).toString(), ymaVar2);
        if (ymaVar != null) {
            k73VarU.l(ymaVar);
        }
        mmaVar.C();
        if (ymaVar != null) {
            u(str.subSequence(((a) intRange2).b + 1, str.length()).toString(), ymaVar);
        }
    }

    public final void z(zc7 zc7Var) {
        eq6 eq6Var = new eq6(this);
        zc7Var.getClass();
        eq6Var.A(zc7Var);
    }
}
