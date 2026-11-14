package defpackage;

import android.animation.TimeAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes.dex */
public final class vqk extends k56 {
    public final p79 t;
    public final TimeAnimator u;
    public boolean v;
    public boolean w;

    public vqk(final RecyclerView recyclerView, boolean z) {
        p79 p79Var = new p79();
        p79Var.a = new int[3];
        this.t = p79Var;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.u = timeAnimator;
        this.w = z;
        long integer = recyclerView.getResources().getInteger(2131493009);
        ((e) this).c = integer;
        ((e) this).d = integer;
        ((e) this).e = integer;
        this.g = false;
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: uqk
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                RecyclerView recyclerView2 = recyclerView;
                e eVar = recyclerView2.M;
                if (eVar == null || !eVar.h()) {
                    this.a.u.cancel();
                } else {
                    recyclerView2.invalidate();
                }
            }
        });
    }

    @Override // defpackage.k56
    public final void f() {
        this.w = false;
    }

    public final fr i(vph vphVar, i iVar, int i, List list) {
        p79 p79Var = this.t;
        p79Var.getClass();
        if (vphVar.g) {
            int layoutPosition = iVar.getLayoutPosition();
            int[] iArr = p79Var.a;
            if (layoutPosition < iArr.length) {
                iArr[layoutPosition] = iVar.hashCode();
            }
        }
        return super.i(vphVar, iVar, i, list);
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean k(i iVar) {
        if (!this.w) {
            c(iVar);
            return false;
        }
        super.k(iVar);
        iVar.itemView.setTranslationY(fan.a(120.0f, r1.getResources()));
        return true;
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean l(i iVar, i iVar2, int i, int i2, int i3, int i4) {
        if (iVar2 == iVar) {
            c(iVar2);
            return false;
        }
        c(iVar2);
        c(iVar);
        return false;
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean m(i iVar, int i, int i2, int i3, int i4) {
        if (this.v) {
            return super.m(iVar, i, i2, i3, i4);
        }
        o(iVar);
        return false;
    }

    @Override // defpackage.k56, defpackage.xkj
    public final boolean n(i iVar) {
        c(iVar);
        return false;
    }

    @Override // defpackage.xkj
    public final void p() {
        this.u.start();
    }

    @Override // defpackage.xkj
    public final void r() {
        this.u.start();
    }

    @Override // defpackage.k56
    public final void s(i iVar) {
        if (this.w) {
            iVar.getLayoutPosition();
            this.p.add(iVar);
            View view = iVar.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.alpha(1.0f).translationY(0.0f).setInterpolator(lf1.l).setDuration(((e) this).c).setListener(new f56(this, iVar, view, viewPropertyAnimatorAnimate, (byte) 2));
        }
    }

    @Override // defpackage.k56
    public final void u(i iVar) {
    }
}
