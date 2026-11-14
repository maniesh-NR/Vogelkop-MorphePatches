package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bc9 extends ba2 implements mb9 {
    public final nb9 b;
    public final BrowserActivity c;
    public final tcl d;
    public final ha2 e;
    public final rc9 f;
    public String g;
    public final wun h;
    public final rn9 i;
    public final tcc j;
    public final xc9 k;
    public final fge l;

    public bc9(BrowserActivity browserActivity, tcl tclVar, ha2 ha2Var, rc9 rc9Var, tcc tccVar, xc9 xc9Var, String str, wun wunVar, fge fgeVar) {
        super(hb9.class);
        this.b = new nb9((byte) 0);
        this.i = new rn9((byte) 17);
        this.c = browserActivity;
        this.d = tclVar;
        this.e = ha2Var;
        this.f = rc9Var;
        this.j = tccVar;
        this.k = xc9Var;
        this.g = str;
        this.h = wunVar;
        this.l = fgeVar;
        rc9Var.d.b(this);
    }

    public static void u(ImageView imageView, String str, String str2) {
        int[][] iArr = lg7.a;
        kg7 kg7VarG = lg7.g(c5o.m().o(str, str2));
        imageView.setImageDrawable(kg7VarG.h(2, imageView.getContext()));
        imageView.setBackground(kg7VarG.g(2, imageView.getContext()));
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        if (i > 0) {
            return;
        }
        rc9 rc9Var = this.f;
        rc9Var.getClass();
        arrayList.addAll(new ArrayList(rc9Var.c));
    }

    @Override // defpackage.mb9
    public final void f(int i, int i2) {
        ja2 ja2Var = (ja2) this.i.d;
        ha2 ha2Var = this.e;
        if (ja2Var != null) {
            ha2Var.W(ja2Var, ja2Var);
        }
        int iL = ha2Var.L(hb9.class);
        if (iL == -1) {
            return;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                t();
                return;
            } else {
                ha2Var.V(ha2Var.J(iL + i));
                i2 = i3;
            }
        }
    }

    @Override // defpackage.mb9
    public final void h(int i, int i2) {
        ja2 ja2Var = (ja2) this.i.d;
        ha2 ha2Var = this.e;
        if (ja2Var != null) {
            ha2Var.W(ja2Var, ja2Var);
        }
        int iL = ha2Var.L(hb9.class);
        if (iL == -1) {
            iL = ha2Var.a.size();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ha2Var.H(iL + i + i3, (hb9) this.f.c.get(i + i3));
        }
        if (this.j.i.d(qcc.e)) {
            this.k.a();
        }
        t();
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        byte b = 12;
        if (i == 2131558854) {
            return new wb9(this.c, this.d, ha2.M(viewGroup, i, 0), this.g, this.i, new vk2(this, b));
        }
        nb9 nb9Var = this.b;
        if (i == 2131558849) {
            return new tb9(this.c, this.d, ha2.M(viewGroup, i, 0), this.g, this.i, new vk2(this, b), this.h, nb9Var);
        }
        if (i == 2131558847) {
            return new qb9(this.c, this.d, ha2.M(viewGroup, i, 0), this.g, this.i, this.l, nb9Var);
        }
        if (i == 2131558853) {
            return new ac9(ha2.M(viewGroup, i, 0), nb9Var);
        }
        if (i != 2131558855) {
            return null;
        }
        return new yb9(this.c, this.d, ha2.M(viewGroup, i, 0), this.g, this.i);
    }

    @Override // defpackage.mb9
    public final void m(int i) {
        ha2 ha2Var = this.e;
        int iL = ha2Var.L(hb9.class);
        if (iL == -1) {
            return;
        }
        ha2Var.W(ha2Var.J(iL + i), (hb9) this.f.c.get(i));
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.f.d.c(this);
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        if (ja2Var instanceof kb9) {
            return 2131558854;
        }
        if (ja2Var instanceof jb9) {
            return 2131558849;
        }
        if (ja2Var instanceof ib9) {
            return 2131558847;
        }
        if (ja2Var instanceof zb9) {
            return 2131558853;
        }
        return ja2Var instanceof lb9 ? 2131558855 : 0;
    }

    public final void t() {
        ha2 ha2Var = this.e;
        ja2 ja2VarJ = ha2Var.a.size() > 0 ? ha2Var.J(ha2Var.a.size() - 1) : null;
        rn9 rn9Var = this.i;
        ja2 ja2Var = (ja2) rn9Var.d;
        if (ja2VarJ != ja2Var) {
            if (ja2Var != null) {
                rn9Var.b = true;
            }
            rn9Var.d = ja2VarJ;
        }
        if (ja2VarJ != null) {
            ha2Var.W(ja2VarJ, ja2VarJ);
        }
    }
}
