package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class mv9 extends lx8 implements y9n {
    public final /* synthetic */ nv9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv9(nv9 nv9Var, View view) {
        super(view);
        this.d = nv9Var;
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        nv9 nv9Var = this.d;
        if (i2 < 100 && i == 100) {
            nv9Var.z();
            return;
        }
        nrl nrlVar = nv9Var.k;
        if (nrlVar.a && i == 0) {
            Object obj = nv9Var.n;
            nrlVar.a = false;
            ((qp5) nrlVar.b).accept(obj);
        }
    }
}
