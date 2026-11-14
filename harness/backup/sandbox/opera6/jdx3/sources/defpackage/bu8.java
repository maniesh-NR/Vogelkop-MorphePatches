package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.CardView;
import com.opera.android.widget.ClickAwareCardView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class bu8 extends o43 implements xa2, View.OnClickListener {
    public final nrl f;
    public int g;
    public final int h;

    public bu8(View view) {
        super(view);
        WeakHashMap weakHashMap = r5n.a;
        ClickAwareCardView clickAwareCardView = (ClickAwareCardView) ((View) m5n.f(view, 2131362863));
        this.h = f03.w(2130970848, view.getContext(), 2131166687);
        clickAwareCardView.q = this;
        this.f = new nrl(this, (byte) 0);
    }

    @Override // defpackage.xa2
    public void J(wa2 wa2Var) {
        Rect rect = wa2Var.b;
        int iMax = Math.max(rect.left, rect.right) + this.h;
        CardView cardView = (CardView) ((i) this).itemView;
        if (this.g != iMax) {
            cardView.setPadding(iMax, cardView.getPaddingTop(), iMax, cardView.getPaddingBottom());
            this.g = iMax;
        }
        rect.right = 0;
        rect.left = 0;
    }

    @Override // defpackage.lx8
    public final int b0() {
        return 1;
    }

    public yz f0() {
        return Z().d;
    }

    public boolean g0(View view) {
        return false;
    }

    @Override // defpackage.o43, defpackage.cr
    public void i(boolean z) {
        this.f.getClass();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        mq mqVarE0 = e0();
        if (mqVarE0 == null || g0(view)) {
            return;
        }
        yz yzVar = mqVarE0.d;
        if (yzVar == null || !yzVar.s()) {
            mqVarE0.k();
        }
    }

    @Override // defpackage.o43, defpackage.cr
    public final void q(boolean z) {
        super.q(z);
        this.f.q(z);
    }
}
