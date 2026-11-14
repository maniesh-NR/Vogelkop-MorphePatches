package com.opera.android.weather.ui;

import J.N;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.browser.dialog.DialogDelegate;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.settings.SettingsManager;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import defpackage.ay;
import defpackage.bon;
import defpackage.eq6;
import defpackage.eyi;
import defpackage.ft6;
import defpackage.glm;
import defpackage.ipn;
import defpackage.kon;
import defpackage.kpn;
import defpackage.ks3;
import defpackage.kze;
import defpackage.l45;
import defpackage.lpn;
import defpackage.lrk;
import defpackage.lz6;
import defpackage.mcj;
import defpackage.mpn;
import defpackage.oam;
import defpackage.ole;
import defpackage.opn;
import defpackage.oz6;
import defpackage.pn6;
import defpackage.ppn;
import defpackage.pt1;
import defpackage.qe6;
import defpackage.qfl;
import defpackage.qp6;
import defpackage.qpn;
import defpackage.qq6;
import defpackage.qs2;
import defpackage.r9i;
import defpackage.rpn;
import defpackage.rz4;
import defpackage.tah;
import defpackage.te5;
import defpackage.upn;
import defpackage.vsl;
import defpackage.w6j;
import defpackage.wsl;
import defpackage.wyn;
import defpackage.xq6;
import defpackage.xsl;
import defpackage.z63;
import defpackage.zq6;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0004\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/opera/android/weather/ui/WeatherWidgetActivity;", "Lrz4;", "<init>", "()V", "kpn", "lpn", "mpn", "z63", "ynh", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeatherWidgetActivity extends rz4 {
    public static final /* synthetic */ int e0 = 0;
    public final w6j O;
    public final qe6 P;
    public final ay Q;
    public final zyk R;
    public mcj S;
    public oam T;
    public xm5 U;
    public ks3 V;
    public eyi W;
    public r9i X;
    public pt1 Y;
    public z63 Z;
    public lpn a0;
    public kpn b0;
    public kpn c0;
    public boolean d0;

    public WeatherWidgetActivity() {
        super(17);
        this.O = new w6j(uqh.a(rpn.class), new ppn(this, (byte) 1), new ppn(this, (byte) 0), new ppn(this, (byte) 2));
        this.P = new qe6((byte) 16);
        this.Q = new ay((Object) this, (byte) 14);
        this.R = z4c.b(new m2n(this, (byte) 7));
    }

    @Override // defpackage.rz4
    public final DialogDelegate B0() {
        return new mpn((Uri) this.R.getValue());
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.hjf
    public final void C() {
        eyi eyiVar = this.W;
        if (eyiVar == null) {
            eyiVar = null;
        }
        xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
        super.C();
    }

    @Override // defpackage.rz4
    public final void D0(WebContents webContents) {
        ks3 ks3Var = this.V;
        if (ks3Var == null) {
            ks3Var = null;
        }
        this.X = new r9i(this, webContents, ks3Var);
        xm5 xm5Var = this.U;
        if (xm5Var == null) {
            xm5Var = null;
        }
        f99 f99VarT = qbe.t(scd.D((plh) xm5Var.a, getLifecycle()));
        r9i r9iVar = this.X;
        if (r9iVar == null) {
            r9iVar = null;
        }
        j14.Y(new z99(f99VarT, new te5(2, (upn) r9iVar.e, upn.class, "viewsV1NotifyHostStateChanged", "viewsV1NotifyHostStateChanged(Lcom/opera/android/genapi/weatherrpc/HostState;)V", 4, (byte) 7), (byte) 2), cqp.V(getLifecycle()));
        eyi eyiVar = this.W;
        ((kze) (eyiVar != null ? eyiVar : null).d).j(this, new glm(new qfl((Object) this, (byte) 23), (byte) 4));
    }

    public final void F0(xsl xslVar) {
        boolean zV;
        ColorStateList colorStateListValueOf;
        pt1 pt1Var = this.Y;
        if (pt1Var == null) {
            pt1Var = null;
        }
        FrameLayout frameLayout = (FrameLayout) pt1Var.g;
        mcj mcjVar = this.S;
        if (mcjVar == null) {
            mcjVar = null;
        }
        Context context = frameLayout.getContext();
        vsl vslVar = vsl.a;
        if (Intrinsics.a(xslVar, vslVar)) {
            zV = f03.V(R.attr.windowLightStatusBar, context);
        } else {
            if (!(xslVar instanceof wsl)) {
                h9o.p();
                return;
            }
            zV = !((wsl) xslVar).a;
        }
        mcjVar.t(zV);
        pt1 pt1Var2 = this.Y;
        LayoutDirectionToolbar layoutDirectionToolbar = (pt1Var2 != null ? pt1Var2 : null).c;
        Context context2 = layoutDirectionToolbar.getContext();
        if (Intrinsics.a(xslVar, vslVar)) {
            colorStateListValueOf = f03.I(context2) ? ColorStateList.valueOf(-16777216) : ColorStateList.valueOf(-1);
        } else {
            if (!(xslVar instanceof wsl)) {
                h9o.p();
                return;
            }
            colorStateListValueOf = ((wsl) xslVar).a ? ColorStateList.valueOf(-1) : ColorStateList.valueOf(-16777216);
        }
        ((Toolbar) layoutDirectionToolbar).y = colorStateListValueOf;
        yq1 yq1Var = ((Toolbar) layoutDirectionToolbar).b;
        if (yq1Var != null) {
            yq1Var.setTextColor(colorStateListValueOf);
        }
    }

    public final void G0() {
        lpn lpnVar = this.a0;
        if (lpnVar != null) {
            lpnVar.g();
        }
        this.a0 = null;
        kpn kpnVar = this.b0;
        if (kpnVar != null) {
            kpnVar.g();
        }
        this.b0 = null;
        kpn kpnVar2 = this.c0;
        if (kpnVar2 != null) {
            kpnVar2.g();
        }
        this.c0 = null;
    }

    public final rpn H0() {
        return (rpn) this.O.getValue();
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
        return 2131559555;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Uri k0() {
        return (Uri) this.R.getValue();
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Drawable l0(Context context) {
        ColorStateList colorStateListValueOf;
        Drawable drawableI0 = j14.i0(2131231986, context);
        xsl xslVar = ((qpn) H0().d.a.getValue()).a.b;
        if (Intrinsics.a(xslVar, vsl.a)) {
            colorStateListValueOf = f03.I(context) ? ColorStateList.valueOf(-16777216) : ColorStateList.valueOf(-1);
        } else {
            if (!(xslVar instanceof wsl)) {
                h9o.p();
                return null;
            }
            colorStateListValueOf = ((wsl) xslVar).a ? ColorStateList.valueOf(-1) : ColorStateList.valueOf(-16777216);
        }
        drawableI0.mutate();
        drawableI0.setTintList(colorStateListValueOf);
        return drawableI0;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final CharSequence m0() {
        return ((qpn) H0().d.a.getValue()).a.a.a(getResources());
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final boolean o0(NavigationController navigationController) {
        if (((qpn) H0().d.a.getValue()).d) {
            return false;
        }
        return super.o0(navigationController);
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        super.onDestroy();
        G0();
        z63 z63Var = this.Z;
        if (z63Var == null) {
            z63Var = null;
        }
        z63Var.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        super.p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f A[PHI: r0
      0x013f: PHI (r0v1 int) = (r0v0 int), (r0v3 int), (r0v9 int) binds: [B:3:0x000e, B:5:0x0017, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.opera.android.FullscreenWebActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.weather.ui.WeatherWidgetActivity.u0(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final void v0() throws Resources.NotFoundException {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        lz6 lz6Var = (lz6) operaApplication.J.get();
        SettingsManager settingsManagerJ = operaApplication.J();
        oz6 oz6VarD = lz6Var.d();
        zyk zykVar = lz6Var.j;
        this.T = new oam(settingsManagerJ, new eq6(oz6VarD));
        ddc ddcVarV = cqp.V(getLifecycle());
        oam oamVar = this.T;
        mt5 mt5Var = null;
        if (oamVar == null) {
            oamVar = null;
        }
        bon bonVar = lz6Var.d;
        qp6 qp6Var = (qp6) zykVar.getValue();
        oz6 oz6VarD2 = lz6Var.d();
        ft6 ft6VarC = lz6Var.c();
        w7j w7jVar = lz6Var.c;
        xm5 xm5Var = new xm5();
        byte b = 3;
        xm5Var.a = a26.l0(nb6.l(qbe.t(nb6.l((f99) oamVar.b, (jdj) oamVar.c, ((oz6) ((eq6) oamVar.a).a).e, new kon(4, null))), new ya9(oz6VarD2.d, w7jVar.m(), new x11((byte) 3, (mt5) null, bonVar), (byte) 0), new cw(new f99[]{qp6Var.b, ft6VarC.c, oz6VarD2.c, ft6VarC.d}, new zq6(5, null), (byte) 8), new xq6(4, mt5Var)), ddcVarV, aej.b, 1);
        this.U = xm5Var;
        ddc ddcVarV2 = cqp.V(getLifecycle());
        xm5 xm5Var2 = this.U;
        this.V = new ks3(ddcVarV2, xm5Var2 == null ? null : xm5Var2, this.P, new nv6(operaApplication.L().c), (wyn) operaApplication.r.m1.get(), (qp6) zykVar.getValue(), lz6Var.d(), lz6Var.c(), (pn6) lz6Var.m.getValue());
        this.W = new eyi(false, operaApplication.J());
        SettingsManager settingsManagerJ2 = ((OperaApplication) getApplication()).J();
        Resources resources = getResources();
        zyk zykVar2 = this.R;
        String scheme = ((Uri) zykVar2.getValue()).getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = ((Uri) zykVar2.getValue()).getHost();
        String str = host != null ? host : "";
        boolean z = resources.getBoolean(2131034131);
        if (scheme.length() != 0 && str.length() != 0) {
            N.MdX$dmbm((OperaBrowserContextHandle) N.M4QvXpDD(), scheme, str, oup.n0(djh.c(settingsManagerJ2.n("default_webpage_zoom"), 50, z ? 200 : 130)));
        }
        new l45(false, this, new s6h(lz6Var.a(), lz6Var.c(), false), (dq6) lz6Var.n.getValue()).L();
        na2.B(cqp.V(getLifecycle()), (CoroutineContext) null, (rx5) null, new opn(this, mt5Var, b), 3);
        super.v0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final void w0(View view) {
        mcj mcjVar = new mcj(getWindow());
        Window window = (Window) mcjVar.b;
        if (window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
            mcjVar.j();
        }
        if (window.getNavigationBarColor() != 0) {
            window.setNavigationBarColor(0);
            mcjVar.j();
        }
        this.S = mcjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [ipn] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ipn] */
    @Override // defpackage.rz4, com.opera.android.FullscreenWebActivity
    public final void x0(WebContentsWrapper webContentsWrapper) {
        super.x0(webContentsWrapper);
        G0();
        final byte b = 0;
        final byte b2 = 1;
        if (webContentsWrapper != null) {
            this.a0 = new lpn(webContentsWrapper, H0(), (Uri) this.R.getValue());
            this.b0 = new kpn(webContentsWrapper, H0(), b2);
            this.c0 = new kpn(webContentsWrapper, H0(), b);
        }
        z63 z63Var = this.Z;
        if (z63Var == null) {
            z63Var = null;
        }
        WebContents webContentsE = webContentsWrapper != null ? webContentsWrapper.e() : null;
        z63Var.d = webContentsE;
        if (webContentsE != null) {
            float f = ((Rect) z63Var.c).left;
            float f2 = z63Var.a;
            webContentsE.Q(new Rect((int) Math.ceil(f / f2), (int) Math.ceil(r0.top / f2), (int) Math.ceil(r0.right / f2), (int) Math.ceil(r0.bottom / f2)));
        }
        ChromiumContent chromiumContent = this.N;
        if (chromiumContent != null) {
            String[] strArr = OperaApplication.K;
            lz6 lz6Var = (lz6) ((OperaApplication) getApplication()).J.get();
            byte b3 = 2;
            Class<rpn> cls = rpn.class;
            tah tahVar = new tah(this, chromiumContent, this, (ipn) new esk(this) { // from class: ipn
                public final /* synthetic */ WeatherWidgetActivity b;

                {
                    this.b = this;
                }

                public final Object get() {
                    byte b4 = b;
                    WeatherWidgetActivity weatherWidgetActivity = this.b;
                    switch (b4) {
                        case 0:
                            int i = WeatherWidgetActivity.e0;
                            qim qimVar = weatherWidgetActivity.o;
                            Objects.requireNonNull(qimVar);
                            return qimVar.c;
                        default:
                            int i2 = WeatherWidgetActivity.e0;
                            sz4 sz4Var = weatherWidgetActivity.h;
                            if (sz4Var != null) {
                                return sz4Var;
                            }
                            qp2.o("Required value was null.");
                            return null;
                    }
                }
            }, (ipn) new esk(this) { // from class: ipn
                public final /* synthetic */ WeatherWidgetActivity b;

                {
                    this.b = this;
                }

                public final Object get() {
                    byte b4 = b2;
                    WeatherWidgetActivity weatherWidgetActivity = this.b;
                    switch (b4) {
                        case 0:
                            int i = WeatherWidgetActivity.e0;
                            qim qimVar = weatherWidgetActivity.o;
                            Objects.requireNonNull(qimVar);
                            return qimVar.c;
                        default:
                            int i2 = WeatherWidgetActivity.e0;
                            sz4 sz4Var = weatherWidgetActivity.h;
                            if (sz4Var != null) {
                                return sz4Var;
                            }
                            qp2.o("Required value was null.");
                            return null;
                    }
                }
            }, this.Q, new lrk(1, H0(), cls, "setToolbarAppearance", "setToolbarAppearance(Lcom/opera/android/weather/ui/ToolbarAppearance;)V", 0, (byte) 18), new lrk(1, H0(), cls, "setForceCloseOnBackNavigation", "setForceCloseOnBackNavigation(Z)V", 0, (byte) 19), new qq6(lz6Var.d(), b3), new nv6(lz6Var.c()), new ole(lz6Var.f));
            qe6 qe6Var = this.P;
            qe6Var.b = tahVar;
            getLifecycle().a(new qs2(qe6Var, tahVar, b3));
        }
    }
}
