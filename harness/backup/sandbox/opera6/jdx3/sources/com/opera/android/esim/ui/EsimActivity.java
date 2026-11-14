package com.opera.android.esim.ui;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.euicc.EuiccManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.BrowserActivity;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import defpackage.a98;
import defpackage.aeb;
import defpackage.ala;
import defpackage.ay;
import defpackage.b98;
import defpackage.bp6;
import defpackage.cl4;
import defpackage.cv3;
import defpackage.d78;
import defpackage.dp6;
import defpackage.eq6;
import defpackage.eyi;
import defpackage.fz4;
import defpackage.ga6;
import defpackage.gha;
import defpackage.gq6;
import defpackage.i06;
import defpackage.i78;
import defpackage.i88;
import defpackage.j04;
import defpackage.jq6;
import defpackage.k5o;
import defpackage.k78;
import defpackage.kze;
import defpackage.lq6;
import defpackage.or2;
import defpackage.pt1;
import defpackage.q78;
import defpackage.qb7;
import defpackage.qe6;
import defpackage.qs2;
import defpackage.qwe;
import defpackage.rz4;
import defpackage.s98;
import defpackage.s9i;
import defpackage.te5;
import defpackage.u68;
import defpackage.u78;
import defpackage.v78;
import defpackage.v88;
import defpackage.w68;
import defpackage.w6j;
import defpackage.wy3;
import defpackage.wyn;
import defpackage.x5f;
import defpackage.x77;
import defpackage.y68;
import defpackage.yk4;
import defpackage.yq6;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/opera/android/esim/ui/EsimActivity;", "Lrz4;", "<init>", "()V", "wy3", "fz4", "cv3", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EsimActivity extends rz4 {
    public static final /* synthetic */ int f0 = 0;
    public final w6j O;
    public final ga6 P;
    public final cv3 Q;
    public final zyk R;
    public final zyk S;
    public final ay T;
    public v78 U;
    public d06 V;
    public ala W;
    public eyi X;
    public s9i Y;
    public or2 Z;
    public gha a0;
    public wy3 b0;
    public fz4 c0;
    public boolean d0;
    public Uri e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsimActivity() {
        super(1);
        final byte b = 1;
        final byte b2 = 0;
        this.O = new w6j(uqh.a(u78.class), new d78(this, (byte) 0), new Function0(this) { // from class: t68
            public final /* synthetic */ EsimActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.esim.ui.EsimActivity] */
            public final Object invoke() {
                byte b3 = b2;
                ?? r1 = this.b;
                switch (b3) {
                    case 0:
                        v78 v78Var = r1.U;
                        if (v78Var == null) {
                            return null;
                        }
                        return v78Var;
                    case 1:
                        int i = EsimActivity.f0;
                        String[] strArr = OperaApplication.K;
                        return (dp6) ((OperaApplication) r1.getApplication()).v.get();
                    default:
                        int i2 = EsimActivity.f0;
                        return ((ql6) ((dp6) r1.R.getValue()).q.getValue()).a();
                }
            }
        }, new d78(this, (byte) 1));
        this.P = new ga6((byte) 17, false);
        this.Q = new cv3(this, b);
        this.R = z4c.b(new Function0(this) { // from class: t68
            public final /* synthetic */ EsimActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.esim.ui.EsimActivity] */
            public final Object invoke() {
                byte b3 = b;
                ?? r1 = this.b;
                switch (b3) {
                    case 0:
                        v78 v78Var = r1.U;
                        if (v78Var == null) {
                            return null;
                        }
                        return v78Var;
                    case 1:
                        int i = EsimActivity.f0;
                        String[] strArr = OperaApplication.K;
                        return (dp6) ((OperaApplication) r1.getApplication()).v.get();
                    default:
                        int i2 = EsimActivity.f0;
                        return ((ql6) ((dp6) r1.R.getValue()).q.getValue()).a();
                }
            }
        });
        final byte b3 = 2;
        this.S = z4c.b(new Function0(this) { // from class: t68
            public final /* synthetic */ EsimActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.esim.ui.EsimActivity] */
            public final Object invoke() {
                byte b32 = b3;
                ?? r1 = this.b;
                switch (b32) {
                    case 0:
                        v78 v78Var = r1.U;
                        if (v78Var == null) {
                            return null;
                        }
                        return v78Var;
                    case 1:
                        int i = EsimActivity.f0;
                        String[] strArr = OperaApplication.K;
                        return (dp6) ((OperaApplication) r1.getApplication()).v.get();
                    default:
                        int i2 = EsimActivity.f0;
                        return ((ql6) ((dp6) r1.R.getValue()).q.getValue()).a();
                }
            }
        });
        this.T = new ay((Object) this, (byte) 6);
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.hjf
    public final void C() {
        eyi eyiVar = this.X;
        if (eyiVar == null) {
            eyiVar = null;
        }
        xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
        super.C();
        invalidateMenu();
    }

    @Override // defpackage.rz4
    public final InterceptNavigationDelegate C0(ChromiumContent chromiumContent) {
        return new aeb(chromiumContent, this.T, l08.a).g;
    }

    @Override // defpackage.rz4
    public final void D0(WebContents webContents) {
        ala alaVar = this.W;
        if (alaVar == null) {
            alaVar = null;
        }
        this.Y = new s9i(this, webContents, alaVar);
        d06 d06Var = this.V;
        if (d06Var == null) {
            d06Var = null;
        }
        f99 f99VarT = qbe.t(scd.D((plh) d06Var.a, getLifecycle()));
        s9i s9iVar = this.Y;
        if (s9iVar == null) {
            s9iVar = null;
        }
        j14.Y(new z99(f99VarT, new te5(2, (s98) s9iVar.e, s98.class, "viewsV1NotifyHostStateChanged", "viewsV1NotifyHostStateChanged(Lcom/opera/android/genapi/esimrpc/HostState;)V", 4, (byte) 1), (byte) 2), cqp.V(getLifecycle()));
        eyi eyiVar = this.X;
        ((kze) (eyiVar != null ? eyiVar : null).d).j(this, new cl4(new u68(this, (byte) 0), (byte) 16));
    }

    public final u78 G0() {
        return (u78) this.O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        if (joh.p(this)) {
            startActivity(new Intent((Context) this, (Class<?>) BrowserActivity.class).setAction("android.intent.action.MAIN").addFlags(268435456));
        }
        super/*android.app.Activity*/.finish();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final String h0() {
        return "android.intent.action.VIEW";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final int i0(FullscreenWebActivity fullscreenWebActivity) {
        return f03.t(2130969328, fullscreenWebActivity, 2131103876);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final int j0() {
        return 2131558694;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Uri k0() {
        Uri uri = this.e0;
        return uri == null ? (Uri) this.S.getValue() : uri;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Drawable l0(Context context) {
        Drawable drawableI0 = j14.i0(2131231986, context);
        j14.n0(drawableI0, f03.t(2130969110, context, 2131103876));
        return drawableI0;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final CharSequence m0() {
        return ((i78) G0().n.a.getValue()).a.a.a(getResources());
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final boolean o0(NavigationController navigationController) {
        int iOrdinal = ((i78) G0().n.a.getValue()).a.c.ordinal();
        if (iOrdinal == 0) {
            return super.o0(navigationController);
        }
        if (iOrdinal == 1) {
            return false;
        }
        h9o.p();
        return false;
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        super.onDestroy();
        wy3 wy3Var = this.b0;
        if (wy3Var != null) {
            wy3Var.g();
        }
        this.b0 = null;
        fz4 fz4Var = this.c0;
        if (fz4Var != null) {
            fz4Var.g();
        }
        this.c0 = null;
        b0(this.Q);
        gha ghaVar = this.a0;
        if (ghaVar != null) {
            ghaVar.c(null);
        }
    }

    @Override // defpackage.hjf
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        gha ghaVar = this.a0;
        if (ghaVar != null) {
            Bundle extras = intent.getExtras();
            a98 a98Var = a98.c;
            if (extras != null && extras.getBoolean("ESIM_ATTRIBUTION_RESOLVED", false)) {
                a98Var = new a98(extras.getString("ESIM_SOURCE"), extras.getString("ESIM_CAMPAIGN"));
            }
            ghaVar.c = a98Var;
        }
    }

    @Override // defpackage.rz4
    public final void onResume() {
        ChromiumContent chromiumContent;
        super.onResume();
        if (!(((i78) G0().n.a.getValue()).b instanceof k78) || (chromiumContent = this.N) == null) {
            return;
        }
        chromiumContent.x(false);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final boolean onSupportNavigateUp() {
        WebContents webContentsN0 = n0();
        if (o0(webContentsN0 != null ? webContentsN0.q() : null)) {
            return true;
        }
        finish();
        return true;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void p0() {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        if (this.e0 != null) {
            super.p0();
        } else {
            na2.B(cqp.V(getLifecycle()), (CoroutineContext) null, (rx5) null, new w68(this, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final void u0(View view) {
        this.U = new v78((dp6) this.R.getValue(), (byte) 0);
        u78 u78VarG0 = G0();
        u78VarG0.getClass();
        f65 f65VarA = p7n.a(u78VarG0);
        mt5 mt5Var = null;
        q78 q78Var = new q78(u78VarG0, null, (byte) 1);
        byte b = 3;
        na2.B(f65VarA, (CoroutineContext) null, (rx5) null, q78Var, 3);
        FrameLayout frameLayout = (FrameLayout) view;
        int i = 2131362089;
        if (((FrameLayout) w1h.j(2131362089, view)) != null) {
            i = 2131362741;
            View viewJ = w1h.j(2131362741, view);
            if (viewJ != null) {
                int i2 = 2131362212;
                OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131362212, viewJ);
                if (operaIconedMessage != null) {
                    i2 = 2131362050;
                    MaterialButton materialButtonJ = w1h.j(2131362050, viewJ);
                    if (materialButtonJ != null) {
                        i2 = 2131362539;
                        TextView textView = (TextView) w1h.j(2131362539, viewJ);
                        if (textView != null) {
                            i2 = 2131363739;
                            TextView textView2 = (TextView) w1h.j(2131363739, viewJ);
                            if (textView2 != null) {
                                i2 = 2131364596;
                                TextView textView3 = (TextView) w1h.j(2131364596, viewJ);
                                if (textView3 != null) {
                                    pt1 pt1Var = new pt1((LinearLayout) viewJ, (View) operaIconedMessage, (View) materialButtonJ, (View) textView, (View) textView2, (View) textView3, (byte) 6);
                                    i = 2131362742;
                                    View viewJ2 = w1h.j(2131362742, view);
                                    if (viewJ2 != null) {
                                        int i3 = 2131362733;
                                        TextView textView4 = (TextView) w1h.j(2131362733, viewJ2);
                                        if (textView4 != null) {
                                            i3 = 2131362594;
                                            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, viewJ2);
                                            if (stylingImageView != null) {
                                                i3 = 2131363509;
                                                TextView textView5 = (TextView) w1h.j(2131363509, viewJ2);
                                                if (textView5 != null) {
                                                    i3 = 2131364080;
                                                    MaterialButton materialButtonJ2 = w1h.j(2131364080, viewJ2);
                                                    if (materialButtonJ2 != null) {
                                                        v88 v88Var = new v88((LinearLayout) viewJ2, textView4, stylingImageView, textView5, materialButtonJ2, (byte) 0);
                                                        i = 2131363351;
                                                        View viewJ3 = w1h.j(2131363351, view);
                                                        if (viewJ3 != null) {
                                                            if (w1h.j(2131364525, viewJ3) == null) {
                                                                t3p.q("Missing required view with ID: ".concat(viewJ3.getResources().getResourceName(2131364525)));
                                                                return;
                                                            }
                                                            b98 b98Var = new b98((FrameLayout) viewJ3, (byte) 0);
                                                            i = 2131363798;
                                                            FrameLayout frameLayout2 = (FrameLayout) w1h.j(2131363798, view);
                                                            if (frameLayout2 != null) {
                                                                i = 2131363061;
                                                                if (((ToolbarProgressBar) w1h.j(2131363061, view)) != null) {
                                                                    i = 2131364794;
                                                                    if (w1h.j(2131364794, view) != null) {
                                                                        i = 2131364795;
                                                                        if (((FrameLayout) w1h.j(2131364795, view)) != null) {
                                                                            i = 2131365082;
                                                                            if (((LinearLayout) w1h.j(2131365082, view)) != null) {
                                                                                this.Z = new or2(frameLayout, pt1Var, v88Var, b98Var, frameLayout2, (byte) 8);
                                                                                String[] strArr = OperaApplication.K;
                                                                                qwe qweVarB = ((OperaApplication) getApplication()).B();
                                                                                or2 or2Var = this.Z;
                                                                                if (or2Var == null) {
                                                                                    or2Var = null;
                                                                                }
                                                                                qweVarB.b((FrameLayout) or2Var.b);
                                                                                or2 or2Var2 = this.Z;
                                                                                if (or2Var2 == null) {
                                                                                    or2Var2 = null;
                                                                                }
                                                                                ((v88) or2Var2.e).f.setOnClickListener(new yk4((Object) this, (byte) 21));
                                                                                addMenuProvider(new y68(this), this, qcc.e);
                                                                                na2.B(cqp.V(getLifecycle()), (CoroutineContext) null, (rx5) null, new w68(this, mt5Var, (byte) 2), 3);
                                                                                na2.B(cqp.V(getLifecycle()), (CoroutineContext) null, (rx5) null, new w68(this, mt5Var, b), 3);
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
                                        t3p.q("Missing required view with ID: ".concat(viewJ2.getResources().getResourceName(i3)));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewJ.getResources().getResourceName(i2)));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final void v0() throws Resources.NotFoundException {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        zyk zykVar = this.R;
        dp6 dp6Var = (dp6) zykVar.getValue();
        ddc ddcVarV = cqp.V(getLifecycle());
        i88 i88Var = dp6Var.a;
        eq6 eq6Var = new eq6(i88Var);
        xm5 xm5Var = new xm5(i88Var);
        x77 x77Var = dp6Var.b;
        qe6 qe6Var = new qe6((EuiccManager) dp6Var.t.getValue(), (byte) 3);
        gq6 gq6Var = (gq6) dp6Var.u.getValue();
        i06 i06Var = dp6Var.f;
        bp6 bp6Var = new bp6(dp6Var);
        k5o k5oVar = dp6Var.m;
        i3j i3jVar = new i3j(dp6Var.b(), dp6Var.j, dp6Var.l);
        jq6 jq6Var = new jq6(dp6Var.d());
        d06 d06Var = new d06();
        d06Var.a = a26.l0(new cw(new f99[]{(f99) bp6Var.a.g.invoke(), gq6Var.a(), (f99) ((zyk) i3jVar.d).getValue(), jq6Var.a.f}, new yq6(i06Var, eq6Var, xm5Var, x77Var, qe6Var, k5oVar, null), (byte) 8), ddcVarV, aej.b, 1);
        this.V = d06Var;
        x5f x5fVar = operaApplication.L().c;
        x5f x5fVar2 = operaApplication.L().d;
        Bundle extras = getIntent().getExtras();
        a98 a98Var = a98.c;
        if (extras != null && extras.getBoolean("ESIM_ATTRIBUTION_RESOLVED", false)) {
            a98Var = new a98(extras.getString("ESIM_SOURCE"), extras.getString("ESIM_CAMPAIGN"));
        }
        gha ghaVar = new gha(x5fVar, x5fVar2, a98Var);
        this.a0 = ghaVar;
        dp6 dp6Var2 = (dp6) zykVar.getValue();
        ddc ddcVarV2 = cqp.V(getLifecycle());
        d06 d06Var2 = this.V;
        if (d06Var2 == null) {
            d06Var2 = null;
        }
        wyn wynVar = (wyn) operaApplication.r.m1.get();
        s9i s9iVar = new s9i(dp6Var2.b, new eq6(dp6Var2.a), dp6Var2.h, dp6Var2.l, (byte) 11, false);
        lq6 lq6Var = new lq6(dp6Var2.d());
        bp6 bp6Var2 = new bp6(dp6Var2);
        qb7 qb7Var = new qb7(dp6Var2.d(), ddcVarV2, dp6Var2.a());
        eq6 eq6Var2 = new eq6(dp6Var2.d());
        d06 d06Var3 = new d06(dp6Var2.d());
        ala alaVar = new ala();
        alaVar.a = this;
        alaVar.b = ddcVarV2;
        alaVar.c = d06Var2;
        alaVar.d = this.P;
        alaVar.e = ghaVar;
        alaVar.f = wynVar;
        alaVar.g = s9iVar;
        alaVar.h = lq6Var;
        alaVar.i = bp6Var2;
        alaVar.j = qb7Var;
        alaVar.k = eq6Var2;
        alaVar.l = d06Var3;
        this.W = alaVar;
        this.X = new eyi(false, operaApplication.J());
        SettingsManager settingsManagerJ = ((OperaApplication) getApplication()).J();
        Resources resources = getResources();
        zyk zykVar2 = this.S;
        String scheme = ((Uri) zykVar2.getValue()).getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = ((Uri) zykVar2.getValue()).getHost();
        String str = host != null ? host : "";
        boolean z = resources.getBoolean(2131034131);
        if (scheme.length() != 0 && str.length() != 0) {
            N.MdX$dmbm((OperaBrowserContextHandle) N.M4QvXpDD(), scheme, str, oup.n0(djh.c(settingsManagerJ.n("default_webpage_zoom"), 50, z ? 200 : 130)));
        }
        super.v0();
        Y(this.Q);
    }

    @Override // defpackage.rz4, com.opera.android.FullscreenWebActivity
    public final void x0(WebContentsWrapper webContentsWrapper) {
        super.x0(webContentsWrapper);
        wy3 wy3Var = this.b0;
        if (wy3Var != null) {
            wy3Var.g();
        }
        this.b0 = null;
        fz4 fz4Var = this.c0;
        if (fz4Var != null) {
            fz4Var.g();
        }
        this.c0 = null;
        if (webContentsWrapper != null) {
            this.b0 = new wy3(webContentsWrapper, G0(), (Uri) this.S.getValue());
            this.c0 = new fz4(webContentsWrapper, G0());
            d06 d06Var = new d06(new j04(this, (byte) 9));
            ga6 ga6Var = this.P;
            ga6Var.b = d06Var;
            getLifecycle().a(new qs2(ga6Var, d06Var, (byte) 3));
        }
    }
}
