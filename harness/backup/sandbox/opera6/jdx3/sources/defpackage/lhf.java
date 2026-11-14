package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class lhf implements fck, View.OnAttachStateChangeListener {
    public final ConstraintLayout a;
    public final cxh b;
    public c1f c;

    public lhf(ConstraintLayout constraintLayout, cxh cxhVar) {
        this.a = constraintLayout;
        this.b = cxhVar;
        z4o.q0(constraintLayout);
        constraintLayout.addOnAttachStateChangeListener(this);
        if (constraintLayout.isAttachedToWindow()) {
            onViewAttachedToWindow(constraintLayout);
        }
        lzb lzbVar = new lzb(this, (byte) 28);
        dll dllVarS = q9n.s(constraintLayout);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, constraintLayout, lzbVar);
    }

    @Override // defpackage.fck
    public final int a() {
        return f03.G(this.a.getContext()).getDefaultColor();
    }

    @Override // defpackage.fck
    public final int b() {
        return this.b.a(this.a.getContext());
    }

    @Override // defpackage.fck
    public final View getView() {
        return this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        c1f c1fVarC = c1f.c(this.a);
        this.c = c1fVarC;
        if (c1fVarC != null) {
            c1fVarC.d(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        c1f c1fVar = this.c;
        if (c1fVar != null) {
            c1fVar.g(this);
        }
    }
}
