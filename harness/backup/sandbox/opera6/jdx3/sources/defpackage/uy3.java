package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.SecurityInfo;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.favorites.SpeedDialDataFetcher;
import com.opera.android.webapps.AddToHomescreenDataFetcherNative;
import com.opera.api.Callback;
import java.util.HashMap;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class uy3 implements e7l {
    public static final HashMap g = new HashMap();
    public final h7f a = new h7f();
    public final ChromiumContent b;
    public z4k c;
    public final vzk d;
    public TabInfo e;
    public boolean f;

    public uy3(vzk vzkVar, ChromiumContent chromiumContent, int i, TabInfo tabInfo) {
        ty3 ty3Var = new ty3(this, (byte) 0);
        this.d = vzkVar;
        this.b = chromiumContent;
        chromiumContent.m = new ole(this);
        chromiumContent.k(ty3Var);
        chromiumContent.i = i;
        chromiumContent.z.f();
        g.put(Integer.valueOf(i), this);
        this.e = tabInfo;
    }

    public static uy3 F(b9l b9lVar) {
        return (uy3) g.get(Integer.valueOf(b9lVar.getId()));
    }

    public static ChromiumContent H(b2l b2lVar) {
        uy3 uy3VarF = F(b2lVar);
        if (uy3VarF != null) {
            return uy3VarF.b;
        }
        return null;
    }

    @Override // defpackage.b9l
    public final boolean A() {
        long j = this.b.n;
        return j != 0 && N.Msp1FMud(j);
    }

    @Override // defpackage.b9l
    public final int B() {
        NavigationController navigationControllerQ = this.b.e().q();
        int iT = navigationControllerQ.t();
        if (iT >= 0) {
            return navigationControllerQ.i(iT).d;
        }
        return 0;
    }

    @Override // defpackage.b9l
    public final void C(boolean z, boolean z2, Callback callback) {
        if (z || z2) {
            callback.run(null);
            return;
        }
        ChromiumContent chromiumContent = this.b;
        N.MGbhXOWD(chromiumContent.n, new tt2(callback, chromiumContent.o.g() + chromiumContent.o.h(), (byte) 2));
    }

    @Override // defpackage.b9l
    public final hh4 D(Runnable runnable) {
        return ((j5m) ((kze) this.b.q().f).g()).a(runnable);
    }

    @Override // defpackage.b9l
    public final void E(int i, boolean z, Callback callback) {
        N.MiC4wbtM(this.b.n, i, z, callback);
    }

    @Override // defpackage.b9l
    public final String G() {
        return (String) N.MA_5vIay(this.b.n);
    }

    @Override // defpackage.b9l
    public final String I() {
        return this.b.n();
    }

    @Override // defpackage.b9l
    public final boolean J() {
        return !this.b.t;
    }

    @Override // defpackage.b9l
    public final int K() {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.x == null) {
            return 0;
        }
        np1 np1Var = chromiumContent.H;
        if (!np1Var.a) {
            return 0;
        }
        r4h r4hVar = (r4h) np1Var.d;
        return ((r4hVar.c == 100 ? 10000 : r4hVar.f) * 100) / 10000;
    }

    @Override // defpackage.b9l
    public final boolean M(boolean z) {
        ChromiumContent chromiumContent = this.b;
        return chromiumContent.o.r(chromiumContent, z);
    }

    @Override // defpackage.b9l
    public final void N() {
        ChromiumContent chromiumContent = this.b;
        WebContents webContentsF = chromiumContent.f();
        if (webContentsF != null) {
            webContentsF.p0();
            webContentsF.setAudioMuted(true);
        }
        ard ardVar = chromiumContent.z;
        if (ardVar != null) {
            ardVar.c();
        }
    }

    @Override // defpackage.b9l
    public final boolean O() {
        long j = this.b.a;
        return j != 0 && N.MWxyiKiL(j);
    }

    @Override // defpackage.b9l
    public final int P() {
        return N.MV0r1H9h(this.b.e());
    }

    @Override // defpackage.b9l
    public final boolean Q(Callback callback) {
        N.M30rDk55(this.b.e(), callback);
        return true;
    }

    @Override // defpackage.b9l
    public final zg R() {
        return this.b.A;
    }

    @Override // defpackage.b9l
    public final boolean S() {
        return this.f;
    }

    @Override // defpackage.b9l
    public final vz5 U() {
        return this.b.q();
    }

    @Override // defpackage.b9l
    public final void V() {
        this.b.e().stop();
    }

    @Override // defpackage.e7l
    public final void W(boolean z) {
        this.b.z(z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, dx3] */
    @Override // defpackage.b9l
    public final void X() {
        ChromiumContent chromiumContent = this.b;
        if (N.MhKYEP1z(chromiumContent.e())) {
            return;
        }
        ?? C = chromiumContent.c();
        z77 z77VarU = sfe.U((Context) C);
        umi umiVar = vml.d;
        WebContents webContentsE = chromiumContent.e();
        mv mvVar = new mv(z5i.b0(webContentsE.s()) ? new hd((dx3) C, umiVar, webContentsE.s().g()) : new AddToHomescreenDataFetcherNative(C, umiVar, webContentsE), (byte) 0);
        z77VarU.getClass();
        z77VarU.b(mvVar, ijm.b);
    }

    @Override // defpackage.b9l
    public final int Y() {
        return N.M$CFPNhV(this.b.e());
    }

    @Override // defpackage.e7l
    public final void Z(lsc lscVar) {
        this.b.v(lscVar);
    }

    @Override // defpackage.b9l
    public final TabInfo a() {
        return this.e;
    }

    @Override // defpackage.e7l
    public final WindowAndroid a0() {
        return this.b.b;
    }

    @Override // defpackage.b9l
    public final void b() {
        this.b.x(false);
    }

    @Override // defpackage.b9l
    public final qwi b0() {
        ChromiumContent chromiumContent = this.b;
        return new qwi(chromiumContent.o(), new hwi((SecurityInfo) N.MCHF1Vfr(chromiumContent.n)));
    }

    @Override // defpackage.b9l
    public final void c() {
        this.b.d().c();
    }

    @Override // defpackage.b9l
    public final boolean c0() {
        ChromiumContent chromiumContent = this.b;
        return chromiumContent.o.n(chromiumContent);
    }

    @Override // defpackage.b9l
    public final void d() {
        this.b.s();
    }

    @Override // defpackage.b9l
    public final void d0(String str, boolean z, Callback callback) {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            callback.run(null);
            return;
        }
        WebContents webContentsE = chromiumContent.e();
        Context context = chromiumContent.getView().getContext();
        int iE = nr8.e(context);
        if (N.M4P_efwZ(webContentsE)) {
            return;
        }
        new SpeedDialDataFetcher(webContentsE, str, z ? 1 : 0, context, iE, callback);
    }

    @Override // defpackage.b9l
    public final void dispose() {
        ChromiumContent chromiumContent = this.b;
        g.remove(Integer.valueOf(chromiumContent.i));
        chromiumContent.l();
    }

    @Override // defpackage.e7l
    public final void e() {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            return;
        }
        NavigationController navigationControllerD = chromiumContent.d();
        if (navigationControllerD.f()) {
            navigationControllerD.e();
        }
    }

    @Override // defpackage.b9l
    public final boolean f() {
        ChromiumContent chromiumContent = this.b;
        return !chromiumContent.h() && chromiumContent.d().f();
    }

    @Override // defpackage.b9l
    public final boolean g() {
        return this.b.d().g();
    }

    @Override // defpackage.b9l
    public final int getId() {
        return this.b.i;
    }

    @Override // defpackage.b9l
    public final String getUrl() {
        return this.b.r();
    }

    @Override // defpackage.e7l
    public final void h(int i) {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            return;
        }
        NavigationController navigationControllerD = chromiumContent.d();
        if (navigationControllerD.s(i)) {
            navigationControllerD.h(i);
        }
    }

    @Override // defpackage.b9l
    public final NavigationHistory i() {
        return new lld((Object) this.b.e(), (byte) 5);
    }

    @Override // defpackage.b9l
    public final boolean isActive() {
        return this.b.r;
    }

    @Override // defpackage.b9l
    public final boolean isAudioMuted() {
        ChromiumContent chromiumContent = this.b;
        return !chromiumContent.h() && chromiumContent.e().isAudioMuted();
    }

    @Override // defpackage.b9l
    public final boolean isLoading() {
        return this.b.H.a;
    }

    @Override // defpackage.e7l
    public final boolean j(int i, int i2) {
        return N.M$0a8QHM(this.b.e(), i, i2);
    }

    @Override // defpackage.b9l
    public final void k(boolean z) {
        this.b.setUseDesktopUserAgent(z);
    }

    @Override // defpackage.e7l
    public final void l() {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            return;
        }
        NavigationController navigationControllerD = chromiumContent.d();
        if (navigationControllerD.n()) {
            navigationControllerD.l();
        }
    }

    @Override // defpackage.b9l
    public final boolean m() {
        return this.b.t;
    }

    @Override // defpackage.b9l
    public final boolean n() {
        ChromiumContent chromiumContent = this.b;
        return !chromiumContent.h() && chromiumContent.d().n();
    }

    @Override // defpackage.b9l
    public final void o() {
        ChromiumContent chromiumContent = this.b;
        chromiumContent.o.E(chromiumContent);
    }

    @Override // defpackage.b9l
    public final void p() {
        this.b.x(true);
    }

    @Override // defpackage.b9l
    public final void q() {
        ChromiumContent chromiumContent = this.b;
        chromiumContent.o.G(chromiumContent);
    }

    @Override // defpackage.b9l
    public final boolean r() {
        return this.b.j;
    }

    @Override // defpackage.b9l
    public final boolean s(TabInfo tabInfo) {
        if (this.e.equals(tabInfo)) {
            return false;
        }
        TabInfo tabInfo2 = this.e;
        this.e = tabInfo;
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
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            return;
        }
        chromiumContent.e().setAudioMuted(z);
    }

    @Override // defpackage.b9l
    public final void show() {
        this.b.B();
    }

    @Override // defpackage.b9l
    public final esk t() {
        return new sy3(this.b.p(), (byte) 0);
    }

    @Override // defpackage.b9l
    public final void u() {
        this.b.i();
    }

    @Override // defpackage.b9l
    public final boolean v() {
        return true;
    }

    public final void w(b7l b7lVar) {
        this.a.b(b7lVar);
    }

    @Override // defpackage.b9l
    public final boolean x(Uri uri, Callback callback) {
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent.h()) {
            return false;
        }
        return N.MQ210P2s(chromiumContent.e(), "file".equals(uri.getScheme()) ? uri.getPath() : uri.toString(), callback);
    }

    @Override // defpackage.b9l
    public final t59 y() {
        return this.b.M;
    }

    @Override // defpackage.b9l
    public final boolean z() {
        ChromiumContent chromiumContent = this.b;
        return !chromiumContent.h() && N.MKZFebr4(chromiumContent.e());
    }
}
