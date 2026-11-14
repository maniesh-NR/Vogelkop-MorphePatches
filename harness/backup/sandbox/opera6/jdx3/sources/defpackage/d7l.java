package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d7l implements b2l {
    public final z4k a;
    public final b7l b;
    public final aal c;
    public final tw2 d;
    public final w6j e;
    public final wci f;
    public final h7f g;
    public final xbf h;
    public final iga i;
    public e7l j;
    public boolean k;
    public final lqm l;
    public boolean m;

    public d7l(ilj iljVar, d7l d7lVar) {
        this.a = new z4k((Object) this, (byte) 5);
        b7l b7lVar = new b7l(this);
        this.b = b7lVar;
        this.g = new h7f();
        aal aalVar = d7lVar.c;
        this.c = aalVar;
        this.d = d7lVar.d;
        this.e = new w6j(this, d7lVar.e);
        this.h = d7lVar.h;
        this.f = new wci(this, aalVar, (byte) 6);
        this.i = d7lVar.i;
        this.j = iljVar;
        this.l = lqm.l;
        iljVar.a.b(b7lVar);
    }

    public d7l(xbf xbfVar, ilj iljVar, tw2 tw2Var, aal aalVar, iga igaVar, rc6 rc6Var, lqm lqmVar) {
        this.a = new z4k((Object) this, (byte) 5);
        b7l b7lVar = new b7l(this);
        this.b = b7lVar;
        this.g = new h7f();
        this.c = aalVar;
        this.d = tw2Var;
        this.e = new w6j(this, rc6Var);
        this.h = xbfVar;
        this.f = new wci(this, aalVar, (byte) 6);
        this.i = igaVar;
        this.j = iljVar;
        this.l = lqmVar;
        iljVar.a.b(b7lVar);
    }

    public d7l(xbf xbfVar, uy3 uy3Var, tw2 tw2Var, aal aalVar, iga igaVar, rc6 rc6Var, lqm lqmVar) {
        z4k z4kVar = new z4k((Object) this, (byte) 5);
        this.a = z4kVar;
        b7l b7lVar = new b7l(this);
        this.b = b7lVar;
        this.g = new h7f();
        this.c = aalVar;
        this.d = tw2Var;
        this.e = new w6j(this, rc6Var);
        this.h = xbfVar;
        wci wciVar = new wci(this, aalVar, (byte) 6);
        this.f = wciVar;
        this.i = igaVar;
        this.j = uy3Var;
        this.l = lqmVar;
        uy3Var.w(b7lVar);
        uy3Var.b.p = wciVar;
        uy3Var.c = z4kVar;
        this.k = true;
    }

    @Override // defpackage.b9l
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.b9l
    public final int B() {
        throw null;
    }

    @Override // defpackage.b9l
    public final void C(boolean z, boolean z2, Callback callback) {
        int i;
        int i2;
        knf knfVarH = this.e.h();
        if (knfVarH != null) {
            knfVarH.r();
            OperaPageRootView view = knfVarH.getView();
            mnf mnfVar = (mnf) knfVarH.B().g();
            if (z) {
                i = mnfVar.a;
                i2 = 0;
            } else {
                i2 = mnfVar.a;
                i = 0;
            }
            int i3 = z2 ? 0 : mnfVar.b;
            view.isAttachedToWindow();
            Canvas canvas = new Canvas();
            int width = view.getWidth();
            int height = view.getHeight() - i2;
            Bitmap bitmapU = z5i.u(width, height, Bitmap.Config.ARGB_8888);
            if (bitmapU == null) {
                knfVarH.E();
                callback.run(null);
            } else {
                if (height != view.getHeight()) {
                    canvas.clipRect(0, 0, width, height);
                }
                canvas.setBitmap(bitmapU);
                canvas.translate(0.0f, -i2);
                j14.x = canvas;
                try {
                    view.draw(canvas);
                    j14.x = null;
                    knfVarH.E();
                    callback.run(yni.a(bitmapU, i, i3));
                } catch (Throwable th) {
                    j14.x = null;
                    throw th;
                }
            }
        }
        if (knfVarH != null) {
            return;
        }
        this.j.C(z, z2, callback);
    }

    @Override // defpackage.b9l
    public final hh4 D(Runnable runnable) {
        throw null;
    }

    @Override // defpackage.b9l
    public final void E(int i, boolean z, Callback callback) {
        this.j.E(i, z, callback);
    }

    @Override // defpackage.b9l
    public final String G() {
        throw null;
    }

    @Override // defpackage.b9l
    public final String I() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean J() {
        return !n0() && this.j.J();
    }

    @Override // defpackage.b9l
    public final int K() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean M(boolean z) {
        return this.j.M(z);
    }

    @Override // defpackage.b9l
    public final void N() {
        this.j.N();
    }

    @Override // defpackage.b9l
    public final boolean O() {
        return ((knf) this.e.d) != null || this.j.O();
    }

    @Override // defpackage.b9l
    public final int P() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean Q(Callback callback) {
        throw null;
    }

    @Override // defpackage.b9l
    public final zg R() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean S() {
        throw null;
    }

    @Override // defpackage.b9l
    public final vz5 U() {
        throw null;
    }

    @Override // defpackage.b9l
    public final void V() {
        knf knfVar = (knf) this.e.d;
        if (knfVar != null) {
            knfVar.u();
        }
        this.j.V();
    }

    public final void W(boolean z) {
        knf knfVar = (knf) this.e.d;
        if (knfVar != null) {
            if (z) {
                knfVar.F();
            } else {
                knfVar.a();
            }
        }
        if (!this.k && !wqm.w(this.j.getUrl())) {
            r0(true);
        }
        this.j.W(z);
        h7f h7fVar = this.g;
        if (z) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((a2l) g7fVarH.next()).G(this);
            }
        } else {
            g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
            while (g7fVarH2.hasNext()) {
                ((a2l) g7fVarH2.next()).S(this);
            }
        }
    }

    @Override // defpackage.b9l
    public final void X() {
        this.j.X();
    }

    @Override // defpackage.b9l
    public final int Y() {
        throw null;
    }

    public final void Z(lsc lscVar) {
        if (this.k) {
            this.j.Z(lscVar);
            return;
        }
        boolean zW = wqm.w(lscVar.a);
        e7l e7lVar = this.j;
        if (zW) {
            e7lVar.Z(lscVar);
            return;
        }
        boolean zIsActive = e7lVar.isActive();
        r0(false);
        this.j.Z(lscVar);
        if (zIsActive) {
            this.j.W(true);
        }
    }

    @Override // defpackage.b9l
    public final TabInfo a() {
        throw null;
    }

    @Override // defpackage.b9l
    public final void b() {
        w6j w6jVar = this.e;
        knf knfVar = (knf) w6jVar.d;
        if (knfVar != null) {
            knfVar.y();
        }
        if (((knf) w6jVar.d) != null) {
            return;
        }
        this.j.b();
    }

    @Override // defpackage.b9l
    public final qwi b0() {
        throw null;
    }

    @Override // defpackage.b9l
    public final void c() {
        iuh iuhVar = (iuh) i();
        NavigationHistory navigationHistory = (NavigationHistory) iuhVar.b;
        if (navigationHistory.d() > 0) {
            int id = iuhVar.i(navigationHistory.j()).getId();
            w6j w6jVar = this.e;
            SparseArray sparseArray = (SparseArray) w6jVar.c;
            SparseArray sparseArray2 = (SparseArray) w6jVar.b;
            knf knfVar = (knf) sparseArray2.get(id);
            sparseArray2.clear();
            if (knfVar != null) {
                sparseArray2.put(id, knfVar);
            }
            Parcelable parcelable = (Parcelable) sparseArray.get(id);
            sparseArray.clear();
            if (parcelable != null) {
                sparseArray.put(id, parcelable);
            }
        }
        this.j.c();
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).r(this);
        }
    }

    @Override // defpackage.b9l
    public final boolean c0() {
        throw null;
    }

    @Override // defpackage.b9l
    public final void d() {
        this.j.d();
    }

    @Override // defpackage.b9l
    public final void d0(String str, boolean z, Callback callback) {
        this.j.d0(str, z, callback);
    }

    @Override // defpackage.b9l
    public final void dispose() {
        this.m = true;
        this.j.dispose();
        w6j w6jVar = this.e;
        ((SparseArray) w6jVar.b).clear();
        ((SparseArray) w6jVar.c).clear();
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).R(this);
        }
    }

    @Override // defpackage.w6f
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void F(a2l a2lVar) {
        this.g.b(a2lVar);
    }

    @Override // defpackage.b9l
    public final boolean f() {
        return !this.m && this.j.f();
    }

    public final String f0() {
        return UrlMangler.a(this.j.getUrl(), "article_id");
    }

    @Override // defpackage.b9l
    public final boolean g() {
        throw null;
    }

    public final String g0() {
        knf knfVarH = this.e.h();
        return knfVarH != null ? knfVarH.z() : BrowserUtils.getDisplayString(this.j.getUrl());
    }

    @Override // defpackage.b9l
    public final int getId() {
        return this.j.getId();
    }

    @Override // defpackage.b9l
    public final String getUrl() {
        throw null;
    }

    public final String h0() {
        return BrowserUtils.getExternalUrlWithFallback(this.j.getUrl());
    }

    @Override // defpackage.b9l
    public final NavigationHistory i() {
        return new iuh(this, this.j.i());
    }

    public final String i0() {
        return BrowserUtils.getRendererUrl(this.j.getUrl());
    }

    @Override // defpackage.b9l
    public final boolean isActive() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean isAudioMuted() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean isLoading() {
        throw null;
    }

    public final long j0() {
        zg zgVarB = BrowserUtils.b(this.j.getUrl());
        if (zgVarB == null) {
            return -1L;
        }
        q6e q6eVar = eti.a;
        eri eriVar = null;
        if (q6eVar != null) {
            String string = ((Uri) ((zg) zgVarB.c).b).toString();
            ArrayList arrayList = q6eVar.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                eri eriVar2 = (eri) obj;
                if (string.equals(eriVar2.getUrl())) {
                    eriVar = eriVar2;
                    break;
                }
            }
        }
        if (eriVar != null) {
            return eriVar.getId();
        }
        return -1L;
    }

    @Override // defpackage.b9l
    public final void k(boolean z) {
        this.j.k(z);
    }

    public final String k0() {
        String url = this.j.getUrl();
        String strA = UrlMangler.a(url, "article_share_url");
        return TextUtils.isEmpty(strA) ? BrowserUtils.getExternalUrlWithFallback(url) : strA;
    }

    public final String l0() {
        return (String) t().get();
    }

    @Override // defpackage.b9l
    public final boolean m() {
        return this.j.m();
    }

    public final yul m0() {
        if (!this.j.isLoading() && n0()) {
            knf knfVar = (knf) this.e.d;
            return knfVar == null ? yul.e : knfVar.x();
        }
        return yul.d;
    }

    @Override // defpackage.b9l
    public final boolean n() {
        return !this.m && this.j.n();
    }

    public final boolean n0() {
        return this.i.g(this.j.getUrl());
    }

    @Override // defpackage.b9l
    public final void o() {
        w6j w6jVar = this.e;
        knf knfVar = (knf) w6jVar.d;
        if (knfVar != null) {
            knfVar.o();
        }
        if (((knf) w6jVar.d) != null) {
            return;
        }
        this.j.o();
    }

    public final boolean o0() {
        return ((knf) this.e.d) != null;
    }

    @Override // defpackage.b9l
    public final void p() {
        w6j w6jVar = this.e;
        knf knfVar = (knf) w6jVar.d;
        if (knfVar != null) {
            knfVar.y();
        }
        if (((knf) w6jVar.d) != null) {
            return;
        }
        this.j.p();
    }

    public final void p0() {
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).q(this);
        }
    }

    @Override // defpackage.b9l
    public final void q() {
        w6j w6jVar = this.e;
        knf knfVar = (knf) w6jVar.d;
        if (knfVar != null) {
            knfVar.q();
        }
        if (((knf) w6jVar.d) != null) {
            return;
        }
        this.j.q();
    }

    public final void q0(int i, Runnable runnable) {
        if (this.k) {
            runnable.run();
            return;
        }
        NavigationHistory navigationHistoryI = this.j.i();
        if (wqm.w(navigationHistoryI.i(navigationHistoryI.j() + i).getUrl())) {
            runnable.run();
            return;
        }
        boolean zIsActive = this.j.isActive();
        r0(false);
        runnable.run();
        if (zIsActive) {
            this.j.W(true);
        }
    }

    @Override // defpackage.b9l
    public final boolean r() {
        throw null;
    }

    public final void r0(boolean z) {
        HashMap map = new HashMap();
        ilj iljVar = (ilj) this.j;
        vzk vzkVar = iljVar.b;
        int i = iljVar.e;
        TabInfo tabInfo = iljVar.f;
        jke jkeVar = iljVar.c;
        ChromiumContent chromiumContentA = ((hz4) vzkVar.b).a(iljVar.d, null);
        jkeVar.B(chromiumContentA, i, map);
        uy3 uy3Var = new uy3(vzkVar, chromiumContentA, i, tabInfo);
        w6j w6jVar = this.e;
        SparseArray sparseArray = (SparseArray) w6jVar.b;
        SparseArray sparseArrayClone = sparseArray.clone();
        sparseArray.clear();
        for (int i2 = 0; i2 < sparseArrayClone.size(); i2++) {
            Integer num = (Integer) map.get(Integer.valueOf(sparseArrayClone.keyAt(i2)));
            if (num != null) {
                sparseArray.append(num.intValue(), (knf) sparseArrayClone.valueAt(i2));
            }
        }
        SparseArray sparseArray2 = (SparseArray) w6jVar.c;
        SparseArray sparseArrayClone2 = sparseArray2.clone();
        sparseArray2.clear();
        for (int i3 = 0; i3 < sparseArrayClone2.size(); i3++) {
            Integer num2 = (Integer) map.get(Integer.valueOf(sparseArrayClone2.keyAt(i3)));
            if (num2 != null) {
                sparseArray2.append(num2.intValue(), (Parcelable) sparseArrayClone2.valueAt(i3));
            }
        }
        uy3Var.w(this.b);
        uy3Var.b.p = this.f;
        uy3Var.c = this.a;
        if (z && this.j.isActive()) {
            uy3Var.W(true);
        }
        this.j = uy3Var;
        this.k = true;
    }

    @Override // defpackage.b9l
    public final boolean s(TabInfo tabInfo) {
        return this.j.s(tabInfo);
    }

    @Override // defpackage.w6f
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final void H(a2l a2lVar) {
        this.g.c(a2lVar);
    }

    @Override // defpackage.b9l
    public final void setAudioMuted(boolean z) {
        if (!this.k) {
            r0(true);
        }
        this.j.setAudioMuted(z);
    }

    @Override // defpackage.b9l
    public final void show() {
        this.j.show();
    }

    @Override // defpackage.b9l
    public final esk t() {
        knf knfVarH = this.e.h();
        return knfVarH != null ? new sy3(knfVarH.n(), (byte) 0) : new b59(this);
    }

    @Override // defpackage.b9l
    public final void u() {
        this.j.u();
    }

    @Override // defpackage.b9l
    public final boolean v() {
        knf knfVar = (knf) this.e.d;
        return knfVar != null ? knfVar.w() : this.j.v();
    }

    @Override // defpackage.b9l
    public final boolean x(Uri uri, Callback callback) {
        throw null;
    }

    @Override // defpackage.b9l
    public final t59 y() {
        throw null;
    }

    @Override // defpackage.b9l
    public final boolean z() {
        throw null;
    }
}
