package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.api.Callback;
import java.util.Collections;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class ilj implements e7l {
    public final h7f a;
    public final vzk b;
    public final jke c;
    public final boolean d;
    public final int e;
    public TabInfo f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;

    public ilj(vzk vzkVar, int i, TabInfo tabInfo, iuh iuhVar, boolean z) {
        this.a = new h7f();
        this.j = Integer.MIN_VALUE;
        this.b = vzkVar;
        this.c = new ike(iuhVar);
        this.d = z;
        this.e = i;
        this.f = tabInfo;
    }

    public ilj(vzk vzkVar, int i, TabInfo tabInfo, boolean z, lsc lscVar) {
        this.a = new h7f();
        this.j = Integer.MIN_VALUE;
        this.b = vzkVar;
        this.c = new ike(-1);
        this.d = z;
        this.e = i;
        this.f = tabInfo;
        if (lscVar != null) {
            F(lscVar);
        }
    }

    public ilj(vzk vzkVar, jke jkeVar, int i, TabInfo tabInfo) {
        this.a = new h7f();
        this.j = Integer.MIN_VALUE;
        this.b = vzkVar;
        this.c = jkeVar;
        this.d = false;
        this.e = i;
        this.f = tabInfo;
    }

    public ilj(vzk vzkVar, jke jkeVar, boolean z, int i, TabInfo tabInfo, lsc lscVar) {
        this.a = new h7f();
        this.j = Integer.MIN_VALUE;
        this.b = vzkVar;
        this.c = jkeVar;
        this.d = z;
        this.e = i;
        this.f = tabInfo;
        if (lscVar != null) {
            F(lscVar);
        }
    }

    @Override // defpackage.b9l
    public final boolean A() {
        return false;
    }

    @Override // defpackage.b9l
    public final int B() {
        return 8;
    }

    @Override // defpackage.b9l
    public final void C(boolean z, boolean z2, Callback callback) {
        callback.run(null);
    }

    @Override // defpackage.b9l
    public final hh4 D(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // defpackage.b9l
    public final void E(int i, boolean z, Callback callback) {
        callback.run("");
    }

    public final void F(lsc lscVar) {
        jke jkeVar = this.c;
        jkeVar.u();
        int i = this.j + 1;
        this.j = i;
        jkeVar.X(new hlj(i, lscVar), true);
    }

    @Override // defpackage.b9l
    public final String G() {
        return "";
    }

    @Override // defpackage.b9l
    public final String I() {
        return this.i;
    }

    @Override // defpackage.b9l
    public final boolean J() {
        return !this.d;
    }

    @Override // defpackage.b9l
    public final int K() {
        return 0;
    }

    @Override // defpackage.b9l
    public final boolean M(boolean z) {
        return false;
    }

    @Override // defpackage.b9l
    public final void N() {
    }

    @Override // defpackage.b9l
    public final boolean O() {
        return false;
    }

    @Override // defpackage.b9l
    public final int P() {
        return 0;
    }

    @Override // defpackage.b9l
    public final boolean Q(Callback callback) {
        return false;
    }

    @Override // defpackage.b9l
    public final zg R() {
        return null;
    }

    @Override // defpackage.b9l
    public final boolean S() {
        return true;
    }

    @Override // defpackage.b9l
    public final vz5 U() {
        return null;
    }

    @Override // defpackage.b9l
    public final void V() {
    }

    @Override // defpackage.e7l
    public final void W(boolean z) {
        this.g = z;
        if (z) {
            h(0);
        }
    }

    @Override // defpackage.b9l
    public final void X() {
    }

    @Override // defpackage.b9l
    public final int Y() {
        return 0;
    }

    @Override // defpackage.e7l
    public final void Z(lsc lscVar) {
        String str = lscVar.a;
        this.h = true;
        this.i = str;
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((b7l) g7fVarH.next()).b();
        }
        try {
            GURL gurl = new GURL(str);
            NavigationHandle navigationHandleW = w(gurl);
            F(lscVar);
            h7fVar.getClass();
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                b7l b7lVar = (b7l) g7fVar.next();
                d7l d7lVar = b7lVar.a;
                h7f h7fVar2 = d7lVar.g;
                h7fVar2.getClass();
                g7f g7fVar2 = new g7f(h7fVar2);
                while (g7fVar2.hasNext()) {
                    ((a2l) g7fVar2.next()).p(d7lVar);
                }
                d7l d7lVar2 = b7lVar.a;
                h7f h7fVar3 = d7lVar2.g;
                h7fVar3.getClass();
                g7f g7fVar3 = new g7f(h7fVar3);
                while (g7fVar3.hasNext()) {
                    ((a2l) g7fVar3.next()).x(d7lVar2);
                }
            }
            navigationHandleW.didFinish(gurl, false, true, true, false, false, 0, 0, "", 0, false, false, "", null, false, Collections.EMPTY_MAP, 0);
            h7fVar.getClass();
            g7f g7fVar4 = new g7f(h7fVar);
            while (g7fVar4.hasNext()) {
                ((b7l) g7fVar4.next()).a(navigationHandleW);
            }
            this.h = false;
            this.i = null;
            g7f g7fVar5 = new g7f(h7fVar);
            while (g7fVar5.hasNext()) {
                ((b7l) g7fVar5.next()).d();
            }
        } finally {
        }
    }

    @Override // defpackage.b9l
    public final TabInfo a() {
        return this.f;
    }

    @Override // defpackage.e7l
    public final WindowAndroid a0() {
        return null;
    }

    @Override // defpackage.b9l
    public final void b() {
    }

    @Override // defpackage.b9l
    public final qwi b0() {
        return qwi.a();
    }

    @Override // defpackage.b9l
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.b9l
    public final boolean c0() {
        return false;
    }

    @Override // defpackage.b9l
    public final void d() {
    }

    @Override // defpackage.b9l
    public final void d0(String str, boolean z, Callback callback) {
        callback.run(null);
    }

    @Override // defpackage.b9l
    public final void dispose() {
    }

    @Override // defpackage.e7l
    public final void e() {
        h(-1);
    }

    @Override // defpackage.b9l
    public final boolean f() {
        jke jkeVar = this.c;
        return !jkeVar.isDestroyed() && jkeVar.j() > 0;
    }

    @Override // defpackage.b9l
    public final boolean g() {
        return false;
    }

    @Override // defpackage.b9l
    public final int getId() {
        return this.e;
    }

    @Override // defpackage.b9l
    public final String getUrl() {
        jke jkeVar = this.c;
        return (jkeVar.isDestroyed() ? SessionStore.h : jkeVar.i(jkeVar.j())).d();
    }

    @Override // defpackage.e7l
    public final void h(int i) {
        jke jkeVar = this.c;
        String url = jkeVar.i(jkeVar.j() + i).getUrl();
        this.h = true;
        this.i = url;
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((b7l) g7fVarH.next()).b();
        }
        try {
            GURL gurl = new GURL(url);
            NavigationHandle navigationHandleW = w(gurl);
            jkeVar.l(jkeVar.j() + i);
            h7fVar.getClass();
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                b7l b7lVar = (b7l) g7fVar.next();
                d7l d7lVar = b7lVar.a;
                h7f h7fVar2 = d7lVar.g;
                h7fVar2.getClass();
                g7f g7fVar2 = new g7f(h7fVar2);
                while (g7fVar2.hasNext()) {
                    ((a2l) g7fVar2.next()).p(d7lVar);
                }
                d7l d7lVar2 = b7lVar.a;
                h7f h7fVar3 = d7lVar2.g;
                h7fVar3.getClass();
                g7f g7fVar3 = new g7f(h7fVar3);
                while (g7fVar3.hasNext()) {
                    ((a2l) g7fVar3.next()).x(d7lVar2);
                }
            }
            navigationHandleW.didFinish(gurl, false, true, true, false, false, 0, 0, "", 0, false, false, "", null, false, Collections.EMPTY_MAP, 0);
            g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
            while (g7fVarH2.hasNext()) {
                ((b7l) g7fVarH2.next()).a(navigationHandleW);
            }
            this.h = false;
            this.i = null;
            g7f g7fVar4 = new g7f(h7fVar);
            while (g7fVar4.hasNext()) {
                ((b7l) g7fVar4.next()).d();
            }
        } finally {
        }
    }

    @Override // defpackage.b9l
    public final NavigationHistory i() {
        jke jkeVar = this.c;
        ike ikeVar = new ike(jkeVar.j());
        for (int i = 0; i < jkeVar.d(); i++) {
            ikeVar.X(jkeVar.i(i), false);
        }
        return ikeVar;
    }

    @Override // defpackage.b9l
    public final boolean isActive() {
        return this.g;
    }

    @Override // defpackage.b9l
    public final boolean isAudioMuted() {
        return false;
    }

    @Override // defpackage.b9l
    public final boolean isLoading() {
        return this.h;
    }

    @Override // defpackage.e7l
    public final boolean j(int i, int i2) {
        return false;
    }

    @Override // defpackage.b9l
    public final void k(boolean z) {
    }

    @Override // defpackage.e7l
    public final void l() {
        h(1);
    }

    @Override // defpackage.b9l
    public final boolean m() {
        return this.d;
    }

    @Override // defpackage.b9l
    public final boolean n() {
        jke jkeVar = this.c;
        return !jkeVar.isDestroyed() && jkeVar.j() + 1 < jkeVar.d();
    }

    @Override // defpackage.b9l
    public final void o() {
    }

    @Override // defpackage.b9l
    public final void p() {
    }

    @Override // defpackage.b9l
    public final void q() {
    }

    @Override // defpackage.b9l
    public final boolean r() {
        return false;
    }

    @Override // defpackage.b9l
    public final boolean s(TabInfo tabInfo) {
        if (this.f.equals(tabInfo)) {
            return false;
        }
        TabInfo tabInfo2 = this.f;
        this.f = tabInfo;
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            d7l d7lVar = ((b7l) g7fVarH.next()).a;
            h7f h7fVar2 = d7lVar.g;
            g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
            while (g7fVarH2.hasNext()) {
                ((a2l) g7fVarH2.next()).T(d7lVar, tabInfo2);
            }
        }
        return true;
    }

    @Override // defpackage.b9l
    public final void setAudioMuted(boolean z) {
    }

    @Override // defpackage.b9l
    public final void show() {
    }

    @Override // defpackage.b9l
    public final esk t() {
        jke jkeVar = this.c;
        String title = (jkeVar.isDestroyed() ? SessionStore.h : jkeVar.i(jkeVar.j())).getTitle();
        return !TextUtils.isEmpty(title) ? new sy3(title, (byte) 0) : new sy3(getUrl(), (byte) 1);
    }

    @Override // defpackage.b9l
    public final void u() {
    }

    @Override // defpackage.b9l
    public final boolean v() {
        return false;
    }

    public final NavigationHandle w(GURL gurl) {
        NavigationHandle navigationHandle = new NavigationHandle(0L, gurl, false, false, false, false, false, false);
        GURL gurl2 = zs9.a;
        navigationHandle.didStart(gurl2, 1, gurl2, true, false, null, 0, false, false, false, false, 0L, false, false, "", 0L, null);
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((b7l) g7fVarH.next()).c(navigationHandle);
        }
        return navigationHandle;
    }

    @Override // defpackage.b9l
    public final boolean x(Uri uri, Callback callback) {
        return false;
    }

    @Override // defpackage.b9l
    public final t59 y() {
        return null;
    }

    @Override // defpackage.b9l
    public final boolean z() {
        return false;
    }
}
