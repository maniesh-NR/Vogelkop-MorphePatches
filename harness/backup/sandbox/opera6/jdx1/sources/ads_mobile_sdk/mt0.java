package ads_mobile_sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import defpackage.c26;
import defpackage.fsg;
import defpackage.gcf;
import defpackage.hkm;
import defpackage.i3o;
import defpackage.j3o;
import defpackage.kcf;
import defpackage.o5p;
import defpackage.obp;
import defpackage.qbp;
import defpackage.qqo;
import defpackage.rf4;
import defpackage.w1h;
import defpackage.xp9;
import defpackage.zch;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class mt0 extends gcf implements o5p, obp {
    public static final /* synthetic */ xtb[] D = {zch.b(mt0.class, "hasContentViewBeenSet", "getHasContentViewBeenSet()Z")};
    public boolean A;
    public d3k B;
    public boolean C;
    public final Context a;
    public final nx5 b;
    public final CoroutineContext c;
    public final nx5 d;
    public final qr0 e;
    public final ah3 f;
    public final String g;
    public final ax0 h;
    public final e7 i;
    public final Optional j;
    public d3k k;
    public AdActivity l;
    public final ji m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public RelativeLayout p;
    public ViewGroup q;
    public y46 r;
    public boolean s;
    public ev t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Toolbar x;
    public final pfe y;
    public int z;

    public mt0(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, ax0 ax0Var, e7 e7Var, Optional optional) {
        super(true);
        this.a = context;
        this.b = nx5Var;
        this.c = coroutineContext;
        this.d = nx5Var2;
        this.e = qr0Var;
        this.f = ah3Var;
        this.g = str;
        this.h = ax0Var;
        this.i = e7Var;
        this.j = optional;
        this.m = new ji((Object) null, Boolean.FALSE);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.y = new pfe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        if (defpackage.na2.Z(r12, r4, r0) != r1) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[Catch: all -> 0x0131, PHI: r2 r11
      0x00f6: PHI (r2v8 ads_mobile_sdk.mt0) = (r2v7 ads_mobile_sdk.mt0), (r2v10 ads_mobile_sdk.mt0) binds: [B:57:0x00f4, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r11v7 pfe) = (r11v6 pfe), (r11v16 pfe) binds: [B:57:0x00f4, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:16:0x0034, B:58:0x00f6, B:61:0x00fc, B:63:0x0100, B:64:0x0115), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.mt0 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt0.a(ads_mobile_sdk.mt0, nt5):java.lang.Object");
    }

    public Toolbar a(RelativeLayout relativeLayout) {
        return a(relativeLayout, "");
    }

    public final Toolbar a(RelativeLayout relativeLayout, String str) {
        Toolbar toolbar = new Toolbar(this.l);
        toolbar.setId(View.generateViewId());
        ViewGroup viewGroup = this.q;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setId(View.generateViewId());
        toolbar.setBackgroundColor(-12303292);
        toolbar.setTitleMarginStart(0);
        toolbar.setSubtitle(str);
        toolbar.setVisibility(0);
        toolbar.setContentDescription("gma_custom_webview_toolbar");
        try {
            toolbar.setNavigationIcon(this.a.getResources().getDrawable(2131231169, null));
        } catch (Resources.NotFoundException e) {
            xu0.a("Error obtaining close icon.", e, 4);
        } catch (NullPointerException e2) {
            xu0.a("Error obtaining close icon.", e2, 4);
        }
        toolbar.setNavigationOnClickListener(new pkm(this, (byte) 21));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        relativeLayout.addView(toolbar, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, toolbar.getId());
        layoutParams2.addRule(12);
        View view = this.q;
        relativeLayout.addView(view != null ? view : null, layoutParams2);
        return toolbar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[PHI: r11 r12
      0x00ba: PHI (r11v4 ads_mobile_sdk.cy0) = (r11v3 ads_mobile_sdk.cy0), (r11v11 ads_mobile_sdk.cy0) binds: [B:36:0x00b8, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r12v4 ads_mobile_sdk.mt0) = (r12v3 ads_mobile_sdk.mt0), (r12v10 ads_mobile_sdk.mt0) binds: [B:36:0x00b8, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt0.a(ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    public Object a(RelativeLayout relativeLayout, mt5 mt5Var) {
        return Unit.a;
    }

    @Override // defpackage.o5p
    public Object a(xp9 xp9Var, mt5 mt5Var) {
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r6.b(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:13:0x002b, B:30:0x0071, B:32:0x0075, B:33:0x0078, B:35:0x007c), top: B:44:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.lt0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.lt0 r0 = (ads_mobile_sdk.lt0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.lt0 r0 = new ads_mobile_sdk.lt0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            pfe r6 = r0.b
            ads_mobile_sdk.mt0 r7 = r0.a
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L82
            goto L71
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L35:
            boolean r7 = r0.c
            pfe r6 = r0.b
            ads_mobile_sdk.mt0 r2 = r0.a
            defpackage.ybh.y(r8)
            r8 = r6
            r6 = r2
            goto L54
        L41:
            defpackage.ybh.y(r8)
            r0.a = r6
            pfe r8 = r6.y
            r0.b = r8
            r0.c = r7
            r0.f = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L6e
        L54:
            boolean r2 = r6.C     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L7b
            r6.A = r7     // Catch: java.lang.Throwable -> L84
            if (r7 != 0) goto L7b
            r6.C = r4     // Catch: java.lang.Throwable -> L84
            d3k r7 = r6.B     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L6f
            r0.a = r6     // Catch: java.lang.Throwable -> L84
            r0.b = r8     // Catch: java.lang.Throwable -> L84
            r0.f = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r7 = r6.b(r0)     // Catch: java.lang.Throwable -> L84
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r7 = r6
            r6 = r8
        L71:
            d3k r8 = r7.B     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L78
            r8.k(r5)     // Catch: java.lang.Throwable -> L82
        L78:
            r7.B = r5     // Catch: java.lang.Throwable -> L82
            goto L7c
        L7b:
            r6 = r8
        L7c:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L82
            r6.l(r5)
            return r7
        L82:
            r7 = move-exception
            goto L86
        L84:
            r7 = move-exception
            r6 = r8
        L86:
            r6.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt0.a(boolean, nt5):java.lang.Object");
    }

    @Override // defpackage.o5p
    public final void a() {
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new qg2((byte) 16));
    }

    public abstract void a(int i);

    public final void a(int i, boolean z) {
        AdActivity adActivity;
        Window window;
        RelativeLayout relativeLayout = this.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(z ? 0 : -16777216);
        }
        this.v = z;
        this.z = i;
        if (Build.VERSION.SDK_INT >= 31) {
            qr0 qr0Var = this.e;
            qr0Var.getClass();
            if (!((Boolean) qr0Var.a("gads:enable_blur_transparent_background", Boolean.TRUE, fo.a)).booleanValue() || (adActivity = this.l) == null || (window = adActivity.getWindow()) == null) {
                return;
            }
            window.setBackgroundBlurRadius(i);
        }
    }

    @Override // defpackage.obp
    public void a(ev evVar) {
        this.t = evVar;
        AdActivity adActivity = this.l;
        if (adActivity != null) {
            adActivity.finish();
        }
    }

    @Override // defpackage.o5p
    public final void a(AdActivity adActivity) {
        int i;
        int i2;
        Window window;
        this.l = adActivity;
        if (this.o.get()) {
            adActivity.finish();
            return;
        }
        byte b = 1;
        if (!this.n.getAndSet(true)) {
            d3k d3kVar = this.k;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            adActivity.getOnBackPressedDispatcher().a(adActivity, this);
            fo foVar = fo.a;
            o();
            if (i()) {
                j().setLayerType(1, null);
            } else {
                Window window2 = adActivity.getWindow();
                if (window2 != null) {
                    window2.setFlags(16777216, 16777216);
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(adActivity);
            relativeLayout.setId(View.generateViewId());
            relativeLayout.setBackgroundColor(this.v ? 0 : -16777216);
            this.p = relativeLayout;
            int i3 = Build.VERSION.SDK_INT;
            qr0 qr0Var = this.e;
            if (i3 >= 31) {
                qr0Var.getClass();
                if (((Boolean) qr0Var.a("gads:enable_blur_transparent_background", Boolean.TRUE, foVar)).booleanValue() && (window = adActivity.getWindow()) != null) {
                    window.setBackgroundBlurRadius(this.z);
                }
            }
            byte b2 = 8;
            if (this.w) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(j(), false);
                qr0Var.getClass();
                Boolean bool = Boolean.FALSE;
                if (((Boolean) qr0Var.a("gads:custom_webview_disable_text_classifier:enabled", bool, foVar)).booleanValue()) {
                    j().setTextClassifier(TextClassifier.NO_OP);
                }
                if (((Boolean) qr0Var.a("gads:custom_webview_disable_downloads:enabled", bool, foVar)).booleanValue()) {
                    j().setDownloadListener(new qbp());
                }
                adActivity.setShowWhenLocked(true);
                this.x = a(relativeLayout);
            } else {
                ViewGroup viewGroup = this.q;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                relativeLayout.addView(viewGroup, -1, -1);
                qr0Var.getClass();
                int iIntValue = ((Number) qr0Var.a("gad:interstitial:close_button_padding_dip", (Object) 20, (Function1) fo.a$11)).intValue();
                boolean zBooleanValue = ((Boolean) qr0Var.a("gads:force_top_right_close_button:enabled", Boolean.TRUE, foVar)).booleanValue();
                if (zBooleanValue) {
                    i2 = iIntValue;
                    i = 0;
                } else {
                    i = iIntValue;
                    i2 = 0;
                }
                View y46Var = new y46(adActivity, (String) qr0Var.a("gads:close_button_asset_name", "white", fo.a$23), new yu(i2, i, iIntValue));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(10);
                if (zBooleanValue) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(9);
                }
                this.r = y46Var;
                ((y46) y46Var).b = new qqo(this, b);
                if ((!this.s || h()) && !f()) {
                    y46 y46Var2 = this.r;
                    if (y46Var2 != null) {
                        y46Var2.setVisibility(0);
                    }
                    this.s = false;
                } else {
                    y46 y46Var3 = this.r;
                    if (y46Var3 != null) {
                        y46Var3.setVisibility(8);
                    }
                    this.s = true;
                }
                RelativeLayout relativeLayout2 = this.p;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(y46Var, layoutParams);
                }
                a((y46) y46Var);
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
            adActivity.setContentView(relativeLayout, layoutParams2);
            mt5 mt5Var = null;
            c26.K(new kt0(this, mt5Var, b));
            defpackage.na2.B(this.d, h.a, null, new fsg(new hkm(this, relativeLayout, mt5Var, b2), mt5Var, (byte) 3), 2);
        }
        this.j.ifPresent(new qg2((byte) 15));
    }

    public void a(y46 y46Var) {
    }

    public final boolean a(Context context) {
        ah3 ah3Var = this.f;
        nx5 nx5Var = this.d;
        byte b = 4;
        mt5 mt5Var = null;
        try {
            j().o = this;
            context.startActivity(this.h.a(context, this));
            l();
            return true;
        } catch (ActivityNotFoundException e) {
            xh3.a(nx5Var, new kt0(this, mt5Var, b));
            xh3.a("Exception starting Activity", e, 4);
            ah3Var.a("AdActivityLauncher.show", (Throwable) e);
            return false;
        } catch (SecurityException e2) {
            xh3.a(nx5Var, new kt0(this, mt5Var, (byte) 5));
            xh3.a("Exception starting Activity", e2, 4);
            ah3Var.a("AdActivityLauncher.show", (Throwable) e2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r5 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.cy0 r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.vs0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.vs0 r0 = (ads_mobile_sdk.vs0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.vs0 r0 = new ads_mobile_sdk.vs0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r8)
            goto L70
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            ads_mobile_sdk.cy0 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L5b
        L37:
            defpackage.ybh.y(r8)
            prb r8 = new prb
            r8.<init>()
            java.lang.String r6 = r6.g
            java.lang.String r2 = "version"
            r8.r(r2, r6)
            ads_mobile_sdk.aq1 r6 = new ads_mobile_sdk.aq1
            r2 = 3
            r6.<init>(r7, r8, r5, r2)
            defpackage.c26.K(r6)
            r0.a = r7
            r0.d = r4
            java.lang.String r6 = "aes2"
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 == r1) goto L6f
        L5b:
            r0.a = r5
            r0.d = r3
            ads_mobile_sdk.q70 r6 = r7.d
            if (r6 == 0) goto L6d
            java.lang.String r7 = "native:view_show"
            java.lang.Object r5 = ads_mobile_sdk.q70.a(r6, r7, r0)
            if (r5 == r1) goto L6d
            ads_mobile_sdk.wf3 r5 = (ads_mobile_sdk.wf3) r5
        L6d:
            if (r5 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt0.b(ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    public abstract Object b(nt5 nt5Var);

    @Override // defpackage.o5p
    public final void b() {
        this.j.ifPresent(new qg2((byte) 13));
    }

    public Object c(kuk kukVar) {
        return a(this, (nt5) kukVar);
    }

    @Override // defpackage.o5p
    public final void c() {
        this.j.ifPresent(new qg2((byte) 17));
    }

    public Unit d(mt5 mt5Var) {
        return Unit.a;
    }

    public Object e(rf4 rf4Var) {
        return Unit.a;
    }

    @Override // defpackage.o5p
    public final void e() {
        this.m.setValue(D[0], Boolean.TRUE);
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return false;
    }

    @Override // defpackage.gcf
    public final void handleOnBackPressed() {
        kcf onBackPressedDispatcher;
        if (j().canGoBack()) {
            j().goBack();
            return;
        }
        if (!((AtomicBoolean) this.i.a).get() && !j().k.get()) {
            mt5 mt5Var = null;
            byte b = 3;
            defpackage.na2.B(this.b, h.a, null, new fsg(new kt0(this, mt5Var, b), mt5Var, b), 2);
            return;
        }
        this.t = ev.a;
        setEnabled(false);
        AdActivity adActivity = this.l;
        if (adActivity == null || (onBackPressedDispatcher = adActivity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.d();
    }

    public boolean i() {
        return false;
    }

    public abstract cy0 j();

    public abstract int k();

    public final void l() {
        mt5 mt5Var = null;
        rf4 rf4Var = new rf4((byte) 21, mt5Var, this);
        this.k = defpackage.na2.B(this.d, h.a, null, new fsg(rf4Var, mt5Var, (byte) 3), 2);
    }

    public final void n() {
        AdActivity adActivity = this.l;
        if (adActivity == null || !adActivity.isFinishing() || this.o.get()) {
            return;
        }
        mt5 mt5Var = null;
        kt0 kt0Var = new kt0(this, mt5Var, (byte) 0);
        defpackage.na2.B(this.b, h.a, null, new fsg(kt0Var, mt5Var, (byte) 3), 2);
    }

    public final void o() {
        try {
            AdActivity adActivity = this.l;
            if (adActivity == null) {
                return;
            }
            adActivity.setRequestedOrientation(k());
        } catch (IllegalStateException e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Unable to update orientation: " + e, null);
        }
    }

    @Override // defpackage.o5p
    public final void onConfigurationChanged() {
    }

    @Override // defpackage.o5p
    public final void onDestroy() {
        n();
        this.j.ifPresent(new qg2((byte) 20));
    }

    @Override // defpackage.o5p
    public final void onPause() {
        n();
        this.j.ifPresent(new qg2((byte) 14));
    }

    @Override // defpackage.o5p
    public final void onResume() {
        AdActivity adActivity;
        Window window;
        AdActivity adActivity2 = this.l;
        if (adActivity2 != null && !adActivity2.isInMultiWindowMode() && (adActivity = this.l) != null && (window = adActivity.getWindow()) != null) {
            oji ojiVar = new oji(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            w1h j3oVar = i >= 35 ? new j3o(window, ojiVar) : i >= 30 ? new i3o(window, ojiVar) : new h3o(window, ojiVar);
            if (this.u) {
                j3oVar.x();
            }
            j3oVar.p(this.u ? 519 : 1);
        }
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new qg2((byte) 18));
    }

    @Override // defpackage.o5p
    public void onStop() {
        if (!j().k.get()) {
            j().onPause();
        }
        n();
        this.j.ifPresent(new qg2((byte) 19));
    }
}
