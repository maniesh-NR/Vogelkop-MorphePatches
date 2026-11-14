package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaTextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class skb extends blb {
    public static final ixh i = new ixh(3.0f);
    public static final long j;
    public final vo3 e;
    public i f;
    public flb g;
    public RecyclerView h;

    static {
        on7 on7Var = pn7.b;
        j = cs5.x0(150, un7.d);
    }

    public skb(vo3 vo3Var) {
        this.e = vo3Var;
    }

    @Override // defpackage.blb
    public final void d(RecyclerView recyclerView, i iVar) {
        iVar.itemView.animate().cancel();
        iVar.itemView.setTranslationX(0.0f);
        iVar.itemView.setTranslationY(0.0f);
        iVar.itemView.setTranslationZ(0.0f);
    }

    @Override // defpackage.blb
    public final int h(RecyclerView recyclerView, i iVar) {
        return 983055;
    }

    @Override // defpackage.blb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.blb
    public final boolean m() {
        View view = this.h;
        if (view == null) {
            view = null;
        }
        return flb.n(view) != null;
    }

    @Override // defpackage.blb
    public void o(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i2, boolean z) {
        if (f == iVar.itemView.getTranslationX() && f2 == iVar.itemView.getTranslationY()) {
            return;
        }
        iVar.itemView.setTranslationX(f);
        iVar.itemView.setTranslationY(f2);
        xf8.G0(this.e.d.A, v());
    }

    @Override // defpackage.blb
    public final void t(i iVar, int i2) {
        if (iVar == null || i2 != 2) {
            iVar = null;
        }
        if (Intrinsics.a(iVar, this.f)) {
            return;
        }
        i iVar2 = this.f;
        vo3 vo3Var = this.e;
        if (iVar2 != null) {
            iVar2.itemView.animate().translationZ(0.0f).setListener(new kc(iVar2, (byte) 14));
            xj7 xj7Var = (xj7) vo3Var.d.A.g();
            xf8.G0(vo3Var.d.A, uj7.a);
            x(iVar2, xj7Var);
            if (iVar2 instanceof jv2) {
                ((OperaTextView) ((jv2) iVar2).b.d).setSelected(true);
            }
        }
        this.f = iVar;
        if (iVar != null) {
            iVar.itemView.animate().setDuration(pn7.f(j)).translationZ(i.l(iVar.itemView.getContext()));
            xf8.G0(vo3Var.d.A, v());
            w(iVar);
            if (iVar instanceof jv2) {
                ((OperaTextView) ((jv2) iVar).b.d).setSelected(false);
            }
        }
    }

    @Override // defpackage.blb
    public final void u(i iVar, int i2) {
    }

    public xj7 v() {
        return this.f != null ? vj7.a : uj7.a;
    }

    public void w(i iVar) {
    }

    public abstract void x(i iVar, xj7 xj7Var);
}
