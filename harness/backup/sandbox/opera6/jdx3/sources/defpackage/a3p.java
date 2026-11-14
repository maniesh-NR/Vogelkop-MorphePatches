package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.URLUtil;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class a3p extends RelativeLayout {
    public static final Map h0 = rbd.c(new Pair[]{new Pair("Cache-Control", "no-cache, no-store, must-revalidate"), new Pair("Pragma", "no-cache")});
    public int A;
    public final Rect B;
    public final Rect C;
    public final fr D;
    public final fr E;
    public volatile Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public View N;
    public Integer O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Integer S;
    public Boolean T;
    public Boolean U;
    public Boolean V;
    public final int W;
    public final File a;
    public boolean a0;
    public final sm b;
    public String b0;
    public final bpo c;
    public String c0;
    public final m1p d;
    public boolean d0;
    public final int e;
    public final kgo e0;
    public final int f;
    public volatile long f0;
    public final p7p g;
    public final AtomicBoolean g0;
    public final boolean h;
    public final Function0 i;
    public bxk j;
    public final boolean k;
    public final String l;
    public final zyk m;
    public final ConcurrentHashMap.KeySetView n;
    public j2p o;
    public j2p p;
    public j2p q;
    public RelativeLayout r;
    public ImageButton s;
    public final Activity t;
    public final GestureDetector u;
    public n2p v;
    public boolean w;
    public boolean x;
    public final ca2 y;
    public final dvj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[EDGE_INSN: B:24:0x0075->B:25:0x0076 BREAK  A[LOOP:0: B:18:0x0060->B:23:0x0072]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a3p(android.content.Context r3, java.io.File r4, defpackage.sm r5, defpackage.bpo r6, defpackage.m1p r7, int r8, int r9, defpackage.p7p r10, boolean r11, kotlin.jvm.functions.Function0 r12, defpackage.bxk r13, int r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3p.<init>(android.content.Context, java.io.File, sm, bpo, m1p, int, int, p7p, boolean, kotlin.jvm.functions.Function0, bxk, int):void");
    }

    public final void a() {
        ImageButton imageButton = this.s;
        if (imageButton != null) {
            Context context = imageButton.getContext();
            BitmapDrawable bitmapDrawableD = bcp.MRAID_CLOSE.d(context);
            BitmapDrawable bitmapDrawableD2 = bcp.MRAID_CLOSE_PRESSED.d(context);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{-16842919}, bitmapDrawableD);
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, bitmapDrawableD2);
            imageButton.setImageDrawable(stateListDrawable);
            imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void b() {
        String str;
        if (!this.I || !this.G || this.a0 || (str = this.c0) == null) {
            return;
        }
        if (StringsKt.N(str)) {
            str = null;
        }
        if (str != null) {
            this.a0 = true;
            p7p p7pVar = this.g;
            if (p7pVar != null) {
                voo vooVar = p7pVar.a;
                ylp ylpVar = vooVar instanceof ylp ? (ylp) vooVar : null;
                if (ylpVar != null) {
                    p7p.c("on_adm_injected", (List) ylpVar.D.getValue(), p7pVar.b);
                }
                p7pVar.a(0);
            }
            g("window.operaBridge.notifyReadyEvent(" + str + ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j2p c(android.content.Context r5) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getApplicationContext()
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            int r1 = r1.flags
            r1 = r1 & 2
            r2 = 1
            if (r1 != 0) goto L27
            java.util.List r1 = r8p.a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "com.opera.ads.demo"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 == 0) goto L2a
            java.util.List r0 = r8p.a
            java.lang.String r1 = ynh.e
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
        L27:
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
        L2a:
            android.content.Context r5 = r5.getApplicationContext()
            p0i r0 = t0i.b     // Catch: java.lang.Throwable -> L36
            j2p r0 = new j2p     // Catch: java.lang.Throwable -> L36
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L36
            goto L3f
        L36:
            r0 = move-exception
            p0i r1 = t0i.b
            q0i r1 = new q0i
            r1.<init>(r0)
            r0 = r1
        L3f:
            java.lang.Throwable r1 = t0i.d(r0)
            if (r1 == 0) goto L7a
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L71
            r0 = r1
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L71
            java.lang.String r3 = "theme="
            boolean r3 = kotlin.text.StringsKt.E(r0, r3, r2)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L62
            java.lang.String r3 = "Can't convert value"
            boolean r0 = kotlin.text.StringsKt.E(r0, r3, r2)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L71
        L62:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper     // Catch: java.lang.Throwable -> L72
            r1 = 16974391(0x1030237, float:2.406249E-38)
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L72
            j2p r5 = new j2p     // Catch: java.lang.Throwable -> L72
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L72
            r0 = r5
            goto L7a
        L71:
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            p0i r0 = t0i.b
            q0i r0 = new q0i
            r0.<init>(r5)
        L7a:
            ybh.y(r0)
            j2p r0 = (defpackage.j2p) r0
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            int r1 = r4.e
            int r3 = r4.f
            r5.<init>(r1, r3)
            r0.setLayoutParams(r5)
            myo r5 = new myo
            r5.<init>(r4, r2)
            r0.setWebChromeClient(r5)
            c5d r5 = new c5d
            r1 = 4
            r5.<init>(r4, r1)
            r0.setWebViewClient(r5)
            k2p r4 = new k2p
            r4.<init>()
            r0.setWebViewRenderProcessClient(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3p.c(android.content.Context):j2p");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.q2p
            if (r0 == 0) goto L13
            r0 = r7
            q2p r0 = (defpackage.q2p) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q2p r0 = new q2p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.t
            px5 r7 = px5.a
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ybh.y(r5)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r2
        L2e:
            ybh.y(r5)
            p0i r5 = t0i.b     // Catch: java.lang.Throwable -> L4c
            cv6 r5 = bb7.a     // Catch: java.lang.Throwable -> L4c
            mr6 r5 = mr6.b     // Catch: java.lang.Throwable -> L4c
            hmo r1 = new hmo     // Catch: java.lang.Throwable -> L4c
            r4 = 8
            r1.<init>(r4, r2, r6)     // Catch: java.lang.Throwable -> L4c
            r0.v = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = na2.Z(r5, r1, r0)     // Catch: java.lang.Throwable -> L4c
            if (r5 != r7) goto L47
            return r7
        L47:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L4c
            p0i r6 = t0i.b     // Catch: java.lang.Throwable -> L4c
            goto L55
        L4c:
            r5 = move-exception
            p0i r6 = t0i.b
            q0i r6 = new q0i
            r6.<init>(r5)
            r5 = r6
        L55:
            boolean r6 = r5 instanceof q0i
            if (r6 != 0) goto L5a
            r2 = r5
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3p.d(java.lang.String, nt5):java.io.Serializable");
    }

    public final String e(Uri uri) {
        Intrinsics.a(uri.getHost(), "appassets.androidplatform.net");
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        return StringsKt.T(path, "/" + this.l + '/');
    }

    public final void f(j2p j2pVar) {
        Unit unit;
        View q0iVar;
        Boolean q0iVar2;
        Activity activity = this.t;
        boolean z = this.k;
        if (!z) {
            this.v = n2p.EXPANDED;
            ito[] itoVarArr = ito.a;
            if (activity != null) {
                int i = activity.getWindow().getAttributes().flags;
                this.Q = (i & 1024) != 0;
                this.R = (i & 2048) != 0;
                ActionBar actionBar = activity.getActionBar();
                if (actionBar != null) {
                    this.P = actionBar.isShowing();
                    actionBar.hide();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    try {
                        p0i p0iVar = t0i.b;
                        View viewFindViewById = activity.findViewById(R.id.title);
                        q0i parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
                        q0iVar = parent instanceof View ? (View) parent : null;
                    } catch (Throwable th) {
                        p0i p0iVar2 = t0i.b;
                        q0iVar = new q0i(th);
                    }
                    if (q0iVar instanceof q0i) {
                        q0iVar = null;
                    }
                    View view = q0iVar;
                    if (view != null) {
                        this.O = Integer.valueOf(view.getVisibility());
                        view.setVisibility(8);
                    } else {
                        view = null;
                    }
                    this.N = view;
                }
                ito[] itoVarArr2 = ito.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    Window window = activity.getWindow();
                    WindowInsets rootWindowInsets = window.getDecorView().getRootWindowInsets();
                    this.T = rootWindowInsets != null ? Boolean.valueOf(rootWindowInsets.isVisible(WindowInsets.Type.statusBars())) : null;
                    this.U = rootWindowInsets != null ? Boolean.valueOf(rootWindowInsets.isVisible(WindowInsets.Type.navigationBars())) : null;
                    try {
                        p0i p0iVar3 = t0i.b;
                        Method declaredMethod = Window.class.getDeclaredMethod("getDecorFitsSystemWindows", null);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod.invoke(window, null);
                        q0iVar2 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                    } catch (Throwable th2) {
                        p0i p0iVar4 = t0i.b;
                        q0iVar2 = new q0i(th2);
                    }
                    if (q0iVar2 instanceof q0i) {
                        q0iVar2 = null;
                    }
                    this.V = q0iVar2;
                    ito[] itoVarArr3 = ito.a;
                    window.setDecorFitsSystemWindows(false);
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        insetsController.hide(WindowInsets.Type.systemBars());
                        insetsController.setSystemBarsBehavior(2);
                    }
                } else {
                    this.S = Integer.valueOf(activity.getWindow().getDecorView().getSystemUiVisibility());
                }
                activity.getWindow().getDecorView().setSystemUiVisibility(5894);
                this.J = !this.Q;
            }
        }
        if (!j2pVar.hasFocus()) {
            j2pVar.setFocusable(true);
            j2pVar.setFocusableInTouchMode(true);
            j2pVar.requestFocus();
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(j2pVar, -1, -1);
        this.r = relativeLayout;
        if (!z) {
            ImageButton imageButton = new ImageButton(getContext());
            imageButton.setBackgroundColor(0);
            imageButton.setOnClickListener(new oep(new cno(this, (byte) 9)));
            this.s = imageButton;
            if (!z && this.v == n2p.EXPANDED && !this.x) {
                a();
            }
            relativeLayout.addView(this.s);
            int iD = nxg.d(getContext(), 50.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iD, iD);
            if (relativeLayout == this.r) {
                layoutParams.addRule(10);
                layoutParams.addRule(11);
            }
            ImageButton imageButton2 = this.s;
            if (imageButton2 != null) {
                imageButton2.setLayoutParams(layoutParams);
            }
        }
        View viewC = aoh.c(activity, this);
        ViewGroup viewGroup = viewC instanceof ViewGroup ? (ViewGroup) viewC : null;
        if (viewGroup != null) {
            viewGroup.addView(this.r, new ViewGroup.LayoutParams(-1, -1));
        }
        this.K = true;
        if (z) {
            this.H = true;
            this.v = n2p.DEFAULT;
            r();
            ito[] itoVarArr4 = ito.a;
            g("mraid.fireReadyEvent();");
            if (this.w) {
                s();
            }
        }
    }

    public final void g(String str) {
        j2p j2pVar = this.q;
        if (j2pVar == null || str.length() <= 0) {
            return;
        }
        ito[] itoVarArr = ito.a;
        j2pVar.evaluateJavascript(str, new z4d((byte) 5));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r5, java.util.Map r6) {
        /*
            r4 = this;
            java.lang.String r0 = "endCard"
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto Lc
            r4.d0 = r1
            goto L14
        Lc:
            java.lang.String r0 = "endCardClick"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Ld6
        L14:
            bxk r0 = r4.j
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.b
            o7p r0 = (defpackage.o7p) r0
            int r2 = r5.hashCode()
            switch(r2) {
                case -934426579: goto L8a;
                case -840405966: goto L78;
                case -599445191: goto L65;
                case 3363353: goto L54;
                case 104264043: goto L4b;
                case 106440182: goto L38;
                case 109757538: goto L25;
                default: goto L23;
            }
        L23:
            goto L9c
        L25:
            java.lang.String r1 = "start"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
            bw1 r1 = new bw1
            r2 = 14
            r1.<init>(r0, r2)
            defpackage.pfp.a(r1)
            goto L9c
        L38:
            java.lang.String r1 = "pause"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
            bw1 r1 = new bw1
            r2 = 12
            r1.<init>(r0, r2)
            defpackage.pfp.a(r1)
            goto L9c
        L4b:
            java.lang.String r2 = "muted"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5c
            goto L9c
        L54:
            java.lang.String r2 = "mute"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L9c
        L5c:
            bw1 r2 = new bw1
            r2.<init>(r0, r1)
            defpackage.pfp.a(r2)
            goto L9c
        L65:
            java.lang.String r1 = "complete"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
            bw1 r1 = new bw1
            r2 = 10
            r1.<init>(r0, r2)
            defpackage.pfp.a(r1)
            goto L9c
        L78:
            java.lang.String r1 = "unmute"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
            bw1 r1 = new bw1
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.pfp.a(r1)
            goto L9c
        L8a:
            java.lang.String r1 = "resume"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L9c
            bw1 r1 = new bw1
            r2 = 13
            r1.<init>(r0, r2)
            defpackage.pfp.a(r1)
        L9c:
            p7p r4 = r4.g
            if (r4 == 0) goto Ld6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lad:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ld3
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "evt"
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            if (r2 != 0) goto Lad
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto Lad
        Ld3:
            r4.d(r5, r0)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3p.h(java.lang.String, java.util.Map):void");
    }

    public final void i(boolean z) {
        View view;
        int[] iArr = new int[2];
        if (z) {
            view = this.q;
            if (view == null) {
                return;
            }
        } else {
            view = this;
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        ito[] itoVarArr = ito.a;
        int i3 = i2 - this.A;
        int width = view.getWidth();
        int height = view.getHeight();
        Rect rect = this.C;
        Rect rect2 = this.B;
        Rect rect3 = z ? rect2 : rect;
        if (i == rect3.left && i3 == rect3.top && width == rect3.width() && height == rect3.height()) {
            return;
        }
        int i4 = width + i;
        int i5 = height + i3;
        if (z) {
            rect2.set(i, i3, i4, i5);
        } else {
            rect.set(i, i3, i4, i5);
        }
        if (this.G) {
            if (z) {
                v();
            } else {
                w();
            }
        }
    }

    public final int j(int i) {
        return nxg.f(getContext(), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.net.Uri r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3p.k(android.net.Uri):void");
    }

    public final void l(String str) {
        n2p n2pVar;
        n2p n2pVar2;
        ito[] itoVarArr = ito.a;
        boolean z = this.k;
        if (z || (n2pVar2 = this.v) == n2p.DEFAULT || n2pVar2 == n2p.RESIZED) {
            if (!z || this.v == n2p.LOADING) {
                if (str != null && str.length() != 0) {
                    na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new sto(this, str, (mt5) null, (byte) 14), 3);
                    return;
                }
                j2p j2pVar = this.o;
                if (j2pVar != null) {
                    if (z || (n2pVar = this.v) == n2p.DEFAULT) {
                        xgh.g(j2pVar);
                    } else if (n2pVar == n2p.RESIZED) {
                        this.s = null;
                    }
                    f(j2pVar);
                }
            }
        }
    }

    public final void m() {
        Activity activity = this.t;
        if (activity != null) {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            rect.width();
            rect.height();
            ito[] itoVarArr = ito.a;
            this.A = window.findViewById(R.id.content).getTop();
            int iWidth = rect.width();
            int i = this.E.c - this.A;
            fr frVar = this.D;
            if (iWidth == frVar.b && i == frVar.c) {
                return;
            }
            frVar.b = iWidth;
            frVar.c = i;
            if (this.G) {
                x();
            }
        }
    }

    public final void n(String str) {
        jkp jkpVar;
        ito[] itoVarArr = ito.a;
        this.g0.set(true);
        Uri uri = str != null ? Uri.parse(str) : null;
        p7p p7pVar = this.g;
        if (uri != null && URLUtil.isNetworkUrl(uri.toString()) && Intrinsics.a(uri.getHost(), "appassets.androidplatform.net")) {
            if (p7pVar != null) {
                p7pVar.g(9105, e(uri));
                return;
            }
            return;
        }
        if (str == null || !c.q(str, "about:blank", false)) {
            this.c.a(str);
            g("window.operaBridge.notifyOnClicked()");
            if (this.d0 && p7pVar != null) {
                p7pVar.d("endCardClick", n08.a);
            }
            j2p j2pVar = this.q;
            if (j2pVar != null && (jkpVar = j2pVar.b) != null) {
                jkpVar.a();
            }
            n2p n2pVar = this.v;
            if (n2pVar == n2p.EXPANDED) {
                p();
            } else if (n2pVar == n2p.RESIZED) {
                q();
            }
        }
    }

    public final void o() {
        int i = getResources().getConfiguration().orientation;
        ito[] itoVarArr = ito.a;
        zyk zykVar = fap.a;
        Size sizeC = fap.c(getContext());
        int width = sizeC.getWidth();
        int height = sizeC.getHeight();
        fr frVar = this.E;
        if (width == frVar.b && height == frVar.c) {
            return;
        }
        frVar.b = width;
        frVar.c = height;
        if (this.G) {
            y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ito[] itoVarArr = ito.a;
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        ito[] itoVarArr = ito.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ito[] itoVarArr = ito.a;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n2p n2pVar = this.v;
        n2p n2pVar2 = n2p.HIDDEN;
        boolean z2 = this.k;
        if (n2pVar == n2pVar2 && z2) {
            ito[] itoVarArr = ito.a;
            return;
        }
        Objects.toString(n2pVar);
        ito[] itoVarArr2 = ito.a;
        if (this.J) {
            return;
        }
        n2p n2pVar3 = this.v;
        if (n2pVar3 == n2p.EXPANDED || n2pVar3 == n2p.RESIZED) {
            o();
            m();
        }
        if (this.M) {
            this.M = false;
            this.B.set(this.C);
            v();
        } else {
            i(false);
        }
        if (this.v == n2p.RESIZED && z) {
            pfp.a(new bw1(this, (byte) 9));
        }
        this.H = true;
        if (this.v == n2p.LOADING && this.G && !z2) {
            this.v = n2p.DEFAULT;
            r();
            g("mraid.fireReadyEvent();");
            if (this.w) {
                s();
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.u.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ito[] itoVarArr = ito.a;
        j2p j2pVar = this.q;
        if (j2pVar == null || !j2pVar.a) {
            u(i);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ito[] itoVarArr = ito.a;
        j2p j2pVar = this.q;
        if (j2pVar == null || !j2pVar.a) {
            u(i);
        }
    }

    public final void p() {
        n2p n2pVar = this.v;
        n2p n2pVar2 = n2p.DEFAULT;
        boolean z = this.k;
        if (n2pVar == n2pVar2 && z) {
            this.v = n2p.HIDDEN;
        } else if (n2pVar == n2p.EXPANDED || n2pVar == n2p.RESIZED) {
            this.v = n2pVar2;
        }
        byte b = 1;
        this.M = true;
        if (!z) {
            Activity activity = this.t;
            if (activity != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    Window window = activity.getWindow();
                    Boolean bool = this.V;
                    if (bool != null) {
                        window.setDecorFitsSystemWindows(bool.booleanValue());
                    }
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        int iStatusBars = WindowInsets.Type.statusBars();
                        Boolean bool2 = this.T;
                        Boolean bool3 = Boolean.TRUE;
                        if (Intrinsics.a(bool2, bool3)) {
                            insetsController.show(iStatusBars);
                        } else if (Intrinsics.a(bool2, Boolean.FALSE)) {
                            insetsController.hide(iStatusBars);
                        }
                        int iNavigationBars = WindowInsets.Type.navigationBars();
                        Boolean bool4 = this.U;
                        if (Intrinsics.a(bool4, bool3)) {
                            insetsController.show(iNavigationBars);
                        } else if (Intrinsics.a(bool4, Boolean.FALSE)) {
                            insetsController.hide(iNavigationBars);
                        }
                    }
                } else {
                    View decorView = activity.getWindow().getDecorView();
                    Integer num = this.S;
                    if (num != null) {
                        decorView.setSystemUiVisibility(num.intValue());
                    }
                    Window window2 = activity.getWindow();
                    if (this.Q) {
                        window2.addFlags(1024);
                    } else {
                        window2.clearFlags(1024);
                    }
                    if (this.R) {
                        window2.addFlags(2048);
                    } else {
                        window2.clearFlags(2048);
                    }
                }
                if (this.P) {
                    ActionBar actionBar = activity.getActionBar();
                    if (actionBar != null) {
                        actionBar.show();
                    }
                } else {
                    Integer num2 = this.O;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        View view = this.N;
                        if (view != null) {
                            view.setVisibility(iIntValue);
                        }
                    }
                }
                this.Q = false;
                this.J = false;
                this.N = null;
                this.O = null;
                this.P = false;
                this.S = null;
                this.T = null;
                this.U = null;
                this.V = null;
            }
            RelativeLayout relativeLayout = this.r;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                xgh.g(relativeLayout);
            }
            this.r = null;
            this.s = null;
            j2p j2pVar = this.p;
            if (j2pVar == null) {
                j2p j2pVar2 = this.o;
                if (j2pVar2 != null) {
                    addView(j2pVar2, new ViewGroup.LayoutParams(this.e, this.f));
                }
            } else {
                j2pVar.destroy();
                this.p = null;
                j2p j2pVar3 = this.o;
                if (j2pVar3 != null) {
                    j2pVar3.setWebChromeClient(new myo(this, b));
                    j2pVar3.setWebViewClient(new c5d(this, (byte) 4));
                    this.q = j2pVar3;
                }
            }
        }
        pfp.a(new p2p(this, (byte) 0));
    }

    public final void q() {
        this.v = n2p.DEFAULT;
        this.M = true;
        this.s = null;
        j2p j2pVar = this.o;
        if (j2pVar != null) {
            addView(j2pVar, new ViewGroup.LayoutParams(this.e, this.f));
        }
        pfp.a(new p2p(this, (byte) 1));
    }

    public final void r() {
        ito[] itoVarArr = ito.a;
        g("mraid.fireStateChangeEvent('" + this.v.a + "');");
    }

    public final void s() {
        ito[] itoVarArr = ito.a;
        g("mraid.fireViewableChangeEvent(" + this.w + ");");
    }

    public final void t() {
        jkp jkpVar;
        jkp jkpVar2;
        ito[] itoVarArr = ito.a;
        int i = o2p.b[this.v.ordinal()];
        if (i == 2 || i == 3) {
            j2p j2pVar = this.q;
            if (j2pVar != null && (jkpVar = j2pVar.b) != null) {
                jkpVar.a();
            }
            p();
            this.c.c();
            return;
        }
        if (i != 4) {
            return;
        }
        j2p j2pVar2 = this.q;
        if (j2pVar2 != null && (jkpVar2 = j2pVar2.b) != null) {
            jkpVar2.a();
        }
        q();
    }

    public final void u(int i) {
        boolean z = i == 0;
        if (z != this.w) {
            this.w = z;
            if (this.G && this.H) {
                s();
            }
        }
    }

    public final void v() {
        Rect rect = this.B;
        int i = rect.left;
        int i2 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        ito[] itoVarArr = ito.a;
        g("mraid.setCurrentPosition(" + j(i) + ',' + j(i2) + ',' + j(iWidth) + ',' + j(iHeight) + ");");
    }

    public final void w() {
        Rect rect = this.C;
        int i = rect.left;
        int i2 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        ito[] itoVarArr = ito.a;
        g("mraid.setDefaultPosition(" + j(i) + ',' + j(i2) + ',' + j(iWidth) + ',' + j(iHeight) + ");");
    }

    public final void x() {
        fr frVar = this.D;
        int i = frVar.b;
        int i2 = frVar.c;
        ito[] itoVarArr = ito.a;
        g("mraid.setMaxSize(" + j(i) + ',' + j(i2) + ");");
    }

    public final void y() {
        fr frVar = this.E;
        int i = frVar.b;
        int i2 = frVar.c;
        ito[] itoVarArr = ito.a;
        g("mraid.setScreenSize(" + j(i) + ',' + j(i2) + ");");
    }
}
