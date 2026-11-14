package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.i;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.osp.OspCollectorService;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.chromium.printing.Printable;

/* loaded from: classes.dex */
public final class ghf implements zkf, ati, jvk, Printable {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public ghf() {
        this.a = (byte) 6;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public ghf(Context context) {
        this.a = (byte) 10;
        this.b = new Object();
        this.d = new HashMap();
        this.c = new b8i(this, context);
    }

    public ghf(Context context, TypedArray typedArray) {
        this.a = (byte) 27;
        this.b = context;
        this.c = typedArray;
    }

    public ghf(Context context, kw3 kw3Var, kw3 kw3Var2) {
        this.a = (byte) 22;
        this.b = kw3Var;
        this.c = kw3Var2;
        this.d = new qzj(context, null);
    }

    public ghf(Context context, lkk[] lkkVarArr) {
        this.a = (byte) 3;
        this.d = context.getApplicationContext();
        this.c = new SparseArray(lkkVarArr.length);
        byte b = 0;
        for (lkk lkkVar : lkkVarArr) {
            byte b2 = lkkVar.a;
            if (b2 > b) {
                b = b2;
            }
        }
        this.b = new zsf[b + 1];
        for (lkk lkkVar2 : lkkVarArr) {
            ((SparseArray) this.c).put(lkkVar2.a, lkkVar2);
        }
    }

    public ghf(View view, View view2, FadingScrollView fadingScrollView, final wzg wzgVar, final kze kzeVar, final kze kzeVar2, xzg xzgVar) {
        this.a = (byte) 7;
        this.b = view;
        this.c = view2;
        this.d = fadingScrollView;
        final h42 h42Var = new h42();
        f7f f7fVar = new f7f() { // from class: uzg
            public final void d0(Object obj) {
                h42Var.r((((Boolean) ((kze) wzgVar.c).g()).booleanValue() || !wqm.D(Uri.parse((String) kzeVar2.g()))) ? vzg.c : ((Boolean) kzeVar.g()).booleanValue() ? vzg.a : vzg.b);
            }
        };
        h42Var.s((kze) wzgVar.c, f7fVar);
        h42Var.s(kzeVar2, f7fVar);
        h42Var.s(kzeVar, f7fVar);
        h42Var.j(xzgVar, new qzg(this, (byte) 1));
    }

    public ghf(View view, eck eckVar) {
        this.a = (byte) 20;
        this.b = view;
        this.c = eckVar;
        q9n.g(view, new z61(this, (byte) 22));
    }

    public ghf(ViewPager viewPager, PathInterpolator pathInterpolator) {
        this.a = (byte) 19;
        this.b = viewPager;
        this.c = pathInterpolator;
        viewPager.setOnTouchListener(new m42(this, (byte) 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ghf(dx3 dx3Var, b2l b2lVar) {
        this.a = (byte) 26;
        this.b = new WeakReference(b2lVar);
        this.c = dx3Var.getString(2132020554);
        this.d = t8.a.getString(2132018881);
    }

    public ghf(gnh gnhVar) {
        this.a = (byte) 24;
        this.b = gnhVar;
        this.c = nvk.v(2132018532);
        PointF pointF = k3d.a;
        this.d = new mvk(2130970920, 2132022301, 2130970921, 2131951679, new i3d(2130969282, 1, "states/on success", false), new i3d(2130969282, 2, "states/on success", false), new i3d(2130969323, 1, "states/success", false), new i3d(2130969323, 2, "states/success", false));
    }

    public ghf(guf gufVar) {
        this.a = (byte) 17;
        n65 n65Var = n65.b;
        this.b = gufVar;
        this.c = c26.j(1);
        this.d = c26.k(n65Var);
    }

    public ghf(i4d i4dVar) {
        this.a = (byte) 16;
        this.b = i4dVar;
    }

    public ghf(File file, umi umiVar) {
        this.a = (byte) 13;
        this.b = file;
        this.c = umiVar;
        this.d = new qie((byte) 19);
    }

    public /* synthetic */ ghf(Object obj, MediationAdConfiguration mediationAdConfiguration, String str, byte b) {
        this.a = b;
        this.d = obj;
        this.b = mediationAdConfiguration;
        this.c = str;
    }

    public /* synthetic */ ghf(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ghf(List list) {
        this.a = (byte) 15;
        this.b = list;
        this.c = new hyl[list.size()];
        this.d = new pr(new txi(this, (byte) 0));
    }

    public ghf(k6l k6lVar) {
        this.a = (byte) 25;
        this.d = k6lVar;
        this.b = new ArrayList();
    }

    public ghf(ndc ndcVar, plk plkVar, z77 z77Var) {
        this.a = (byte) 21;
        this.b = plkVar;
        this.c = z77Var;
        ((h42) plkVar.d).j(ndcVar, new qzg(this, (byte) 21));
    }

    public ghf(pne pneVar, String str, int i, umi umiVar, bnj bnjVar, long j) {
        this.a = (byte) 18;
        byte b = 4;
        q65 q65Var = new q65(new mni(this, (byte) 14), b);
        this.b = q65Var;
        this.c = bnjVar;
        String strT = dbh.t(pneVar.a, str);
        if (TextUtils.isEmpty(strT)) {
            bnjVar.f(false);
            return;
        }
        nya nyaVarB = oya.b(strT, i, i, 0, 10, new rii(this, b));
        this.d = nyaVarB;
        if (nyaVarB != null) {
            q65Var.B0(umiVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public ghf(sam samVar, ghf ghfVar) {
        this.a = (byte) 29;
        this.b = samVar;
        this.c = ghfVar;
        this.d = samVar.getValue();
    }

    public ghf(umi umiVar, x5f x5fVar, q6e q6eVar) {
        this.a = (byte) 14;
        this.b = umiVar;
        this.c = x5fVar;
        this.d = new qie((byte) 19);
        q6eVar.F(new kv1(this, (byte) 3));
    }

    public ghf(wjh wjhVar, fji fjiVar, aji ajiVar) {
        this.a = (byte) 12;
        this.b = fjiVar;
        this.c = ajiVar;
        Objects.requireNonNull(wjhVar);
        this.d = wjhVar;
    }

    public ghf(x5f x5fVar, uqe uqeVar) {
        this.a = (byte) 5;
        this.b = x5fVar;
        this.c = uqeVar;
        this.d = new LinkedHashSet();
    }

    public ghf(x5g x5gVar) {
        this.a = (byte) 4;
        this.b = x5gVar;
        ode odeVar = new ode();
        this.c = odeVar;
        z5g z5gVar = new z5g(this, (byte) 0);
        this.d = z5gVar;
        a4g a4gVar = x5gVar.e;
        List listUnmodifiableList = a4gVar != null ? Collections.unmodifiableList(a4gVar.a) : null;
        odeVar.r(listUnmodifiableList == null ? l08.a : listUnmodifiableList);
        x5gVar.c();
        x5gVar.b.b(z5gVar);
    }

    public ghf(zd4 zd4Var, wtk wtkVar, String str) {
        this.a = (byte) 23;
        this.c = zd4Var;
        this.b = wtkVar;
    }

    public static ghf H(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new ghf(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(defpackage.ghf r7, java.lang.String r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.lth
            if (r0 == 0) goto L13
            r0 = r9
            lth r0 = (defpackage.lth) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lth r0 = new lth
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            ybh.y(r9)
            goto L6d
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r4
        L2e:
            ybh.y(r9)
            fvh r9 = new fvh
            r9.<init>()
            java.lang.Object r2 = r7.b
            java.lang.Object r2 = r7.b
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.toString()
            rma r5 = new rma
            r6 = 4
            r5.<init>(r6)
            r5.o(r2, r4)
            hra r2 = r5.d()
            r9.a = r2
            java.lang.String r2 = "Accept-Language"
            r9.d(r2, r8)
            kvh r8 = new kvh
            r8.<init>(r9)
            java.lang.Object r9 = r7.d
            jg8 r9 = (jg8) r9
            p71 r2 = new p71
            r5 = 19
            r2.<init>(r7, r8, r4, r5)
            r0.v = r3
            java.lang.Object r9 = na2.Z(r9, r2, r0)
            if (r9 != r1) goto L6d
            return r1
        L6d:
            t0i r9 = (t0i) r9
            java.lang.Object r7 = r9.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghf.r(ghf, java.lang.String, nt5):java.lang.Object");
    }

    public static lrg y(Map map, String str, irg irgVar) {
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            lrg lrgVar = new lrg(irgVar.d);
            map.put(str, rbd.d(new Pair[]{new Pair(irgVar.a, lrgVar)}));
            return lrgVar;
        }
        lrg lrgVar2 = (lrg) map2.get(irgVar.a);
        if (lrgVar2 != null) {
            return lrgVar2;
        }
        lrg lrgVar3 = new lrg(irgVar.d);
        map2.put(irgVar.a, lrgVar3);
        return lrgVar3;
    }

    public final ArrayList A() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList2.add(new Pair(entry2.getKey(), Boolean.valueOf(((lrg) entry2.getValue()).b())));
            }
            arrayList.add(new bqg(str, rbd.h(arrayList2)));
        }
        return arrayList;
    }

    public final void B(String str) {
        Boolean boolValueOf;
        Collection collectionValues;
        Collection collectionValues2;
        Map map = (Map) ((LinkedHashMap) this.c).get(str);
        List list = (List) ((LinkedHashMap) this.b).get(str);
        if (list != null) {
            List list2 = list;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                loop1: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map map2 = (Map) ((LinkedHashMap) this.d).get((String) it.next());
                    if (map2 != null && (collectionValues2 = map2.values()) != null) {
                        Collection collection = collectionValues2;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (it2.hasNext()) {
                                if (((lrg) it2.next()).b()) {
                                    z = true;
                                    break loop1;
                                }
                            }
                        }
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (map == null || (collectionValues = map.values()) == null) {
            return;
        }
        Iterator it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            ((lrg) it3.next()).a(Intrinsics.a(boolValueOf, Boolean.TRUE));
        }
    }

    public final void D(String str, String str2, boolean z) {
        Object next;
        N(str, str2, z);
        Iterator it = ((LinkedHashMap) this.b).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((List) ((Map.Entry) next).getValue()).contains(str)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str3 = entry != null ? (String) entry.getKey() : null;
        if (str3 != null) {
            B(str3);
        }
    }

    public final boolean E() {
        if (((sam) this.b).getValue() != this.d) {
            return true;
        }
        ghf ghfVar = (ghf) this.c;
        return ghfVar != null && ghfVar.E();
    }

    public final boolean G() {
        PagerAdapter adapter;
        if (!((ViewPager) this.b).isAttachedToWindow() || (adapter = ((ViewPager) this.b).getAdapter()) == null || adapter.getCount() == 0 || !((ViewPager) this.b).isLaidOut() || ((ValueAnimator) this.d) != null || !((ViewPager) this.b).beginFakeDrag()) {
            return false;
        }
        int scrollX = ((ViewPager) this.b).getScrollX();
        int iB = l2c.j.b((ViewPager) this.b);
        ViewPager viewPager = (ViewPager) this.b;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollX, iB == 1 ? scrollX - viewPager.getWidth() : viewPager.getWidth() + scrollX);
        this.d = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator((PathInterpolator) this.c);
        ((ValueAnimator) this.d).setDuration(700L);
        ((ValueAnimator) this.d).addUpdateListener(new jq3(this, (byte) 5));
        ((ValueAnimator) this.d).addListener(new kc(this, (byte) 25));
        ((ValueAnimator) this.d).start();
        return true;
    }

    public final jjm I(Context context) {
        ArrayList arrayList;
        Intent intent;
        ghf ghfVar;
        Context context2;
        qn qnVar;
        icj jvgVar;
        Intent intent2 = (Intent) ((i4d) this.b).b;
        String[] strArr = OperaApplication.K;
        ArrayList arrayListC = ((zcj) ((OperaApplication) context.getApplicationContext()).r.Q0.get()).c(intent2, (b2l) this.d);
        if (i0l.g() || (!arrayListC.isEmpty() && Build.VERSION.SDK_INT < 34)) {
            if (i0l.g()) {
                arrayList = arrayListC;
                intent = intent2;
                ghfVar = this;
                context2 = context;
                qnVar = null;
            } else {
                arrayList = arrayListC;
                intent = intent2;
                ghfVar = this;
                qnVar = new qn(ghfVar, intent, arrayList, context, (byte) 20);
                context2 = context;
            }
            qn qnVar2 = qnVar;
            jvgVar = new jvg(intent, arrayList, (b2l) ghfVar.d, qnVar2, (dcj) ghfVar.c);
        } else {
            jvgVar = new p8f(intent2, arrayListC, (dcj) this.c);
            context2 = context;
        }
        return jvgVar.f(context2);
    }

    public final void J() {
        ((TypedArray) this.c).recycle();
    }

    public final void K() {
        ((wtk) this.b).release();
        xug.q(new qlk(this, (byte) 8));
    }

    public final String L(String str, p6l p6lVar) {
        String strJ;
        String host = Uri.parse(str).getHost();
        if (host != null && (wqm.y(host, "redirector.opera.com") || wqm.y(host, "redirector.op-test.net"))) {
            String str2 = (String) ((esk) this.b).get();
            if (str2 == null) {
                str2 = "";
            }
            return c.o(c.o(str, "$gaid$", str2), "$huid$", (String) ((esk) this.c).get());
        }
        if (!l6e.p(str)) {
            return str;
        }
        p6l p6lVar2 = p6l.b;
        esk eskVar = (esk) this.d;
        if (p6lVar == p6lVar2) {
            strJ = ((h1a) eskVar.get()).i();
            if (strJ.length() == 0) {
                strJ = "android-ofa-b-pr";
            }
        } else {
            strJ = ((h1a) eskVar.get()).j();
            if (strJ.length() == 0) {
                strJ = "android-ofa-b-re";
            }
        }
        return c.o(str, "#{OPRClient}", strJ);
    }

    public final fn7 M(wo2 wo2Var) {
        wtk wtkVar = (wtk) this.b;
        xug.i();
        Objects.toString(wtkVar);
        ntk ntkVar = wo2Var.a;
        List<co2> list = wo2Var.b;
        Objects.toString(ntkVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Objects.toString((co2) it.next());
        }
        this.d = new fn7();
        for (co2 co2Var : list) {
            fn7 fn7Var = (fn7) this.d;
            Rect rect = co2Var.d;
            int i = co2Var.f;
            boolean z = co2Var.g;
            Matrix matrix = new Matrix(ntkVar.b);
            RectF rectF = new RectF(rect);
            Size size = co2Var.e;
            matrix.postConcat(d2m.a(rectF, d2m.i(size), i, z));
            jpo.j(d2m.d(d2m.h(i, d2m.f(rect)), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            ne5 ne5VarB = ntkVar.g.b();
            ne5VarB.a = size;
            fn7Var.put(co2Var, new ntk(co2Var.b, co2Var.c, ne5VarB.p(), matrix, false, rect2, ntkVar.i - i, -1, ntkVar.e != z));
        }
        wtkVar.c(ntkVar.d((zd4) this.c, true));
        for (Map.Entry entry : ((fn7) this.d).entrySet()) {
            p(ntkVar, entry);
            ((ntk) entry.getValue()).a(new jbd(this, ntkVar, entry, (byte) 19));
        }
        ntkVar.o.add(new ip1((fn7) this.d, (byte) 7));
        return (fn7) this.d;
    }

    public final void N(String str, String str2, boolean z) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        Object linkedHashMap2 = linkedHashMap.get(str);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str, linkedHashMap2);
        }
        Map map = (Map) linkedHashMap2;
        lrg lrgVar = (lrg) map.get(str2);
        if (lrgVar == null) {
            lrgVar = new lrg(z);
            lrgVar.a = new rd1(this, str, str2, (byte) 2);
            map.put(str2, lrgVar);
        }
        lrgVar.a(z);
    }

    @Override // org.chromium.printing.Printable
    public final String a() {
        return (String) this.d;
    }

    @Override // org.chromium.printing.Printable
    public final boolean b() {
        b2l b2lVar = (b2l) ((WeakReference) this.b).get();
        if (b2lVar == null) {
            return false;
        }
        d7l d7lVar = (d7l) b2lVar;
        return (d7lVar.m || d7lVar.o0() || d7lVar.j.c0()) ? false : true;
    }

    public final void c(Iterable iterable, Function2 function2) {
        Object next;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Map map = (Map) ((LinkedHashMap) this.d).get(str2);
            if (map != null) {
                function2.invoke(str2, map);
                Iterator it2 = ((LinkedHashMap) this.b).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((List) ((Map.Entry) next).getValue()).contains(str2)) {
                            break;
                        }
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null && (str = (String) entry.getKey()) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            B((String) it3.next());
        }
    }

    @Override // defpackage.zkf
    public final void d(AdError adError) {
        switch (this.a) {
            case 1:
                mpf mpfVar = (mpf) this.d;
                mpfVar.a("loadAd: initialize onError, error=" + adError);
                mpfVar.a.onFailure(adError);
                break;
            default:
                qpf qpfVar = (qpf) this.d;
                qpfVar.a("loadAd: initialize onError, error=" + adError);
                qpfVar.b.onFailure(adError);
                break;
        }
    }

    @Override // defpackage.zkf
    public final void e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((mpf) this.d).a("loadAd: initialize onSuccess");
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = (MediationAppOpenAdConfiguration) obj;
                rm5.a0(mediationAppOpenAdConfiguration);
                qfb qfbVar = new qfb((Object) this, (byte) 17);
                String str = (String) this.c;
                Context context = mediationAppOpenAdConfiguration.getContext();
                wjo wjoVar = wjo.REGULAR;
                if (fcp.a(qfbVar) != null && fcp.b(qfbVar, context) != null && fcp.c(qfbVar, str) != null) {
                    ejo ejoVar = fko.a;
                    fko.a(context);
                    vt1 vt1Var = new vt1(context.getApplicationContext(), new pro(str, sm.h, eq.e, wjoVar));
                    vt1Var.J(qfbVar);
                    vt1Var.I();
                    break;
                }
                break;
            default:
                ((qpf) this.d).a("loadAd: initialize onSuccess");
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = (MediationRewardedAdConfiguration) obj;
                rm5.a0(mediationRewardedAdConfiguration);
                qie qieVar = new qie((Object) this, (byte) 5);
                String str2 = (String) this.c;
                Context context2 = mediationRewardedAdConfiguration.getContext();
                wjo wjoVar2 = wjo.REGULAR;
                if (fcp.a(qieVar) != null && fcp.b(qieVar, context2) != null && fcp.c(qieVar, str2) != null) {
                    ejo ejoVar2 = fko.a;
                    fko.a(context2);
                    i2i i2iVar = new i2i(context2.getApplicationContext(), new pro(str2, sm.f, eq.e, wjoVar2));
                    i2iVar.J(qieVar);
                    i2iVar.I();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ysi
    public final void g(esi esiVar) {
    }

    @Override // org.chromium.printing.Printable
    public final String getTitle() {
        b2l b2lVar = (b2l) ((WeakReference) this.b).get();
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            String strL0 = d7lVar.l0();
            if (!TextUtils.isEmpty(strL0)) {
                return strL0;
            }
            String strK0 = d7lVar.k0();
            if (!TextUtils.isEmpty(strK0)) {
                return strK0;
            }
        }
        return (String) this.c;
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = (mvk) this.c;
        mvk mvkVar2 = (mvk) this.d;
        if (cs5.W(iVar.itemView)) {
            hvkVarArr[0] = mvkVar2;
            hvkVarArr[1] = mvkVar;
        } else {
            hvkVarArr[0] = mvkVar;
            hvkVarArr[1] = mvkVar2;
        }
    }

    @Override // defpackage.ysi
    public final boolean i() {
        return true;
    }

    @Override // org.chromium.printing.Printable
    public final boolean j(int i, int i2) {
        b2l b2lVar = (b2l) ((WeakReference) this.b).get();
        if (b2lVar == null || !b()) {
            return false;
        }
        d7l d7lVar = (d7l) b2lVar;
        if (!d7lVar.k) {
            d7lVar.r0(true);
        }
        return d7lVar.j.j(i, i2);
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        if (iVar instanceof onh) {
            final List listV = ((onh) iVar).V();
            if (listV.isEmpty()) {
                return;
            }
            if (Intrinsics.a(hvkVar, (mvk) this.c)) {
                final byte b = 0;
                iVar.itemView.post(new Runnable(this) { // from class: ovk
                    public final /* synthetic */ ghf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        List<enh> list = listV;
                        ghf ghfVar = this.b;
                        switch (b2) {
                            case 0:
                                gnh gnhVar = (gnh) ghfVar.b;
                                boolean z = false;
                                for (enh enhVar : list) {
                                    if (gnhVar.f.remove(enhVar)) {
                                        N.MKH2wY$N(gnhVar.b.f.a, enhVar.c);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    gnhVar.e();
                                    knh knhVar = gnhVar.e;
                                    int size = list.size();
                                    y83 y83Var = knhVar.A;
                                    if (y83Var == null) {
                                        y83Var = null;
                                    }
                                    knhVar.G0(((LinearLayout) y83Var.b).getContext().getResources().getQuantityString(2131886184, size, Integer.valueOf(size)), true);
                                    break;
                                }
                                break;
                            default:
                                ((gnh) ghfVar.b).d(list);
                                break;
                        }
                    }
                });
            } else if (Intrinsics.a(hvkVar, (mvk) this.d)) {
                final byte b2 = 1;
                iVar.itemView.post(new Runnable(this) { // from class: ovk
                    public final /* synthetic */ ghf b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        List<enh> list = listV;
                        ghf ghfVar = this.b;
                        switch (b22) {
                            case 0:
                                gnh gnhVar = (gnh) ghfVar.b;
                                boolean z = false;
                                for (enh enhVar : list) {
                                    if (gnhVar.f.remove(enhVar)) {
                                        N.MKH2wY$N(gnhVar.b.f.a, enhVar.c);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    gnhVar.e();
                                    knh knhVar = gnhVar.e;
                                    int size = list.size();
                                    y83 y83Var = knhVar.A;
                                    if (y83Var == null) {
                                        y83Var = null;
                                    }
                                    knhVar.G0(((LinearLayout) y83Var.b).getContext().getResources().getQuantityString(2131886184, size, Integer.valueOf(size)), true);
                                    break;
                                }
                                break;
                            default:
                                ((gnh) ghfVar.b).d(list);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.ysi
    public final void l() {
        ode odeVar = (ode) this.c;
        a4g a4gVar = ((x5g) this.b).e;
        List listUnmodifiableList = a4gVar != null ? Collections.unmodifiableList(a4gVar.a) : null;
        if (listUnmodifiableList == null) {
            listUnmodifiableList = l08.a;
        }
        odeVar.r(listUnmodifiableList);
    }

    @Override // defpackage.ysi
    public final ekc m() {
        return (ode) this.c;
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        if (iVar instanceof onh) {
            return ((onh) iVar).U();
        }
        return false;
    }

    public final void o() {
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                lrg lrgVar = (lrg) entry2.getValue();
                mrg mrgVar = new mrg(this, entry, entry2, (byte) 0);
                lrgVar.getClass();
                lrgVar.a = mrgVar;
            }
        }
        for (Map.Entry entry3 : ((LinkedHashMap) this.d).entrySet()) {
            for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
                lrg lrgVar2 = (lrg) entry4.getValue();
                mrg mrgVar2 = new mrg(this, entry3, entry4, (byte) 1);
                lrgVar2.getClass();
                lrgVar2.a = mrgVar2;
            }
        }
    }

    public final void p(ntk ntkVar, Map.Entry entry) {
        ntk ntkVar2 = (ntk) entry.getValue();
        Objects.toString(ntkVar2);
        uo2 uo2Var = new uo2(ntkVar.g.a, ((co2) entry.getKey()).d, ntkVar.c ? (zd4) this.c : null, ((co2) entry.getKey()).f, ((co2) entry.getKey()).g);
        short s = ((co2) entry.getKey()).c;
        ntkVar2.getClass();
        xug.i();
        ntkVar2.b();
        jpo.n("Consumer can only be linked once.", !ntkVar2.j);
        ntkVar2.j = true;
        mtk mtkVar = ntkVar2.l;
        fr4 fr4VarI0 = k1g.i0(mtkVar.c(), new ltk(ntkVar2, mtkVar, s, uo2Var, (uo2) null), x7d.l());
        fr4VarI0.addListener(new wr9(fr4VarI0, new d7h((byte) 7, this, ntkVar2, false), (byte) 0), x7d.l());
    }

    public final void q(en8 en8Var, s7m s7mVar) {
        hyl[] hylVarArr = (hyl[]) this.c;
        for (int i = 0; i < hylVarArr.length; i++) {
            s7mVar.a();
            s7mVar.b();
            hyl hylVarTrack = en8Var.track(s7mVar.d, 3);
            oj9 oj9Var = (oj9) ((List) this.b).get(i);
            String str = oj9Var.n;
            z4o.y("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = oj9Var.a;
            if (str2 == null) {
                s7mVar.b();
                str2 = s7mVar.e;
            }
            nj9 nj9Var = new nj9();
            nj9Var.a = str2;
            nj9Var.l = dzd.p("video/mp2t");
            nj9Var.m = dzd.p(str);
            nj9Var.e = oj9Var.e;
            nj9Var.d = oj9Var.d;
            nj9Var.J = oj9Var.K;
            nj9Var.p = oj9Var.q;
            z1m.q(nj9Var, hylVarTrack);
            hylVarArr[i] = hylVarTrack;
        }
    }

    @Override // defpackage.ati
    public final void remove(Object obj) {
        w3g w3gVar = (w3g) obj;
        x5g x5gVar = (x5g) this.b;
        a4g a4gVar = x5gVar.e;
        if (a4gVar != null) {
            List list = a4gVar.a;
            int iA = w3g.a(list, w3gVar);
            N.MvKxovNE(a4gVar.b, iA);
            list.remove(iA);
        }
        x5gVar.d.a.j(w4g.a(w3gVar));
    }

    public final ColorStateList s(int i) {
        int resourceId;
        ColorStateList colorStateListV;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListV = nb6.v(resourceId, (Context) this.b)) == null) ? typedArray.getColorStateList(i) : colorStateListV;
    }

    public final Drawable t(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : sgb.F(resourceId, (Context) this.b);
    }

    public final Drawable u(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.a().c(resourceId, (Context) this.b);
    }

    public final Typeface v(int i, int i2, rq1 rq1Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.d;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.d = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.b;
        ThreadLocal threadLocal = ResourcesCompat.a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.c(context, resourceId, typedValue2, i2, rq1Var, true, false);
    }

    public final lrg w(npg npgVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        irg irgVar = npgVar.d;
        if (irgVar == null) {
            return null;
        }
        String str = npgVar.a;
        List<cqg> list = npgVar.g;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return y(linkedHashMap, str, irgVar);
        }
        ArrayList arrayList = new ArrayList();
        for (cqg cqgVar : list) {
            y(linkedHashMap, cqgVar.a, cqgVar.b);
            arrayList.add(cqgVar.a);
        }
        ((LinkedHashMap) this.b).put(str, arrayList);
        return y((LinkedHashMap) this.c, str, irgVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hwm */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r6, java.util.Map r7, nt5 r8) throws hwm {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.pbi
            if (r0 == 0) goto L13
            r0 = r8
            pbi r0 = (defpackage.pbi) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            pbi r0 = new pbi
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.u
            ghf r5 = r0.t
            ybh.y(r8)     // Catch: java.lang.Exception -> L7d
            goto L67
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r4
        L32:
            ybh.y(r8)
            java.lang.Object r8 = r5.c     // Catch: java.lang.Exception -> L7d
            u7d r8 = (u7d) r8     // Catch: java.lang.Exception -> L7d
            java.lang.String r8 = r8.a()     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            r2.append(r8)     // Catch: java.lang.Exception -> L7d
            java.lang.String r8 = "/ruleSet/"
            r2.append(r8)     // Catch: java.lang.Exception -> L7d
            r2.append(r6)     // Catch: java.lang.Exception -> L7d
            java.lang.String r8 = ".json"
            r2.append(r8)     // Catch: java.lang.Exception -> L7d
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r5.d     // Catch: java.lang.Exception -> L7d
            eqa r2 = (eqa) r2     // Catch: java.lang.Exception -> L7d
            r0.t = r5     // Catch: java.lang.Exception -> L7d
            r0.u = r6     // Catch: java.lang.Exception -> L7d
            r0.x = r3     // Catch: java.lang.Exception -> L7d
            java.lang.Object r8 = r2.b(r8, r7, r0)     // Catch: java.lang.Exception -> L7d
            if (r8 != r1) goto L67
            return r1
        L67:
            r7 = r8
            gqa r7 = (gqa) r7     // Catch: java.lang.Exception -> L7d
            int r7 = r7.c     // Catch: java.lang.Exception -> L7d
            r0 = 403(0x193, float:5.65E-43)
            if (r7 == r0) goto L75
            r0 = 404(0x194, float:5.66E-43)
            if (r7 == r0) goto L75
            return r8
        L75:
            hwm r7 = new hwm     // Catch: java.lang.Exception -> L7d
            java.lang.String r8 = "Unable to initialise due to wrong configuration, please make sure your settingsID/ruleSetID is correct."
            r7.<init>(r8, r4)     // Catch: java.lang.Exception -> L7d
            throw r7     // Catch: java.lang.Exception -> L7d
        L7d:
            r7 = move-exception
            java.lang.Object r5 = r5.b
            owm r5 = (owm) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed while fetching ruleSet using id: "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r5.a(r6, r7)
            boolean r5 = r7 instanceof hwm
            if (r5 == 0) goto L9a
            r4 = r7
            hwm r4 = (hwm) r4
        L9a:
            if (r4 != 0) goto La3
            hwm r4 = new hwm
            java.lang.String r5 = "Unable to initialise due to poor or no network connection while fetching the rule Set."
            r4.<init>(r5, r7)
        La3:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghf.x(java.lang.String, java.util.Map, nt5):java.lang.Object");
    }

    public final zsf z(int i) {
        zsf[] zsfVarArr = (zsf[]) this.b;
        if (zsfVarArr[i] == null) {
            wbk wbkVar = (wbk) OspCollectorService.g.get(((SparseArray) this.c).get(i));
            zsfVarArr[i] = (zsf) ((xbk) wbkVar.a.i).d((Context) this.d);
        }
        return zsfVarArr[i];
    }
}
