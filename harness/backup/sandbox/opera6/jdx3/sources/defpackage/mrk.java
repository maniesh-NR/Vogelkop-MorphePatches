package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.search.SuggestionsListWrapper;
import com.opera.android.search.behavior.ScrollableToolbarLinearLayout;
import com.opera.android.settings.SettingsManager;
import com.opera.android.suggestion.SuggestionManagerBridge;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mrk implements fm8 {
    public final wih A;
    public final isd B;
    public final hqk C;
    public final rqk D;
    public final flb E;
    public final p8f F;
    public final rv7 G;
    public final xpm H;
    public final irk I;
    public final SuggestionManagerBridge J;
    public final j55 K;
    public final qt8 L;
    public final n3h M;
    public final zyk N;
    public final rn9 O;
    public c1f P;
    public pvb Q;
    public boolean R;
    public Integer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final qt6 W;
    public final pde a;
    public final ViewGroup b;
    public final fbf c;
    public final nwf d;
    public final ode e;
    public final umi f;
    public final SettingsManager g;
    public final iv7 h;
    public final k6l i;
    public final i53 j;
    public final nr8 k;
    public final x5f l;
    public final qdh m;
    public final yz9 n;
    public final m0a o;
    public final hw3 p;
    public final x77 q;
    public final hw3 r;
    public final ot8 s;
    public final isj t;
    public final fe5 u;
    public final igi v;
    public boolean w;
    public final pde x;
    public final w6j y;
    public final eyi z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0adb A[PHI: r6
      0x0adb: PHI (r6v12 int) = (r6v11 int), (r6v13 int), (r6v15 int) binds: [B:27:0x0164, B:29:0x0175, B:33:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0a49  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mrk(tcc r41, defpackage.j4c r42, defpackage.pde r43, android.view.ViewGroup r44, defpackage.fbf r45, defpackage.nwf r46, ode r47, defpackage.umi r48, defpackage.dbf r49, com.opera.android.settings.SettingsManager r50, defpackage.iv7 r51, defpackage.k6l r52, defpackage.i53 r53, defpackage.nr8 r54, defpackage.ipk r55, defpackage.wcd r56, android.content.ClipboardManager r57, defpackage.pde r58, defpackage.ibf r59, defpackage.x5f r60, defpackage.osf r61, defpackage.x5f r62, defpackage.m6m r63, defpackage.s28 r64, defpackage.mdh r65, defpackage.qdh r66, defpackage.br6 r67, defpackage.qr8 r68, defpackage.nv2 r69, defpackage.gjm r70, defpackage.yz9 r71, defpackage.m0a r72, defpackage.hw3 r73, defpackage.ky1 r74, defpackage.ysj r75, defpackage.jv3 r76, defpackage.x77 r77, defpackage.jv3 r78, defpackage.zv3 r79, com.opera.android.Lazy r80, plh r81, defpackage.hw3 r82, defpackage.ot8 r83) {
        /*
            Method dump skipped, instructions count: 2880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.<init>(tcc, j4c, pde, android.view.ViewGroup, fbf, nwf, ode, umi, dbf, com.opera.android.settings.SettingsManager, iv7, k6l, i53, nr8, ipk, wcd, android.content.ClipboardManager, pde, ibf, x5f, osf, x5f, m6m, s28, mdh, qdh, br6, qr8, nv2, gjm, yz9, m0a, hw3, ky1, ysj, jv3, x77, jv3, zv3, com.opera.android.Lazy, plh, hw3, ot8):void");
    }

    public final isj a() {
        return this.t;
    }

    public final void b() {
        c1f c1fVar;
        if (!c() || (c1fVar = this.P) == null) {
            return;
        }
        c1fVar.b();
    }

    public final boolean c() {
        if (this.P != null) {
            return !r0.c;
        }
        return false;
    }

    public final boolean d() {
        return ((CoordinatorLayout) this.y.a).getVisibility() == 0;
    }

    public final fyj e() {
        Context context = this.b.getContext();
        boolean zB = this.h.b();
        l0a l0aVar = (l0a) this.o.e.g();
        jm7 jm7Var = (jm7) this.e.g();
        boolean z = jm7Var != null ? jm7Var.b : false;
        if (this.v.O()) {
            return new fyj(dyj.a, 4, new jxj(z7h.h(context, 48.0f), z7h.h(context, 108.0f)), false, z ? 1 : 0);
        }
        if (!zB) {
            l0aVar.getClass();
            return new fyj(dyj.b, 1, null, true, z ? 1 : 0);
        }
        gpj gpjVarS = ddh.s(r9n.i(context).height(), context);
        gpj gpjVar = gpj.a;
        return gpjVarS.d() ? new fyj(dyj.a, 2, null, false, z ? 1 : 0) : new fyj(dyj.a, 4, new jxj(z7h.h(context, 48.0f), z7h.h(context, 108.0f)), false, z ? 1 : 0);
    }

    public final void f() {
        if (c()) {
            return;
        }
        c1f c1fVar = this.P;
        if (c1fVar != null) {
            c1fVar.f(false);
            ((vqk) c1fVar.g).w = false;
            ((eyi) c1fVar.d).j();
        }
        w6j w6jVar = this.y;
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w6jVar.e;
        hqk hqkVar = this.C;
        fadingRecyclerView.M0(hqkVar, true);
        eyi eyiVar = new eyi(this, (byte) 6);
        hqkVar.x = eyiVar;
        SparseArray sparseArray = (SparseArray) hqkVar.u.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            ((odb) sparseArray.valueAt(i)).reset();
        }
        SuggestionsListWrapper suggestionsListWrapper = (SuggestionsListWrapper) w6jVar.d;
        FadingRecyclerView fadingRecyclerView2 = (FadingRecyclerView) w6jVar.e;
        jm7 jm7Var = (jm7) this.e.g();
        this.P = new c1f(this.u, this.l, eyiVar, suggestionsListWrapper, fadingRecyclerView2, this.J, this.f, jm7Var != null ? jm7Var.a : false, b8h.j((ode) this.v.f, new r4k((byte) 22)));
        ArrayList arrayList = new ArrayList();
        Iterator it = hqkVar.s.iterator();
        while (it.hasNext()) {
            pa3 pa3Var = (pa3) ((WeakReference) it.next()).get();
            if (pa3Var != null) {
                arrayList.add(pa3Var);
            } else {
                it.remove();
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            View view = ((i) obj).itemView;
            view.animate().cancel();
            view.clearAnimation();
            if (view.hasTransientState()) {
                q9n.J(view, View.class, new gpk((byte) 3));
            }
        }
        this.I.a = false;
        j55 j55Var = this.K;
        j55Var.l = false;
        if (j55Var.m >= 2) {
            j55Var.o = null;
            j55Var.m = 0;
        }
        j55Var.n = true;
        i(String.valueOf(this.H.a.getText()));
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        ((SuggestionsListWrapper) this.y.d).postOnAnimation(new erk(this, (byte) 0));
    }

    public final void h(bsi bsiVar) {
        FrameLayout frameLayout;
        boolean z;
        yv7 yv7Var;
        Iterator it;
        int i;
        yv7 yv7Var2;
        String str;
        ha6 ha6Var;
        StylingImageCheckableWithText stylingImageCheckableWithText;
        FrameLayout frameLayout2;
        boolean z2;
        String str2;
        o29 o29Var;
        wxe qx1Var;
        ViewPropertyAnimator duration;
        eri eriVar;
        if (d()) {
            return;
        }
        iv7 iv7Var = this.h;
        if (bsiVar != null && (eriVar = bsiVar.a) != null) {
            iv7Var.e(eriVar, false);
        }
        iv7Var.l++;
        wih wihVar = this.A;
        yu4 yu4Var = (yu4) wihVar.a.get();
        o8f o8fVar = new o8f(wihVar, (byte) 28);
        mfj mfjVar = yu4Var.e;
        if (mfjVar != null) {
            o8fVar.run(new t0i(mfjVar));
        } else {
            na2.B(yu4Var.c, (CoroutineContext) null, (rx5) null, new s71((ufj) yu4Var.a.get(), ((SharedPreferences) yu4Var.d.get()).getString("last-language-header", null), yu4Var, new wx((Object) o8fVar, (Object) yu4Var, (byte) 25), (mt5) null, (byte) 5), 3);
        }
        ((CoordinatorLayout) this.y.a).setVisibility(0);
        eyi eyiVar = this.z;
        eyiVar.b = false;
        mrk mrkVar = (mrk) eyiVar.d;
        mrkVar.b.removeCallbacks((qlk) eyiVar.c);
        w6j w6jVar = mrkVar.y;
        if (((CoordinatorLayout) w6jVar.a).getParent() == null) {
            mrkVar.b.addView((CoordinatorLayout) w6jVar.a);
        }
        this.u.a(true);
        c1f c1fVar = this.P;
        if (c1fVar != null) {
            c1fVar.f(true);
            nga ngaVar = (nga) c1fVar.a;
            int i2 = ngaVar.a;
            ViewGroup viewGroup = (ViewGroup) ngaVar.c;
            if (i2 == 0) {
                duration = null;
            } else {
                ngaVar.a = 0;
                viewGroup.animate().cancel();
                duration = viewGroup.animate().translationY(ngaVar.a).setInterpolator(lf1.l).setDuration(150L);
            }
            if (duration != null) {
                viewGroup.setTranslationY(ngaVar.b);
                duration.start();
            }
            ((jqk) c1fVar.f).k = false;
        }
        rn9 rn9Var = this.O;
        rn9Var.b = true;
        x5f x5fVar = (x5f) rn9Var.d;
        String strL = ((eri) ((pde) rn9Var.c).g()).l();
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).d().e(strL, new zbe((byte) 22));
            x5fVar.U0(x56VarF);
        }
        rv7 rv7Var = this.G;
        FrameLayout frameLayout3 = rv7Var.c;
        yv7 yv7Var3 = rv7Var.n;
        hd hdVar = rv7Var.m;
        List list = bsiVar != null ? bsiVar.d : null;
        boolean z3 = list == null || list.isEmpty();
        if (z3) {
            iy1 iy1Var = (iy1) hdVar.f;
            List list2 = (List) ((ex0) ((jv3) hdVar.e).get()).d.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof d52) {
                    arrayList.add(obj);
                }
            }
            hdVar.b = !arrayList.isEmpty();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!(((c52) obj2) instanceof d52)) {
                    arrayList2.add(obj2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                linkedHashSet.add(((c52) obj3).a());
            }
            Iterable iterable = (Iterable) iy1Var.m.g();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                linkedHashSet2.add(((jx1) it2.next()).getId());
            }
            if (!linkedHashSet.equals(linkedHashSet2)) {
                iy1Var.b();
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayList2.get(i4);
                    i4++;
                    c52 c52Var = (c52) obj4;
                    if (c52Var != null) {
                        if (c52Var instanceof e52) {
                            e52 e52Var = (e52) c52Var;
                            String str3 = e52Var.b;
                            String str4 = e52Var.c;
                            String str5 = e52Var.d;
                            String str6 = e52Var.e;
                            frameLayout2 = frameLayout3;
                            String str7 = e52Var.f;
                            String str8 = e52Var.g;
                            z92 z92Var = str8 != null ? new z92(str8) : null;
                            if (Intrinsics.a(str6, "application/vnd.opera.x-page-context")) {
                                str2 = str5;
                                z2 = z3;
                                qx1Var = new tx1(z92Var, Uri.parse(str4), null, null);
                                o29Var = null;
                            } else {
                                str2 = str5;
                                z2 = z3;
                                File file = new File(new File(snf.c), str4);
                                o29 o29VarO = c5o.m().o(Uri.fromFile(file).toString(), str6);
                                o29Var = o29VarO;
                                qx1Var = new qx1(o29VarO, file, str6);
                            }
                            ux1 ux1Var = ux1.a;
                            qde qdeVar = iy1Var.m;
                            ArrayList arrayList3 = qdeVar.l;
                            arrayList3.add(new rx1(str3, qx1Var, ux1Var));
                            qdeVar.r(CollectionsKt.k0(arrayList3));
                            iy1Var.i.a.put(str3, new h52(str3, o29Var, ux1Var, true, false, str4, str2, str6, str7, z92Var));
                        } else {
                            frameLayout2 = frameLayout3;
                            z2 = z3;
                            if (c52Var instanceof f52) {
                                f52 f52Var = (f52) c52Var;
                                iy1Var.a(f52Var.d, f52Var.b, f52Var.c);
                            } else if (c52Var instanceof d52) {
                            }
                        }
                        frameLayout3 = frameLayout2;
                        z3 = z2;
                    }
                    h9o.p();
                    return;
                }
            }
            frameLayout = frameLayout3;
            z = z3;
            pv7 pv7Var = rv7Var.w;
            if (pv7Var != null && (ha6Var = pv7Var.b) != null && (stylingImageCheckableWithText = (StylingImageCheckableWithText) ha6Var.m) != null) {
                stylingImageCheckableWithText.u(hdVar.b);
            }
        } else {
            frameLayout = frameLayout3;
            z = z3;
            ((iy1) hdVar.f).b();
        }
        if (bsiVar != null && (str = bsiVar.b) != null) {
            yv7Var3.k(str);
        }
        if (z) {
            yv7Var = yv7Var3;
            if (bsiVar != null && bsiVar.h) {
                yv7Var.b();
            }
        } else if (z5i.r0(frameLayout.getContext())) {
            z5i.v0(frameLayout.getContext());
        } else {
            Iterator it3 = bsiVar.d.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    j95.n();
                    throw null;
                }
                w92 w92Var = (w92) next;
                hdVar.getClass();
                if (w92Var != null) {
                    if (w92Var instanceof u92) {
                        iy1 iy1Var2 = (iy1) hdVar.f;
                        u92 u92Var = (u92) w92Var;
                        Uri uri = u92Var.a;
                        o29 o29Var2 = u92Var.b;
                        String str9 = u92Var.d;
                        String str10 = u92Var.c;
                        ux1 ux1Var2 = ux1.a;
                        iy1Var2.getClass();
                        ux1 ux1Var3 = ux1.b;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        it = it3;
                        String strValueOf = i5 > 0 ? jCurrentTimeMillis + "-" + i5 : String.valueOf(jCurrentTimeMillis);
                        if (o29Var2 == o29.IMAGE) {
                            iy1Var2.e(strValueOf, new v12(uri, iy1Var2.c(strValueOf)), ux1Var3);
                        } else {
                            iy1Var2.d(strValueOf, new py1(uri, ulp.D(snf.c, strValueOf, str10)), ux1Var3, str9, o29Var2);
                        }
                        i = i6;
                        yv7Var2 = yv7Var3;
                    } else {
                        it = it3;
                        if (w92Var instanceof y92) {
                            iy1 iy1Var3 = (iy1) hdVar.f;
                            y92 y92Var = (y92) w92Var;
                            Uri uri2 = y92Var.a;
                            String str11 = y92Var.b;
                            String str12 = y92Var.c;
                            z92 z92Var2 = y92Var.d;
                            ux1 ux1Var4 = ux1.a;
                            iy1Var3.getClass();
                            ux1 ux1Var5 = ux1.b;
                            i = i6;
                            yv7Var2 = yv7Var3;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String strValueOf2 = i5 > 0 ? jCurrentTimeMillis2 + "-" + i5 : String.valueOf(jCurrentTimeMillis2);
                            qde qdeVar2 = iy1Var3.m;
                            ArrayList arrayList4 = qdeVar2.l;
                            arrayList4.add(new sx1(strValueOf2, new tx1(z92Var2, uri2, str11, str12), ux1Var5));
                            qdeVar2.r(CollectionsKt.k0(arrayList4));
                            iy1Var3.j(strValueOf2, uri2, str11, str12, z92Var2.a);
                        } else {
                            i = i6;
                            yv7Var2 = yv7Var3;
                            if (w92Var instanceof v92) {
                                iy1 iy1Var4 = (iy1) hdVar.f;
                                String str13 = ((v92) w92Var).a;
                                iy1Var4.getClass();
                                iy1Var4.a(null, String.valueOf(System.currentTimeMillis()), str13);
                            }
                        }
                    }
                    yv7Var3 = yv7Var2;
                    it3 = it;
                    i5 = i;
                }
                h9o.p();
                return;
            }
            yv7Var = yv7Var3;
            if (bsiVar != null) {
                yv7Var.b();
            }
        }
        x77 x77Var = this.q;
        x77Var.d = ((qim) x77Var.b).f(this);
        ((gm8) x77Var.c).d();
        qt6 qt6Var = this.W;
        qt6Var.a = true;
        mrk mrkVar2 = (mrk) qt6Var.f;
        m0a m0aVar = mrkVar2.o;
        rv7 rv7Var2 = mrkVar2.G;
        ((l0a) m0aVar.e.g()).getClass();
        qt6Var.b = ((uv7) rv7Var2.u.g()).a;
        qt6Var.d = ((uv7) rv7Var2.u.g()).b;
        if (mrkVar2.w) {
            mrkVar2.w = false;
            ((brk) qt6Var.c).invoke();
        }
    }

    public final void i(String str) {
        c1f c1fVar;
        p37.h0((ScrollableToolbarLinearLayout) ((vs) this.y.b).b);
        b2l b2lVar = this.i.o;
        if (b2lVar == null || (c1fVar = this.P) == null) {
            return;
        }
        int i = 0;
        boolean z = ((uv7) this.G.u.g()).b == lbf.c;
        boolean zM = ((d7l) b2lVar).j.m();
        ((vqk) c1fVar.g).v = false;
        jqk jqkVar = (jqk) c1fVar.f;
        boolean z2 = jqkVar.g == null;
        jqkVar.g = str;
        jqkVar.i = true;
        jqkVar.j = false;
        ArrayList arrayList = new ArrayList();
        long jUptimeMillis = SystemClock.uptimeMillis();
        SuggestionManagerBridge suggestionManagerBridge = jqkVar.b;
        km5 km5Var = new km5();
        km5Var.c = str;
        km5Var.a = z2;
        km5Var.b = zM;
        Objects.requireNonNull(jqkVar);
        km5Var.d = jqkVar;
        N.MopJ6PdP(suggestionManagerBridge.a, str, z, zM, km5Var, arrayList);
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        jqkVar.i = false;
        if (jqkVar.j) {
            jqkVar.d.k(jqkVar.g, jqkVar.e, zM);
        }
        long j = jUptimeMillis2 - jUptimeMillis;
        long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
        if (jqkVar.k) {
            return;
        }
        if (j + jUptimeMillis3 > 200 || !arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kqk kqkVar = (kqk) obj;
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(kqkVar.ordinal());
            }
            jqkVar.k = true;
            x5f x5fVar = jqkVar.c;
            Locale locale = Locale.US;
            StringBuilder sbQ = p3p.q(j / 1000, "query: <", "s, update: <");
            sbQ.append(jUptimeMillis3 / 1000);
            sbQ.append("s (");
            sbQ.append((Object) sb);
            sbQ.append(")");
            x5fVar.R(24, sbQ.toString());
        }
    }
}
