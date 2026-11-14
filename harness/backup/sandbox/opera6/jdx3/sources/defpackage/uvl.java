package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class uvl {
    public final pt1 a;
    public final RecyclerView b;
    public final pde c;
    public final pde d;
    public final t8k e;
    public final tsd f;
    public View g;
    public final pde h = new pde(new tvl(0.0f, 0.0f, 0, 0));
    public final FrameLayout i;
    public Boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public ValueAnimator q;

    public uvl(pde pdeVar, pt1 pt1Var, RecyclerView recyclerView, pde pdeVar2, pde pdeVar3, njm njmVar, lg lgVar, fd fdVar, hv3 hv3Var, kze kzeVar, t8k t8kVar, tsd tsdVar, tsd tsdVar2) {
        this.a = pt1Var;
        this.b = recyclerView;
        this.c = pdeVar2;
        this.d = pdeVar3;
        this.e = t8kVar;
        this.f = tsdVar2;
        final byte b = 0;
        FrameLayout frameLayout = (FrameLayout) pt1Var.b;
        this.i = frameLayout;
        this.m = z7h.h(frameLayout.getContext(), 16.0f);
        this.n = z7h.h(frameLayout.getContext(), 24.0f);
        this.o = frameLayout.getResources().getDimensionPixelSize(2131167604);
        this.p = frameLayout.getResources().getDimensionPixelSize(2131167605);
        a26.U(njmVar, pdeVar, new bv8(this, (byte) 3), new p7l(this, (byte) 19));
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: svl
            public final /* synthetic */ uvl b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                uvl uvlVar = this.b;
                switch (b2) {
                    case 0:
                        uvlVar.a();
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        uvlVar.a();
                        break;
                    default:
                        uvlVar.a();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: svl
            public final /* synthetic */ uvl b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                uvl uvlVar = this.b;
                switch (b22) {
                    case 0:
                        uvlVar.a();
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        uvlVar.a();
                        break;
                    default:
                        uvlVar.a();
                        break;
                }
            }
        });
        final byte b3 = 2;
        a26.T(tsdVar2, pdeVar, new f7f(this) { // from class: svl
            public final /* synthetic */ uvl b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                uvl uvlVar = this.b;
                switch (b22) {
                    case 0:
                        uvlVar.a();
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        uvlVar.a();
                        break;
                    default:
                        uvlVar.a();
                        break;
                }
            }
        });
        new p8f(pdeVar, pt1Var, kzeVar, tsdVar);
        ImageView imageView = (ImageView) pt1Var.c;
        new zg(pdeVar, imageView, lgVar);
        new qb7(pdeVar, (ImageView) pt1Var.d, (ImageView) pt1Var.g, fdVar);
        ((ConstraintLayout) pt1Var.f).setOnClickListener(new mze(hv3Var, (byte) 3));
        imageView.setOnClickListener(new mze(hv3Var, (byte) 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvl.a():boolean");
    }

    public final Integer b() {
        View view = this.g;
        if (view == null) {
            return null;
        }
        Object parent = this.i.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return null;
        }
        return Integer.valueOf(q9n.q(view, view2).y);
    }

    public final int c() {
        boolean zY = w1h.y(this.i.getContext(), ((kl5) this.f.g()).b);
        pde pdeVar = this.c;
        return zY ? ((mnf) pdeVar.g()).c - ((FrameLayout) this.a.b).getHeight() : ((mnf) pdeVar.g()).c;
    }

    public final void d(boolean z) {
        FrameLayout frameLayout = this.i;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        boolean z2 = this.k;
        int i = layoutParams.height;
        int i2 = z2 ? this.p : this.o;
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            layoutParams.height = i2;
            frameLayout.requestLayout();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(z2 ? 150L : 250L);
        valueAnimatorOfInt.setInterpolator(lf1.c);
        valueAnimatorOfInt.addUpdateListener(new wo1(layoutParams, this, (byte) 3));
        valueAnimatorOfInt.addListener(new df1(this, (byte) 6));
        valueAnimatorOfInt.start();
        this.q = valueAnimatorOfInt;
    }
}
