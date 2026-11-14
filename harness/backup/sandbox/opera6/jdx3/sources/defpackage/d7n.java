package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.bookmarks.h;

/* loaded from: classes.dex */
public abstract class d7n extends e7n {
    public final TextView k;
    public final TextView l;
    public final View m;
    public final TextView n;
    public final i53 o;

    public d7n(View view, tzi tziVar, i53 i53Var) {
        super(view, tziVar);
        this.k = (TextView) ((i) this).itemView.findViewById(2131363263);
        this.l = (TextView) ((i) this).itemView.findViewById(2131363266);
        this.m = ((i) this).itemView.findViewById(2131363258);
        this.n = (TextView) ((i) this).itemView.findViewById(2131363255);
        this.o = i53Var;
    }

    @Override // defpackage.ak7, defpackage.th7
    public final boolean I(i iVar) {
        if (this.j) {
            return !this.i.a.a(((h) this.o).o()).h() || getItemViewType() == iVar.getItemViewType();
        }
        return false;
    }

    @Override // defpackage.ak7, defpackage.th7
    public final void K(i iVar) {
        int iIndexOf;
        e7n e7nVar = (e7n) iVar;
        boolean zJ0 = e7nVar.j0();
        i53 i53Var = this.o;
        if (zJ0) {
            iIndexOf = 0;
        } else {
            al3 al3Var = e7nVar.i.a;
            iIndexOf = al3Var.a(((h) i53Var).o()).i().indexOf(al3Var);
        }
        if (iIndexOf >= 0) {
            al3 al3Var2 = this.i.a;
            i53Var.getClass();
            i53Var.h(al3Var2, al3Var2.a(((h) i53Var).o()), iIndexOf);
        }
    }

    @Override // defpackage.yzi
    public final boolean V() {
        qhc qhcVar = this.i;
        if (qhcVar != null) {
            return qhcVar.a() || qhcVar.b == 2;
        }
        return false;
    }

    @Override // defpackage.yzi, defpackage.qzi
    public final void W(boolean z) {
        f0();
        ((i) this).itemView.setEnabled(!z || this.i.a());
    }

    @Override // defpackage.yzi
    public final boolean Y() {
        qhc qhcVar = this.i;
        return qhcVar != null && qhcVar.a();
    }

    @Override // defpackage.ak7, defpackage.th7
    public final View e() {
        return ((i) this).itemView.findViewById(2131363262);
    }

    @Override // defpackage.ak7, defpackage.th7
    public final Object f() {
        return null;
    }

    @Override // defpackage.yzi
    public final void g0(boolean z) {
        this.m.setVisibility(this.i.a() ? z ? 0 : 4 : 8);
    }

    @Override // defpackage.e7n
    public void k0(qhc qhcVar) {
        TextView textView = this.k;
        textView.setText(qhcVar.d(textView.getResources()));
        ml3 ml3VarA = qhcVar.a.a(((h) this.o).o());
        TextView textView2 = this.n;
        if (ml3VarA == null || ml3VarA.h()) {
            textView2.setText(2132020570);
        } else {
            textView2.setText(ml3VarA.getTitle());
        }
    }

    @Override // defpackage.ak7, defpackage.th7
    public final void x(boolean z) {
        ((i) this).itemView.setSelected(z || Z());
    }
}
