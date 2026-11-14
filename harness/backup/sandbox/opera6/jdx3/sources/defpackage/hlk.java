package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public final class hlk implements knf, tdn {
    public final pde a;
    public final shf b;
    public final String c;
    public final slk d;
    public final ydn e;
    public final xb f;
    public final jtg g;
    public final ebh h;
    public final gmk i;
    public final ru9 j;
    public final o4g k;
    public final OperaPageRootView l;
    public final fwf m;
    public final String n;

    /* JADX WARN: Multi-variable type inference failed */
    public hlk(BrowserActivity browserActivity, pde pdeVar, String str, slk slkVar, ydn ydnVar, xb xbVar, jtg jtgVar, ebh ebhVar, gmk gmkVar, ru9 ru9Var) {
        this.a = pdeVar;
        this.c = str;
        this.d = slkVar;
        this.e = ydnVar;
        this.f = xbVar;
        this.g = jtgVar;
        this.h = ebhVar;
        this.i = gmkVar;
        this.j = ru9Var;
        final byte b = 0;
        View viewInflate = browserActivity.getLayoutInflater().inflate(2131559383, (ViewGroup) null, false);
        int i = 2131361846;
        OperaListItem operaListItem = (OperaListItem) w1h.j(2131361846, viewInflate);
        if (operaListItem != null) {
            i = 2131362205;
            OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131362205, viewInflate);
            if (operaListItem2 != null) {
                i = 2131362347;
                OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131362347, viewInflate);
                if (operaListItem3 != null) {
                    i = 2131362409;
                    ScrollView scrollView = (ScrollView) w1h.j(2131362409, viewInflate);
                    if (scrollView != null) {
                        i = 2131363295;
                        MaterialButton materialButtonJ = w1h.j(2131363295, viewInflate);
                        if (materialButtonJ != null) {
                            i = 2131363788;
                            OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131363788, viewInflate);
                            if (operaListItem4 != null) {
                                i = 2131363929;
                                OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131363929, viewInflate);
                                if (operaListItem5 != null) {
                                    i = 2131363974;
                                    OperaListItem operaListItem6 = (OperaListItem) w1h.j(2131363974, viewInflate);
                                    if (operaListItem6 != null) {
                                        i = 2131363975;
                                        OperaListItem operaListItem7 = (OperaListItem) w1h.j(2131363975, viewInflate);
                                        if (operaListItem7 != null) {
                                            i = 2131364408;
                                            MaterialButton materialButtonJ2 = w1h.j(2131364408, viewInflate);
                                            if (materialButtonJ2 != null) {
                                                i = 2131364595;
                                                OperaListItem operaListItem8 = (OperaListItem) w1h.j(2131364595, viewInflate);
                                                if (operaListItem8 != null) {
                                                    i = 2131365056;
                                                    OperaListItem operaListItem9 = (OperaListItem) w1h.j(2131365056, viewInflate);
                                                    if (operaListItem9 != null) {
                                                        OperaPageRootView operaPageRootView = (OperaPageRootView) viewInflate;
                                                        this.k = new o4g(operaPageRootView, operaListItem, operaListItem2, operaListItem3, scrollView, materialButtonJ, operaListItem4, operaListItem5, operaListItem6, operaListItem7, materialButtonJ2, operaListItem8, operaListItem9);
                                                        this.b = new shf(pdeVar, scrollView);
                                                        this.l = operaPageRootView;
                                                        fwf fwfVar = new fwf(browserActivity.getLifecycle());
                                                        this.m = fwfVar;
                                                        this.n = r9n.u(browserActivity, browserActivity.getPackageName(), 0L).versionName;
                                                        slkVar.i.j(fwfVar, new f7f(this) { // from class: flk
                                                            public final /* synthetic */ hlk b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            public final void d0(Object obj) {
                                                                byte b2 = b;
                                                                hlk hlkVar = this.b;
                                                                switch (b2) {
                                                                    case 0:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 1:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 2:
                                                                        hlkVar.g();
                                                                        break;
                                                                    default:
                                                                        hlkVar.g();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final byte b2 = 1;
                                                        xbVar.e.j(fwfVar, new f7f(this) { // from class: flk
                                                            public final /* synthetic */ hlk b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            public final void d0(Object obj) {
                                                                byte b22 = b2;
                                                                hlk hlkVar = this.b;
                                                                switch (b22) {
                                                                    case 0:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 1:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 2:
                                                                        hlkVar.g();
                                                                        break;
                                                                    default:
                                                                        hlkVar.g();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final byte b3 = 2;
                                                        gmkVar.a.j(fwfVar, new f7f(this) { // from class: flk
                                                            public final /* synthetic */ hlk b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            public final void d0(Object obj) {
                                                                byte b22 = b3;
                                                                hlk hlkVar = this.b;
                                                                switch (b22) {
                                                                    case 0:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 1:
                                                                        hlkVar.g();
                                                                        break;
                                                                    case 2:
                                                                        hlkVar.g();
                                                                        break;
                                                                    default:
                                                                        hlkVar.g();
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        if (ebhVar != null) {
                                                            final byte b4 = 3;
                                                            ebhVar.a.j(fwfVar, new f7f(this) { // from class: flk
                                                                public final /* synthetic */ hlk b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                public final void d0(Object obj) {
                                                                    byte b22 = b4;
                                                                    hlk hlkVar = this.b;
                                                                    switch (b22) {
                                                                        case 0:
                                                                            hlkVar.g();
                                                                            break;
                                                                        case 1:
                                                                            hlkVar.g();
                                                                            break;
                                                                        case 2:
                                                                            hlkVar.g();
                                                                            break;
                                                                        default:
                                                                            hlkVar.g();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        x53 x53Var = new x53(this);
                                                        ru9Var.a(x53Var);
                                                        fwfVar.getLifecycle().a(new qs2(ru9Var, x53Var));
                                                        materialButtonJ.setOnClickListener(new View.OnClickListener(this) { // from class: glk
                                                            public final /* synthetic */ hlk b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b5 = b;
                                                                hlk hlkVar = this.b;
                                                                switch (b5) {
                                                                    case 0:
                                                                        ru9 ru9Var2 = hlkVar.j;
                                                                        if (ru9Var2.a.getBoolean("vpn_pro.kill_switch.on", false)) {
                                                                            nv6 nv6VarB = ru9Var2.b();
                                                                            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn_pro.kill_switch.on", false);
                                                                            nv6VarB.w();
                                                                            break;
                                                                        } else {
                                                                            Context context = view.getContext();
                                                                            wvg wvgVar = (wvg) hlkVar.d.i.g();
                                                                            int i2 = (!wvgVar.a() || wvgVar.b()) ? 2132018563 : 2132018564;
                                                                            z77 z77VarU = sfe.U(context);
                                                                            rxh rxhVar = new rxh(i2);
                                                                            txi txiVar = new txi(hlkVar, (byte) 19);
                                                                            gkj gkjVar = new gkj(false, false);
                                                                            gkjVar.a = null;
                                                                            gkjVar.b = null;
                                                                            gkjVar.c = null;
                                                                            gkjVar.d = null;
                                                                            gkjVar.e = null;
                                                                            gkjVar.f = null;
                                                                            gkjVar.g = null;
                                                                            gkjVar.h = txiVar;
                                                                            gkjVar.i = null;
                                                                            gkjVar.j = null;
                                                                            gkjVar.k = 2132022130;
                                                                            gkjVar.l = 2132018111;
                                                                            gkjVar.m = 2132018565;
                                                                            gkjVar.n = true;
                                                                            gkjVar.o = rxhVar;
                                                                            z77VarU.getClass();
                                                                            z77VarU.b(gkjVar, ijm.b);
                                                                            break;
                                                                        }
                                                                    default:
                                                                        StringBuilder sb = new StringBuilder();
                                                                        o4g o4gVar = hlkVar.k;
                                                                        for (OperaListItem operaListItem10 : Arrays.asList((OperaListItem) o4gVar.f, (OperaListItem) o4gVar.c, (OperaListItem) o4gVar.g, (OperaListItem) o4gVar.e, (OperaListItem) o4gVar.h, (OperaListItem) o4gVar.k, (OperaListItem) o4gVar.l, (OperaListItem) o4gVar.i)) {
                                                                            sb.append(operaListItem10.A.D());
                                                                            sb.append(":\n");
                                                                            sb.append(operaListItem10.B.D());
                                                                            sb.append("\n\n");
                                                                        }
                                                                        new ghf(new i4d(new u5f(sb.toString(), (byte) 11))).I(view.getContext());
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        materialButtonJ2.setOnClickListener(new View.OnClickListener(this) { // from class: glk
                                                            public final /* synthetic */ hlk b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b5 = b2;
                                                                hlk hlkVar = this.b;
                                                                switch (b5) {
                                                                    case 0:
                                                                        ru9 ru9Var2 = hlkVar.j;
                                                                        if (ru9Var2.a.getBoolean("vpn_pro.kill_switch.on", false)) {
                                                                            nv6 nv6VarB = ru9Var2.b();
                                                                            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn_pro.kill_switch.on", false);
                                                                            nv6VarB.w();
                                                                            break;
                                                                        } else {
                                                                            Context context = view.getContext();
                                                                            wvg wvgVar = (wvg) hlkVar.d.i.g();
                                                                            int i2 = (!wvgVar.a() || wvgVar.b()) ? 2132018563 : 2132018564;
                                                                            z77 z77VarU = sfe.U(context);
                                                                            rxh rxhVar = new rxh(i2);
                                                                            txi txiVar = new txi(hlkVar, (byte) 19);
                                                                            gkj gkjVar = new gkj(false, false);
                                                                            gkjVar.a = null;
                                                                            gkjVar.b = null;
                                                                            gkjVar.c = null;
                                                                            gkjVar.d = null;
                                                                            gkjVar.e = null;
                                                                            gkjVar.f = null;
                                                                            gkjVar.g = null;
                                                                            gkjVar.h = txiVar;
                                                                            gkjVar.i = null;
                                                                            gkjVar.j = null;
                                                                            gkjVar.k = 2132022130;
                                                                            gkjVar.l = 2132018111;
                                                                            gkjVar.m = 2132018565;
                                                                            gkjVar.n = true;
                                                                            gkjVar.o = rxhVar;
                                                                            z77VarU.getClass();
                                                                            z77VarU.b(gkjVar, ijm.b);
                                                                            break;
                                                                        }
                                                                    default:
                                                                        StringBuilder sb = new StringBuilder();
                                                                        o4g o4gVar = hlkVar.k;
                                                                        for (OperaListItem operaListItem10 : Arrays.asList((OperaListItem) o4gVar.f, (OperaListItem) o4gVar.c, (OperaListItem) o4gVar.g, (OperaListItem) o4gVar.e, (OperaListItem) o4gVar.h, (OperaListItem) o4gVar.k, (OperaListItem) o4gVar.l, (OperaListItem) o4gVar.i)) {
                                                                            sb.append(operaListItem10.A.D());
                                                                            sb.append(":\n");
                                                                            sb.append(operaListItem10.B.D());
                                                                            sb.append("\n\n");
                                                                        }
                                                                        new ghf(new i4d(new u5f(sb.toString(), (byte) 11))).I(view.getContext());
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        return;
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static String c(long j) {
        if (j <= 0) {
            return "";
        }
        return ((SimpleDateFormat) yjb.a.get()).format(new Date(j));
    }

    @Override // defpackage.knf
    public final ikc B() {
        return this.a;
    }

    @Override // defpackage.tdn
    public final void C() {
        g();
    }

    @Override // defpackage.knf
    public final void E() {
    }

    @Override // defpackage.knf
    public final void F() {
    }

    @Override // defpackage.knf
    public final void a() {
    }

    @Override // defpackage.knf
    public final boolean b() {
        return true;
    }

    @Override // defpackage.knf
    public final void d() {
        this.m.a(true);
        this.e.F(this);
        y();
        g();
    }

    @Override // defpackage.knf
    public final void e() {
        this.m.a(false);
        this.e.H(this);
    }

    public final boolean f() {
        return !this.g.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlk.g():void");
    }

    @Override // defpackage.knf
    public final String getUrl() {
        return this.c;
    }

    @Override // defpackage.knf
    public final OperaPageRootView getView() {
        return this.l;
    }

    @Override // defpackage.knf
    public final String n() {
        return "Subscription";
    }

    @Override // defpackage.knf
    public final void o() {
    }

    @Override // defpackage.knf
    public final void q() {
    }

    @Override // defpackage.knf
    public final void r() {
        shf shfVar = this.b;
        ScrollView scrollView = (ScrollView) shfVar.b;
        if (scrollView.isAttachedToWindow()) {
            return;
        }
        mnf mnfVar = (mnf) ((pde) shfVar.a).g();
        scrollView.setPadding(scrollView.getPaddingLeft(), mnfVar.a, scrollView.getPaddingRight(), mnfVar.b);
    }

    @Override // defpackage.tdn
    public final void s() {
        g();
    }

    @Override // defpackage.tdn
    public final void t() {
    }

    @Override // defpackage.knf
    public final void u() {
    }

    @Override // defpackage.knf
    public final boolean w() {
        return true;
    }

    @Override // defpackage.knf
    public final void y() {
        g();
        ebh ebhVar = this.h;
        if (ebhVar != null) {
            ebhVar.c();
        }
    }

    @Override // defpackage.knf
    public final String z() {
        return "opera://subscription";
    }
}
