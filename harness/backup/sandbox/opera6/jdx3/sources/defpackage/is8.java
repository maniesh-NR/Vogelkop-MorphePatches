package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class is8 extends fs8 {
    public final cr8 i;

    public is8(cr8 cr8Var) {
        super(cr8Var);
        cr8Var.setId(2131362849);
        this.i = cr8Var;
    }

    @Override // defpackage.fs8
    public final void Z(hq8 hq8Var) {
        super.Z(hq8Var);
        tq8 tq8Var = (tq8) hq8Var;
        cr8 cr8Var = this.i;
        ArrayList arrayList = cr8Var.x;
        tq8 tq8Var2 = cr8Var.v;
        if (tq8Var2 != tq8Var) {
            if (tq8Var2 != null) {
                tq8Var2.o(cr8Var);
            }
            cr8Var.v = tq8Var;
            if (tq8Var != null) {
                tq8Var.b(cr8Var);
            }
            if (cr8Var.v != null) {
                cr8Var.t(true);
                cr8Var.s();
            } else {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    br8 br8Var = (br8) obj;
                    br8Var.a.o(br8Var);
                    yr8 yr8Var = br8Var.b;
                    yr8Var.f = null;
                    yr8Var.j = 0;
                    yr8Var.e();
                    yr8Var.k = null;
                    yr8Var.l = null;
                }
                arrayList.clear();
            }
            cr8Var.invalidate();
        }
        cr8Var.l();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f == null || this.d == null) {
            return;
        }
        Y().k(this.f);
        this.d.Y((tq8) this.f, false);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ns8 ns8Var;
        hq8 hq8Var = this.f;
        if (hq8Var == null || (ns8Var = this.d) == null) {
            return false;
        }
        return ns8Var.L(this, hq8Var);
    }

    @Override // defpackage.th7
    public final void x(boolean z) {
        cr8 cr8Var = this.i;
        float fFloatValue = ((Float) cr8Var.A.getAnimatedValue()).floatValue();
        cr8Var.A.cancel();
        cr8Var.A.removeUpdateListener(cr8Var);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.15f : 1.0f);
        cr8Var.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(cr8Var.z);
        cr8Var.A.addUpdateListener(cr8Var);
        cr8Var.A.start();
        cr8Var.invalidate();
    }
}
