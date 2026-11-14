package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.OperaApplication;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.custom_views.swipe_to_refresh.RefreshView;
import com.opera.android.feed.FeedContainerView;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.feed.FeedScrollViewContentWrapper;
import com.opera.android.feed.FeedViewPager;
import com.opera.android.settings.SettingsManager;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.third_party.android.swiperefresh.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class c5k extends o8k implements o0c, p5j {
    public final bx8 A;
    public final FeedViewPager B;
    public final qt3 C;
    public final t4k D;
    public final w4k E;
    public final bp F;
    public final aba G;
    public final z8b H;
    public final uvl I;
    public final v4k J;
    public final h5k K;
    public final x4k L;
    public final mni M;
    public final pde N;
    public nrl O;
    public final b5k P;
    public final int Q;
    public final q9b R;
    public final ColorDrawable S;
    public final ykn T;
    public final pde U;
    public final pde V;
    public final kze W;
    public final ru9 X;
    public final x53 Y;
    public boolean Z;
    public final boolean a0;
    public final ks3 b0;
    public q8l c0;
    public final int d0;
    public final t8k e;
    public final kze e0;
    public final fwf f;
    public final pde f0;
    public final pde g;
    public final xt3 h;
    public final bvl i;
    public final SettingsManager j;
    public final nue k;
    public final FeedScrollView l;
    public final RefreshView m;
    public final SwipeRefreshLayout n;
    public final RecyclerView o;
    public final FeedScrollViewContentWrapper p;
    public final cv8 q;
    public final FeedContainerView r;
    public final lqe s;
    public final kue t;
    public final x5f u;
    public final fqe v;
    public final ete w;
    public final lv3 x;
    public final zxf y;
    public final p0c z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035a A[PHI: r4
      0x035a: PHI (r4v49 int) = (r4v48 int), (r4v50 int), (r4v51 int), (r4v52 int), (r4v53 int), (r4v54 int), (r4v58 int), (r4v60 int), (r4v62 int) binds: [B:12:0x0262, B:14:0x026f, B:16:0x027c, B:18:0x0289, B:20:0x0296, B:22:0x02a3, B:30:0x02d5, B:34:0x02ed, B:38:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x049d A[PHI: r11
      0x049d: PHI (r11v12 int) = (r11v11 int), (r11v13 int), (r11v14 int), (r11v16 int), (r11v17 int), (r11v19 int) binds: [B:55:0x03f0, B:57:0x03fb, B:59:0x0406, B:63:0x041e, B:65:0x042b, B:69:0x0445] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.graphics.drawable.Drawable, q9b] */
    /* JADX WARN: Type inference failed for: r92v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, ndc, xd5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c5k(defpackage.p6l r91, com.opera.android.BrowserActivity r92, defpackage.u8k r93, defpackage.hw3 r94, defpackage.qim r95, defpackage.xt3 r96, defpackage.bvl r97, defpackage.r22 r98, defpackage.x5f r99, defpackage.x5f r100, defpackage.osf r101, defpackage.umi r102, defpackage.ekn r103, s6h r104, defpackage.ku5 r105, defpackage.xnh r106, cq5 r107, defpackage.ipk r108, com.opera.android.settings.SettingsManager r109, defpackage.nue r110, defpackage.fqe r111, defpackage.lv3 r112, defpackage.wt3 r113, defpackage.pde r114, defpackage.pde r115, defpackage.f1p r116, defpackage.kze r117, defpackage.ykn r118, defpackage.pde r119, defpackage.fs6 r120, defpackage.kze r121, defpackage.j4c r122, defpackage.qnc r123, defpackage.w6o r124, defpackage.nr8 r125, android.view.View.OnLongClickListener r126, defpackage.qr8 r127, defpackage.qq6 r128, defpackage.nv2 r129, defpackage.tlg r130, com.opera.android.Lazy r131, defpackage.jv3 r132, defpackage.hv3 r133, defpackage.rw3 r134, defpackage.gx8 r135, defpackage.j4c r136, defpackage.e7k r137, defpackage.j4c r138) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5k.<init>(p6l, com.opera.android.BrowserActivity, u8k, hw3, qim, xt3, bvl, r22, x5f, x5f, osf, umi, ekn, s6h, ku5, xnh, cq5, ipk, com.opera.android.settings.SettingsManager, nue, fqe, lv3, wt3, pde, pde, f1p, kze, ykn, pde, fs6, kze, j4c, qnc, w6o, nr8, android.view.View$OnLongClickListener, qr8, qq6, nv2, tlg, com.opera.android.Lazy, jv3, hv3, rw3, gx8, j4c, e7k, j4c):void");
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("speed_dial.enabled".equals(str)) {
            this.J.b();
            k();
        } else if ("speed_dial.shape".equals(str)) {
            this.W.r(d());
        }
    }

    public final void a(mnf mnfVar) {
        p8l p8lVar = ((lo3) this.V.g()).a ? p8l.b : p8l.a;
        int i = mnfVar.c;
        ykn yknVar = this.T;
        avl avlVar = (avl) ((bvl) yknVar.a.get()).getState().g();
        int i2 = avlVar.e != 2 ? 0 : i + avlVar.c;
        q9b q9bVar = this.R;
        if (i2 != q9bVar.b) {
            q9bVar.b = i2;
            q9bVar.b();
        }
        int iA = yknVar.a(mnfVar.d, p8lVar);
        if (iA != q9bVar.c) {
            q9bVar.c = iA;
            q9bVar.b();
        }
        m();
        l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, androidx.viewpager.widget.ViewPager, com.opera.android.custom_views.LayoutDirectionViewPager, com.opera.android.feed.FeedViewPager] */
    public final xw8 b() {
        int currentItem;
        ?? r0 = this.B;
        if (r0.getChildCount() == 0 || (currentItem = r0.getCurrentItem()) < 0) {
            return null;
        }
        return ((zw8) this.A.a.get(r0.r(currentItem))).b;
    }

    public final void c(boolean z) {
        if (z) {
            b5k b5kVar = this.P;
            c5k c5kVar = b5kVar.f;
            if (b5kVar.c) {
                return;
            }
            b5kVar.c = true;
            c5kVar.p.addOnLayoutChangeListener(b5kVar);
            c5kVar.l.F(b5kVar);
            vml.d(b5kVar.a, 5000L);
            b5kVar.c();
        }
    }

    public final vr8 d() {
        int i;
        int i2;
        f8k f8kVar = (f8k) this.U.g();
        Context context = this.l.getContext();
        gxh gxhVar = new gxh(p37.F(((rmn) ((kze) this.b0.h).g()).f, f03.t(2130969725, context, 2131101243), f03.t(2130969726, context, 2131101243)));
        w6k w6kVar = f8kVar.c;
        boolean z = f8kVar.a;
        w6k w6kVar2 = w6k.b;
        SettingsManager settingsManager = this.j;
        if (w6kVar == w6kVar2) {
            return new vr8(new fxh(2131103876), u0h.g(context, maj.b), new fxh(R.color.transparent), z ? new dxh(2130969116) : new fxh(R.color.transparent), gxhVar, new fxh(2131103876), new fxh(2131103880), new fxh(2131103884), new fxh(2131103876), new fxh(2131103877), settingsManager.x().b);
        }
        fxh fxhVar = new fxh(2131099815);
        if (f8kVar.b) {
            i = 2131099818;
            i2 = 2131099818;
        } else {
            i = 17170445;
            i2 = 2131099818;
        }
        return new vr8(fxhVar, laj.e, new fxh(i), z ? new dxh(2130969117) : new fxh(R.color.transparent), gxhVar, new fxh(2131099815), new fxh(i2), new fxh(2131099822), new dxh(2130971078), new fxh(2131099933), settingsManager.x().b);
    }

    public final Parcelable e(Parcelable parcelable) {
        this.s.w++;
        boolean z = parcelable instanceof ex8;
        NestedScrollView nestedScrollView = this.l;
        if (z) {
            nestedScrollView.getClass();
            ex8 ex8Var = (ex8) parcelable;
            Parcelable superState = ex8Var.getSuperState();
            nestedScrollView.setScrollY(ex8Var.a);
            parcelable = superState;
        } else {
            nestedScrollView.setScrollY(0);
        }
        r0.w--;
        return parcelable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, androidx.core.widget.NestedScrollView, com.opera.android.feed.FeedScrollView] */
    public final void f() {
        if (this.r.getVisibility() == 0) {
            ?? r0 = this.l;
            if (r0.canScrollVertically(1)) {
                int measuredHeight = (this.p.getMeasuredHeight() - ((r0.getHeight() - r0.getPaddingTop()) - r0.getPaddingBottom())) - r0.getScrollY();
                Resources resources = r0.getResources();
                Rect rect = fan.a;
                r0.B(0, measuredHeight, cs5.t(Math.abs((int) (measuredHeight / resources.getDisplayMetrics().density)) * 5, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 1000), false);
            }
        }
    }

    public final void g(f1p f1pVar, boolean z, boolean z2) {
        cue cueVar = (cue) f1pVar.a;
        String str = (String) f1pVar.b;
        String[] strArr = OperaApplication.K;
        fue fueVarZ = ((OperaApplication) this.b.getApplication()).z();
        fueVarZ.d();
        cue cueVar2 = fueVarZ.a;
        FeedViewPager feedViewPager = this.B;
        if (cueVar != cueVar2) {
            this.l.scrollTo(0, 0);
            feedViewPager.setCurrentItem(feedViewPager.r(0));
            xw8 xw8VarB = b();
            if (xw8VarB != null) {
                xw8VarB.g.x0(0);
                return;
            }
            return;
        }
        if (str == null) {
            c(z);
            return;
        }
        int iA = this.A.a(str);
        if (iA != -1) {
            feedViewPager.setCurrentItem(feedViewPager.r(iA));
            c(z);
            return;
        }
        this.O = new nrl(f1pVar, z);
        if (z2) {
            c(z);
        }
        if (((cue) f1pVar.a).ordinal() != 1) {
            return;
        }
        this.v.c().l(str);
    }

    public final void h() {
        this.P.b();
        FeedScrollView feedScrollView = this.l;
        feedScrollView.getClass();
        mzg.j(feedScrollView, "abortAnimatedScroll", (Class[]) null, new Object[0]);
        mzg.j(this.o, "cancelScroll", (Class[]) null, new Object[0]);
        xw8 xw8VarB = b();
        if (xw8VarB != null) {
            mzg.j(xw8VarB.g, "cancelScroll", (Class[]) null, new Object[0]);
        }
    }

    public final void i() {
        mnf mnfVar = (mnf) this.a.g();
        int iMax = Math.max(mnfVar.b, ((Integer) ((pde) this.H.a).g()).intValue());
        int i = mnfVar.b;
        FeedScrollViewContentWrapper feedScrollViewContentWrapper = this.p;
        int i2 = feedScrollViewContentWrapper.b;
        int i3 = this.d0;
        if (iMax != i2 || i != feedScrollViewContentWrapper.c || i3 != feedScrollViewContentWrapper.d) {
            feedScrollViewContentWrapper.b = iMax;
            feedScrollViewContentWrapper.c = i;
            feedScrollViewContentWrapper.d = i3;
            feedScrollViewContentWrapper.requestLayout();
        }
        dv8 dv8Var = new dv8(mnfVar.c, iMax);
        cv8 cv8Var = this.q;
        RecyclerView recyclerView = cv8Var.e;
        if (Intrinsics.a(cv8Var.D, dv8Var)) {
            return;
        }
        cv8Var.D = dv8Var;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), 0);
        cv8Var.d.requestLayout();
        cv8Var.m.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed A[PHI: r17
      0x00ed: PHI (r17v4 com.opera.android.browser.OperaPageRootView) = (r17v3 com.opera.android.browser.OperaPageRootView), (r17v6 com.opera.android.browser.OperaPageRootView) binds: [B:52:0x00e3, B:43:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.rmn r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5k.j(rmn):void");
    }

    public final void k() {
        Context context = this.c.getContext();
        w6k w6kVar = ((f8k) this.U.g()).d;
        laj lajVarG = w6kVar == w6k.a ? laj.e : u0h.g(context, maj.b);
        xf8.F0(this.N, lajVarG);
        int color = w6kVar.ordinal() != 0 ? -1 : context.getColor(2131099830);
        RefreshView refreshView = this.m;
        if (color != refreshView.c) {
            refreshView.c = color;
            refreshView.invalidate();
        }
        context.getColor(2131099820);
        refreshView.invalidate();
        if (!lajVarG.equals(refreshView.d)) {
            refreshView.d = lajVarG;
            refreshView.invalidate();
        }
        refreshView.setAlpha(0.87f);
        this.l.invalidate();
        this.S.setColor(f03.t(2130969256, context, 2131101243));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.opera.android.feed.FeedScrollView] */
    public final void l() {
        int i = ((mnf) this.a.g()).c;
        avl avlVar = (avl) this.i.getState().g();
        int i2 = avlVar.e == 1 ? 0 : avlVar.c;
        ?? r5 = this.l;
        r5.setPadding(0, i2 + i, 0, 0);
        byte b = avlVar.e;
        if (b == 1 || b != 2) {
            i = 0;
        }
        if (i != r5.G) {
            r5.G = i;
            r5.invalidate();
        }
        i();
    }

    public final void m() {
        q9b q9bVar = this.R;
        int i = q9bVar.b;
        OperaPageRootView operaPageRootView = this.c;
        Rect rect = new Rect(0, i, operaPageRootView.getWidth(), operaPageRootView.getHeight() - q9bVar.c);
        Rect rect2 = new Rect(0, 0, rect.width(), Math.min(this.m.getResources().getDimensionPixelSize(2131167363), rect.height()));
        ks3 ks3Var = this.b0;
        if (Intrinsics.a((Rect) ks3Var.f, rect) && Intrinsics.a((Rect) ks3Var.g, rect2)) {
            return;
        }
        ks3Var.f = rect;
        ks3Var.g = rect2;
        ks3Var.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // defpackage.o0c
    public final void p(l0c l0cVar) {
        ?? r0 = TextUtils.getLayoutDirectionFromLocale(l0cVar == null ? Locale.getDefault() : l0cVar.b()) != 1 ? 0 : 1;
        FeedViewPager feedViewPager = this.B;
        if (feedViewPager.c != r0) {
            feedViewPager.c = r0;
            feedViewPager.b.d(r0);
        }
        kue kueVar = this.t;
        if (kueVar.l == r0) {
            return;
        }
        kueVar.l = r0;
        kueVar.d.a.d(r0);
    }
}
