package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class z13 extends FrameLayout {
    public static final Rect q = new Rect();
    public static final List r = Arrays.asList(eq.c, eq.d);
    public eq a;
    public String b;
    public ro9 c;
    public guo d;
    public volatile boolean e;
    public boolean f;
    public boolean g;
    public guo h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public d3k m;
    public boolean n;
    public volatile boolean o;
    public final lmo p;

    public z13(Context context) {
        super(context.getApplicationContext(), null, 0);
        this.f = true;
        this.l = -1L;
        this.p = new lmo(new y13(this, (byte) 0), (byte) 0);
        ejo ejoVar = fko.a;
        fko.a(context);
    }

    public final void a(guo guoVar, boolean z) {
        if (Intrinsics.a(guoVar, this.d) || Intrinsics.a(guoVar, this.h)) {
            if ((this.i && z && Intrinsics.a(guoVar, this.d)) || this.g == z) {
                return;
            }
            this.g = z;
            e();
        }
    }

    public final void b(boolean z) {
        ro9 ro9Var;
        guo guoVar;
        guo guoVar2;
        wjo wjoVar = wjo.REGULAR;
        if (this.o || (ro9Var = this.c) == null) {
            return;
        }
        if (this.a == null) {
            ro9Var.a(new cm(2, "No AdSize for Banner!", (byte) 0));
            return;
        }
        String str = this.b;
        if (str == null || StringsKt.N(str)) {
            ro9Var.a(new cm(2, "No valid placement ID for Banner!", (byte) 0));
            return;
        }
        if (!z) {
            if (this.d != null) {
                ro9Var.a(new cm(1, "Ad has been started or used!", (byte) 0));
                return;
            }
            guo guoVar3 = new guo(getContext(), this.b, this.a);
            this.d = guoVar3;
            guoVar3.c = new uuj(new s6h(guoVar3, ro9Var, false));
            guoVar3.c();
            return;
        }
        if ((getGlobalVisibleRect(q) || (guoVar2 = this.d) == null || guoVar2.d()) && !this.i) {
            guo guoVar4 = this.h;
            if ((guoVar4 != null ? (ylp) guoVar4.d : null) != null && (guoVar = this.h) != null && !guoVar.d()) {
                d();
                return;
            }
            this.k++;
            guo guoVar5 = this.h;
            if (guoVar5 != null) {
                guoVar5.a();
            }
            Context context = getContext();
            String str2 = this.b;
            eq eqVar = this.a;
            wjo wjoVar2 = wjo.REGULAR;
            guo guoVar6 = new guo(context, str2, eqVar);
            this.h = guoVar6;
            guoVar6.c = new uuj(new s6h(guoVar6, ro9Var, false));
            guoVar6.c();
        }
    }

    public final void c() {
        this.l = SystemClock.uptimeMillis();
    }

    public final void d() {
        p7p p7pVar;
        p7p p7pVar2;
        guo guoVar;
        if (this.o || !isAttachedToWindow()) {
            return;
        }
        guo guoVar2 = this.d;
        if (guoVar2 == null && (guoVar = this.h) != null) {
            this.d = guoVar;
            this.h = null;
            guoVar2 = guoVar;
        }
        if ((guoVar2 != null ? guoVar2.e : null) instanceof t9p) {
            guo guoVar3 = this.d;
            if (guoVar3 != null && (p7pVar2 = guoVar3.i) != null) {
                p7pVar2.f();
            }
            guo guoVar4 = this.d;
            if (guoVar4 != null) {
                guoVar4.f(this, null, null, new r2(1, this, z13.class, "onAdRenderFailed", "onAdRenderFailed(I)V", 0, (byte) 11), new s2(2, this, z13.class, "onMraidAutoRefreshPauseChanged", "onMraidAutoRefreshPauseChanged(Lcom/opera/ads/internal/ad/BannerAdImpl;Z)V", 0, (byte) 5));
            }
        }
        guo guoVar5 = this.h;
        if (!((guoVar5 != null ? guoVar5.e : null) instanceof t9p) || this.i || this.g) {
            return;
        }
        byte b = 1;
        this.i = true;
        guo guoVar6 = this.h;
        if (guoVar6 != null && (p7pVar = guoVar6.i) != null) {
            p7pVar.f();
        }
        guo guoVar7 = this.h;
        if (guoVar7 != null) {
            guoVar7.f(this, this.d, new y13(this, b), new b11(this, (byte) 4), new s2(2, this, z13.class, "onMraidAutoRefreshPauseChanged", "onMraidAutoRefreshPauseChanged(Lcom/opera/ads/internal/ad/BannerAdImpl;Z)V", 0, (byte) 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r6 = this;
            boolean r0 = r6.o
            r1 = 0
            if (r0 != 0) goto L70
            boolean r0 = r6.j
            if (r0 != 0) goto L70
            boolean r0 = r6.f
            if (r0 == 0) goto L70
            boolean r0 = r6.g
            if (r0 != 0) goto L70
            guo r0 = r6.d
            if (r0 == 0) goto L2b
            voo r0 = r0.d
            ylp r0 = (defpackage.ylp) r0
            if (r0 == 0) goto L1e
            java.lang.Integer r0 = r0.F
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L2b
            int r0 = r0.intValue()
            if (r0 <= 0) goto L29
            r0 = 1
            goto L33
        L29:
            r0 = 0
            goto L33
        L2b:
            java.util.List r0 = defpackage.z13.r
            eq r2 = r6.a
            boolean r0 = kotlin.collections.CollectionsKt.E(r0, r2)
        L33:
            if (r0 == 0) goto L70
            ro9 r0 = r6.c
            if (r0 == 0) goto L70
            long r2 = r6.l
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L70
            guo r0 = r6.d
            if (r0 == 0) goto L5b
            boolean r0 = r0.d()
            if (r0 != 0) goto L5b
            boolean r0 = defpackage.fko.c
            if (r0 == 0) goto L70
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L70
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L70
        L5b:
            d3k r0 = r6.m
            if (r0 == 0) goto L60
            return
        L60:
            a64 r0 = defpackage.w2p.a
            r3 r2 = new r3
            r3 = 5
            r2.<init>(r3, r1, r6)
            r3 = 3
            d3k r0 = na2.B(r0, r1, r1, r2, r3)
            r6.m = r0
            return
        L70:
            d3k r0 = r6.m
            if (r0 == 0) goto L77
            r0.k(r1)
        L77:
            r6.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.e():void");
    }

    public final void f() {
        this.o = true;
        ro9 ro9Var = this.c;
        if (ro9Var != null) {
            ro9Var.c = null;
        }
        this.c = null;
        e();
        byte b = 0;
        if (this.n) {
            pfp.a(new x13(this, b));
            return;
        }
        guo guoVar = this.d;
        if (guoVar != null) {
            guoVar.a();
        }
        this.d = null;
        guo guoVar2 = this.h;
        if (guoVar2 != null) {
            guoVar2.a();
        }
        this.h = null;
        this.i = false;
    }

    public final void g(u13 u13Var) {
        wjo wjoVar = wjo.REGULAR;
        if (fcp.a(u13Var) == null || fcp.b(u13Var, getContext()) == null || this.o || this.c != null) {
            return;
        }
        this.c = new ro9(this, u13Var);
        b(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ejo ejoVar = fko.a;
        fko.b(this);
        fko.b.add(this.p);
        d();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ejo ejoVar = fko.a;
        fko.b.remove(this.p);
        pfp.a(new x13(this, (byte) 1));
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        pfp.a(new x13(this, (byte) 2));
    }
}
