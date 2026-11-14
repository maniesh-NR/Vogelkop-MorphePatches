package defpackage;

import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class ui7 implements ti7 {
    public final th7 a;
    public boolean b;

    public ui7(th7 th7Var) {
        this.a = th7Var;
    }

    @Override // defpackage.ti7
    public final void a(i iVar) {
        this.a.a(iVar);
    }

    @Override // defpackage.ti7
    public final boolean b(i iVar, int i, int i2) {
        return wi7.a(iVar.itemView, this.a.e(), i, i2);
    }

    @Override // defpackage.ti7
    public final void c(i iVar, int i, int i2) {
        boolean z = iVar != null;
        if (z == this.b) {
            return;
        }
        this.b = z;
        this.a.x(z);
    }
}
