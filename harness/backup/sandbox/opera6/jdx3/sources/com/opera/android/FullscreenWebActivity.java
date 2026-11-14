package com.opera.android;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.ToolbarProgressBar;
import defpackage.dll;
import defpackage.dx3;
import defpackage.e73;
import defpackage.e7d;
import defpackage.fsp;
import defpackage.fzk;
import defpackage.jq9;
import defpackage.kq9;
import defpackage.ksc;
import defpackage.lq9;
import defpackage.lqm;
import defpackage.pxh;
import defpackage.q9n;
import defpackage.qwe;
import defpackage.shf;
import defpackage.u8n;
import defpackage.wt2;
import defpackage.wy3;
import defpackage.xgf;
import defpackage.xt2;
import defpackage.z22;
import java.util.Arrays;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.chromium.base.CommandLine;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public class FullscreenWebActivity extends dx3 {
    public static final HashSet I = new HashSet(Arrays.asList("http", "https", "chrome"));
    public boolean B;
    public shf C;
    public lq9 D;
    public lq9 F;
    public int G;
    public int H;
    public jq9 u;
    public WebContentsWrapper v;
    public kq9 w;
    public wt2 x;
    public wy3 y;
    public boolean z;
    public lqm A = lqm.i;
    public int E = 1;

    public static void A0(Context context, String str, pxh pxhVar) {
        context.startActivity(e0(context, FullscreenWebActivity.class, str, pxhVar, true, lqm.d));
    }

    public static Intent e0(Context context, Class cls, String str, pxh pxhVar, boolean z, lqm lqmVar) {
        Intent intent = str != null ? new Intent("android.intent.action.VIEW", Uri.parse(str), context.getApplicationContext(), cls) : new Intent(context.getApplicationContext(), (Class<?>) cls);
        if (pxhVar != null) {
            intent.putExtra("android.intent.extra.TITLE", pxhVar.a(context.getResources()));
        }
        intent.putExtra("fullscreen-open-new-tab", z);
        if (lqmVar != null) {
            intent.putExtra("fullscreen-origin-new-tab", lqmVar.ordinal());
        }
        return intent;
    }

    public static void z0(Context context, String str, pxh pxhVar) {
        context.startActivity(e0(context, FullscreenWebActivity.class, str, pxhVar, false, null));
    }

    @Override // defpackage.hjf
    public void C() {
        super.C();
        WebContentsWrapper webContentsWrapper = this.v;
        if (webContentsWrapper != null) {
            webContentsWrapper.i();
        }
    }

    @Override // defpackage.dx3
    public final boolean Z() {
        return false;
    }

    public final void d0(int i) {
        int i2 = i + this.H;
        if (this.E != 2) {
            WebContentsWrapper webContentsWrapper = this.v;
            if (webContentsWrapper instanceof ChromiumContent) {
                ((ChromiumContent) webContentsWrapper).A(i2);
                return;
            }
            return;
        }
        jq9 jq9Var = this.u;
        if (jq9Var == null || jq9Var.m == i2) {
            return;
        }
        jq9Var.m = i2;
        jq9Var.g();
    }

    public WebContentsWrapper f0(qi qiVar, WebContents webContents) {
        WebContentsWrapper webContentsWrapperT0 = t0(qiVar, webContents);
        kq9 kq9Var = this.w;
        if (kq9Var == null) {
            kq9Var = new kq9(this);
            this.w = kq9Var;
        }
        N.MqlMMZM3(webContentsWrapperT0.a, kq9Var);
        webContentsWrapperT0.g(null);
        return webContentsWrapperT0;
    }

    public void g0(WebContentsWrapper webContentsWrapper) {
        webContentsWrapper.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h0() {
        return getIntent().getAction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int i0(FullscreenWebActivity fullscreenWebActivity) {
        return f03.t(2130969099, fullscreenWebActivity, 2131100249);
    }

    public int j0() {
        return 2131558909;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Uri k0() {
        return getIntent().getData();
    }

    public Drawable l0(Context context) {
        Drawable drawableF = sgb.F(f03.E(2130968579, context, 2131231986), context);
        j14.o0(drawableF, f03.u(2130969110, context, 2131099825));
        return drawableF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence m0() {
        return getIntent().getStringExtra("android.intent.extra.TITLE");
    }

    public final WebContents n0() {
        WebContentsWrapper webContentsWrapper = this.v;
        if (webContentsWrapper == null || webContentsWrapper.h()) {
            return null;
        }
        return this.v.e();
    }

    public boolean o0(NavigationController navigationController) {
        if (navigationController == null || !navigationController.f()) {
            return false;
        }
        navigationController.e();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3, defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j0());
        View viewFindViewById = findViewById(2131361903);
        u0(viewFindViewById);
        w0(viewFindViewById);
        CommandLine commandLine = ((OperaApplication) getApplication()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(this, commandLine);
        wt2 wt2Var = new wt2(this, (byte) 3);
        this.x = wt2Var;
        e7d.a(this, wt2Var);
        getOnBackPressedDispatcher().a(this, new xt2(this, (byte) 4));
    }

    @Override // defpackage.dx3, defpackage.hjf
    public void onDestroy() {
        x0(null);
        wy3 wy3Var = this.y;
        if (wy3Var != null) {
            wy3Var.g();
        }
        jq9 jq9Var = this.u;
        if (jq9Var != null) {
            c5o c5oVar = ((ContentViewRenderView) jq9Var).c;
            ((SurfaceView) c5oVar.a).getHolder().removeCallback((yr5) c5oVar.b);
            ((ContentViewRenderView) jq9Var).b = null;
            N.MTwjIV_e(((ContentViewRenderView) jq9Var).a);
            ((ContentViewRenderView) jq9Var).a = 0L;
            jq9Var.j = false;
            this.u = null;
        }
        wt2 wt2Var = this.x;
        if (wt2Var != null) {
            e7d.c(wt2Var);
            this.x = null;
        }
        this.C = null;
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        if (this.v != null) {
            p0();
        } else {
            this.z = true;
        }
    }

    @Override // defpackage.dx3
    public void onStop() {
        super.onStop();
        this.z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p0() {
        if (!"android.intent.action.VIEW".equals(h0())) {
            finish();
            return;
        }
        CharSequence charSequenceM0 = m0();
        Uri uriK0 = k0();
        if (uriK0 != null && !Uri.EMPTY.equals(uriK0)) {
            s0(uriK0, 0, charSequenceM0 == null ? 1 : 0);
        }
        if (charSequenceM0 != null) {
            setTitle(charSequenceM0);
        }
        this.B = getIntent().getBooleanExtra("fullscreen-open-new-tab", false);
        lqm lqmVarD = lqm.d(getIntent().getIntExtra("fullscreen-origin-new-tab", -1));
        if (lqmVarD == null) {
            lqmVarD = lqm.i;
        }
        this.A = lqmVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(GURL gurl) {
        if (this.B) {
            xgf xgfVar = new xgf(gurl.g());
            xgfVar.m = this.A;
            xgfVar.n = true;
            zi4.u(this, xgfVar);
            finish();
            return;
        }
        ksc kscVar = new ksc(gurl, 6);
        WebContents webContentsN0 = n0();
        if (webContentsN0 != null) {
            webContentsN0.q().r(kscVar);
        }
    }

    public void r0(int i, String str) {
        ksc kscVar = new ksc(str, 6);
        if (i == 0) {
            kscVar.k = true;
        } else if (i == 1) {
            kscVar.k = false;
        }
        WebContents webContentsN0 = n0();
        if (webContentsN0 != null) {
            webContentsN0.q().r(kscVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(Uri uri, int i, int i2) {
        GURL gurl;
        if (!I.contains(uri.getScheme())) {
            finish();
            return;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            gurl = zs9.a;
        } else {
            GURL.a();
            gurl = (GURL) N.Ml2KxI$W(string);
        }
        String strH = gurl.h();
        if (strH == null) {
            finish();
            return;
        }
        if (i2 == 1) {
            setTitle(strH);
        }
        r0(i, strH);
    }

    public WebContentsWrapper t0(qi qiVar, WebContents webContents) {
        return new WebContentsWrapper(qiVar, webContents, 0);
    }

    public void u0(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v0() {
        ViewGroup viewGroup = (ViewGroup) findViewById(2131361903);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(2131365082);
        View viewFindViewById = viewGroup.findViewById(2131364795);
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) findViewById(2131363061);
        if (toolbarProgressBar != null) {
            this.C = new shf(toolbarProgressBar);
        }
        WebContentsWrapper webContentsWrapperF0 = f0(this.j, (WebContents) N.M_FZHKB_(false, false));
        jq9 jq9Var = new jq9(viewGroup2);
        this.u = jq9Var;
        jq9Var.f(this.j);
        x0(webContentsWrapperF0);
        qwe qweVarB = ((OperaApplication) getApplication()).B();
        if (viewFindViewById != null) {
            qweVarB.b(viewFindViewById);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(p37.X(i0(this), qweVarB.a.a)));
        this.y = new wy3(this, this.v, viewGroup2);
        l5b l5bVar = q9n.c;
        View view = (Toolbar) viewGroup.findViewById(2131364794);
        byte b = 7;
        if (view != null) {
            e73 e73Var = new e73(this, view, b);
            dll dllVarS = q9n.s(view);
            if (dllVarS != null) {
                u8n.b(dllVarS, view, e73Var);
            }
            e73Var.a(view);
            setSupportActionBar(view);
            getSupportActionBar().o();
        }
        s6h s6hVar = new s6h(this, viewGroup);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(viewGroup2, s6hVar);
        View viewFindViewById2 = viewGroup.findViewById(2131362089);
        if (viewFindViewById2 != null) {
            viewFindViewById2.addOnLayoutChangeListener(new z22(this, b));
        }
        if (this.z) {
            this.z = false;
            p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w0(View view) {
        Window window = getWindow();
        String[] strArr = OperaApplication.K;
        new fzk(view, window, ((OperaApplication) getApplication()).B());
    }

    public void x0(WebContentsWrapper webContentsWrapper) {
        WebContentsWrapper webContentsWrapper2 = this.v;
        if (webContentsWrapper2 != webContentsWrapper) {
            this.v = webContentsWrapper;
            lq9 lq9Var = this.D;
            if (lq9Var != null) {
                lq9Var.g();
                this.D = null;
            }
            lq9 lq9Var2 = this.F;
            if (lq9Var2 != null) {
                lq9Var2.g();
                this.F = null;
            }
            WebContentsWrapper webContentsWrapper3 = this.v;
            jq9 jq9Var = this.u;
            if (webContentsWrapper3 != null) {
                jq9Var.c(webContentsWrapper3.e());
                this.u.addView(this.v.getView());
                wy3 wy3Var = this.y;
                if (wy3Var != null) {
                    FullscreenWebActivity fullscreenWebActivity = (FullscreenWebActivity) wy3Var.e;
                    wy3Var.g();
                    if (fullscreenWebActivity.u.getParent() == null) {
                        ((ViewGroup) wy3Var.d).addView((View) fullscreenWebActivity.u, 0);
                    }
                    fullscreenWebActivity.u.setVisibility(0);
                }
                this.v.e().v1(2);
                if (this.C != null) {
                    this.D = new lq9(this, this.v, (byte) 1);
                }
                this.F = new lq9(this, this.v, (byte) 0);
                y0(this.v.e().x0());
                d0(this.G);
            } else {
                jq9Var.c((WebContents) null);
            }
            if (webContentsWrapper2 != null) {
                this.u.removeView(webContentsWrapper2.getView());
                webContentsWrapper2.e().v1(0);
                g0(webContentsWrapper2);
            }
        }
    }

    public final void y0(int i) {
        int i2 = this.E;
        if (i == i2) {
            return;
        }
        if (this.G != 0) {
            if ((i2 == 2) != (i == 2)) {
                d0(0);
                this.E = i;
                d0(this.G);
                return;
            }
        }
        this.E = i;
    }
}
