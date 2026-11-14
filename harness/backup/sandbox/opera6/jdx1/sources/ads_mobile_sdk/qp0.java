package ads_mobile_sdk;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.dgh;
import defpackage.edp;
import defpackage.evo;
import defpackage.f43;
import defpackage.fvo;
import defpackage.he6;
import defpackage.kyo;
import defpackage.mip;
import defpackage.prb;
import defpackage.sbl;
import defpackage.the;
import defpackage.uie;
import defpackage.vtp;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qp0 extends zt1 {
    public final jz2 A;
    public final ve2 D;
    public Point E = new Point();
    public Point F = new Point();
    public long G;
    public long H;
    public final AtomicBoolean I;
    public final prb g;
    public final nx5 h;
    public final nx5 i;
    public final k8 j;
    public final it1 k;
    public final zv1 l;
    public final uie m;
    public final ux2 n;
    public final kh3 o;
    public final mip p;
    public final kyo q;
    public final gp3 r;
    public final b82 s;
    public final ph0 t;
    public final a02 u;
    public final g02 v;
    public final av2 w;
    public final a2 x;
    public final i41 y;
    public final qr0 z;

    public qp0(prb prbVar, nx5 nx5Var, nx5 nx5Var2, k8 k8Var, it1 it1Var, zv1 zv1Var, uie uieVar, ux2 ux2Var, kh3 kh3Var, mip mipVar, kyo kyoVar, gp3 gp3Var, b82 b82Var, ph0 ph0Var, a02 a02Var, g02 g02Var, av2 av2Var, a2 a2Var, i41 i41Var, qr0 qr0Var, jz2 jz2Var, ve2 ve2Var) {
        this.g = prbVar;
        this.h = nx5Var;
        this.i = nx5Var2;
        this.j = k8Var;
        this.k = it1Var;
        this.l = zv1Var;
        this.m = uieVar;
        this.n = ux2Var;
        this.o = kh3Var;
        this.p = mipVar;
        this.q = kyoVar;
        this.r = gp3Var;
        this.s = b82Var;
        this.t = ph0Var;
        this.u = a02Var;
        this.v = g02Var;
        this.w = av2Var;
        this.x = a2Var;
        this.y = i41Var;
        this.z = qr0Var;
        this.A = jz2Var;
        this.D = ve2Var;
        new AtomicBoolean(false);
        this.I = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.qp0 r8, defpackage.fvo r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.np0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.np0 r0 = (ads_mobile_sdk.np0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.np0 r0 = new ads_mobile_sdk.np0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2f
            android.view.WindowManager r8 = r0.b
            ads_mobile_sdk.qp0 r9 = r0.a
            defpackage.ybh.y(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L7a
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L35:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.a2 r10 = r8.x
            boolean r10 = r10.q0
            if (r10 != 0) goto L41
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L41:
            ads_mobile_sdk.i41 r10 = r8.y
            r10.a()
            ads_mobile_sdk.ew1 r9 = (ads_mobile_sdk.ew1) r9
            android.widget.FrameLayout r9 = r9.c()
            if (r9 == 0) goto L53
            android.content.Context r9 = r9.getContext()
            goto L54
        L53:
            r9 = r3
        L54:
            boolean r10 = r9 instanceof android.app.Activity
            if (r10 == 0) goto L5b
            r3 = r9
            android.app.Activity r3 = (android.app.Activity) r3
        L5b:
            if (r3 != 0) goto L60
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L60:
            java.lang.Class<android.view.WindowManager> r9 = android.view.WindowManager.class
            java.lang.Object r9 = r3.getSystemService(r9)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            ads_mobile_sdk.g02 r10 = r8.v
            r0.a = r8
            r0.b = r9
            r0.e = r4
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.g02.a(r10, r0)
            if (r10 != r1) goto L7a
            return r1
        L7a:
            ads_mobile_sdk.cy0 r10 = (ads_mobile_sdk.cy0) r10
            ads_mobile_sdk.zv1 r0 = r8.l
            r0.getClass()
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r5 = 0
            r6 = -2
            r2 = -2
            r3 = -2
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            ads_mobile_sdk.qr0 r0 = r0.b
            r0.getClass()
            r2 = 808(0x328, float:1.132E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            ads_mobile_sdk.fo r3 = ads_mobile_sdk.fo.a$11
            java.lang.String r4 = "gads:policy_validator_layoutparam:flags"
            java.lang.Object r0 = r0.a(r4, r2, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.flags = r0
            r0 = 2
            r1.type = r0
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r1.gravity = r0
            r9.addView(r10, r1)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r10)
            r8.e = r9
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qp0.a(ads_mobile_sdk.qp0, fvo, nt5):java.lang.Object");
    }

    public static void a(qp0 qp0Var, FrameLayout frameLayout, vv1 vv1Var, String str, prb prbVar, int i) {
        defpackage.na2.B(qp0Var.h, null, null, new fp0(qp0Var, vv1Var, prbVar, str, frameLayout, (i & 32) == 0, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.qp0 r5, defpackage.fvo r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.op0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.op0 r0 = (ads_mobile_sdk.op0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.op0 r0 = new ads_mobile_sdk.op0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2d
            fvo r6 = r0.b
            ads_mobile_sdk.qp0 r5 = r0.a
            defpackage.ybh.y(r7)
            goto L9d
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L33:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.av2 r7 = r5.w
            ads_mobile_sdk.av2 r2 = ads_mobile_sdk.av2.g
            if (r7 != r2) goto L3f
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L3f:
            prb r7 = r5.g
            java.lang.String r2 = "overlay"
            if (r7 == 0) goto L4a
            prb r7 = r7.w(r2)     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
            r7 = r4
        L4b:
            if (r7 == 0) goto Lb7
            hgc r7 = r7.a
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lb7
            java.lang.ref.WeakReference r7 = r5.d
            java.lang.Object r7 = r7.get()
            ads_mobile_sdk.cy0 r7 = (ads_mobile_sdk.cy0) r7
            if (r7 == 0) goto L6b
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.k
            if (r2 == 0) goto L6b
            boolean r2 = r2.get()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
        L6b:
            if (r7 == 0) goto L8c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r4, r2)
            if (r2 == 0) goto L78
            kotlin.Unit r1 = kotlin.Unit.a
            goto Lb9
        L78:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r4, r2)
            if (r2 == 0) goto L8c
            r2 = r6
            ads_mobile_sdk.ew1 r2 = (ads_mobile_sdk.ew1) r2
            android.widget.FrameLayout r2 = r2.d()
            if (r2 == 0) goto L8c
            r2.removeView(r7)
        L8c:
            ads_mobile_sdk.a02 r7 = r5.u
            r0.a = r5
            r0.b = r6
            r0.e = r3
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.a02.a(r7, r0)
            if (r7 == r1) goto Lb9
        L9d:
            ads_mobile_sdk.cy0 r7 = (ads_mobile_sdk.cy0) r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            r5.getClass()
            r5.d = r0
            ads_mobile_sdk.ew1 r6 = (ads_mobile_sdk.ew1) r6
            android.widget.FrameLayout r5 = r6.d()
            if (r5 == 0) goto Lb4
            r5.addView(r7)
        Lb4:
            kotlin.Unit r1 = kotlin.Unit.a
            goto Lb9
        Lb7:
            kotlin.Unit r1 = kotlin.Unit.a
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qp0.b(ads_mobile_sdk.qp0, fvo, nt5):java.lang.Object");
    }

    public final String a(View view, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (Intrinsics.a(view, (View) ((WeakReference) entry.getValue()).get())) {
                return str;
            }
        }
        gt1 gt1Var = this.k.b;
        if (gt1Var == null || evo.a[gt1Var.ordinal()] != 1) {
            return null;
        }
        return "3099";
    }

    public final String a(FrameLayout frameLayout) {
        ux2 ux2Var = this.n;
        fw0 fw0Var = fw0.CUI_NAME_VIEW_SIGNALS;
        kh3 kh3Var = this.o;
        l08 l08Var = l08.a;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                String strA = this.j.a(frameLayout);
                rg3VarA.close();
                return strA;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
        try {
            String strA2 = this.j.a(frameLayout);
            wk2VarA.close();
            return strA2;
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
                if (th4 instanceof kql) {
                    throw new uw0((kql) th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new ou0(th4);
                }
                if (th4 instanceof mv0) {
                    throw th4;
                }
                throw new tu0(th4);
            } finally {
            }
        }
    }

    @Override // ads_mobile_sdk.zt1
    public final prb a(f43 f43Var, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap) {
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, f43Var, linkedHashMap, scaleType);
        prb prbVar = new prb();
        prbVar.o("asset_view_signal", vv1VarB.a);
        prbVar.o("ad_view_signal", vv1VarB.b);
        prbVar.o("scroll_view_signal", vv1VarB.c);
        prbVar.o("lock_screen_signal", vv1VarB.d);
        return prbVar;
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(int i, View view) {
        boolean zC;
        boolean zC2 = false;
        boolean z = this.m.b() != null;
        prb prbVar = this.g;
        if (prbVar != null) {
            try {
                zC = prbVar.u("allow_sdk_custom_click_gesture").c();
            } catch (Exception unused) {
            }
        } else {
            zC = false;
        }
        prb prbVar2 = null;
        if (!zC) {
            if (!z) {
                if (prbVar != null) {
                    try {
                        zC2 = prbVar.u("allow_custom_click_gesture").c();
                    } catch (Exception unused2) {
                    }
                }
                if (zC2) {
                    if (!this.I.get()) {
                        xu0.c("Custom click reporting failed. enableCustomClickGesture is not set.", null);
                        return;
                    }
                }
            }
            xu0.c("Custom click reporting failed. Ad unit id is not in the allow list.", null);
            return;
        }
        fvo fvoVar = (fvo) this.c.get();
        if (fvoVar == null) {
            xu0.a("Ad should be associated with an ad view before calling performClickForCustomGesture()", null, 6);
            return;
        }
        ew1 ew1Var = (ew1) fvoVar;
        FrameLayout frameLayoutC = ew1Var.c();
        Map mapB = ew1Var.b();
        ImageView.ScaleType scaleTypeE = ew1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = ImageView.ScaleType.CENTER_INSIDE;
        }
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, frameLayoutC, mapB, scaleTypeE);
        String strA = a(view, ew1Var.b());
        prb prbVarA = this.l.a(strA, this.F, this.E);
        if (zC) {
            Point point = this.F;
            Point point2 = this.E;
            try {
                prb prbVar3 = new prb();
                prbVar3.p(Integer.valueOf(point.x), "x");
                prbVar3.p(Integer.valueOf(point.y), "y");
                prb prbVar4 = new prb();
                prbVar4.p(Integer.valueOf(point2.x), "x");
                prbVar4.p(Integer.valueOf(point2.y), "y");
                prb prbVar5 = new prb();
                prbVar5.o("start_point", prbVar3);
                prbVar5.o("end_point", prbVar4);
                prbVar5.p(Integer.valueOf(i), "duration_ms");
                prbVar2 = prbVar5;
            } catch (Exception e) {
                xu0.a("Error occurred while grabbing custom click gesture signals.", e);
            }
            prbVar.o("custom_click_gesture_signal", prbVar2);
        }
        a(this, ew1Var.c(), vv1VarB, strA, prbVarA, 16);
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(View view, f43 f43Var, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType) {
        defpackage.na2.B(this.h, null, null, new ep0(this, null, (byte) 0), 3);
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, f43Var, linkedHashMap, scaleType);
        String strA = a(view, linkedHashMap);
        a(this, f43Var, vv1VarB, strA, this.l.a(strA, this.F, this.E), 48);
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
        boolean z = true;
        ep0 ep0Var = new ep0(this, null, (byte) 1);
        nx5 nx5Var = this.h;
        defpackage.na2.B(nx5Var, null, null, ep0Var, 3);
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, frameLayout, map, scaleType);
        String strA = a(frameLayout);
        if (this.x.q0) {
            this.y.a();
        } else {
            z = false;
        }
        defpackage.na2.B(nx5Var, null, null, new he6(this, vv1VarB, strA, z, null, (byte) 1), 3);
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(f43 f43Var) {
        this.c = new WeakReference(null);
        this.d = new WeakReference(null);
        this.E = new Point();
        this.F = new Point();
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(f43 f43Var, MotionEvent motionEvent) {
        this.l.getClass();
        int[] iArr = new int[2];
        if (f43Var != null) {
            f43Var.getLocationOnScreen(iArr);
        }
        this.E = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.p.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.H = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.r.a = motionEvent;
            this.G = jCurrentTimeMillis;
            this.F = this.E;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.E;
        motionEventObtain.setLocation(point.x, point.y);
        k8 k8Var = this.j;
        k8Var.getClass();
        e7 e7Var = k8Var.j;
        if (e7Var == null) {
            e7Var = null;
        }
        u83 u83Var = ((h7) e7Var.a).b;
        edp edpVar = (edp) u83Var.f.get();
        if (edpVar == null) {
            u83Var.e.b(fl0.EVENT_ID_EARLY_INPUT_EVENT);
        } else {
            edpVar.a(motionEventObtain);
        }
        motionEventObtain.recycle();
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(WeakReference weakReference, f43 f43Var, LinkedHashMap linkedHashMap, ew1 ew1Var, ew1 ew1Var2) {
        this.c = weakReference;
        this.E = new Point();
        this.F = new Point();
        if (f43Var != null) {
            defpackage.na2.B(this.i, null, null, new sbl(this, f43Var, weakReference, null, (byte) 17), 3);
            f43Var.setOnTouchListener(ew1Var);
            f43Var.setClickable(true);
            f43Var.setOnClickListener(ew1Var2);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (view != null) {
                view.setOnTouchListener(ew1Var);
                view.setClickable(true);
                view.setOnClickListener(ew1Var2);
            }
        }
    }

    @Override // ads_mobile_sdk.zt1
    public final void a$1() {
        a(this, null, null, "_videoMediaView", null, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // ads_mobile_sdk.zt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.prb b(defpackage.f43 r2, android.widget.ImageView.ScaleType r3, java.util.LinkedHashMap r4) {
        /*
            r1 = this;
            prb r0 = new prb
            r0.<init>()
            prb r2 = r1.a(r2, r3, r4)
            java.lang.String r3 = "nas"
            r0.o(r3, r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.I
            boolean r2 = r2.get()
            if (r2 == 0) goto L2f
            java.lang.String r2 = "allow_custom_click_gesture"
            prb r1 = r1.g
            if (r1 == 0) goto L25
            pqb r1 = r1.u(r2)     // Catch: java.lang.Exception -> L25
            boolean r1 = r1.c()     // Catch: java.lang.Exception -> L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L2f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "custom_click_gesture_eligible"
            r0.q(r2, r1)
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qp0.b(f43, android.widget.ImageView$ScaleType, java.util.LinkedHashMap):prb");
    }

    @Override // ads_mobile_sdk.zt1
    public final void b(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
        boolean z;
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, frameLayout, map, scaleType);
        String strA = a(frameLayout);
        if (this.x.q0) {
            this.y.a();
            z = true;
        } else {
            z = false;
        }
        defpackage.na2.B(this.h, null, null, new he6(this, vv1VarB, strA, z, null, (byte) 2), 3);
    }

    @Override // ads_mobile_sdk.zt1
    public final void c() {
        fvo fvoVar = (fvo) this.c.get();
        if (fvoVar == null) {
            xu0.a("Ad should be associated with an ad view before click happens.", null, 6);
            return;
        }
        ew1 ew1Var = (ew1) fvoVar;
        FrameLayout frameLayoutC = ew1Var.c();
        Map mapB = ew1Var.b();
        ImageView.ScaleType scaleTypeE = ew1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = ImageView.ScaleType.CENTER_INSIDE;
        }
        vv1 vv1VarB = dgh.b(this.n, this.o, this.l, frameLayoutC, mapB, scaleTypeE);
        String strA = a((View) this.f.get(), ew1Var.b());
        a(this, ew1Var.c(), vv1VarB, strA, this.l.a(strA, this.F, this.E), 48);
    }

    @Override // ads_mobile_sdk.zt1
    public final boolean d() {
        if (e() == 0) {
            return true;
        }
        return this.m.f();
    }

    @Override // ads_mobile_sdk.zt1
    public final int e() {
        the theVarB = this.m.b();
        if (theVarB != null) {
            return theVarB.a;
        }
        return 0;
    }

    @Override // ads_mobile_sdk.zt1
    public final boolean k() {
        it1 it1Var = this.k;
        return (it1Var.p.isEmpty() || it1Var.q == null) ? false : true;
    }
}
