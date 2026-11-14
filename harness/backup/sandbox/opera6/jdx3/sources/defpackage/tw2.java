package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class tw2 implements kud, crn, f94, oq2, gk8, bcf, ann, qc6, ir6 {
    public static volatile br3 c;
    public static final yu9 d = new yu9((byte) 1);
    public final /* synthetic */ byte a;
    public final Object b;

    public tw2(byte b) {
        br3 provider;
        this.a = b;
        switch (b) {
            case 2:
                yu9 yu9Var = d;
                y6h y6hVar = y6h.c;
                try {
                    yu9Var = (pvd) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                }
                pvd[] pvdVarArr = {yu9.b, yu9Var};
                i9d i9dVar = new i9d();
                i9dVar.a = pvdVarArr;
                Charset charset = jfb.a;
                this.b = i9dVar;
                return;
            case 16:
                this.b = fee.k();
                return;
            default:
                synchronized (tw2.class) {
                    provider = Security.getProvider("BC");
                    if (!(provider instanceof br3)) {
                        if (c == null) {
                            c = new br3();
                        }
                        provider = c;
                    }
                }
                this.b = provider;
                return;
        }
    }

    public /* synthetic */ tw2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public tw2(u59 u59Var, vrb vrbVar) {
        this.a = (byte) 24;
        this.b = u59Var;
    }

    public tw2(xqe xqeVar) {
        this.a = (byte) 9;
        this.b = xqeVar;
        xqeVar.n(new q02(this, (byte) 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jt8 q(h5a r8, java.util.List r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.q(h5a, java.util.List):jt8");
    }

    public static tw2 r(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new tw2((Object) AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2), (byte) 3);
    }

    public static String t(gt gtVar) {
        int iOrdinal = gtVar.ordinal();
        if (iOrdinal == 0) {
            return "popular_sites";
        }
        if (iOrdinal == 1) {
            return "categories";
        }
        if (iOrdinal == 2) {
            return "frequently_visited";
        }
        if (iOrdinal == 3) {
            return "tools_you_may_like";
        }
        if (iOrdinal == 4) {
            return "bookmarks";
        }
        if (iOrdinal == 5) {
            return "search";
        }
        h9o.p();
        return null;
    }

    public static String w(kq8 kq8Var) {
        switch (kq8Var.ordinal()) {
            case 0:
                return "betting";
            case 1:
                return "dating";
            case 2:
                return "education";
            case 3:
                return "entertainment";
            case 4:
                return "finance";
            case 5:
                return "gaming";
            case 6:
                return "government";
            case 7:
                return "news";
            case 8:
                return "other";
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return "search";
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "shopping";
            case 11:
                return "social";
            case 12:
                return "sport";
            case 13:
                return "travel";
            default:
                h9o.p();
                return null;
        }
    }

    public final int a() {
        return (k() << 8) | k();
    }

    @Override // defpackage.crn
    public final ViewGroup b() {
        return ((x22) this.b).g;
    }

    public final void c() {
    }

    @Override // defpackage.ann
    public final void d() {
        ((uk5) this.b).run(new rw7(Collections.singletonList(new dzh("Wallpaper"))));
    }

    @Override // defpackage.ann
    public final void e() {
        ((uk5) this.b).run(new rw7(Collections.singletonList(new dzh("Wallpaper"))));
    }

    public final void f(itd itdVar, boolean z) {
        wp1 wp1Var;
        byte b = this.a;
        Object obj = this.b;
        int i = 0;
        switch (b) {
            case 4:
                if (itdVar instanceof akk) {
                    ((akk) itdVar).A.k().c(false);
                }
                kud kudVar = ((ne) obj).e;
                if (kudVar != null) {
                    kudVar.f(itdVar, z);
                    break;
                }
                break;
            default:
                xp1 xp1Var = (xp1) obj;
                itd itdVarK = itdVar.k();
                boolean z2 = itdVarK != itdVar;
                if (z2) {
                    itdVar = itdVarK;
                }
                wp1[] wp1VarArr = xp1Var.K;
                int length = wp1VarArr != null ? wp1VarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        wp1Var = null;
                    } else {
                        wp1Var = wp1VarArr[i];
                        if (wp1Var == null || wp1Var.h != itdVar) {
                            i++;
                        }
                    }
                }
                if (wp1Var != null) {
                    if (!z2) {
                        xp1Var.r(wp1Var, z);
                        break;
                    } else {
                        xp1Var.p(wp1Var.a, wp1Var, itdVarK);
                        xp1Var.r(wp1Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.crn
    public final boolean g() {
        x22 x22Var = (x22) this.b;
        return x22Var.u == null && x22Var.g.isShown();
    }

    public final Object h() {
        return this.b;
    }

    public final fee i() {
        throw null;
    }

    @Override // defpackage.crn
    public final rn9 j() {
        return new rn9(((x22) this.b).h.b.get(), (Object) mf0.i, (byte) 18);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hr6 */
    public final short k() throws IOException, hr6 {
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new hr6();
    }

    @Override // defpackage.oq2
    public final void l(ru2 ru2Var) {
        mq2 mq2Var = (mq2) this.b;
        if (mq2Var.j.a()) {
            return;
        }
        mq2Var.e.l(ru2Var);
    }

    public final g3o l0(View view, g3o g3oVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 19:
                ChromiumContainerView chromiumContainerView = (ChromiumContainerView) obj;
                zy4 zy4Var = chromiumContainerView.b;
                int i = zy4Var.n ? 519 : 647;
                d3o d3oVar = g3oVar.a;
                r9b r9bVarI = d3oVar.i(i);
                r9b r9bVarN = d3oVar.n();
                r9b r9bVarI2 = d3oVar.i(647);
                int i2 = r9bVarN.d;
                if (i2 <= r9bVarI2.d) {
                    i2 = 0;
                }
                if (!zy4Var.b.equals(r9bVarI) || zy4Var.e != i2) {
                    zy4Var.b = r9bVarI;
                    zy4Var.e = i2;
                    zy4Var.S();
                    if (zy4Var.q == 3) {
                        chromiumContainerView.a(zy4Var.R());
                    }
                }
                int i3 = chromiumContainerView.f;
                int i4 = r9bVarI.b;
                int i5 = r9bVarI.d;
                if (i3 != i4 || chromiumContainerView.g != i5) {
                    chromiumContainerView.f = i4;
                    chromiumContainerView.g = i5;
                    chromiumContainerView.invalidate();
                }
                return g3oVar;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                g3o g3oVar2 = collapsingToolbarLayout.getFitsSystemWindows() ? g3oVar : null;
                if (!Objects.equals(collapsingToolbarLayout.D, g3oVar2)) {
                    collapsingToolbarLayout.D = g3oVar2;
                    collapsingToolbarLayout.requestLayout();
                }
                return g3oVar.a.c();
        }
    }

    @Override // defpackage.crn
    public final void m(sba sbaVar, lrn lrnVar) {
        x22 x22Var = (x22) this.b;
        sbaVar.a(lrnVar);
        sbaVar.a(new q22(x22Var, (byte) 0));
        sbaVar.f();
        x22Var.u = sbaVar;
    }

    public final ConsentDisclosureObject n(String str) throws ProtocolException {
        eqa eqaVar = (eqa) ((u59) this.b).b;
        eqaVar.getClass();
        oup.M();
        HttpURLConnection httpURLConnectionA = eqaVar.a.a(str, eqaVar.a((Map) null));
        httpURLConnectionA.setRequestMethod(RequestBuilder.GET);
        String str2 = d71.d(httpURLConnectionA).b;
        crb crbVar = xrb.a;
        return (ConsentDisclosureObject) crbVar.a(str2, zwg.p(((rpb) crbVar).b, uqh.d(ConsentDisclosureObject.class)));
    }

    public final kt8 o(bp3 bp3Var, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            kt8 kt8VarO = o(bp3Var, arrayList, i2, CollectionsKt.W(arrayList.get(i), list));
            return kt8VarO instanceof gt8 ? kt8VarO : o(bp3Var, arrayList, i2, list);
        }
        LinkedHashSet linkedHashSetE = b5j.e((Set) bp3Var.f, list);
        linkedHashSetE.toString();
        Objects.toString((List) bp3Var.h);
        ArrayList arrayList2 = new ArrayList(k95.o(linkedHashSetE, 10));
        Iterator it = linkedHashSetE.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h5a) it.next()).a());
        }
        Iterator it2 = CollectionsKt.F(arrayList2).iterator();
        while (true) {
            byte b = 1;
            if (it2.hasNext()) {
                vt8 vt8Var = (vt8) it2.next();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : linkedHashSetE) {
                    if (((h5a) obj).a() == vt8Var) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.size() > 1) {
                    break;
                }
            } else {
                xd4 xd4Var = (xd4) this.b;
                wth wthVar = new wth(linkedHashSetE, b);
                xd4Var.getClass();
                Iterator it3 = linkedHashSetE.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        h5a h5aVar = (h5a) it3.next();
                        if (!h5aVar.b(bp3Var, xd4Var)) {
                            h5aVar.toString();
                            break;
                        }
                    } else {
                        try {
                            y7h.j(xd4Var, bp3Var, wthVar);
                            return new gt8(new wth(linkedHashSetE, b));
                        } catch (IllegalArgumentException | kg4 unused) {
                        }
                    }
                }
            }
        }
        return ht8.a;
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        if (v84Var.isCanceled()) {
            return;
        }
        vml.c(new xi2(this, iOException, (byte) 1));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        try {
            String strString = pzhVar.g.string();
            if (pzhVar.q) {
                try {
                    ((yi2) this.b).d(strString);
                } catch (JSONException unused) {
                    vml.c(new bi2(this, "Invalid JSON: " + strString, (byte) 3));
                }
            } else {
                vml.c(new bi2(this, pzhVar, (byte) 4));
            }
        } catch (IOException e) {
            vml.c(new xi2(this, e, (byte) 0));
        }
    }

    public final boolean p(itd itdVar) {
        Window.Callback callback;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ne neVar = (ne) obj;
                if (itdVar != neVar.c) {
                    ptd ptdVar = ((akk) itdVar).B;
                    kud kudVar = neVar.e;
                    if (kudVar != null) {
                        return kudVar.p(itdVar);
                    }
                }
                return false;
            default:
                xp1 xp1Var = (xp1) obj;
                if (itdVar != itdVar.k() || !xp1Var.E || (callback = xp1Var.l.getCallback()) == null || xp1Var.P) {
                    return true;
                }
                callback.onMenuOpened(108, itdVar);
                return true;
        }
    }

    public final void s(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((na3) this.b).b(0);
    }

    public final long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        ((uk5) this.b).run(new rw7(Collections.singletonList(new dzh("Wallpaper"))));
    }

    public final void x(st stVar, boolean z, gt gtVar) {
        orm ormVar = (orm) this.b;
        if (!z) {
            String strT = t(gtVar);
            x5f x5fVar = (x5f) ormVar;
            if (x5fVar.h) {
                x5fVar.j(2, strT, false);
                return;
            }
            return;
        }
        String strT2 = t(gtVar);
        x5f x5fVar2 = (x5f) ormVar;
        if (x5fVar2.h) {
            x5fVar2.j(1, strT2, false);
        }
        if (gtVar == gt.f) {
            ip0 ip0Var = null;
            switch (stVar.e.ordinal()) {
                case 0:
                    ip0Var = ip0.t;
                    break;
                case 1:
                    Set set = stVar.f;
                    kq8 kq8Var = set != null ? (kq8) CollectionsKt.X(set, uih.a) : null;
                    switch (kq8Var == null ? -1 : wt.a[kq8Var.ordinal()]) {
                        case -1:
                            break;
                        case 0:
                        default:
                            h9o.p();
                            return;
                        case 1:
                            ip0Var = ip0.b;
                            break;
                        case 2:
                            ip0Var = ip0.c;
                            break;
                        case 3:
                            ip0Var = ip0.n;
                            break;
                        case 4:
                            ip0Var = ip0.d;
                            break;
                        case 5:
                            ip0Var = ip0.l;
                            break;
                        case 6:
                            ip0Var = ip0.m;
                            break;
                        case 7:
                            ip0Var = ip0.o;
                            break;
                        case 8:
                            ip0Var = ip0.j;
                            break;
                        case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                            ip0Var = ip0.e;
                            break;
                        case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                            ip0Var = ip0.f;
                            break;
                        case 11:
                            ip0Var = ip0.g;
                            break;
                        case 12:
                            ip0Var = ip0.k;
                            break;
                        case 13:
                            ip0Var = ip0.h;
                            break;
                        case 14:
                            ip0Var = ip0.i;
                            break;
                    }
                case 2:
                case 4:
                case 8:
                    break;
                case 3:
                    ip0Var = ip0.s;
                    break;
                case 5:
                    ip0Var = ip0.r;
                    break;
                case 6:
                    ip0Var = ip0.v;
                    break;
                case 7:
                    ip0Var = ip0.u;
                    break;
                default:
                    h9o.p();
                    return;
            }
            if (ip0Var != null) {
                x5fVar2.u(ip0Var);
            }
        }
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        ((uk5) this.b).run(new sw7(Unit.a));
    }
}
