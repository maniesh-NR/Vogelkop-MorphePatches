package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.browser.TabInfo;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.tabui2.ConfigurationProvidingFrameLayout;
import com.opera.android.tabui2.FadeoutRecyclerView;
import com.opera.android.tabui2.TabUiRootFrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r9l implements fm8 {
    public static final LinkedHashMap F = new LinkedHashMap();
    public final p9l A;
    public final z5l B;
    public final z5l C;
    public final g4l D;
    public final l45 E;
    public final gjm a;
    public final p77 b;
    public final k6l c;
    public final u4l d;
    public final ViewGroup e;
    public final mt3 f;
    public final jo3 g;
    public final yqa h;
    public final gb3 i;
    public final j1k j;
    public final zyk l;
    public final zyk m;
    public final i03 p;
    public final ebl q;
    public final pde r;
    public final fe5 s;
    public final gal t;
    public boolean u;
    public final pde v;
    public final s9i w;
    public final pde x;
    public final z9j y;
    public final zkk z;
    public final zyk k = z4c.b(new c9l(this, 0));
    public final l9l n = new l9l(this);
    public j9l o = j9l.a;

    /* JADX WARN: Removed duplicated region for block: B:85:0x0755 A[PHI: r3
      0x0755: PHI (r3v2 int) = (r3v1 int), (r3v4 int), (r3v5 int), (r3v6 int), (r3v7 int) binds: [B:3:0x0087, B:5:0x0094, B:7:0x00a1, B:9:0x00ae, B:11:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r19v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r29v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r30v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r31v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r32v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.ObservableEditText, w6f] */
    /* JADX WARN: Type inference failed for: r33v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r39v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /* JADX WARN: Type inference failed for: r41v1, types: [android.view.View, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r42v1, types: [android.view.View, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r45v1, types: [android.view.View, com.opera.android.custom_views.TabCountButton] */
    /* JADX WARN: Type inference failed for: r5v45, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r9l(defpackage.pde r74, defpackage.c4l r75, defpackage.gjm r76, defpackage.x5f r77, defpackage.z77 r78, defpackage.p77 r79, defpackage.k6l r80, defpackage.u4l r81, defpackage.i53 r82, defpackage.nr8 r83, com.opera.android.settings.SettingsManager r84, defpackage.ysj r85, defpackage.mt3 r86, android.view.ViewGroup r87, defpackage.mt3 r88, defpackage.eme r89, defpackage.jo3 r90, defpackage.yqa r91, defpackage.p6l r92, gb3 r93, defpackage.j1k r94) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9l.<init>(pde, c4l, gjm, x5f, z77, p77, k6l, u4l, i53, nr8, com.opera.android.settings.SettingsManager, ysj, mt3, android.view.ViewGroup, mt3, eme, jo3, yqa, p6l, gb3, j1k):void");
    }

    public final isj a() {
        return (isj) this.k.getValue();
    }

    public final boolean b() {
        b2l b2lVarG;
        k6l k6lVar = this.c;
        b2l b2lVarA = k6lVar.A();
        gal galVar = this.t;
        if (galVar.e != b2lVarA.T() && (b2lVarG = g(galVar.e)) != null) {
            k6lVar.C(b2lVarG, 3);
        }
        return j();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.opera.android.custom_views.StylingImageButton, com.opera.android.custom_views.StylingImageView] */
    public final void c() {
        lxh lxhVar;
        b3c b3cVar = (b3c) this.y.g();
        cyj cyjVar = eyj.H;
        ebl eblVar = this.q;
        Context context = eblVar.f.getContext();
        Size size = (Size) eblVar.f.c.g();
        Size size2 = (Size) this.f.invoke();
        TabUiRootFrameLayout tabUiRootFrameLayout = eblVar.a;
        eyj eyjVarE = m5h.e(context, b3cVar, size, size2, ((Number) tabUiRootFrameLayout.d.g()).intValue(), tabUiRootFrameLayout.getResources().getDimensionPixelSize(2131167669));
        pde pdeVar = this.x;
        xf8.F0(pdeVar, eyjVarE);
        ?? r2 = eblVar.c;
        int iOrdinal = h().ordinal();
        if (iOrdinal == 0) {
            lxhVar = new lxh(2131232273);
        } else if (iOrdinal == 1) {
            lxhVar = new lxh(2131232103);
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return;
                } else {
                    qp2.n("not for display");
                    return;
                }
            }
            lxhVar = new lxh(2131232124);
        }
        r2.setImageDrawable(lxhVar.f(r2.getContext()));
        txj txjVar = ((eyj) pdeVar.g()).l;
        if (txjVar != null) {
            int i = txjVar.d;
            int i2 = txjVar.c;
            int i3 = txjVar.b;
            RecyclerView recyclerView = eblVar.i;
            p37.s0(recyclerView, -1, i3);
            p37.o0(recyclerView, 0, txjVar.a, 0, 0, 13);
            recyclerView.setPadding(i2, i, i2, recyclerView.getPaddingBottom());
            RecyclerView recyclerView2 = eblVar.h;
            p37.s0(recyclerView2, -1, i3);
            p37.o0(recyclerView2, 0, txjVar.a, 0, 0, 13);
            recyclerView2.setPadding(i2, i, i2, recyclerView2.getPaddingBottom());
        }
    }

    public final void d() {
        ebl eblVar = this.q;
        RelativeLayout relativeLayout = eblVar.q;
        EqualWidthLinearLayout equalWidthLinearLayout = eblVar.b;
        bq1 bq1Var = eblVar.o;
        FloatingActionButton floatingActionButton = eblVar.A;
        RelativeLayout relativeLayout2 = eblVar.r;
        RelativeLayout relativeLayout3 = eblVar.C;
        RelativeLayout relativeLayout4 = eblVar.q;
        boolean z = relativeLayout.getVisibility() == 0;
        if (this.w.Y()) {
            equalWidthLinearLayout.setVisibility(8);
            floatingActionButton.setVisibility(8);
            relativeLayout3.setVisibility(8);
            relativeLayout4.setVisibility(8);
            relativeLayout2.setVisibility(0);
        } else if (this.u) {
            equalWidthLinearLayout.setVisibility(8);
            floatingActionButton.setVisibility(8);
            relativeLayout3.setVisibility(8);
            relativeLayout4.setVisibility(0);
            relativeLayout2.setVisibility(8);
        } else {
            equalWidthLinearLayout.setVisibility(0);
            floatingActionButton.setVisibility(0);
            relativeLayout3.setVisibility(0);
            relativeLayout4.setVisibility(8);
            relativeLayout2.setVisibility(8);
        }
        ConfigurationProvidingFrameLayout configurationProvidingFrameLayout = eblVar.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) configurationProvidingFrameLayout.getLayoutParams();
        p37.n0(configurationProvidingFrameLayout, marginLayoutParams.leftMargin, (relativeLayout3.getVisibility() == 0 || relativeLayout4.getVisibility() == 0 || relativeLayout2.getVisibility() == 0) ? relativeLayout3.getLayoutParams().height : 0, marginLayoutParams.rightMargin, 0);
        if (!z && relativeLayout4.getVisibility() == 0 && f().q.l.g() == null) {
            bq1Var.requestFocus();
            l5b l5bVar = q9n.c;
            q9n.G(bq1Var.getContext(), bq1Var);
        } else {
            if (!z || relativeLayout4.getVisibility() == 0) {
                return;
            }
            q9n.u(bq1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View e(defpackage.uz3 r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9l.e(uz3):android.view.View");
    }

    public final z5l f() {
        return k() ? this.C : this.B;
    }

    public final b2l g(p6l p6lVar) {
        s3l s3lVar;
        s3l s3lVar2 = u3l.a;
        int iOrdinal = p6lVar.ordinal();
        if (iOrdinal == 0) {
            s3lVar = u3l.a;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            s3lVar = u3l.b;
        }
        k6l k6lVar = this.c;
        return (b2l) CollectionsKt.firstOrNull(exg.p(k6lVar, s3lVar, k6lVar.m));
    }

    public final b3c h() {
        int iOrdinal = ((b3c) this.y.g()).ordinal();
        if (iOrdinal == 0) {
            return b3c.f;
        }
        if (iOrdinal == 1) {
            return b3c.d;
        }
        if (iOrdinal == 2) {
            return b3c.e;
        }
        if (iOrdinal == 3) {
            return b3c.f;
        }
        h9o.p();
        return null;
    }

    public final boolean i(boolean z) {
        FadeoutRecyclerView fadeoutRecyclerView;
        RecyclerView recyclerView;
        BottomBar bottomBar = this.g.a;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
            }
            return false;
        }
        this.o = j9l.c;
        ebl eblVar = this.q;
        eblVar.a.a = true;
        q9n.u(eblVar.o);
        this.j.invoke();
        g4l.a(this.D, null, 3);
        ((m24) this.l.getValue()).c(this.n);
        if (!z) {
            bottomBar.animate().cancel();
            bottomBar.setAlpha(1.0f);
            if (bottomBar.f) {
                bottomBar.f = false;
                bottomBar.setDescendantFocusability(131072);
            }
            this.o = j9l.d;
            this.e.removeView(this.p);
            return true;
        }
        b2l b2lVarA = this.c.A();
        FloatingActionButton floatingActionButton = eblVar.A;
        gal galVar = this.t;
        int iOrdinal2 = galVar.e.ordinal();
        if (iOrdinal2 == 0) {
            fadeoutRecyclerView = eblVar.j;
        } else {
            if (iOrdinal2 != 1) {
                h9o.p();
                return false;
            }
            fadeoutRecyclerView = eblVar.g;
        }
        FadeoutRecyclerView fadeoutRecyclerView2 = fadeoutRecyclerView;
        int iOrdinal3 = galVar.e.ordinal();
        if (iOrdinal3 == 0) {
            recyclerView = eblVar.i;
        } else {
            if (iOrdinal3 != 1) {
                h9o.p();
                return false;
            }
            recyclerView = eblVar.h;
        }
        RecyclerView recyclerView2 = recyclerView;
        new rh8(this.x, b2lVarA, this.e, this.p, floatingActionButton, fadeoutRecyclerView2, recyclerView2, f(), (wv3) ((BrowserActivity) this.h.c).y0.get(), new nqi((Object) this, (byte) 12), new j1k(0, this, r9l.class, "onHidden", "onHidden()V", 0, (byte) 21));
        return true;
    }

    public final boolean j() {
        int iOrdinal = this.o.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
            }
            return false;
        }
        this.o = j9l.b;
        ebl eblVar = this.q;
        eblVar.a.a = true;
        q9n.u(eblVar.o);
        q(new c9l(this, (byte) 4));
        return true;
    }

    public final boolean k() {
        return this.t.e == p6l.b;
    }

    public final void l() {
        int iIndexOf;
        float fB;
        int iOrdinal = ((b3c) this.y.g()).ordinal();
        byte b = 3;
        gal galVar = this.t;
        p9l p9lVar = this.A;
        if (iOrdinal == 0) {
            z5l z5lVarF = f();
            x2l x2lVar = z5lVarF.v;
            RecyclerView recyclerView = z5lVarF.f;
            x2lVar.getClass();
            b2l b2lVar = (b2l) nxg.n(recyclerView, new bvk(b));
            if (b2lVar == null) {
                b2lVar = (b2l) x2lVar.o.e.getValue();
            }
            if (b2lVar != null) {
                m(b2lVar);
                return;
            } else {
                p9lVar.k(galVar.e);
                return;
            }
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                return;
            }
            h9o.p();
            return;
        }
        b2l b2lVarG = g(galVar.e);
        if (b2lVarG != null) {
            z5l z5lVarF2 = f();
            x2l x2lVar2 = z5lVarF2.v;
            RecyclerView recyclerView2 = z5lVarF2.f;
            x2lVar2.getClass();
            h6n it = new g6n(recyclerView2).iterator();
            while (true) {
                h6n h6nVar = it;
                fB = 0.0f;
                if (!h6nVar.hasNext()) {
                    break;
                }
                View view = (View) h6nVar.next();
                i iVarT = recyclerView2.T(view);
                if ((iVarT instanceof h5l) && Intrinsics.a(CollectionsKt.firstOrNull(((h5l) iVarT).X()), b2lVarG)) {
                    int height = view.getHeight() * view.getWidth();
                    if (height > 0 && q9n.x(view)) {
                        if (view.getGlobalVisibleRect(new Rect())) {
                            fB = djh.b((r5.height() * r5.width()) / height, 0.0f, 1.0f);
                        }
                    }
                }
            }
            if (fB > 0.5f) {
                m(b2lVarG);
                return;
            }
        }
        boolean zK = k();
        ebl eblVar = this.q;
        RecyclerView recyclerView3 = zK ? eblVar.g : eblVar.j;
        if (!recyclerView3.canScrollVertically(1)) {
            if (!recyclerView3.canScrollHorizontally(recyclerView3.getLayoutDirection() == 0 ? 1 : -1)) {
                p9lVar.k(galVar.e);
                return;
            }
        }
        z5l z5lVarF3 = f();
        x2l x2lVar3 = z5lVarF3.v;
        RecyclerView recyclerView4 = z5lVarF3.f;
        x2lVar3.getClass();
        b2l b2lVar2 = (b2l) nxg.n(recyclerView4, new bvk(b));
        if (b2lVar2 == null) {
            b2lVar2 = (b2l) x2lVar3.o.e.getValue();
        }
        b2l b2lVar3 = (b2lVar2 == null || (iIndexOf = x2lVar3.o.b.indexOf(b2lVar2)) <= 0) ? null : (b2l) x2lVar3.o.b.get(iIndexOf - 1);
        if (b2lVar3 != null) {
            d7l d7lVar = (d7l) b2lVar3;
            if (((Set) ((pde) ((a21) f().u.a).m).g()).contains(Integer.valueOf(d7lVar.j.a().d))) {
                p9lVar.h0(b2lVar3, new TabInfo(0, d7lVar.j.a().d, System.currentTimeMillis(), 0L));
                return;
            } else {
                m(b2lVar3);
                return;
            }
        }
        z5l z5lVarF4 = f();
        x2l x2lVar4 = z5lVarF4.v;
        RecyclerView recyclerView5 = z5lVarF4.f;
        x2lVar4.getClass();
        b2l b2lVar4 = (b2l) nxg.n(recyclerView5, new bvk(b));
        if (b2lVar4 == null) {
            b2lVar4 = (b2l) x2lVar4.o.e.getValue();
        }
        if (b2lVar4 != null) {
            m(b2lVar4);
        } else {
            p9lVar.k(galVar.e);
        }
    }

    public final void m(b2l b2lVar) {
        s3l s3lVar;
        d7l d7lVar = (d7l) b2lVar;
        int i = d7lVar.j.a().d;
        p9l p9lVar = this.A;
        if (i == 0) {
            d7lVar.j.a();
            p9lVar.h0(b2lVar, new TabInfo(0, 0, System.currentTimeMillis(), 0L));
            return;
        }
        s3l s3lVar2 = u3l.a;
        int iOrdinal = b2lVar.T().ordinal();
        if (iOrdinal == 0) {
            s3lVar = u3l.a;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            s3lVar = u3l.b;
        }
        r3l r3lVar = new r3l(i);
        s3lVar.getClass();
        b2l b2lVar2 = (b2l) CollectionsKt.Q(exg.p(this.c, new p3l(s3lVar, r3lVar), y6l.a));
        ((d7l) b2lVar2).j.a();
        p9lVar.h0(b2lVar2, new TabInfo(0, 0, System.currentTimeMillis(), 0L));
    }

    public final void n() {
        this.z.b(vr0.d);
        g4l.a(this.D, uz3.g, 1);
        this.a.c(new jnh(), this.s, new w4i(new f9l(this, (byte) 1), (byte) 24));
    }

    public final void o() {
        this.z.b(vr0.e);
        new zhj(new wzg(new vyk(), vyk.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])).c(this.e.getContext());
    }

    public final void p(b2l b2lVar) {
        this.t.g(b2lVar.T());
        z5l z5lVarF = f();
        z5lVarF.u.r(((d7l) b2lVar).j.a().d);
        z5lVarF.e(new v5l(z5lVarF, b2lVar, (byte) 1), new t5l(z5lVarF, (byte) 2));
    }

    public final void q(Function0 function0) {
        zg zgVar = f().p;
        ArrayList arrayList = (ArrayList) zgVar.d;
        arrayList.add(function0);
        if (arrayList.size() == 1) {
            View rootView = ((RecyclerView) zgVar.b).getRootView();
            rootView.requestLayout();
            q9n.d(new bi(zgVar, (byte) 16), rootView);
        }
    }

    public final boolean r(boolean z) {
        if (z == this.u) {
            return false;
        }
        this.u = z;
        LinkedHashMap linkedHashMap = F;
        k6l k6lVar = this.c;
        gal galVar = this.t;
        g4l g4lVar = this.D;
        ebl eblVar = this.q;
        String str = null;
        if (z) {
            this.z.b(vr0.w);
            g4l.a(g4lVar, uz3.f, 1);
            p6l p6lVar = galVar.e;
            k9l k9lVar = (k9l) linkedHashMap.get(p6lVar);
            if (k9lVar != null && (p6lVar != p6l.b || k9lVar.b == k6lVar.y)) {
                str = k9lVar.a;
            }
            eblVar.o.setText(str);
            eblVar.o.setSelection(str != null ? str.length() : 0);
        } else {
            g4l.e(g4lVar);
            p6l p6lVar2 = galVar.e;
            Editable text = eblVar.o.getText();
            linkedHashMap.put(p6lVar2, new k9l(text != null ? text.toString() : null, k6lVar.y));
            eblVar.o.setText(null);
        }
        d();
        return true;
    }

    public final boolean s(boolean z, boolean z2) {
        s9i s9iVar = this.w;
        if (z == s9iVar.Y()) {
            return false;
        }
        if (!z) {
            s9iVar.h0();
            return true;
        }
        u3l u3lVar = (u3l) f().s.g();
        if (s9iVar.Y()) {
            return true;
        }
        s9iVar.e = u3lVar;
        ((pde) s9iVar.c).r(new LinkedHashSet());
        ((pde) s9iVar.d).r(new pyi(exg.p((k6l) s9iVar.b, (u3l) s9iVar.e, y6l.a).size(), (u3l) s9iVar.e, z2));
        return true;
    }

    public final void t() {
        qz3 qz3Var;
        uz3 uz3Var = uz3.g;
        View viewE = e(uz3Var);
        ebl eblVar = this.q;
        boolean zEquals = viewE != null ? viewE.equals(eblVar.d) : false;
        g4l g4lVar = this.D;
        rz3 rz3Var = (rz3) g4lVar.g.i;
        Integer num = null;
        boolean z = ((rz3Var == null || (qz3Var = rz3Var.j) == null) ? null : qz3Var.p) == uz3Var;
        f4l f4lVar = f4l.b;
        if (!zEquals) {
            uz3Var = null;
        }
        g4lVar.j.add(f4lVar);
        g4lVar.d(new eek((Object) g4lVar, (Object) uz3Var, (byte) 7));
        h0h h0hVar = new h0h(new n9k(this));
        if (z && zEquals) {
            num = 2131364670;
        } else if (g4lVar.g.b && g4lVar.b(true) && g4lVar.i.g() == a4l.c) {
            num = 2131364700;
        }
        if (num != null) {
            h0hVar.i = num.intValue();
        }
        h0hVar.o(eblVar.d);
    }

    public final void u() {
        ebl eblVar = this.q;
        if (eblVar.o.isFocused()) {
            q9n.u(eblVar.o);
            eblVar.o.clearFocus();
        }
    }
}
