package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.i;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class lu8 extends bu8 {
    public final RelativeLayout i;
    public final View j;
    public final ize k;

    public lu8(View view, ize izeVar) {
        super(view);
        WeakHashMap weakHashMap = r5n.a;
        this.i = (RelativeLayout) ((View) m5n.f(view, 2131362864));
        this.k = izeVar;
        this.j = view;
        xf8.j0(izeVar, view, new ks6(this, (byte) 10));
        pc5 pc5Var = new pc5(this, (byte) 16);
        q9n.e(view, pc5Var);
        pc5Var.a(view);
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        View viewI0 = i0();
        if (viewI0 != null) {
            ViewParent parent = viewI0.getParent();
            RelativeLayout relativeLayout = this.i;
            if (parent != relativeLayout) {
                if (viewI0.getParent() instanceof ViewGroup) {
                    ((ViewGroup) viewI0.getParent()).removeView(viewI0);
                }
                if (relativeLayout.getChildCount() > 0) {
                    relativeLayout.removeAllViews();
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                h0(layoutParams);
                relativeLayout.addView(viewI0, layoutParams);
            }
        }
    }

    public void h0(RelativeLayout.LayoutParams layoutParams) {
        layoutParams.addRule(10);
    }

    public View i0() {
        ((mq) a0()).d.getClass();
        throw new ClassCastException();
    }

    public final void j0() {
        this.j.setBackgroundColor(((Boolean) this.k.g()).booleanValue() ? f03.t(2130969331, ((i) this).itemView.getContext(), 2131101243) : 0);
    }
}
