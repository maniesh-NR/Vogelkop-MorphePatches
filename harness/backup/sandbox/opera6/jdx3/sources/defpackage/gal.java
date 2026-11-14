package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.tabui2.TabGalleryButtonContainer;
import com.opera.android.tabui2.TabUiRootFrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gal {
    public final pde a;
    public final i03 b;
    public final ebl c;
    public final j1k d;
    public p6l e;
    public float f;
    public final pde g;
    public Float h;
    public final pde i;
    public final pde j;
    public ValueAnimator k;
    public ValueAnimator l;
    public final fal m;
    public final dal n;
    public boolean o;
    public final List p;
    public cal q;
    public cal r;
    public final m2a s;
    public final m2a t;
    public final k26 u;
    public static final ixh v = new ixh(64.0f);
    public static final ixh w = new ixh(96.0f);
    public static final dxh x = new dxh(2130969325);
    public static final dxh y = new dxh(2130969347);
    public static final dxh z = new dxh(2130969351);
    public static final dxh A = new dxh(2130969348);
    public static final dxh B = new dxh(2130969349);
    public static final dxh C = new dxh(2130969350);
    public static final dxh D = new dxh(2130969352);
    public static final dxh E = new dxh(2130969303);
    public static final dxh F = new dxh(2130969353);
    public static final dxh G = new dxh(2130969303);
    public static final dxh H = new dxh(2130969288);
    public static final dxh I = new dxh(2130969288);
    public static final dxh J = new dxh(2130969303);

    public gal(pde pdeVar, i03 i03Var, ebl eblVar, j1k j1kVar, p6l p6lVar) {
        View view = eblVar.A;
        EqualWidthLinearLayout equalWidthLinearLayout = eblVar.b;
        TabUiRootFrameLayout tabUiRootFrameLayout = eblVar.a;
        this.a = pdeVar;
        this.b = i03Var;
        this.c = eblVar;
        this.d = j1kVar;
        this.e = p6lVar;
        float f = p6lVar == p6l.b ? 1.0f : 0.0f;
        this.f = f;
        this.g = new pde(Float.valueOf(f > 0.5f ? 1.0f : 0.0f));
        og ogVar = og.a;
        this.i = new pde(ogVar);
        this.j = new pde(ogVar);
        this.m = new fal(this, equalWidthLinearLayout, view);
        dal dalVar = new dal(this);
        tabUiRootFrameLayout.setNestedScrollingEnabled(true);
        tabUiRootFrameLayout.f = dalVar;
        this.n = dalVar;
        this.p = Arrays.asList(eblVar.C, eblVar.r, eblVar.q, equalWidthLinearLayout, view);
        this.q = new cal(-16777216, -16777216);
        this.r = new cal(-16777216, -16777216);
        m2a m2aVar = new m2a();
        this.s = m2aVar;
        m2a m2aVar2 = new m2a();
        this.t = m2aVar2;
        k26 k26Var = new k26(m2aVar, m2aVar2);
        i03Var.setBackground(k26Var);
        this.u = k26Var;
        q9n.e(tabUiRootFrameLayout, new svk(this, (byte) 4));
        c();
        b(0L);
        a(0L);
    }

    public final void a(long j) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Number) this.g.g()).floatValue(), this.f > 0.5f ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(lf1.f);
        valueAnimatorOfFloat.addUpdateListener(new bal(this, (byte) 1));
        valueAnimatorOfFloat.start();
        this.l = valueAnimatorOfFloat;
    }

    public final void b(long j) {
        if (this.m.c.d == -1 && !this.n.a) {
            ValueAnimator valueAnimator = this.k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f, this.e == p6l.b ? 1.0f : 0.0f);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.setInterpolator(lf1.n);
            valueAnimatorOfFloat.addUpdateListener(new bal(this, (byte) 0));
            valueAnimatorOfFloat.start();
            this.k = valueAnimatorOfFloat;
        }
    }

    public final void c() {
        ebl eblVar = this.c;
        Context context = eblVar.j.getContext();
        Context context2 = eblVar.g.getContext();
        dxh dxhVar = y;
        int iA = dxhVar.a(context);
        dxh dxhVar2 = z;
        int iA2 = dxhVar2.a(context);
        dxh dxhVar3 = A;
        int iA3 = dxhVar3.a(context);
        dxh dxhVar4 = B;
        int iA4 = dxhVar4.a(context);
        dxh dxhVar5 = C;
        int iA5 = dxhVar5.a(context);
        dxh dxhVar6 = D;
        List listJ = t0h.j(iA, iA2, iA3, iA4, iA5, dxhVar6.a(context));
        m2a m2aVar = this.s;
        if (!Intrinsics.a(listJ, m2aVar.a)) {
            m2aVar.a = listJ;
            m2aVar.invalidateSelf();
        }
        this.q = new cal(((l2a) CollectionsKt.K(listJ)).a, ((l2a) CollectionsKt.Q(listJ)).a);
        List listJ2 = t0h.j(dxhVar.a(context2), dxhVar2.a(context2), dxhVar3.a(context2), dxhVar4.a(context2), dxhVar5.a(context2), dxhVar6.a(context2));
        m2a m2aVar2 = this.t;
        if (!Intrinsics.a(listJ2, m2aVar2.a)) {
            m2aVar2.a = listJ2;
            m2aVar2.invalidateSelf();
        }
        this.r = new cal(((l2a) CollectionsKt.K(listJ2)).a, ((l2a) CollectionsKt.Q(listJ2)).a);
    }

    public final void d() {
        ebl eblVar = this.c;
        yq1 yq1Var = eblVar.x;
        yq1 yq1Var2 = eblVar.y;
        Context context = eblVar.j.getContext();
        Context context2 = eblVar.g.getContext();
        pde pdeVar = this.g;
        float fFloatValue = ((Number) pdeVar.g()).floatValue();
        k26 k26Var = this.u;
        k26Var.getClass();
        int iB = zed.b(fFloatValue * 255.0f);
        if (k26Var.c != iB) {
            k26Var.c = iB;
            k26Var.b.setAlpha(iB);
            k26Var.invalidateSelf();
        }
        int iR = p37.R(((Number) pdeVar.g()).floatValue(), this.q.a, this.r.a);
        i03 i03Var = this.b;
        if (iR != i03Var.e) {
            i03Var.e = iR;
            i03Var.invalidate();
            c1f c1fVar = i03Var.b;
            if (c1fVar != null) {
                c1fVar.e();
            }
        }
        int iR2 = p37.R(((Number) pdeVar.g()).floatValue(), this.q.b, this.r.b);
        if (iR2 != i03Var.f) {
            i03Var.f = iR2;
            i03Var.invalidate();
            c1f c1fVar2 = i03Var.b;
            if (c1fVar2 != null) {
                c1fVar2.e();
            }
        }
        dxh dxhVar = E;
        int iA = dxhVar.a(context);
        int iA2 = dxhVar.a(context2);
        TabGalleryButtonContainer tabGalleryButtonContainer = eblVar.z;
        tabGalleryButtonContainer.g.setColor(p37.R(((Number) pdeVar.g()).floatValue(), iA, iA2));
        tabGalleryButtonContainer.invalidate();
        AppCompatImageView appCompatImageView = eblVar.m;
        dxh dxhVar2 = F;
        appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(p37.R(((Number) pdeVar.g()).floatValue(), dxhVar2.a(context), dxhVar2.a(context2))));
        yq1Var2.setTextColor(p37.R(((Number) pdeVar.g()).floatValue(), G.a(context), H.a(context2)));
        yq1Var.setTextColor(p37.R(((Number) pdeVar.g()).floatValue(), I.a(context), J.a(context2)));
        dxh dxhVar3 = x;
        eblVar.b.setBackgroundTintList(ColorStateList.valueOf(p37.R(((Number) pdeVar.g()).floatValue(), dxhVar3.a(context), dxhVar3.a(context2))));
        boolean z2 = ((Number) pdeVar.g()).floatValue() > 0.5f;
        if (z2 != this.o) {
            this.o = z2;
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                u8n.d(z2 ? 2132083619 : 2132083620, (View) it.next());
            }
        }
        boolean z3 = ((Number) pdeVar.g()).floatValue() > 0.5f;
        yq1Var2.setSelected(!z3);
        yq1Var.setSelected(z3);
    }

    public final void e() {
        ebl eblVar = this.c;
        FrameLayout frameLayout = eblVar.l;
        FrameLayout frameLayout2 = eblVar.k;
        Object objG = this.a.g();
        pg pgVar = ng.a;
        boolean zA = Intrinsics.a(objG, pgVar);
        boolean z2 = this.m.c.d != -1 || this.n.a;
        pg pgVar2 = og.a;
        pg pgVar3 = (!zA || (this.f >= 1.0f && !z2)) ? pgVar2 : pgVar;
        pde pdeVar = this.i;
        xf8.F0(pdeVar, pgVar3);
        if (zA && (this.f > 0.0f || z2)) {
            pgVar2 = pgVar;
        }
        pde pdeVar2 = this.j;
        xf8.F0(pdeVar2, pgVar2);
        frameLayout.setVisibility(Intrinsics.a(pdeVar.g(), pgVar) ? 0 : 8);
        frameLayout2.setVisibility(Intrinsics.a(pdeVar2.g(), pgVar) ? 0 : 8);
        frameLayout.setAlpha(djh.b(((1.0f - this.f) * 2.0f) - 1.0f, 0.0f, 1.0f));
        frameLayout2.setAlpha(djh.b((this.f * 2.0f) - 1.0f, 0.0f, 1.0f));
        float fL = v.l(eblVar.a.getContext());
        if (f()) {
            frameLayout.setTranslationX(this.f * fL);
            frameLayout2.setTranslationX((fL * this.f) + (-fL));
        } else {
            frameLayout.setTranslationX((-fL) * this.f);
            frameLayout2.setTranslationX(fL - (this.f * fL));
        }
        TabGalleryButtonContainer tabGalleryButtonContainer = eblVar.z;
        float f = this.f;
        if (f != tabGalleryButtonContainer.f) {
            tabGalleryButtonContainer.f = f;
            tabGalleryButtonContainer.invalidate();
        }
        float f2 = this.f <= 0.5f ? 0.0f : 1.0f;
        Float f3 = this.h;
        if (f3 == null || f2 != f3.floatValue()) {
            this.h = Float.valueOf(f2);
            a(100L);
        }
    }

    public final boolean f() {
        return this.c.a.getLayoutDirection() == 1;
    }

    public final void g(p6l p6lVar) {
        if (this.e == p6lVar) {
            return;
        }
        this.e = p6lVar;
        b(200L);
        this.d.invoke();
    }
}
