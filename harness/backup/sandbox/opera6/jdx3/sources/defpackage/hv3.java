package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.utilities.DisplayUtil;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import org.chromium.content_public.browser.RenderFrameHost;

/* loaded from: classes.dex */
public final class hv3 {
    public final /* synthetic */ BrowserActivity a;

    public /* synthetic */ hv3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    public final void a(int i, gmi gmiVar, int i2) {
        ep0 ep0Var;
        dp0 dp0Var;
        if (i != 1) {
            bo0 bo0Var = i == 3 ? bo0.c : bo0.b;
            int iOrdinal = gmiVar.ordinal();
            if (iOrdinal == 0) {
                ep0Var = ep0.b;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                ep0Var = ep0.d;
            }
            switch (i2) {
                case 1:
                    dp0Var = dp0.c;
                    break;
                case 2:
                    dp0Var = dp0.d;
                    break;
                case 3:
                    dp0Var = dp0.e;
                    break;
                case 4:
                    dp0Var = dp0.f;
                    break;
                case 5:
                    dp0Var = dp0.g;
                    break;
                case 6:
                    dp0Var = dp0.h;
                    break;
                case 7:
                    dp0Var = dp0.i;
                    break;
                case 8:
                    dp0Var = dp0.j;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    dp0Var = dp0.k;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    dp0Var = dp0.l;
                    break;
                case 11:
                    dp0Var = dp0.m;
                    break;
                case 12:
                    dp0Var = dp0.n;
                    break;
                default:
                    dp0Var = dp0.b;
                    break;
            }
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) this.a.getApplication()).L().c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).b(new yo7((Object) bo0Var, (Object) ep0Var, (Object) dp0Var, (byte) 23));
                x5fVar.U0(x56VarF);
            }
        }
    }

    public final void b(hbf hbfVar) {
        BrowserActivity browserActivity = this.a;
        gbf gbfVar = browserActivity.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        if (gbfVar.j.p()) {
            return;
        }
        browserActivity.o1(1);
        gbf gbfVar2 = browserActivity.M;
        if (gbfVar2 == null) {
            gbfVar2 = null;
        }
        gbfVar2.l(null, hbfVar);
    }

    public final void c() {
        ((ul3) this.a.y.a.f.get()).a();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, com.opera.android.BrowserActivity, java.lang.Object] */
    public final void d() {
        int i = BrowserActivity.E1;
        ?? r5 = this.a;
        b2l b2lVarW0 = r5.w0();
        if (b2lVarW0 != null) {
            d7l d7lVar = (d7l) b2lVarW0;
            if (z5i.a0(d7lVar.j.getUrl())) {
                String[] strArr = OperaApplication.K;
                ((OperaApplication) r5.getApplication()).o().a(new mzj(d7lVar.l0(), d7lVar.j.getUrl(), (Bitmap) null, 8));
                return;
            }
            wx wxVar = new wx((Object) b2lVarW0, (Object) r5, (byte) 23);
            if (d7lVar.j.Q(new iyk(wxVar, b2lVarW0, (byte) 15))) {
                return;
            }
            wxVar.run(new tun(d7lVar.l0(), l08.a));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, java.lang.Object] */
    public final void e() {
        ?? r5 = this.a;
        if (z5i.r0((Context) r5)) {
            z5i.v0((Context) r5);
            return;
        }
        k6l k6lVar = r5.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        b2l b2lVar = k6lVar.o;
        if (b2lVar != null) {
            String[] strArr = OperaApplication.K;
            l6e l6eVarC = ((OperaApplication) r5.getApplication()).I().c(9223372036854775805L);
            if (l6eVarC == null) {
                return;
            }
            d7l d7lVar = (d7l) b2lVar;
            d7lVar.E(64000, false, new su((Object) Uri.parse(d7lVar.h0()), (Object) r5, (Object) l6eVarC, (byte) 7));
        }
    }

    public final void f(hw0 hw0Var) {
        x92 x92Var;
        BrowserActivity browserActivity = this.a;
        k6l k6lVar = browserActivity.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        b2l b2lVar = k6lVar.o;
        if (b2lVar == null) {
            return;
        }
        int iOrdinal = hw0Var.ordinal();
        if (iOrdinal == 0) {
            x92Var = x92.e;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            x92Var = x92.f;
        }
        d7l d7lVar = (d7l) b2lVar;
        d7lVar.E(300000, true, new xx1((Object) browserActivity, (Object) Uri.parse(d7lVar.h0()), d7lVar.l0(), (Object) x92Var, (byte) 2));
    }

    public final void g() {
        ((ul3) this.a.y.a.f.get()).a();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context, com.opera.android.BrowserActivity, dx3, java.lang.Object] */
    public final void h() {
        int i = BrowserActivity.E1;
        ?? r5 = this.a;
        b2l b2lVarW0 = r5.w0();
        if (b2lVarW0 != null) {
            if (rm5.D(r5.getApplicationContext())) {
                uy3 uy3VarF = uy3.F(b2lVarW0);
                ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
                if (chromiumContent != null) {
                    gv3 gv3Var = new gv3(r5, (byte) 0);
                    List list = fj9.a;
                    RenderFrameHost renderFrameHostI = chromiumContent.e().I();
                    if (renderFrameHostI != null) {
                        N.MGe8MVxK(renderFrameHostI, fj9.b, new wa(gv3Var, (byte) 12));
                        return;
                    }
                    return;
                }
                return;
            }
            Uri uri = Uri.parse("package:" + r5.getApplicationContext().getPackageName());
            Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", uri);
            if (qvf.b(65536, intent) == null) {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri);
                intent.putExtra(":settings:fragment_args_key", "picture_in_picture");
            }
            qim qimVar = r5.o;
            Objects.requireNonNull(qimVar);
            z77 z77Var = qimVar.c;
            reg regVar = new reg(new gb3((Object) r5, intent, (byte) 7));
            z77Var.getClass();
            z77Var.b(regVar, ijm.b);
        }
    }

    public final void i() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        browserActivity.B1();
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null) {
            return;
        }
        d7l d7lVar = (d7l) b2lVarW0;
        if (d7lVar.n0()) {
            d7lVar.q();
            return;
        }
        iga igaVar = d7lVar.i;
        d7lVar.j.m();
        lsc lscVarF = wqm.f(igaVar.e(), null, lqm.l);
        Objects.requireNonNull(lscVarF);
        d7lVar.Z(lscVarF);
    }

    public final void j(boolean z) {
        by3 by3Var = new by3(z ? 1 : 2, 1);
        int i = BrowserActivity.E1;
        this.a.c1(by3Var);
    }

    public final void k(View view) {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 != null) {
            if (!((d7l) b2lVarW0).o0()) {
                browserActivity.A1((o73) browserActivity.A0.get(), view);
                return;
            }
            dbl dblVar = (dbl) browserActivity.B0.get();
            if (dblVar == null) {
                return;
            }
            browserActivity.A1(dblVar, view);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void l() {
        lsc lscVarA;
        String strBuild;
        int i = BrowserActivity.E1;
        ?? r7 = this.a;
        j4c j4cVar = r7.l0;
        g82 g82Var = ((q82) j4cVar.get()).e;
        if (g82Var == null) {
            b2l b2lVarW0 = r7.w0();
            if (b2lVarW0 != null) {
                d7l d7lVar = (d7l) b2lVarW0;
                String url = d7lVar.j.getUrl();
                if (UrlMangler.c(url)) {
                    strBuild = BrowserUtils.getExternalUrlWithFallback(url);
                } else {
                    String string = r7.getString(2132020640);
                    UrlMangler.Builder builder = new UrlMangler.Builder("readermode", new Uri.Builder().scheme("opera-distiller").authority("readermode").build().toString());
                    builder.externalUrl(url);
                    builder.displayString(string);
                    strBuild = builder.build();
                }
                lsc lscVar = new lsc(strBuild, 0);
                lscVar.k = true;
                lscVar.o = (byte[]) N.Mke9ps$8(1);
                d7lVar.Z(lscVar);
                return;
            }
            return;
        }
        boolean zD = UrlMangler.d(((d7l) ((q82) j4cVar.get()).j).j.getUrl());
        t82 t82Var = r7.E;
        lqm lqmVar = lqm.d;
        if (zD) {
            if (t82Var == null) {
                t82Var = null;
            }
            t82Var.getClass();
            UrlMangler.Builder builder2 = new UrlMangler.Builder("article", g82Var.d);
            builder2.title(g82Var.b);
            builder2.c.put("article_id", g82Var.a);
            lscVarA = wqm.f(builder2.build(), null, lqmVar);
        } else {
            if (t82Var == null) {
                t82Var = null;
            }
            lscVarA = t82Var.a(g82Var, lqmVar);
        }
        lscVarA.k = true;
        b2l b2lVarW02 = r7.w0();
        if (b2lVarW02 != null) {
            ((d7l) b2lVarW02).Z(lscVarA);
        }
    }

    public final void m() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        browserActivity.B1();
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 != null) {
            ((d7l) b2lVarW0).b();
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    public final void n() {
        int i = BrowserActivity.E1;
        ?? r13 = this.a;
        b2l b2lVarW0 = r13.w0();
        if (b2lVarW0 == null) {
            return;
        }
        umi umiVar = r13.x;
        String[] strArr = OperaApplication.K;
        pii piiVar = new pii(umiVar, ((OperaApplication) r13.getApplication()).L().c, DisplayUtil.e(r13));
        Bundle bundle = new Bundle();
        bundle.putInt("tab_id", ((d7l) b2lVarW0).j.getId());
        piiVar.setArguments(bundle);
        qim qimVar = r13.o;
        Objects.requireNonNull(qimVar);
        qimVar.b.b(new zhj(new wzg(piiVar, pii.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])));
    }

    public final void o() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null) {
            return;
        }
        ((f1j) browserActivity.y.K.get()).e(b2lVarW0);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void p(String str, boolean z) {
        int i = BrowserActivity.E1;
        ?? r2 = this.a;
        b2l b2lVarW0 = r2.w0();
        String url = b2lVarW0 != null ? ((d7l) b2lVarW0).j.getUrl() : null;
        Context applicationContext = r2.getApplicationContext();
        z77 z77VarZ0 = r2.z0();
        ysj ysjVarJ0 = r2.J0();
        String url2 = b2lVarW0 != null ? ((d7l) b2lVarW0).j.getUrl() : null;
        if (str != null && (url2 == null || !wqm.J(str, url2, true, true))) {
            url2 = str;
        }
        if (url2 != null) {
            boolean zEquals = url2.equals(b2lVarW0 != null ? ((d7l) b2lVarW0).j.getUrl() : null);
            boolean z2 = zEquals && ((d7l) b2lVarW0).j.m();
            boolean zMvREqNZj = N.MvREqNZj(url2);
            if (zMvREqNZj) {
                if (z != N.MKmMXQdc(url2) || z2) {
                    int i2 = 2;
                    char c = z ? (char) 2 : (char) 1;
                    if (c == 1) {
                        i2 = 1;
                    } else if (c != 2) {
                        throw null;
                    }
                    N.MK6TwYBN(url2, i2, z2);
                } else {
                    N.M7rGNOkl(url2, z2);
                }
                if (!z2) {
                    ru9 ru9VarC = ru9.c(applicationContext);
                    boolean z3 = ru9VarC.a.getBoolean("user_agent_remember_dialog", false);
                    ijm ijmVar = ijm.b;
                    if (z3) {
                        glj gljVar = new glj(2132018530, 2500);
                        ysjVarJ0.getClass();
                        ysjVarJ0.b(gljVar, ijmVar);
                    } else {
                        int i3 = z ? 2132021196 : 2132021190;
                        String string = applicationContext.getString(2132021189, "Opera");
                        rxh rxhVar = new rxh(i3);
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = string;
                        gkjVar.e = null;
                        gkjVar.f = null;
                        gkjVar.g = null;
                        gkjVar.h = null;
                        gkjVar.i = null;
                        gkjVar.j = null;
                        gkjVar.k = 2132019218;
                        gkjVar.l = 0;
                        gkjVar.m = 0;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77VarZ0.getClass();
                        z77VarZ0.b(gkjVar, ijmVar);
                        nv6 nv6VarB = ru9VarC.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("user_agent_remember_dialog", true);
                        nv6VarB.w();
                    }
                }
            }
            if (zEquals) {
                ((d7l) b2lVarW0).k(z);
                if (!zMvREqNZj || url == null) {
                    return;
                }
                mu6 mu6Var = (mu6) r2.a1.getValue();
                if (mu6Var.a(b2lVarW0, url)) {
                    String str2 = (String) N.MXw3KFE6(url);
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    hd hdVar = mu6Var.b;
                    if (hdVar.b) {
                        n9a n9aVar = (n9a) hdVar.d;
                        w56 w56VarO = n9a.o();
                        new bk0(n9aVar, w56VarO).a(str2, new xsf((byte) 0, z));
                        if (((mgh) hdVar.g).c(w56VarO)) {
                            return;
                        }
                        new rml(Unit.a, (umi) hdVar.c).a(new o5f((Object) hdVar, (byte) 18)).m((qie) hdVar.f);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void q() {
        int i = BrowserActivity.E1;
        ?? r8 = this.a;
        b2l b2lVarW0 = r8.w0();
        if (b2lVarW0 != null) {
            d7l d7lVar = (d7l) b2lVarW0;
            if (z5i.a0(d7lVar.j.getUrl())) {
                x22 x22Var = ((y22) r8.y.u0.get()).a;
                if (x22Var != null) {
                    x22Var.b(b2lVarW0, new iv0(r8, (byte) 3));
                    return;
                }
                return;
            }
            ghf ghfVar = new ghf(new i4d(new e5f(d7lVar.k0(), d7lVar.l0(), (byte) 10)));
            ghfVar.d = b2lVarW0;
            String strF0 = d7lVar.f0();
            if (strF0 != null) {
                ghfVar.c = new fv3(r8, strF0);
            }
            ghfVar.I(r8);
        }
    }

    public final void r() {
        File fileE;
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null) {
            return;
        }
        buj bujVar = (buj) browserActivity.k0.getValue();
        bujVar.getClass();
        d7l d7lVar = (d7l) b2lVarW0;
        String url = d7lVar.j.getUrl();
        try {
            fileE = n1h.e(bujVar.a, "screenshot", ".png");
        } catch (IOException unused) {
            fileE = null;
        }
        if (fileE == null) {
            bujVar.a(2132021581);
        } else {
            d7lVar.C(false, false, new ir8(bujVar, ((Integer) bujVar.c.get()).intValue(), fileE, url));
        }
    }

    public final void s() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        browserActivity.B1();
        browserActivity.U0.m();
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null) {
            return;
        }
        d7l d7lVar = (d7l) b2lVarW0;
        if (UrlMangler.c(d7lVar.j.getUrl())) {
            d7lVar.b();
        } else {
            d7lVar.V();
        }
    }

    public final void t() {
        uy3 uy3VarF;
        BrowserActivity browserActivity = this.a;
        w6j w6jVar = browserActivity.F;
        ChromiumContent chromiumContent = null;
        if (w6jVar == null) {
            w6jVar = null;
        }
        z4m z4mVarE = browserActivity.H0().E();
        b2l b2lVarW0 = browserActivity.w0();
        if (!v3m.f((BrowserActivity) w6jVar.a) || !z4mVarE.a) {
            ((p8f) w6jVar.d).E();
            return;
        }
        a4m a4mVar = (a4m) w6jVar.b;
        nv6 nv6VarB = ru9.c(a4mVar.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("translate_web_pages.show_ui_from_page_menu.clicked", true);
        nv6VarB.w();
        f6l f6lVar = a4mVar.j;
        if (f6lVar != null) {
            a4mVar.c.H(f6lVar);
            a4mVar.j = null;
        }
        r4m r4mVar = (r4m) w6jVar.e;
        if (!v3m.f(r4mVar.g.a)) {
            r4mVar.c0(new o4m(r4mVar, (byte) 5));
            return;
        }
        if (b2lVarW0 != null && (uy3VarF = uy3.F(b2lVarW0)) != null) {
            chromiumContent = uy3VarF.b;
        }
        if (chromiumContent == null) {
            r4mVar.b0();
            return;
        }
        if (r4mVar.W() != null) {
            r4mVar.Z(b2lVarW0, 1);
            r4mVar.d0(b2lVarW0);
            return;
        }
        r4mVar.k = (byte) 1;
        yqa yqaVar = chromiumContent.Q;
        if (yqaVar != null) {
            String str = (String) yqaVar.b;
            if (!str.isEmpty() && !"und".equals(str)) {
                r4mVar.b(b2lVarW0, yqaVar);
                return;
            }
        }
        r4mVar.Y(b2lVarW0, 1);
        r4mVar.d0(b2lVarW0);
    }

    public final void u(View view) {
        BrowserActivity browserActivity = this.a;
        nej nejVarI0 = browserActivity.I0();
        im6 im6Var = new im6((swf) browserActivity.y.a.t().get(), new qp2((byte) 19), view, (byte) 7);
        nejVarI0.getClass();
        nejVarI0.b(im6Var, ijm.b);
    }
}
