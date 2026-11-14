package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.custom_views.RecyclerViewForScreenshot;
import com.opera.android.custom_views.Shadow;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.view.TouchIgnoringViewPager;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import com.opera.android.webcore.WebcoreRpcBridge;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;

/* loaded from: classes.dex */
public class r9i implements xyn, jw1, htd, kud, fvj, azc, fu8, dmg, zkf, vnk, lii {
    public static final nyf f = new nyf();
    public static int g;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public r9i(byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = new g1g();
                this.c = new g1g();
                this.d = new edg();
                break;
            default:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    public r9i(Context context, e84 e84Var, umi umiVar) {
        this.a = (byte) 7;
        this.b = context.getApplicationContext();
        this.c = e84Var;
        this.d = umiVar;
        this.e = new qie((byte) 19);
    }

    public r9i(ConstraintLayout constraintLayout, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2, OperaProgressIndicator operaProgressIndicator, TouchIgnoringViewPager touchIgnoringViewPager) {
        this.a = (byte) 17;
        this.b = operaMaterialButton;
        this.c = operaMaterialButton2;
        this.d = operaProgressIndicator;
        this.e = touchIgnoringViewPager;
    }

    public r9i(NestedScrollView nestedScrollView, View view, hcb hcbVar) {
        this.a = (byte) 20;
        this.d = new int[2];
        this.b = nestedScrollView;
        this.c = view;
        this.e = hcbVar;
    }

    public r9i(bon bonVar, pad padVar, qp6 qp6Var, d06 d06Var) {
        this.a = (byte) 11;
        this.b = padVar;
        this.c = qp6Var;
        this.d = d06Var;
        this.e = z4c.b(new r94(this, (byte) 21));
    }

    public r9i(WeatherWidgetActivity weatherWidgetActivity, WebContents webContents, ks3 ks3Var) {
        this.a = (byte) 0;
        this.b = ks3Var;
        qq8 qq8Var = new qq8(new tu(this, (byte) 6));
        this.c = qq8Var;
        this.e = new upn(qq8Var);
        this.d = new WebcoreRpcBridge(2, webContents, this);
        weatherWidgetActivity.getLifecycle().a(new rz(this, (byte) 2));
    }

    public r9i(csh cshVar, bpd bpdVar, esg esgVar, s6h s6hVar) {
        h1b h1bVarS;
        this.a = (byte) 21;
        if (cshVar != null) {
            h1bVarS = h1b.s(cshVar);
        } else {
            a1b a1bVar = h1b.b;
            h1bVarS = csh.e;
        }
        this.b = h1bVarS;
        this.c = bpdVar;
        this.d = esgVar;
        this.e = s6hVar;
    }

    public r9i(dkf dkfVar, View view, int i, int i2, jwf jwfVar) {
        this.a = (byte) 10;
        this.b = dkfVar;
        m66 m66Var = new m66(dkfVar);
        this.c = m66Var;
        ((itd) m66Var).e = this;
        ((itd) m66Var).m = jwfVar;
        o66 o66Var = new o66(dkfVar, m66Var, view, i2);
        this.d = o66Var;
        o66Var.m = i;
        o66Var.h = this;
    }

    public r9i(f9c f9cVar, Context context) {
        this.a = (byte) 19;
        this.e = f9cVar;
        this.d = ColorStateList.valueOf(0);
        this.b = f03.v(context);
        this.c = f03.u(2130969110, new dkf(context, 2132084153), 2131099825);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r9i(fwa r18, android.util.Size r19, android.hardware.camera2.CameraCharacteristics r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9i.<init>(fwa, android.util.Size, android.hardware.camera2.CameraCharacteristics, boolean):void");
    }

    public r9i(i16 i16Var, u59 u59Var, s99 s99Var) {
        this.a = (byte) 9;
        this.b = i16Var;
        this.c = u59Var;
        this.d = s99Var;
        this.e = new LinkedHashSet();
    }

    public r9i(File file, umi umiVar) {
        this.a = (byte) 14;
        this.b = file;
        this.c = umiVar;
        this.d = new File(file, "favorite_catalog_json_data");
        this.e = new qie((byte) 19);
    }

    public /* synthetic */ r9i(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public r9i(String str, String str2, String str3, ArrayList arrayList) {
        this.a = (byte) 2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = Collections.unmodifiableList(arrayList);
    }

    public r9i(Socket socket) {
        this.a = (byte) 12;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new uv6(this);
        this.e = new tv6(this);
    }

    public r9i(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = new SparseBooleanArray();
        this.c = new ArrayMap(0);
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        oyf oyfVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            oyf oyfVar2 = (oyf) arrayList.get(i2);
            int i3 = oyfVar2.e;
            if (i3 > i) {
                oyfVar = oyfVar2;
                i = i3;
            }
        }
        this.e = oyfVar;
    }

    public r9i(k6l k6lVar, SettingsManager settingsManager) {
        this.a = (byte) 8;
        i25 i25Var = new i25(this);
        this.d = i25Var;
        j25 j25Var = new j25(this, (byte) 0);
        this.e = j25Var;
        this.b = k6lVar;
        this.c = settingsManager;
        k6lVar.F(i25Var);
        settingsManager.F(j25Var);
    }

    public r9i(kii kiiVar, kii kiiVar2) {
        this.a = (byte) 28;
        this.b = kiiVar;
        this.c = kiiVar2;
    }

    public r9i(WebContents webContents, u02 u02Var) {
        this.a = (byte) 5;
        qq8 qq8Var = new qq8(new ab(this, (byte) 16));
        this.c = qq8Var;
        this.e = new ole(qq8Var);
        this.d = new WebcoreRpcBridge(0, webContents, this);
        this.b = u02Var;
    }

    public r9i(ppf ppfVar, MediationNativeAdConfiguration mediationNativeAdConfiguration, Context context, String str) {
        this.a = (byte) 23;
        this.e = ppfVar;
        this.b = mediationNativeAdConfiguration;
        this.c = context;
        this.d = str;
    }

    public r9i(uy8 uy8Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 15;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        Objects.requireNonNull(uy8Var);
        this.e = uy8Var;
    }

    public r9i(vzk vzkVar) {
        this.a = (byte) 24;
        ArrayList arrayList = (ArrayList) vzkVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) vzkVar.d;
        LinkedHashSet linkedHashSet2 = fd7.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(fd7.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        this.d = new j06((byte) 23);
        this.e = (ArrayList) vzkVar.c;
        ArrayList arrayList3 = (ArrayList) vzkVar.b;
        this.c = arrayList3;
        new g8b(new c5o(arrayList3, Collections.EMPTY_MAP));
    }

    public static boolean K(int i, int i2) {
        return i2 <= 33 && i > 33;
    }

    public static void Q(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    @Override // defpackage.lii
    public final x79 A() {
        return (x79) this.e;
    }

    public final ArrayList B(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.b;
        Q(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.c;
        Q(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            oa3 oa3Var = (oa3) list.get(i);
            if (!map.containsKey(oa3Var.b) && !map2.containsKey(Integer.valueOf(oa3Var.c))) {
                arrayList.add(oa3Var);
            }
        }
        return arrayList;
    }

    public final h40 C() {
        Integer num = (Integer) this.b;
        if (num == null) {
            t3p.w("Key size is not set");
            return null;
        }
        if (((g40) this.e) == null) {
            t3p.w("Variant is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            t3p.w("IV size is not set");
            return null;
        }
        if (((Integer) this.d) != null) {
            return new h40(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (g40) this.e);
        }
        t3p.w("Tag size is not set");
        return null;
    }

    public final ar7 D() {
        c30 c30Var = c30.h;
        u30 u30Var = (u30) this.b;
        if (u30Var == null) {
            t3p.w("signature encoding is not set");
            return null;
        }
        zq7 zq7Var = (zq7) this.c;
        if (zq7Var == null) {
            t3p.w("EC curve type is not set");
            return null;
        }
        c30 c30Var2 = (c30) this.d;
        if (c30Var2 == null) {
            t3p.w("hash type is not set");
            return null;
        }
        g40 g40Var = (g40) this.e;
        if (g40Var == null) {
            t3p.w("variant is not set");
            return null;
        }
        if (zq7Var == zq7.c && c30Var2 != c30.f) {
            t3p.w("NIST_P256 requires SHA256");
            return null;
        }
        if (zq7Var == zq7.d && c30Var2 != c30.g && c30Var2 != c30Var) {
            t3p.w("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (zq7Var != zq7.e || c30Var2 == c30Var) {
            return new ar7(u30Var, zq7Var, c30Var2, g40Var);
        }
        t3p.w("NIST_P521 requires SHA512");
        return null;
    }

    public final void E() {
        s0b s0bVar;
        xug.i();
        igi igiVar = (igi) this.d;
        xug.i();
        xm2 xm2Var = (xm2) igiVar.f;
        Objects.requireNonNull(xm2Var);
        bl9 bl9Var = (bl9) igiVar.c;
        Objects.requireNonNull(bl9Var);
        bl9 bl9Var2 = (bl9) igiVar.d;
        s0b s0bVar2 = xm2Var.c;
        Objects.requireNonNull(s0bVar2);
        s0bVar2.a();
        s0b s0bVar3 = xm2Var.c;
        Objects.requireNonNull(s0bVar3);
        k1g.O(((g07) s0bVar3).e).addListener(new li4(bl9Var, (byte) 0), x7d.l());
        s0b s0bVar4 = xm2Var.e;
        if (s0bVar4 != null) {
            s0bVar4.a();
            k1g.O(((g07) xm2Var.e).e).addListener(new li4((bl9) null, (byte) 1), x7d.l());
        }
        if (xm2Var.h.size() <= 1 || (s0bVar = xm2Var.d) == null) {
            return;
        }
        s0bVar.a();
        k1g.O(((g07) xm2Var.d).e).addListener(new li4(bl9Var2, (byte) 2), x7d.l());
    }

    public String F(oqe oqeVar, ga6 ga6Var) {
        Uri uri = ((msh) oqeVar).i;
        uqe uqeVar = (uqe) this.b;
        Point point = (Point) ga6Var.b;
        return uqeVar.m(uri, point.x, point.y);
    }

    public final File G() {
        File cacheDir = ((Context) this.b).getCacheDir();
        Locale locale = Locale.ROOT;
        return new File(cacheDir, "account_profile_picture.png-account_profile_picture.png");
    }

    public String H(oqe oqeVar) {
        msh mshVar = (msh) oqeVar;
        return !TextUtils.isEmpty(mshVar.h) ? mshVar.h : mshVar.b();
    }

    public long I(oqe oqeVar) {
        return TimeUnit.SECONDS.toMillis(((msh) oqeVar).o);
    }

    public String J(oqe oqeVar) {
        msh mshVar = (msh) oqeVar;
        xlg xlgVar = mshVar.z;
        return xlgVar == null ? mshVar.b : xlgVar.b;
    }

    public final void L(int i) {
        new l66(this, (dkf) this.b).inflate(i, (m66) this.c);
    }

    public final void M(String str, Callback callback) {
        umi umiVar = (umi) this.d;
        String string = ((SharedPreferences) ((e84) this.c).a.get()).getString("image_url", null);
        if (!(string == null ? false : string.equals(str))) {
            callback.run(null);
            return;
        }
        nml nmlVarE = umiVar.e(new xj(this, str, (byte) 23));
        nmlVarE.b(umiVar.f(new lw0(callback, (byte) 2)));
        ((qie) this.e).n(new oml(nmlVarE), null);
    }

    public final void N(lx8 lx8Var, j82 j82Var) {
        ylg ylgVar = (ylg) this.d;
        if (ylgVar != null) {
            ylgVar.n(lx8Var, j82Var);
        }
    }

    public final void O(j82 j82Var, boolean z) {
        uqe uqeVar = (uqe) this.b;
        if (!z) {
            msh mshVar = (msh) ((pue) j82Var).c;
            uy8 uy8Var = uqeVar.h;
            uy8.i(uy8Var.d, mshVar);
            uy8.i(uy8Var.e, mshVar);
            return;
        }
        oqe oqeVar = ((pue) j82Var).c;
        boolean z2 = j82Var.e;
        if (oqeVar == null) {
            uqeVar.getClass();
            return;
        }
        uy8 uy8Var2 = uqeVar.h;
        if (z2) {
            uy8Var2.j(oqeVar, 2);
        } else {
            uy8Var2.j(oqeVar, 0);
        }
    }

    public final void P(jec jecVar, ArrayList arrayList) {
        uy8 uy8Var = (uy8) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dy8 dy8Var = (dy8) obj;
            if (dy8Var.a.equals("impression")) {
                String str = ((ey8) dy8Var).d;
                Set set = uy8Var.w;
                Set set2 = uy8Var.y;
                k5o k5oVar = uy8Var.H;
                if (set.remove(str)) {
                    k5oVar.r(str, true);
                    uy8Var.x.remove(str);
                    set2.remove(str);
                } else {
                    set2.add(str);
                    k5oVar.r(str, true);
                }
            }
        }
        jecVar.removeAll(arrayList);
    }

    public final oa3 R(List list) {
        oa3 oa3Var;
        HashMap map = (HashMap) this.d;
        ArrayList arrayListB = B(list);
        if (arrayListB.size() < 2) {
            return (oa3) sfe.Z(arrayListB, (String) null);
        }
        Collections.sort(arrayListB, new c9((byte) 6));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((oa3) arrayListB.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListB.size()) {
                break;
            }
            oa3 oa3Var2 = (oa3) arrayListB.get(i3);
            if (i2 == oa3Var2.c) {
                arrayList.add(new Pair(oa3Var2.b, Integer.valueOf(oa3Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (oa3) arrayListB.get(0);
            }
        }
        oa3 oa3Var3 = (oa3) map.get(arrayList);
        if (oa3Var3 != null) {
            return oa3Var3;
        }
        List listSubList = arrayListB.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((oa3) listSubList.get(i5)).d;
        }
        int iNextInt = ((Random) this.e).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                oa3Var = (oa3) sfe.c0(listSubList);
                break;
            }
            oa3Var = (oa3) listSubList.get(i);
            i6 += oa3Var.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        map.put(arrayList, oa3Var);
        return oa3Var;
    }

    public final void S(boolean z) {
        o66 o66Var = (o66) this.d;
        o66Var.s = z;
        o66Var.t = true;
    }

    public final void T() {
        this.c = 12;
    }

    public final void U(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void V() {
        this.d = 16;
    }

    public final void W(boolean z) {
        ColorStateList colorStateList = (ColorStateList) (z ? this.c : this.b);
        if (((ColorStateList) this.d) == colorStateList) {
            return;
        }
        this.d = colorStateList;
        f9c f9cVar = (f9c) this.e;
        Toolbar toolbar = f9cVar.l;
        Context context = toolbar.getContext();
        Drawable drawableF = sgb.F(f9cVar.t0(context), context);
        j14.o0(drawableF, (ColorStateList) this.d);
        if (z) {
            drawableF = j14.p(j14.D(fan.a(32.0f, context.getResources()), context.getColor(2131099819)), drawableF);
        }
        toolbar.A(drawableF);
    }

    @Override // defpackage.lii
    public final boolean a() {
        return ((rvg) this.d) != null;
    }

    @Override // defpackage.lii
    public final boolean b() {
        return ((ViewSwitcher) ((rvg) this.d).n).getCurrentView() == ((LinearLayout) ((rvg) this.d).l);
    }

    @Override // defpackage.dmg
    public final void c(j82 j82Var, ov0 ov0Var, cmg cmgVar, int i, int i2) {
        dmg dmgVar = (dmg) this.e;
        if (dmgVar != null) {
            dmgVar.c(j82Var, ov0Var, cmgVar, i, i2);
        }
    }

    public final void cancel() throws IOException {
        ((Socket) this.b).close();
    }

    @Override // defpackage.zkf
    public final void d(AdError adError) {
        ppf ppfVar = (ppf) this.e;
        ppfVar.a("loadAd: initialize onError, error=" + adError);
        ppfVar.t.onFailure(adError);
    }

    @Override // defpackage.lii
    public final void destroy() {
        this.d = null;
    }

    @Override // defpackage.zkf
    public final void e() {
        ((ppf) this.e).a("loadAd: initialize onSuccess");
        MediationNativeAdConfiguration mediationNativeAdConfiguration = (MediationNativeAdConfiguration) this.b;
        rm5.a0(mediationNativeAdConfiguration);
        qfb qfbVar = new qfb((Object) this, (byte) 18);
        phj.d0(mediationNativeAdConfiguration.getContext(), (String) this.d, qfbVar);
    }

    public final void f(itd itdVar, boolean z) {
    }

    @Override // defpackage.lii
    public final void g(boolean z) {
        ((rvg) this.d).o.setEnabled(z);
    }

    public final nmj getSink() {
        return (tv6) this.e;
    }

    public final ewj getSource() {
        return (uv6) this.d;
    }

    @Override // defpackage.azc
    public final void h(boolean z, boolean z2) {
        uy8 uy8Var = (uy8) this.e;
        uy8Var.h = false;
        qy8 qy8Var = uy8Var.o;
        if (z) {
            P(uy8Var.d, (ArrayList) this.b);
            P(uy8Var.e, (ArrayList) this.c);
            P(uy8Var.f, (ArrayList) this.d);
            qy8Var.b();
            uy8Var.n();
            return;
        }
        if (z2) {
            qy8Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            qy8Var.e = jCurrentTimeMillis;
            qy8Var.f = jCurrentTimeMillis + 30000;
            qy8Var.c(false);
            return;
        }
        qy8Var.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        qy8Var.e = jCurrentTimeMillis2;
        qy8Var.f = jCurrentTimeMillis2 + 300000;
        qy8Var.c(false);
    }

    @Override // defpackage.lii
    public final void i() {
        View currentView = ((ViewSwitcher) ((rvg) this.d).n).getCurrentView();
        rvg rvgVar = (rvg) this.d;
        if (currentView != ((LinearLayout) rvgVar.l)) {
            ((ViewSwitcher) rvgVar.n).showNext();
        }
    }

    public final void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var) {
        x36 x36Var;
        int i3;
        int i4;
        int iA;
        int i5;
        int i6;
        int iD;
        edg edgVar = (edg) this.d;
        int[] iArr = edgVar.b;
        g1g g1gVar = edgVar.a;
        g1g g1gVar2 = (g1g) this.c;
        g1g g1gVar3 = (g1g) this.b;
        g1gVar3.L(bArr, i + i2);
        g1gVar3.N(i);
        Inflater inflater = (Inflater) this.e;
        if (inflater == null) {
            inflater = new Inflater();
            this.e = inflater;
        }
        String str = tym.a;
        if (g1gVar3.a() > 0 && g1gVar3.j() == 120 && tym.H(g1gVar3, g1gVar2, inflater)) {
            g1gVar3.L(g1gVar2.a, g1gVar2.c);
        }
        int i7 = 0;
        edgVar.d = 0;
        edgVar.e = 0;
        edgVar.f = 0;
        edgVar.g = 0;
        edgVar.h = 0;
        edgVar.i = 0;
        g1gVar.K(0);
        edgVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (g1gVar3.a() >= 3) {
            int i8 = g1gVar3.c;
            int iA2 = g1gVar3.A();
            int iH = g1gVar3.H();
            int i9 = g1gVar3.b + iH;
            if (i9 > i8) {
                g1gVar3.N(i8);
                i3 = i7;
                x36Var = null;
            } else {
                char c = 128;
                if (iA2 != 128) {
                    switch (iA2) {
                        case SizeUtil.textSize0 /* 20 */:
                            if (iH % 5 == 2) {
                                g1gVar3.O(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iH / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iA3 = g1gVar3.A();
                                    char c2 = c;
                                    double dA = g1gVar3.A();
                                    double dA2 = g1gVar3.A() - 128;
                                    double dA3 = g1gVar3.A() - 128;
                                    iArr[iA3] = (g1gVar3.A() << 24) | (tym.i((int) ((1.402d * dA2) + dA), 0, 255) << 16) | (tym.i((int) ((dA - (0.34414d * dA3)) - (dA2 * 0.71414d)), 0, 255) << 8) | tym.i((int) ((dA3 * 1.772d) + dA), 0, 255);
                                    i11++;
                                    c = c2;
                                    edgVar = edgVar;
                                }
                                edgVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (iH >= 4) {
                                g1gVar3.O(3);
                                int i12 = iH - 4;
                                if (((g1gVar3.A() & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? 1 : i7) == 0) {
                                    i5 = g1gVar.b;
                                    i6 = g1gVar.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        g1gVar3.k(g1gVar.a, i5, iMin);
                                        g1gVar.N(i5 + iMin);
                                        break;
                                    }
                                } else if (i12 >= 7 && (iD = g1gVar3.D()) >= 4) {
                                    edgVar.h = g1gVar3.H();
                                    edgVar.i = g1gVar3.H();
                                    g1gVar.K(iD - 4);
                                    i12 = iH - 11;
                                    i5 = g1gVar.b;
                                    i6 = g1gVar.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        g1gVar3.k(g1gVar.a, i5, iMin2);
                                        g1gVar.N(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case SizeUtil.textSize1 /* 22 */:
                            if (iH >= 19) {
                                edgVar.d = g1gVar3.H();
                                edgVar.e = g1gVar3.H();
                                g1gVar3.O(11);
                                edgVar.f = g1gVar3.H();
                                edgVar.g = g1gVar3.H();
                                break;
                            }
                            break;
                    }
                    x36Var = null;
                    i3 = 0;
                } else {
                    if (edgVar.d == 0 || edgVar.e == 0 || edgVar.h == 0 || edgVar.i == 0 || (i4 = g1gVar.c) == 0 || g1gVar.b != i4 || !edgVar.c) {
                        x36Var = null;
                    } else {
                        g1gVar.N(0);
                        int i13 = edgVar.h * edgVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iA4 = g1gVar.A();
                            if (iA4 != 0) {
                                iA = i14 + 1;
                                iArr2[i14] = iArr[iA4];
                            } else {
                                int iA5 = g1gVar.A();
                                if (iA5 != 0) {
                                    iA = ((iA5 & 64) == 0 ? iA5 & 63 : ((iA5 & 63) << 8) | g1gVar.A()) + i14;
                                    Arrays.fill(iArr2, i14, iA, (iA5 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0 ? iArr[0] : iArr[g1gVar.A()]);
                                }
                            }
                            i14 = iA;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, edgVar.h, edgVar.i, Bitmap.Config.ARGB_8888);
                        float f2 = edgVar.f;
                        float f3 = edgVar.d;
                        float f4 = f2 / f3;
                        float f5 = edgVar.g;
                        float f6 = edgVar.e;
                        x36Var = new x36((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, bitmapCreateBitmap, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, edgVar.h / f3, edgVar.i / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    edgVar.d = 0;
                    edgVar.e = 0;
                    edgVar.f = 0;
                    edgVar.g = 0;
                    edgVar.h = 0;
                    edgVar.i = 0;
                    g1gVar.K(0);
                    edgVar.c = false;
                }
                g1gVar3.N(i9);
            }
            if (x36Var != null) {
                arrayList.add(x36Var);
            }
            i7 = i3;
        }
        op5Var.accept(new a46(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.jw1
    public final void k(wj5 wj5Var, Callback callback) {
        l45 l45Var = new l45();
        l45Var.c = this;
        l45Var.a = wj5Var;
        l45Var.b = callback;
        ((LinkedHashSet) this.e).add(l45Var);
        u59 u59Var = (u59) this.c;
        Set setN0 = CollectionsKt.n0(wj5Var.r);
        Set setN02 = CollectionsKt.n0(wj5Var.s);
        iu2 iu2Var = new iu2(l45Var, (byte) 19);
        Lazy lazy = (Lazy) u59Var.b;
        ((qln) lazy.get()).q(setN02);
        if (setN0.isEmpty()) {
            iu2Var.run(new sw7(Unit.a));
            return;
        }
        ru9 ru9Var = (ru9) ((qln) lazy.get()).i.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = setN0.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.l0((String) it.next()).toString());
            String strValueOf = intOrNull != null ? String.valueOf(intOrNull.intValue()) : null;
            if (strValueOf != null) {
                arrayList.add(strValueOf);
            }
        }
        if (!arrayList.isEmpty()) {
            HashSet hashSetM = w1h.m(ru9Var.a, "wallpaper.unlocked_ids");
            if (hashSetM.addAll(arrayList)) {
                nv6 nv6VarB = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB.a).putStringSet("wallpaper.unlocked_ids", hashSetM);
                nv6VarB.w();
            }
        }
        ((qln) lazy.get()).f.r(new k3(setN0, u59Var, iu2Var, (byte) 28));
    }

    @Override // defpackage.lii
    public final void l(int i) {
        ((rvg) this.d).k.setVisibility(i);
    }

    @Override // defpackage.lii
    public final int m() {
        return ((ViewSwitcher) ((rvg) this.d).n).getWidth();
    }

    @Override // defpackage.lii
    public final void n(String str) {
        ((StylingTextView) ((rvg) this.d).m).setText(str);
    }

    @Override // defpackage.lii
    public final void o(int i) throws Resources.NotFoundException {
        ((StylingTextView) ((rvg) this.d).f).setText(((rvg) this.d).b.getResources().getQuantityString(2131886171, i, Integer.valueOf(i)));
        ((StylingTextView) ((rvg) this.d).f).setVisibility(0);
    }

    public final boolean p(itd itdVar) {
        return itdVar != null;
    }

    @Override // defpackage.lii
    public final void q() {
        View currentView = ((ViewSwitcher) ((rvg) this.d).n).getCurrentView();
        rvg rvgVar = (rvg) this.d;
        if (currentView != ((RecyclerViewForScreenshot) rvgVar.j)) {
            ((ViewSwitcher) rvgVar.n).showNext();
        }
    }

    @Override // defpackage.fu8
    public final void r(lx8 lx8Var, j82 j82Var) {
        ((fu8) this.c).r(lx8Var, j82Var);
    }

    public final void s(itd itdVar) {
    }

    @Override // defpackage.xyn
    public final void t(String str) {
        switch (this.a) {
            case 0:
                try {
                    ((qq8) this.c).j(new orb(str));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            default:
                try {
                    ((qq8) this.c).j(new orb(str));
                    break;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 12:
                return ((Socket) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lii
    public final CoordinatorLayout v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final byte b = 0;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131559280, viewGroup, false);
        viewGroup.addView(coordinatorLayoutInflate);
        int i = 2131362247;
        MaterialButton materialButtonJ = w1h.j(2131362247, coordinatorLayoutInflate);
        if (materialButtonJ != null) {
            i = 2131363393;
            View viewJ = w1h.j(2131363393, coordinatorLayoutInflate);
            if (viewJ != null) {
                hi4 hi4VarB = hi4.b(viewJ);
                i = 2131363783;
                View viewJ2 = w1h.j(2131363783, coordinatorLayoutInflate);
                if (viewJ2 != null) {
                    hi4 hi4VarB2 = hi4.b(viewJ2);
                    i = 2131363808;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363808, coordinatorLayoutInflate);
                    if (stylingTextView != null) {
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
                                    i = 2131363937;
                                    RecyclerViewForScreenshot recyclerViewForScreenshot = (RecyclerViewForScreenshot) w1h.j(2131363937, coordinatorLayoutInflate);
                                    if (recyclerViewForScreenshot != null) {
                                        i = 2131363938;
                                        LinearProgressIndicator linearProgressIndicatorJ = w1h.j(2131363938, coordinatorLayoutInflate);
                                        if (linearProgressIndicatorJ != null) {
                                            i = 2131363939;
                                            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363939, coordinatorLayoutInflate);
                                            if (linearLayout != null) {
                                                i = 2131363940;
                                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363940, coordinatorLayoutInflate);
                                                if (stylingTextView2 != null) {
                                                    i = 2131363941;
                                                    ViewSwitcher viewSwitcher = (ViewSwitcher) w1h.j(2131363941, coordinatorLayoutInflate);
                                                    if (viewSwitcher != null) {
                                                        i = 2131364117;
                                                        MaterialButton materialButtonJ2 = w1h.j(2131364117, coordinatorLayoutInflate);
                                                        if (materialButtonJ2 != null) {
                                                            i = 2131364423;
                                                            LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131364423, coordinatorLayoutInflate);
                                                            if (linearLayout2 != null) {
                                                                i = 2131364511;
                                                                if (((Space) w1h.j(2131364511, coordinatorLayoutInflate)) != null) {
                                                                    i = 2131364798;
                                                                    if (((Shadow) w1h.j(2131364798, coordinatorLayoutInflate)) != null) {
                                                                        CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
                                                                        this.d = new rvg(coordinatorLayout, materialButtonJ, hi4VarB, hi4VarB2, stylingTextView, hi4VarB3, textInputLayoutJ, hi4VarB4, recyclerViewForScreenshot, linearProgressIndicatorJ, linearLayout, stylingTextView2, viewSwitcher, materialButtonJ2, linearLayout2);
                                                                        coordinatorLayout.getContext();
                                                                        final byte b2 = 1;
                                                                        ((RecyclerViewForScreenshot) ((rvg) this.d).j).C0(new LinearLayoutManager(1, false));
                                                                        rvg rvgVar = (rvg) this.d;
                                                                        ((RecyclerView) ((RecyclerViewForScreenshot) rvgVar.j)).t = true;
                                                                        rvgVar.o.setOnClickListener(new View.OnClickListener(this) { // from class: oii
                                                                            public final /* synthetic */ r9i b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) throws NumberFormatException {
                                                                                byte b3 = b;
                                                                                r9i r9iVar = this.b;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        ((kii) r9iVar.b).run();
                                                                                        break;
                                                                                    default:
                                                                                        ((kii) r9iVar.c).run();
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        ((rvg) this.d).c.setOnClickListener(new View.OnClickListener(this) { // from class: oii
                                                                            public final /* synthetic */ r9i b;

                                                                            {
                                                                                this.b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) throws NumberFormatException {
                                                                                byte b3 = b2;
                                                                                r9i r9iVar = this.b;
                                                                                switch (b3) {
                                                                                    case 0:
                                                                                        ((kii) r9iVar.b).run();
                                                                                        break;
                                                                                    default:
                                                                                        ((kii) r9iVar.c).run();
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        ((LinearLayout) ((rvg) this.d).p).setVisibility(0);
                                                                        rvg rvgVar2 = (rvg) this.d;
                                                                        this.e = new x79(((hi4) rvgVar2.e).b, ((hi4) rvgVar2.i).b, ((hi4) rvgVar2.d).b, ((hi4) rvgVar2.g).b, rvgVar2.h);
                                                                        return rvgVar2.b;
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

    @Override // defpackage.xyn
    public final void w(String str, ilm ilmVar) {
        switch (this.a) {
            case 0:
                try {
                    n9a.u(new orb(str), (ks3) this.b, new wub(ilmVar));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            default:
                try {
                    orb orbVar = new orb(str);
                    u02 u02Var = (u02) this.b;
                    zy9 zy9Var = new zy9();
                    zy9Var.a = ilmVar;
                    zpa.U(orbVar, u02Var, zy9Var);
                    break;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }

    public final boolean x(itd itdVar, MenuItem menuItem) {
        o73 o73Var = (o73) this.e;
        return o73Var != null && o73Var.onMenuItemClick(menuItem);
    }

    @Override // defpackage.lii
    public final void y(k8g k8gVar) {
        ((RecyclerViewForScreenshot) ((rvg) this.d).j).y0(k8gVar);
    }

    public final int z() {
        return 2;
    }
}
