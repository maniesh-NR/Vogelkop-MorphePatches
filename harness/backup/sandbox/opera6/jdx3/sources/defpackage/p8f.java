package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.j;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class p8f implements cn, zkf, d94, f94, icj, rr9, r6l, o7h {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public p8f(byte b) {
        this.a = b;
        switch (b) {
            case SizeUtil.textSize0 /* 20 */:
                this.b = new AtomicReference(mkh.f);
                this.c = new Object();
                break;
            default:
                long[] jArr = imi.a;
                this.b = new see();
                break;
        }
    }

    public /* synthetic */ p8f(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
    }

    public /* synthetic */ p8f(byte b, boolean z) {
        this.a = b;
    }

    public p8f(Context context, umi umiVar) {
        this.a = (byte) 19;
        this.b = umiVar;
        this.c = z4c.b(new vg4(context, (byte) 16));
        this.d = z4c.b(new unj((byte) 0));
    }

    public p8f(Context context, umi umiVar, x5f x5fVar, x5f x5fVar2) {
        this.a = (byte) 5;
        this.b = w1h.l(context, umiVar, "premium_onboarding_reporter", new bg1[0]);
        this.c = x5fVar;
        this.d = x5fVar2;
    }

    public p8f(Intent intent, ArrayList arrayList, dcj dcjVar) {
        this.a = (byte) 17;
        this.b = intent;
        this.c = arrayList;
        this.d = new jcj(dcjVar);
    }

    public p8f(d4d d4dVar) {
        this.a = (byte) 6;
        this.b = new int[Constants.Crypt.KEY_LENGTH];
        this.c = d4dVar;
        this.d = d4dVar.g;
    }

    public p8f(d8e d8eVar) {
        this.a = (byte) 4;
        this.b = d8eVar;
    }

    public /* synthetic */ p8f(Object obj, MediationAdConfiguration mediationAdConfiguration, String str, byte b) {
        this.a = b;
        this.c = obj;
        this.b = mediationAdConfiguration;
        this.d = str;
    }

    public /* synthetic */ p8f(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ p8f(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public p8f(k6l k6lVar, q82 q82Var) {
        this.a = (byte) 9;
        this.b = new i7f();
        this.c = ukh.f;
        this.d = ukh.e;
        q82Var.a.b(new tkh(this));
        k6lVar.a(new qz(this, (byte) 21));
    }

    public p8f(mcj mcjVar, Window window) {
        this.a = (byte) 21;
        jje jjeVar = new jje(this, (byte) 1);
        this.d = jjeVar;
        this.b = mcjVar;
        this.c = window;
        ((i7f) mcjVar.a).b(jjeVar);
        L();
    }

    public p8f(mrk mrkVar, dbf dbfVar) {
        this.a = (byte) 23;
        this.c = mrkVar;
        this.d = dbfVar;
        this.b = new pde(new f55(false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    public p8f(nr8 nr8Var, LinkedHashSet linkedHashSet) {
        tq8 tq8Var;
        this.a = (byte) 26;
        this.b = nr8Var;
        ehc ehcVarB = a.b();
        ArrayList arrayList = new ArrayList(linkedHashSet);
        exg.A(arrayList, x6l.a);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d7l d7lVar = (d7l) ((b2l) obj);
            if (!d7lVar.n0()) {
                long jB = ((nr8) this.b).b(d7lVar.l0(), d7lVar.h0());
                nr8 nr8Var2 = (nr8) this.b;
                nr8Var2.getClass();
                hq8 hq8VarG = nr8.g(new hp2(nr8Var2, jB), ((e) nr8Var2).g);
                if (hq8VarG != null) {
                    ehcVarB.add(hq8VarG);
                }
            }
        }
        ehc ehcVarA = a.a(ehcVarB);
        this.c = ehcVarA;
        byte b = 3;
        this.d = DateFormat.getDateInstance(3, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
        if (ehcVarA.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = ((e) ((nr8) this.b)).f.e;
        int size2 = arrayList2.size();
        while (true) {
            if (i >= size2) {
                tq8Var = 0;
                break;
            }
            tq8Var = arrayList2.get(i);
            i++;
            hq8 hq8Var = (hq8) tq8Var;
            if (Intrinsics.a(hq8Var.h(), (String) this.d) && hq8Var.j()) {
                break;
            }
        }
        tq8 tq8Var2 = tq8Var instanceof tq8 ? tq8Var : null;
        if (tq8Var2 != null) {
            Iterator it = ((ehc) this.c).iterator();
            while (it.hasNext()) {
                ((nr8) this.b).d((hq8) it.next(), tq8Var2, tq8Var2.e.size());
            }
        } else {
            nr8 nr8Var3 = (nr8) this.b;
            ehc ehcVar = (ehc) this.c;
            String str = (String) this.d;
            int size3 = ((e) nr8Var3).f.e.size();
            i7f i7fVar = FavoritesBridge.a;
            ehcVar.forEach(new pv1((FavoritesBridge.Folder) N.M98NjnEk(size3, str), b));
        }
    }

    public p8f(pde pdeVar, pt1 pt1Var, kze kzeVar, tsd tsdVar) {
        this.a = (byte) 28;
        this.b = pt1Var;
        this.c = kzeVar;
        this.d = tsdVar;
        int i = d03.e;
        View view = (ConstraintLayout) pt1Var.f;
        ydp.q(view, j14.i0(2131231307, view.getContext()));
        final byte b = 0;
        a26.T(kzeVar, pdeVar, new f7f(this) { // from class: rvl
            public final /* synthetic */ p8f b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                p8f p8fVar = this.b;
                switch (b2) {
                    case 0:
                        ((Boolean) obj).getClass();
                        p8fVar.a();
                        break;
                    default:
                        p8fVar.a();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(tsdVar, pdeVar, new f7f(this) { // from class: rvl
            public final /* synthetic */ p8f b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                p8f p8fVar = this.b;
                switch (b22) {
                    case 0:
                        ((Boolean) obj).getClass();
                        p8fVar.a();
                        break;
                    default:
                        p8fVar.a();
                        break;
                }
            }
        });
        svk svkVar = new svk(this, (byte) 8);
        q9n.e(view, svkVar);
        svkVar.a(view);
    }

    public p8f(udc udcVar) {
        this.a = (byte) 16;
        this.b = new qdc(udcVar, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public static int A(p8f p8fVar, int i, int i2, byte[] bArr, int i3, int i4) {
        int[] iArr = (int[]) p8fVar.b;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    iArr[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    iArr[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    iArr[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    iArr[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    public static int B(p8f p8fVar, int i, int i2, byte[] bArr, int i3) {
        int[] iArr = (int[]) p8fVar.b;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = ((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16)) & 8388607;
            if (i7 < 8380417) {
                iArr[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public static boolean H(q6e q6eVar, Context context) {
        return !((wnh) xnh.t(context).i()).a(1073741824) && gco.a(q6eVar.b());
    }

    public static um0 I(int i) {
        if (i == 0) {
            return um0.b;
        }
        if (i == 1) {
            return um0.c;
        }
        if (i == 2) {
            return um0.d;
        }
        qp2.n(sko.i(i, "Unexpected value: "));
        return null;
    }

    public static an0 J(int i) {
        switch (i) {
            case 0:
                return an0.b;
            case 1:
                return an0.c;
            case 2:
                return an0.d;
            case 3:
                return an0.e;
            case 4:
                return an0.f;
            case 5:
                return an0.g;
            case 6:
                return an0.h;
            case 7:
                return an0.i;
            case 8:
                return an0.j;
            default:
                hai.d();
                return null;
        }
    }

    public static p8f k(zxh zxhVar) {
        p8f p8fVar = new p8f((byte) 10, false);
        p8fVar.b = zxhVar.a;
        p8fVar.c = zxhVar.b;
        p8fVar.d = zxhVar.c;
        return p8fVar;
    }

    public static hfi n(ffi ffiVar, String str) {
        hfi hfiVarN;
        hfi hfiVar = (hfi) ffiVar;
        if (str.equals(hfiVar.c)) {
            return hfiVar;
        }
        for (ffi ffiVar2 : ffiVar.h()) {
            if (ffiVar2 instanceof hfi) {
                hfi hfiVar2 = (hfi) ffiVar2;
                if (str.equals(hfiVar2.c)) {
                    return hfiVar2;
                }
                if ((ffiVar2 instanceof ffi) && (hfiVarN = n(ffiVar2, str)) != null) {
                    return hfiVarN;
                }
            }
        }
        return null;
    }

    public static void w(Window window) {
        q9n.g(window.getDecorView(), new tu4(window, (byte) 4));
    }

    public final void C(int i) {
        int i2;
        int i3;
        mvg mvgVarT = t();
        if (mvgVarT == null) {
            return;
        }
        String str = mvgVarT.e;
        String str2 = mvgVarT.d;
        String str3 = mvgVarT.c;
        mvgVarT.h = i;
        x5f x5fVar = (x5f) this.c;
        wm0 wm0VarE = bwg.E(mvgVarT.a);
        an0 an0VarJ = J(mvgVarT.b);
        h1b h1bVarS = h1b.s(nb6.W(new b10((byte) 25), h1b.s(mvgVarT.f)));
        h1b h1bVarS2 = h1b.s(mvgVarT.g);
        ArrayList arrayList = new ArrayList(h1bVarS2.size());
        int size = h1bVarS2.size();
        kvg kvgVar = null;
        long j = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = h1bVarS2.get(i4);
            int i5 = i4 + 1;
            kvg kvgVar2 = (kvg) obj;
            h1b h1bVar = h1bVarS2;
            if (kvgVar != null) {
                int i6 = kvgVar.a;
                i2 = size;
                i3 = i5;
                if (i6 == kvgVar2.a) {
                    j += kvgVar2.b;
                    h1bVarS2 = h1bVar;
                    size = i2;
                    i4 = i3;
                } else {
                    arrayList.add(Pair.create(I(i6), Long.valueOf(j)));
                }
            } else {
                i2 = size;
                i3 = i5;
            }
            kvgVar = kvgVar2;
            j = kvgVar2.b;
            h1bVarS2 = h1bVar;
            size = i2;
            i4 = i3;
        }
        if (kvgVar != null) {
            arrayList.add(Pair.create(I(kvgVar.a), Long.valueOf(j)));
        }
        xm0 xm0VarF = bwg.F(mvgVarT.h);
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(zpaVar);
            int i7 = -1;
            zm0 zm0Var = new zm0(2443, -1, 8);
            int i8 = 1;
            zm0Var.q(0, 1, wm0VarE);
            zm0Var.q(3, 1, an0VarJ);
            zm0Var.x(4, str3);
            zm0Var.x(5, str2);
            zm0Var.x(6, str);
            int i9 = 2;
            zm0Var.q(2, 1, nb6.W(new qw8(new zbe(x5fVar, (byte) 23), (byte) 3), h1bVarS));
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                int i11 = i10 + 1;
                Pair pair = (Pair) obj2;
                int i12 = size2;
                ArrayList arrayList3 = arrayList;
                vm0 vm0Var = new vm0(2443, i7, i9);
                um0 um0Var = (um0) pair.first;
                vm0Var.q(0, um0Var == null ? 0 : 1, um0Var);
                vm0Var.p(1, 1, ((Number) pair.second).longValue());
                arrayList2.add(vm0Var);
                i8 = 1;
                i10 = i11;
                size2 = i12;
                arrayList = arrayList3;
                i9 = 2;
                i7 = -1;
            }
            int i13 = i8;
            zm0Var.q(7, i13, arrayList2);
            zm0Var.q(i13, i13, xm0VarF);
            List list = (List) qd0VarB.n(38);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 38, vep.t(qd0VarB, 38, 1)) : new hf0(qd0VarB, 38, list)).add(zm0Var);
            x5fVar.U0(x56VarF);
        }
        if (i == 0) {
            x5f x5fVar2 = (x5f) this.d;
            zpa zpaVar2 = x5fVar2.d;
            x56 x56VarF2 = zpa.F();
            x56VarF2.I(zpaVar2).x(50, str3);
            x56VarF2.I(zpaVar2).x(51, str2);
            x56VarF2.I(zpaVar2).x(52, str);
            x5fVar2.U0(x56VarF2);
        }
        j.a((SharedPreferences) ((b59) this.b).get(), "session");
    }

    public final hfi D(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.d;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((hfi) ((cfi) this.b)).c)) {
                    return (cfi) this.b;
                }
                if (map.containsKey(strSubstring)) {
                    return (hfi) map.get(strSubstring);
                }
                hfi hfiVarN = n((cfi) this.b, strSubstring);
                map.put(strSubstring, hfiVarN);
                return hfiVarN;
            }
        }
        return null;
    }

    public final void E() {
        Uri uriBuild;
        b2l b2lVar = ((k6l) this.c).o;
        if (b2lVar == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (H((q6e) this.d, (BrowserActivity) this.b)) {
            uriBuild = new Uri.Builder().scheme("https").authority("translate.yandex.com").path("translate").appendQueryParameter("js", "y").appendQueryParameter(ImagesContract.URL, ((d7l) b2lVar).h0()).appendQueryParameter("lang", language).build();
        } else {
            if (language.equals("zh")) {
                language = Locale.getDefault().toString().replace("_", "-");
            }
            uriBuild = new Uri.Builder().scheme("https").authority("translate.google.com").path("translate").appendQueryParameter("sl", "auto").appendQueryParameter("tl", language).appendQueryParameter("js", "y").appendQueryParameter("u", ((d7l) b2lVar).h0()).build();
        }
        lsc lscVarF = wqm.f(uriBuild.toString(), null, lqm.n);
        Objects.requireNonNull(lscVarF);
        ((d7l) b2lVar).Z(lscVarF);
    }

    public final void F(Object obj) {
        long jK = joh.k();
        if (jK == wml.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            iml imlVar = (iml) ((AtomicReference) this.b).get();
            int iA = imlVar.a(jK);
            if (iA < 0) {
                ((AtomicReference) this.b).set(imlVar.b(jK, obj));
            } else {
                imlVar.c[iA] = obj;
            }
        }
    }

    public final void G(mvg mvgVar) throws JSONException {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((b59) this.b).get()).edit();
        orb orbVar = new orb();
        orbVar.n(mvgVar.a, "entry_point");
        orbVar.n(mvgVar.b, "first_view");
        orbVar.p(mvgVar.c, "campaign");
        orbVar.p(mvgVar.d, "source");
        orbVar.p(mvgVar.e, "target");
        vpb vpbVar = new vpb();
        ArrayList arrayList = mvgVar.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            lvg lvgVar = (lvg) obj;
            lvgVar.getClass();
            orb orbVar2 = new orb();
            orbVar2.n(lvgVar.a, "from");
            orbVar2.n(lvgVar.b, "to");
            vpbVar.a(orbVar2);
        }
        orbVar.p(vpbVar, "navigations");
        vpb vpbVar2 = new vpb();
        ArrayList arrayList2 = mvgVar.g;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            kvg kvgVar = (kvg) obj2;
            kvgVar.getClass();
            orb orbVar3 = new orb();
            orbVar3.n(kvgVar.a, Constants.Params.IAP_ITEM);
            orbVar3.o(kvgVar.b, "duration");
            vpbVar2.a(orbVar3);
        }
        orbVar.p(vpbVar2, "carousel_items");
        orbVar.n(mvgVar.h, "exit_reason");
        editorEdit.putString("session", orbVar.a.toString()).apply();
    }

    public final void K() {
        see seeVar = (see) this.b;
        String str = (String) this.d;
        List list = (List) seeVar.k(str);
        if (list != null) {
            list.remove((Function0) this.c);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        seeVar.m(str, list);
    }

    public final void L() {
        int systemUiVisibility = ((Window) ((mcj) this.b).b).getDecorView().getSystemUiVisibility();
        Window window = (Window) this.c;
        int systemUiVisibility2 = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility((systemUiVisibility & 8192) == 8192 ? systemUiVisibility2 | 8192 : systemUiVisibility2 & (-8193));
    }

    public final void a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) ((pt1) this.b).f;
        constraintLayout.setBackgroundTintList(((Boolean) ((kze) this.c).g()).booleanValue() ? f03.W(2130969250, constraintLayout.getContext()) : ColorStateList.valueOf(((v8k) ((tsd) this.d).g()).d(constraintLayout.getContext())));
    }

    public final void b() {
        ((ProductSuggestionListItem) this.b).t.add((String) this.d);
        ((Function0) this.c).invoke();
    }

    @Override // defpackage.zkf
    public final void d(AdError adError) {
        switch (this.a) {
            case 2:
                opf opfVar = (opf) this.c;
                opfVar.a("loadAd: initialize onError, error=" + adError);
                opfVar.a.onFailure(adError);
                break;
            default:
                qpf qpfVar = (qpf) this.c;
                qpfVar.b("loadAd: initialize onError, error=" + adError);
                qpfVar.b.onFailure(adError);
                break;
        }
    }

    @Override // defpackage.zkf
    public final void e() {
        switch (this.a) {
            case 2:
                ((opf) this.c).a("loadAd: initialize onSuccess");
                MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = (MediationInterstitialAdConfiguration) this.b;
                rm5.a0(mediationInterstitialAdConfiguration);
                i4d i4dVar = new i4d((Object) this, (byte) 11);
                String str = (String) this.d;
                Context context = mediationInterstitialAdConfiguration.getContext();
                wjo wjoVar = wjo.REGULAR;
                if (fcp.a(i4dVar) != null && fcp.b(i4dVar, context) != null && fcp.c(i4dVar, str) != null) {
                    ejo ejoVar = fko.a;
                    fko.a(context);
                    dhb dhbVar = new dhb(context.getApplicationContext(), new pro(str, sm.e, eq.e, wjoVar));
                    dhbVar.J(i4dVar);
                    dhbVar.I();
                    break;
                }
                break;
            default:
                ((qpf) this.c).b("loadAd: initialize onSuccess");
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = (MediationRewardedAdConfiguration) this.b;
                rm5.a0(mediationRewardedAdConfiguration);
                i4d i4dVar2 = new i4d((Object) this, (byte) 12);
                String str2 = (String) this.d;
                Context context2 = mediationRewardedAdConfiguration.getContext();
                wjo wjoVar2 = wjo.REGULAR;
                if (fcp.a(i4dVar2) != null && fcp.b(i4dVar2, context2) != null && fcp.c(i4dVar2, str2) != null) {
                    ejo ejoVar2 = fko.a;
                    fko.a(context2);
                    l2i l2iVar = new l2i(context2.getApplicationContext(), new pro(str2, sm.g, eq.e, wjoVar2));
                    l2iVar.J(i4dVar2);
                    l2iVar.I();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.icj
    public final jjm f(Context context) {
        Intent intent = (Intent) this.b;
        jcj jcjVar = (jcj) this.d;
        zhj.a(new g0l(intent, jcjVar, (ArrayList) this.c), 0).c(context);
        return jcjVar;
    }

    public final void g(cm cmVar) {
        ((rhf) this.b).h(cmVar, v50.k);
    }

    public final Object get() {
        switch (this.a) {
            case SizeUtil.textSize0 /* 20 */:
                long jK = joh.k();
                if (jK == wml.a) {
                    return this.d;
                }
                iml imlVar = (iml) ((AtomicReference) this.b).get();
                int iA = imlVar.a(jK);
                if (iA >= 0) {
                    return imlVar.c[iA];
                }
                return null;
            default:
                return new s5m(new tmj((byte) 9), new cpj((byte) 7), (dv6) ((wjh) this.b).get(), (ks3) ((ne5) this.c).get(), (t9l) ((plk) this.d).get());
        }
    }

    @Override // defpackage.r6l
    public final pxh h() {
        ehc ehcVar = (ehc) this.c;
        return new txh(new Object[]{Integer.valueOf(ehcVar.d())}, 2131886147, ehcVar.d());
    }

    public final kai i() throws GeneralSecurityException {
        m54 m54VarA;
        if (((bai) this.b) == null) {
            t3p.w("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            t3p.w("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        bai baiVar = (bai) this.b;
        int i = baiVar.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(sko.h(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (baiVar.a() && ((Integer) this.d) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((bai) this.b).a() && ((Integer) this.d) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        aai aaiVar = ((bai) this.b).c;
        if (aaiVar == aai.e) {
            m54VarA = juf.a;
        } else if (aaiVar == aai.d || aaiVar == aai.c) {
            m54VarA = juf.a(((Integer) this.d).intValue());
        } else {
            if (aaiVar != aai.b) {
                j9h.u(((bai) this.b).c, "Unknown RsaSsaPkcs1Parameters.Variant: ");
                return null;
            }
            m54VarA = juf.b(((Integer) this.d).intValue());
        }
        return new kai((bai) this.b, (BigInteger) this.c, m54VarA, (Integer) this.d);
    }

    public final void j() {
        zll zllVar = (zll) this.b;
        zllVar.a();
        LinkedHashMap linkedHashMap = ((wll) this.d).b;
        WebContents webContents = (WebContents) this.c;
        if (Intrinsics.a((zll) linkedHashMap.get(webContents), zllVar)) {
            linkedHashMap.remove(webContents);
        }
    }

    @Override // defpackage.r6l
    public final void l() {
        mea meaVarListIterator = ((ehc) this.c).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return;
            }
            hq8 hq8Var = (hq8) meaVar.next();
            ((e) ((nr8) this.b)).getClass();
            long jE = hq8Var.e();
            i7f i7fVar = FavoritesBridge.a;
            N.Mw8yLl_M(jE);
        }
    }

    public final ree m() {
        int i;
        float fB;
        int i2;
        cfi cfiVar = (cfi) this.b;
        nei neiVar = cfiVar.r;
        nei neiVar2 = cfiVar.s;
        if (neiVar == null || neiVar.j() || (i = neiVar.b) == 9 || i == 2 || i == 3) {
            return new ree(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = neiVar.b();
        if (neiVar2 == null) {
            ree reeVar = ((nfi) ((cfi) this.b)).o;
            fB = reeVar != null ? (reeVar.e * fB2) / reeVar.d : fB2;
        } else {
            if (neiVar2.j() || (i2 = neiVar2.b) == 9 || i2 == 2 || i2 == 3) {
                return new ree(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = neiVar2.b();
        }
        return new ree(0.0f, 0.0f, fB2, fB);
    }

    public final int o() {
        jxf jxfVar = (jxf) this.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        if (jxfVar.a.isEmpty()) {
            return -1;
        }
        jxf jxfVar2 = (jxf) this.c;
        if (jxfVar2 == null) {
            jxfVar2 = null;
        }
        long j = ((wfd) CollectionsKt.K(jxfVar2.a)).a - (((jxf) this.c) != null ? r4 : null).h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public final void onAdLoaded(Object obj) {
        dhb dhbVar = (dhb) obj;
        rhf rhfVar = (rhf) this.b;
        String str = rhfVar.c;
        dl dlVar = rhfVar.d;
        int i = oo8.s + 1;
        oo8.s = i;
        bp bpVar = (bp) this.c;
        oo8 oo8Var = (oo8) this.d;
        rhfVar.d(new alf(dhbVar, str, dlVar, i, bpVar, oo8Var.h, oo8Var.i));
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        boolean z = th instanceof CancellationException;
        l94 l94Var = (l94) this.c;
        if (z) {
            jpo.n((String) null, l94Var.d(new ztk(((String) this.d).concat(" cancelled."), th)));
        } else {
            l94Var.b((Object) null);
        }
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        switch (this.a) {
            case 14:
                shf shfVar = (shf) this.b;
                xbf xbfVar = (xbf) this.c;
                na2.B((nx5) shfVar.a, (CoroutineContext) null, (rx5) null, new lqi(true, (y03) this.d, shfVar, v84Var, xbfVar, false, null), 3);
                break;
            default:
                ((b94) this.b).run(new zx9(iOException));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x00a8, TryCatch #3 {all -> 0x00a8, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0016, B:10:0x0018, B:12:0x001e, B:14:0x0028, B:16:0x0032, B:18:0x0049, B:20:0x005b, B:21:0x006c, B:22:0x0073, B:23:0x0074, B:24:0x007b, B:27:0x007e, B:29:0x0088, B:30:0x0092, B:31:0x0098), top: B:68:0x000a, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(defpackage.v84 r13, pzh r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8f.onResponse(v84, pzh):void");
    }

    public final void onSuccess() {
        ((CircleImageView) ((ProductSuggestionListItem) this.b).q.c).setVisibility(0);
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        k1g.Y((ListenableFuture) this.b, (l94) this.c);
    }

    public final boolean p() {
        jxf jxfVar = (jxf) this.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        return !jxfVar.a.isEmpty();
    }

    public final int q() {
        jxf jxfVar = (jxf) this.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        if (jxfVar.a.isEmpty()) {
            return -1;
        }
        jxf jxfVar2 = (jxf) this.c;
        if (jxfVar2 == null) {
            jxfVar2 = null;
        }
        long j = ((wfd) CollectionsKt.Q(jxfVar2.a)).a + (((jxf) this.c) != null ? r0 : null).h;
        long jU = u() - 1;
        if (j > jU) {
            j = jU;
        }
        return (int) j;
    }

    public final int r() {
        jxf jxfVar = (jxf) this.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        if (jxfVar.a.isEmpty()) {
            return 0;
        }
        jxf jxfVar2 = (jxf) this.c;
        if (jxfVar2 == null) {
            jxfVar2 = null;
        }
        int i = ((wfd) CollectionsKt.Q(jxfVar2.a)).j;
        jxf jxfVar3 = (jxf) this.c;
        return Math.abs(((i + (jxfVar3 != null ? jxfVar3 : null).b) + (jxfVar3 != null ? jxfVar3 : null).c) - (jxfVar3 != null ? jxfVar3 : null).g);
    }

    public final int s() {
        jxf jxfVar = (jxf) this.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        if (jxfVar.a.isEmpty()) {
            return 0;
        }
        jxf jxfVar2 = (jxf) this.c;
        if (jxfVar2 == null) {
            jxfVar2 = null;
        }
        int i = ((wfd) CollectionsKt.K(jxfVar2.a)).j;
        jxf jxfVar3 = (jxf) this.c;
        int i2 = i + (-(jxfVar3 != null ? jxfVar3 : null).f);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    public final mvg t() {
        try {
            return mvg.a(new orb(((SharedPreferences) ((b59) this.b).get()).getString("session", "")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                int[] iArr = (int[]) this.b;
                StringBuilder sb = new StringBuilder("[");
                for (int i = 0; i < iArr.length; i++) {
                    sb.append(iArr[i]);
                    if (i != iArr.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final int u() {
        return ((Number) ((d8e) this.b).invoke()).intValue();
    }

    public final boolean v() {
        return ((SharedPreferences) ((b59) this.b).get()).contains("session");
    }

    public final void x(int i, byte[] bArr) {
        int[] iArr = (int[]) this.b;
        byte b = ((d4d) this.c).e;
        byte[] bArr2 = new byte[8];
        if (b != 2) {
            if (b != 4) {
                h9o.r("Eta needs to be 2 or 4!");
                return;
            }
            for (int i2 = 0; i2 < 128; i2++) {
                int i3 = i2 << 1;
                byte b2 = (byte) (b - iArr[i3]);
                bArr2[0] = b2;
                byte b3 = (byte) (b - iArr[i3 + 1]);
                bArr2[1] = b3;
                bArr[i + i2] = (byte) (b2 | (b3 << 4));
            }
            return;
        }
        for (int i4 = 0; i4 < 32; i4++) {
            int i5 = i4 << 3;
            byte b4 = (byte) (b - iArr[i5]);
            bArr2[0] = b4;
            byte b5 = (byte) (b - iArr[i5 + 1]);
            bArr2[1] = b5;
            byte b6 = (byte) (b - iArr[i5 + 2]);
            bArr2[2] = b6;
            bArr2[3] = (byte) (b - iArr[i5 + 3]);
            bArr2[4] = (byte) (b - iArr[i5 + 4]);
            bArr2[5] = (byte) (b - iArr[i5 + 5]);
            bArr2[6] = (byte) (b - iArr[i5 + 6]);
            bArr2[7] = (byte) (b - iArr[i5 + 7]);
            int i6 = (i4 * 3) + i;
            bArr[i6] = (byte) (b4 | (b5 << 3) | (b6 << 6));
            bArr[i6 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i6 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    public final void y(int i, byte[] bArr) {
        int[] iArr = (int[]) this.b;
        byte b = ((d4d) this.c).e;
        int i2 = 0;
        if (b != 2) {
            if (b == 4) {
                while (i2 < 128) {
                    int i3 = i2 << 1;
                    byte b2 = bArr[i + i2];
                    iArr[i3] = b2 & 15;
                    int i4 = i3 + 1;
                    iArr[i4] = (b2 & 255) >> 4;
                    iArr[i3] = b - iArr[i3];
                    iArr[i4] = b - iArr[i4];
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 < 32) {
            int i5 = (i2 * 3) + i;
            int i6 = i2 << 3;
            byte b3 = bArr[i5];
            iArr[i6] = b3 & 7;
            int i7 = i6 + 1;
            int i8 = b3 & 255;
            iArr[i7] = (i8 >> 3) & 7;
            int i9 = i6 + 2;
            int i10 = bArr[i5 + 1] & 255;
            iArr[i9] = (i8 >> 6) | ((i10 << 2) & 7);
            int i11 = i6 + 3;
            iArr[i11] = (i10 >> 1) & 7;
            int i12 = i6 + 4;
            iArr[i12] = (i10 >> 4) & 7;
            int i13 = i6 + 5;
            int i14 = bArr[i5 + 2] & 255;
            iArr[i13] = (i10 >> 7) | ((i14 << 1) & 7);
            int i15 = i6 + 6;
            iArr[i15] = (i14 >> 2) & 7;
            int i16 = i6 + 7;
            iArr[i16] = (i14 >> 5) & 7;
            iArr[i6] = b - iArr[i6];
            iArr[i7] = b - iArr[i7];
            iArr[i9] = b - iArr[i9];
            iArr[i11] = b - iArr[i11];
            iArr[i12] = b - iArr[i12];
            iArr[i13] = b - iArr[i13];
            iArr[i15] = b - iArr[i15];
            iArr[i16] = b - iArr[i16];
            i2++;
        }
    }

    public final void z(occ occVar) {
        cda cdaVar = (cda) this.d;
        if (cdaVar != null) {
            cdaVar.run();
        }
        cda cdaVar2 = new cda((qdc) this.b, occVar);
        this.d = cdaVar2;
        ((Handler) this.c).postAtFrontOfQueue(cdaVar2);
    }
}
