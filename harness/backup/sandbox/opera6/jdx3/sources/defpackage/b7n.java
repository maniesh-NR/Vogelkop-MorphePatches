package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class b7n extends d7n {
    @Override // defpackage.ak7, defpackage.th7
    public final void a(i iVar) {
        this.o.g(((e7n) iVar).i.a, (ml3) this.i.a);
    }

    @Override // defpackage.ak7, defpackage.yzi
    public final void a0() {
        super.a0();
        if (this.e) {
            b0(m0());
        }
    }

    @Override // defpackage.e7n
    public final boolean j0() {
        return this.i.b == 2;
    }

    @Override // defpackage.d7n, defpackage.e7n
    public final void k0(qhc qhcVar) {
        super.k0(qhcVar);
        b0(m0());
        int i = this.i.b;
        TextView textView = this.l;
        if (i == 2) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        al3 al3Var = this.i.a;
        sa2 sa2Var = new sa2((byte) 4, false);
        al3Var.c(sa2Var);
        int i2 = sa2Var.b;
        textView.setText(((i) this).itemView.getContext().getResources().getQuantityString(2131886094, i2, Integer.valueOf(i2)));
    }

    public final Drawable m0() {
        int iA = vep.A(this.i.b);
        int i = 2131232090;
        if (iA != 0) {
            if (iA == 1) {
                i = 2131232171;
            } else if (iA == 2) {
                i = 2131232065;
            } else if (iA != 3 && iA != 4) {
                i = 0;
            }
        } else if (((ml3) this.i.a).b() != null) {
            return alo.z(((i) this).itemView.getContext(), ((ml3) this.i.a).b());
        }
        return alo.A(i, ((i) this).itemView.getContext());
    }
}
