package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.collection.ArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.custom_views.InterceptableFrameLayout;
import com.opera.android.custom_views.RecyclerViewForScreenshot;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.connection.RealCall;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class vzk implements v97, zun, lii {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public vzk(byte b) {
        switch (b) {
            case 23:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = fd7.p;
                break;
            case 29:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hg((byte) 0));
                this.b = new HashMap();
                this.c = new ReferenceQueue();
                this.a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new ig((Object) this, (byte) 0));
                break;
        }
    }

    public vzk(ImageView imageView, d06 d06Var) {
        this.a = imageView;
        this.b = d06Var;
        d06Var.m(imageView);
    }

    public /* synthetic */ vzk(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vzk(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public vzk(URL url, tm2 tm2Var, String str, String str2) {
        this.a = url;
        this.b = tm2Var;
        this.d = str;
        this.c = str2;
    }

    public vzk(npd npdVar) {
        this.b = new ArrayMap(0);
        this.c = new ArrayMap(0);
        this.a = new Object();
        this.d = new WeakReference(npdVar);
    }

    public vzk(r2j r2jVar) {
        this.a = new HashMap(r2jVar.a);
        this.b = new HashMap(r2jVar.b);
        this.c = new HashMap(r2jVar.c);
        this.d = new HashMap(r2jVar.d);
    }

    public vzk(r9g r9gVar) {
        this.a = new Object();
        this.b = new HashMap();
        this.c = new y9g();
        this.d = r9gVar;
    }

    public vzk(tif tifVar) {
        this.d = new isd((Object) this, (byte) 8);
        this.a = tifVar;
        this.b = new ii((byte) 20);
    }

    public vzk(wv1 wv1Var, esk eskVar, esk eskVar2) {
        this.a = wv1Var;
        this.b = eskVar;
        this.c = eskVar2;
        this.d = new LinkedHashSet();
    }

    public static wjh X(e9a e9aVar) {
        String strCommonHeadersGet = _HeadersCommonKt.commonHeadersGet(e9aVar.a, "X-Opera-Auth-UserEmail");
        String[] strArr = e9aVar.a;
        String strCommonHeadersGet2 = _HeadersCommonKt.commonHeadersGet(strArr, "X-Opera-Auth-UserName");
        String strCommonHeadersGet3 = _HeadersCommonKt.commonHeadersGet(strArr, "X-Opera-Auth-AuthToken");
        if (TextUtils.isEmpty(strCommonHeadersGet) || TextUtils.isEmpty(strCommonHeadersGet2) || TextUtils.isEmpty(strCommonHeadersGet3)) {
            return null;
        }
        return new wjh(strCommonHeadersGet3, strCommonHeadersGet2, "", strCommonHeadersGet, "", (byte) 8);
    }

    public static wjh Y(orb orbVar) {
        return new wjh(orbVar.m("token", ""), orbVar.m("username", ""), orbVar.m("fullname", ""), orbVar.m(Constants.Params.EMAIL, ""), orbVar.m("action", ""), (byte) 8);
    }

    @Override // defpackage.lii
    public final x79 A() {
        return (x79) this.d;
    }

    public final void B(final nod nodVar) {
        synchronized (this.a) {
            wl5 wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
            if (wl5Var == null) {
                return;
            }
            final cig cigVar = wl5Var.g;
            wl5Var.g = cig.b;
            wl5Var.c.add(new vl5(nodVar, cigVar) { // from class: ul5
                public final /* synthetic */ nod b;

                public final ListenableFuture run() {
                    npd npdVar = (npd) ((WeakReference) this.a.d).get();
                    if (npdVar != null) {
                        npdVar.o(this.b);
                    }
                    return r0b.b;
                }
            });
            if (wl5Var.f) {
                return;
            }
            wl5Var.f = true;
            z(wl5Var);
        }
    }

    public final jag C(String str) {
        jag jagVar;
        synchronized (this.a) {
            jagVar = (jag) ((HashMap) this.b).get(str);
        }
        return jagVar;
    }

    public final HashMap D() {
        HashMap map;
        synchronized (this.a) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                jag jagVar = new jag();
                for (lag lagVar : ((jag) entry.getValue()).a.keySet()) {
                    Boolean boolB = ((jag) entry.getValue()).b(lagVar);
                    if (boolB != null && boolB.booleanValue()) {
                        jagVar.a.put((EnumMap) lagVar, (lag) new iag(((jag) entry.getValue()).a(lagVar, (kag) null), true));
                    }
                }
                if (!jagVar.a.isEmpty()) {
                    map2.put((String) entry.getKey(), jagVar);
                }
            }
            map = new HashMap(map2);
        }
        return map;
    }

    public final HashSet E(kag kagVar) {
        lag lagVar = lag.g;
        HashSet hashSet = new HashSet();
        synchronized (this.a) {
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (((jag) entry.getValue()).a(lagVar, kag.ASK) == kagVar) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.zun
    public final void F(tun tunVar) {
        String strE = tunVar.e();
        bf9 bf9Var = (bf9) this.a;
        if (strE.isEmpty()) {
            strE = (String) this.b;
        }
        aib.I(bf9Var, strE, tunVar.a(), (String) this.c, tunVar.c(), (Callback) this.d);
    }

    public final cig G(nod nodVar) {
        synchronized (this.a) {
            wl5 wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
            if (wl5Var == null) {
                return null;
            }
            return wl5Var.e;
        }
    }

    public final h1b H() {
        h1b h1bVarS;
        synchronized (this.a) {
            h1bVarS = h1b.s(((ArrayMap) this.b).values());
        }
        return h1bVarS;
    }

    public final nod I(Object obj) {
        nod nodVar;
        synchronized (this.a) {
            nodVar = (nod) ((ArrayMap) this.b).get(obj);
        }
        return nodVar;
    }

    public final synchronized ea7 J() {
        ea7 ea7VarQ;
        ea7VarQ = (ea7) this.d;
        if (ea7VarQ == null) {
            ea7VarQ = ea7.q((File) this.b);
            this.d = ea7VarQ;
        }
        return ea7VarQ;
    }

    public final InputMethodManager K() {
        b2b b2bVarM;
        WindowAndroid windowAndroid = (WindowAndroid) this.b;
        Context context = (windowAndroid == null || (b2bVarM = windowAndroid.m()) == null) ? null : (Activity) b2bVarM.get();
        if (context == null) {
            context = (Context) this.a;
        }
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public final int L(boolean z) {
        SessionStore sessionStore;
        int iMRAgGFuI = N.MRAgGFuI(SessionStore.j.a, true, (b59) this.a);
        if (!z && (sessionStore = (SessionStore) this.d) != null) {
            N.MxPNalBp(sessionStore.a, iMRAgGFuI);
            sessionStore.injectNavigationHistory(iMRAgGFuI, 0, 0);
        }
        return iMRAgGFuI;
    }

    public final rhg M(nod nodVar) {
        synchronized (this.a) {
            return ((wl5) ((ArrayMap) this.c).get(nodVar)) != null ? null : null;
        }
    }

    public final ijg N(nod nodVar) {
        synchronized (this.a) {
            return ((wl5) ((ArrayMap) this.c).get(nodVar)) != null ? null : null;
        }
    }

    public final m59 O(nod nodVar) {
        wl5 wl5Var;
        synchronized (this.a) {
            wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
        }
        if (wl5Var != null) {
            return wl5Var.b;
        }
        return null;
    }

    public final tzk P(w4o w4oVar) {
        String str = w4oVar.a;
        int i = w4oVar.b;
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        e6iVarE.w(1, str);
        e6iVarE.T0(2, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            return cursorS.moveToFirst() ? new tzk(cursorS.getString(mkh.s(cursorS, "work_spec_id")), cursorS.getInt(mkh.s(cursorS, "generation")), cursorS.getInt(mkh.s(cursorS, "system_id"))) : null;
        } finally {
            cursorS.close();
            e6iVarE.release();
        }
    }

    public final void Q(tzk tzkVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b37) this.b).p(tzkVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.p();
        }
    }

    public final boolean R(View view) {
        InputMethodManager inputMethodManagerK = K();
        return inputMethodManagerK != null && inputMethodManagerK.isActive(view);
    }

    public final boolean S(nod nodVar) {
        boolean z;
        synchronized (this.a) {
            z = ((ArrayMap) this.c).get(nodVar) != null;
        }
        return z;
    }

    public final boolean T(nod nodVar, int i) {
        wl5 wl5Var;
        synchronized (this.a) {
            wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
        }
        npd npdVar = (npd) ((WeakReference) this.d).get();
        return wl5Var != null && wl5Var.e.a(i) && npdVar != null && npdVar.t.P().a(i);
    }

    public final boolean U(nod nodVar, int i) {
        wl5 wl5Var;
        synchronized (this.a) {
            wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
        }
        if (wl5Var != null) {
            o3j o3jVar = wl5Var.d;
            o3jVar.getClass();
            z4o.v("Use contains(Command) for custom command", i != 0);
            Iterator it = o3jVar.a.iterator();
            while (it.hasNext()) {
                if (((n3j) it.next()).a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean V(nod nodVar, n3j n3jVar) {
        wl5 wl5Var;
        synchronized (this.a) {
            wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
        }
        if (wl5Var == null) {
            return false;
        }
        u1b u1bVar = wl5Var.d.a;
        n3jVar.getClass();
        return u1bVar.contains(n3jVar) || vb5.k(n3jVar.b);
    }

    public final void W(vi2 vi2Var, lv5 lv5Var, tvh tvhVar) {
        tif tifVar = (tif) this.a;
        this.c = null;
        if (vi2Var != null) {
            if (lv5Var != null && vi2Var.c == -1) {
                lv5Var.a(null);
            }
            tifVar.y(vi2Var);
            return;
        }
        if (tvhVar != null) {
            tifVar.v(tvhVar);
        } else {
            tifVar.b();
        }
    }

    public final void Z(nod nodVar) {
        synchronized (this.a) {
            wl5 wl5Var = (wl5) ((ArrayMap) this.c).remove(nodVar);
            if (wl5Var == null) {
                return;
            }
            ((ArrayMap) this.b).remove(wl5Var.a);
            wl5Var.b.k();
            npd npdVar = (npd) ((WeakReference) this.d).get();
            if (npdVar == null || npdVar.i()) {
                return;
            }
            tym.S(npdVar.l, new tl5(npdVar, nodVar, (byte) 0));
        }
    }

    @Override // defpackage.lii
    public final boolean a() {
        return ((jii) this.b) != null;
    }

    public final void a0(tvh tvhVar, String str) {
        ArrayList arrayList = tvhVar.b;
        arrayList.add(new lyf("X-Mobile-Client", "ofa"));
        arrayList.add(new lyf("Accept", "application/json"));
        j4c j4cVar = OperaBrowserContext.b;
        arrayList.add(new lyf("Accept-Language", (String) N.MDAibNnc()));
        t9f t9fVar = (t9f) ((ii) this.b).get();
        fvh fvhVar = new fvh();
        fvhVar.h(tvhVar.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lyf lyfVar = (lyf) obj;
            fvhVar.d((String) lyfVar.a, (String) lyfVar.b);
        }
        if (!tvhVar.c.isEmpty()) {
            fvhVar.f(tvhVar.a());
        }
        RealCall realCallQ = j7c.q(fvhVar, t9fVar);
        this.c = new i16((Object) realCallQ, (Object) tvhVar, (Object) str, (byte) 28);
        realCallQ.enqueue((isd) this.d);
    }

    @Override // defpackage.lii
    public final boolean b() {
        return ((jii) this.b).o.getCurrentView() == ((jii) this.b).m;
    }

    public final void b0(Map map) {
        synchronized (this.c) {
            this.d = new pw1(map);
        }
        ((umi) this.a).d(new c4(this, (byte) 27)).a(null);
    }

    public final File c(hub hubVar) {
        String strA = ((ivg) this.a).A(hubVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(hubVar);
        }
        try {
            qq6 qq6VarO = J().o(strA);
            if (qq6VarO != null) {
                return ((File[]) qq6VarO.b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void c0(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final synchronized void d(s38 s38Var, t38 t38Var) {
        jg jgVar = (jg) ((HashMap) this.b).put(s38Var, new jg(s38Var, t38Var, (ReferenceQueue) this.c));
        if (jgVar != null) {
            jgVar.c = null;
            jgVar.clear();
        }
    }

    public final void d0(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.lii
    public final void destroy() {
        this.c = null;
        this.b = null;
    }

    public final void e(Object obj, nod nodVar, o3j o3jVar, cig cigVar) {
        synchronized (this.a) {
            nod nodVarI = I(obj);
            if (nodVarI == null) {
                ((ArrayMap) this.b).put(obj, nodVar);
                ((ArrayMap) this.c).put(nodVar, new wl5(obj, new m59(), o3jVar, cigVar));
            } else {
                wl5 wl5Var = (wl5) ((ArrayMap) this.c).get(nodVarI);
                wl5Var.getClass();
                wl5Var.d = o3jVar;
                wl5Var.e = cigVar;
            }
        }
    }

    public final void e0() {
        this.c = 16;
    }

    @Override // defpackage.zun
    public final void f(boolean z) {
        aib.I((bf9) this.a, (String) this.b, (String) null, (String) this.c, (String) null, (Callback) this.d);
    }

    public final boolean f0(String str, lag lagVar, kag kagVar, boolean z) {
        HashMap map = (HashMap) this.b;
        jag jagVar = (jag) map.get(str);
        if (jagVar == null) {
            jagVar = new jag();
            map.put(str, jagVar);
        }
        if (jagVar.a(lagVar, (kag) null) == kagVar) {
            Boolean boolB = jagVar.b(lagVar);
            if (boolB != null && z == boolB.booleanValue()) {
                return false;
            }
        } else {
            g0(str, lagVar, kagVar);
        }
        jagVar.a.put((EnumMap) lagVar, (lag) new iag(kagVar, z));
        return true;
    }

    @Override // defpackage.lii
    public final void g(boolean z) {
        jii jiiVar = (jii) this.b;
        if (z) {
            jiiVar.p.h(true);
        } else {
            jiiVar.p.f(true);
        }
    }

    public final void g0(String str, lag lagVar, kag kagVar) {
        y9g y9gVar = (y9g) this.c;
        w9g w9gVar = new w9g(str, lagVar);
        nce nceVar = y9gVar.b;
        if (nceVar.e.containsKey(w9gVar)) {
            r5 r5VarT = nceVar.t(w9gVar);
            if (r5VarT.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList((Collection) r5VarT);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x9g x9gVar = (x9g) obj;
                if (r5VarT.contains(x9gVar)) {
                    x9gVar.b.run(new kag[]{kagVar});
                }
            }
        }
    }

    public final void h(dy dyVar) {
        ((Set) this.c).add(dyVar);
    }

    public final void h0() {
        ode odeVar = (ode) this.d;
        ydn ydnVar = (ydn) this.a;
        boolean z = ydnVar.d.a;
        boolean zIsEnabled = ydnVar.c.isEnabled();
        wc7 wc7Var = (wc7) this.b;
        boolean zI = wc7Var.a.i("dns_over_https_enabled");
        SettingsManager settingsManager = wc7Var.a;
        odeVar.r(new bwi(z, zIsEnabled, zI, settingsManager.l(), settingsManager.z("dns_over_https_custom_server_template")));
    }

    @Override // defpackage.lii
    public final void i() {
        View currentView = ((jii) this.b).o.getCurrentView();
        jii jiiVar = (jii) this.b;
        if (currentView != jiiVar.m) {
            jiiVar.o.showNext();
        }
    }

    public final void i0() {
        nv6 nv6VarB = ((ru9) this.a).b();
        ArrayList arrayList = (ArrayList) this.d;
        ((SharedPreferences.Editor) nv6VarB.a).putString("wallpaper.favorites.list", CollectionsKt.P(arrayList, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
        nv6VarB.w();
        onn onnVar = (onn) this.b;
        List listK0 = CollectionsKt.k0(arrayList);
        x5f x5fVar = onnVar.d;
        List<String> list = listK0;
        ArrayList arrayList2 = new ArrayList(k95.o(list, 10));
        for (String str : list) {
            if (str.startsWith("FILE_storefront_wallpaper_")) {
                str = "store-wallpaper";
            } else if (str.startsWith("FILE_user_wallpaper_")) {
                str = "user-wallpaper";
            }
            arrayList2.add(str);
        }
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            b66VarF.getClass();
            b66VarF.q(69, 1, arrayList2);
            x5fVar.U0(x56VarF);
        }
        ((kze) this.c).r(arrayList);
    }

    public final void j(hub hubVar, l45 l45Var) {
        x97 x97Var;
        boolean z;
        String strA = ((ivg) this.a).A(hubVar);
        esg esgVar = (esg) this.c;
        synchronized (esgVar) {
            x97Var = (x97) ((HashMap) esgVar.b).get(strA);
            if (x97Var == null) {
                eq6 eq6Var = (eq6) esgVar.c;
                synchronized (((ArrayDeque) eq6Var.a)) {
                    try {
                        x97Var = (x97) ((ArrayDeque) eq6Var.a).poll();
                    } finally {
                    }
                }
                if (x97Var == null) {
                    x97Var = new x97();
                }
                ((HashMap) esgVar.b).put(strA, x97Var);
            }
            x97Var.b++;
        }
        x97Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(hubVar);
            }
            try {
                ea7 ea7VarJ = J();
                if (ea7VarJ.o(strA) == null) {
                    tn tnVarM = ea7VarJ.m(strA);
                    if (tnVarM == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (((u18) l45Var.a).l(l45Var.b, tnVarM.z(), (trf) l45Var.c)) {
                            ((ea7) tnVarM.d).k(tnVarM, true);
                            tnVarM.a = true;
                        }
                        if (!z) {
                            tnVarM.g();
                        }
                    } finally {
                        if (!tnVarM.a) {
                            try {
                                tnVarM.g();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            ((esg) this.c).C(strA);
        }
    }

    public final void k(nod nodVar, int i, vl5 vl5Var) {
        synchronized (this.a) {
            wl5 wl5Var = (wl5) ((ArrayMap) this.c).get(nodVar);
            if (wl5Var != null) {
                cig cigVar = wl5Var.g;
                cigVar.getClass();
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                w69 w69Var = cigVar.a;
                for (int i2 = 0; i2 < w69Var.a.size(); i2++) {
                    int iB = w69Var.b(i2);
                    z4o.H(!false);
                    sparseBooleanArray.append(iB, true);
                }
                z4o.H(!false);
                sparseBooleanArray.append(i, true);
                z4o.H(!false);
                wl5Var.g = new cig(new w69(sparseBooleanArray));
                wl5Var.c.add(vl5Var);
            }
        }
    }

    @Override // defpackage.lii
    public final void l(int i) {
        ((jii) this.b).l.setVisibility(i);
    }

    @Override // defpackage.lii
    public final int m() {
        return ((jii) this.b).o.getWidth();
    }

    @Override // defpackage.lii
    public final void n(String str) {
        ((jii) this.b).n.setText(str);
    }

    @Override // defpackage.lii
    public final void o(int i) {
    }

    public final v30 p() {
        Integer num = (Integer) this.a;
        if (num == null) {
            t3p.w("Key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            t3p.w("IV size is not set");
            return null;
        }
        if (((u30) this.d) == null) {
            t3p.w("Variant is not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new v30(num.intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (u30) this.d);
        }
        t3p.w("Tag size is not set");
        return null;
    }

    @Override // defpackage.lii
    public final void q() {
        View currentView = ((jii) this.b).o.getCurrentView();
        jii jiiVar = (jii) this.b;
        if (currentView != jiiVar.k) {
            jiiVar.o.showNext();
        }
    }

    public final void r() {
        vzk vzkVar = (vzk) this.d;
        if (vzkVar == null) {
            return;
        }
        ImageView imageView = (ImageView) vzkVar.a;
        vd2 vd2Var = (vd2) vzkVar.d;
        if (vd2Var != null) {
            ((ViewPropertyAnimator) vd2Var.e).cancel();
            vzkVar.d = null;
            ((d06) vzkVar.b).m(imageView);
            imageView.setScaleX(1.0f);
        }
        this.d = null;
    }

    public final void s(jg jgVar) {
        kyh kyhVar;
        synchronized (this) {
            ((HashMap) this.b).remove(jgVar.a);
            if (!jgVar.b || (kyhVar = jgVar.c) == null) {
                return;
            }
            ((f38) this.d).d(jgVar.a, new t38(kyhVar, true, false, jgVar.a, (f38) this.d));
        }
    }

    public final uy3 t(TabInfo tabInfo, ChromiumContent chromiumContent) {
        SessionStore sessionStore;
        boolean z = chromiumContent.t;
        int iL = L(z);
        if (!z && (sessionStore = (SessionStore) this.d) != null) {
            N.MbDDD5E8(sessionStore.a, chromiumContent.e(), iL, (Object) null);
        }
        return new uy3(this, chromiumContent, iL, tabInfo);
    }

    public final void u(Iterable iterable) {
        if (iterable == null) {
            t3p.q("extensions must not be null");
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sk8 sk8Var = (sk8) it.next();
            if (sk8Var instanceof wgk) {
                switch (((wgk) sk8Var).a) {
                    case 0:
                        ((ArrayList) this.b).add(new vgk());
                        break;
                    default:
                        ((ArrayList) this.a).add(new oj3((byte) 6));
                        break;
                }
            }
        }
    }

    @Override // defpackage.lii
    public final CoordinatorLayout v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final byte b = 0;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131559279, viewGroup, false);
        viewGroup.addView(coordinatorLayoutInflate);
        int i = 2131362192;
        LinearLayout linearLayout = (LinearLayout) w1h.j(2131362192, coordinatorLayoutInflate);
        if (linearLayout != null) {
            i = 2131362818;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362818, coordinatorLayoutInflate);
            if (frameLayout != null) {
                i = 2131362819;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362819, coordinatorLayoutInflate);
                if (stylingImageView != null) {
                    i = 2131363393;
                    View viewJ = w1h.j(2131363393, coordinatorLayoutInflate);
                    if (viewJ != null) {
                        hi4 hi4VarB = hi4.b(viewJ);
                        i = 2131363783;
                        View viewJ2 = w1h.j(2131363783, coordinatorLayoutInflate);
                        if (viewJ2 != null) {
                            hi4 hi4VarB2 = hi4.b(viewJ2);
                            i = 2131363843;
                            View viewJ3 = w1h.j(2131363843, coordinatorLayoutInflate);
                            if (viewJ3 != null) {
                                hi4 hi4VarB3 = hi4.b(viewJ3);
                                i = 2131363844;
                                TextInputLayout textInputLayoutJ = w1h.j(2131363844, coordinatorLayoutInflate);
                                if (textInputLayoutJ != null) {
                                    i = 2131363845;
                                    View viewJ4 = w1h.j(2131363845, coordinatorLayoutInflate);
                                    if (viewJ4 != null) {
                                        hi4 hi4VarB4 = hi4.b(viewJ4);
                                        i = 2131363936;
                                        InterceptableFrameLayout interceptableFrameLayout = (InterceptableFrameLayout) w1h.j(2131363936, coordinatorLayoutInflate);
                                        if (interceptableFrameLayout != null) {
                                            i = 2131363937;
                                            RecyclerViewForScreenshot recyclerViewForScreenshot = (RecyclerViewForScreenshot) w1h.j(2131363937, coordinatorLayoutInflate);
                                            if (recyclerViewForScreenshot != null) {
                                                i = 2131363938;
                                                LinearProgressIndicator linearProgressIndicatorJ = w1h.j(2131363938, coordinatorLayoutInflate);
                                                if (linearProgressIndicatorJ != null) {
                                                    i = 2131363939;
                                                    LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131363939, coordinatorLayoutInflate);
                                                    if (linearLayout2 != null) {
                                                        i = 2131363940;
                                                        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363940, coordinatorLayoutInflate);
                                                        if (stylingTextView != null) {
                                                            i = 2131363941;
                                                            ViewSwitcher viewSwitcher = (ViewSwitcher) w1h.j(2131363941, coordinatorLayoutInflate);
                                                            if (viewSwitcher != null) {
                                                                i = 2131364117;
                                                                FloatingActionButton floatingActionButtonJ = w1h.j(2131364117, coordinatorLayoutInflate);
                                                                if (floatingActionButtonJ != null) {
                                                                    i = 2131364423;
                                                                    LinearLayout linearLayout3 = (LinearLayout) w1h.j(2131364423, coordinatorLayoutInflate);
                                                                    if (linearLayout3 != null) {
                                                                        CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
                                                                        this.b = new jii(coordinatorLayout, linearLayout, frameLayout, stylingImageView, hi4VarB, hi4VarB2, hi4VarB3, textInputLayoutJ, hi4VarB4, interceptableFrameLayout, recyclerViewForScreenshot, linearProgressIndicatorJ, linearLayout2, stylingTextView, viewSwitcher, floatingActionButtonJ, linearLayout3);
                                                                        Context context = coordinatorLayout.getContext();
                                                                        final byte b2 = 1;
                                                                        ((jii) this.b).k.C0(new LinearLayoutManager(1, false));
                                                                        jii jiiVar = (jii) this.b;
                                                                        ((RecyclerView) jiiVar.k).t = true;
                                                                        jiiVar.j.a = new r9g((Object) this, (byte) 26);
                                                                        jiiVar.p.setOnClickListener(new View.OnClickListener(this) { // from class: mii
                                                                            public final /* synthetic */ vzk b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) throws NumberFormatException {
                                                                                byte b3 = b;
                                                                                vzk vzkVar = this.b;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        ((kii) vzkVar.a).run();
                                                                                        break;
                                                                                    default:
                                                                                        nii niiVar = (nii) vzkVar.c;
                                                                                        boolean z = niiVar.d;
                                                                                        if (!z) {
                                                                                            vzk vzkVar2 = niiVar.c;
                                                                                            if (!z) {
                                                                                                vzkVar2.r();
                                                                                                vzkVar2.x(false, true);
                                                                                                niiVar.b.setVisibility(0);
                                                                                                niiVar.a.animate().translationY(0.0f).setDuration(300L).setInterpolator(nii.e);
                                                                                                niiVar.d = true;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            niiVar.a();
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        vzk vzkVar = new vzk(((jii) this.b).d, new d06(sgb.F(2131232032, context)));
                                                                        vzkVar.c = new d06(sgb.F(2131232026, context));
                                                                        vzkVar.x(false, false);
                                                                        jii jiiVar2 = (jii) this.b;
                                                                        this.c = new nii(jiiVar2.b, jiiVar2.q, vzkVar);
                                                                        ((jii) this.b).c.setOnClickListener(new View.OnClickListener(this) { // from class: mii
                                                                            public final /* synthetic */ vzk b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) throws NumberFormatException {
                                                                                byte b3 = b2;
                                                                                vzk vzkVar2 = this.b;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        ((kii) vzkVar2.a).run();
                                                                                        break;
                                                                                    default:
                                                                                        nii niiVar = (nii) vzkVar2.c;
                                                                                        boolean z = niiVar.d;
                                                                                        if (!z) {
                                                                                            vzk vzkVar22 = niiVar.c;
                                                                                            if (!z) {
                                                                                                vzkVar22.r();
                                                                                                vzkVar22.x(false, true);
                                                                                                niiVar.b.setVisibility(0);
                                                                                                niiVar.a.animate().translationY(0.0f).setDuration(300L).setInterpolator(nii.e);
                                                                                                niiVar.d = true;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            niiVar.a();
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        ((jii) this.b).q.setVisibility(0);
                                                                        jii jiiVar3 = (jii) this.b;
                                                                        this.d = new x79(jiiVar3.f.b, jiiVar3.i.b, jiiVar3.e.b, jiiVar3.g.b, jiiVar3.h);
                                                                        return jiiVar3.a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void w(hq8 hq8Var, boolean z) {
        e84 e84Var = (e84) this.a;
        qfb qfbVar = (qfb) this.d;
        if (qfbVar == null) {
            return;
        }
        String strC = hq8Var.c();
        b59 b59Var = e84Var.a;
        if (strC.length() != 0) {
            HashSet hashSetM = w1h.m((SharedPreferences) b59Var.get(), "guids");
            if (hashSetM.add(strC)) {
                ((SharedPreferences) b59Var.get()).edit().putStringSet("guids", hashSetM).apply();
            }
        }
        new np6(e84Var, (td2) this.b, (pp6) this.c, qfbVar, hq8Var).b(z);
    }

    public final void x(boolean z, boolean z2) {
        ImageView imageView = (ImageView) this.a;
        d06 d06Var = (d06) this.c;
        if (z) {
            if (d06Var == null || !z2) {
                ((d06) this.b).m(imageView);
                return;
            }
            vzk vzkVar = (vzk) this.d;
            if (vzkVar == null) {
                vzkVar = new vzk(imageView, d06Var, (d06) this.b);
                this.d = vzkVar;
            }
            d06 d06Var2 = (d06) vzkVar.b;
            d06 d06Var3 = (d06) vzkVar.c;
            vd2 vd2Var = (vd2) vzkVar.d;
            if (vd2Var == null) {
                if (((ImageView) vzkVar.a).getDrawable() != ((Drawable) d06Var3.a)) {
                    vzkVar.d = new vd2(vzkVar, d06Var2, d06Var3, -1);
                    return;
                }
                return;
            } else {
                if (((d06) vd2Var.d) == ((d06) ((vzk) vd2Var.f).c)) {
                    return;
                }
                ((ViewPropertyAnimator) vd2Var.e).cancel();
                int i = vd2Var.b;
                vzkVar.d = null;
                vzkVar.d = new vd2(vzkVar, d06Var2, d06Var3, i != -1 ? -1 : 0);
                return;
            }
        }
        if (d06Var == null) {
            imageView.setImageDrawable(null);
            imageView.setBackground(null);
            return;
        }
        if (!z2) {
            d06Var.m(imageView);
            return;
        }
        vzk vzkVar2 = (vzk) this.d;
        if (vzkVar2 == null) {
            vzkVar2 = new vzk(imageView, d06Var, (d06) this.b);
            this.d = vzkVar2;
        }
        d06 d06Var4 = (d06) vzkVar2.b;
        d06 d06Var5 = (d06) vzkVar2.c;
        vd2 vd2Var2 = (vd2) vzkVar2.d;
        if (vd2Var2 == null) {
            if (((ImageView) vzkVar2.a).getDrawable() == ((Drawable) d06Var5.a)) {
                vzkVar2.d = new vd2(vzkVar2, d06Var5, d06Var4, -1);
            }
        } else if (((d06) vd2Var2.d) == ((d06) ((vzk) vd2Var2.f).c)) {
            ((ViewPropertyAnimator) vd2Var2.e).cancel();
            int i2 = vd2Var2.b;
            vzkVar2.d = null;
            vzkVar2.d = new vd2(vzkVar2, d06Var5, d06Var4, i2 != -1 ? -1 : 0);
        }
    }

    @Override // defpackage.lii
    public final void y(k8g k8gVar) {
        ((jii) this.b).k.y0(k8gVar);
    }

    public final void z(wl5 wl5Var) {
        npd npdVar = (npd) ((WeakReference) this.d).get();
        if (npdVar != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                vl5 vl5Var = (vl5) wl5Var.c.poll();
                if (vl5Var == null) {
                    wl5Var.f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                vzk vzkVar = this;
                tym.S(npdVar.l, new zr9(npdVar, this.I(wl5Var.a), new i61((Object) vzkVar, (Object) vl5Var, (Object) atomicBoolean2, (Object) wl5Var, (Object) atomicBoolean, (byte) 2)));
                atomicBoolean2.set(false);
                this = vzkVar;
            }
        }
    }
}
