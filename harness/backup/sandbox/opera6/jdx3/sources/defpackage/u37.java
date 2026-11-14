package defpackage;

import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class u37 extends ro9 {
    public final SparseBooleanArray l;
    public final t37 m;

    public u37(t37 t37Var) {
        super((byte) 28);
        this.l = new SparseBooleanArray();
        this.m = t37Var;
    }

    public final void F(i iVar) {
        int itemViewType = iVar.getItemViewType();
        this.l.append(itemViewType, true);
        int size = u(itemViewType).a.size();
        super.F(iVar);
        if (size == u(itemViewType).a.size()) {
            f0(iVar);
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.l;
            if (i >= sparseBooleanArray.size()) {
                sparseBooleanArray.clear();
                super.f();
                return;
            }
            int iKeyAt = sparseBooleanArray.keyAt(i);
            i iVarT = t(iKeyAt);
            while (iVarT != null) {
                f0(iVarT);
                iVarT = t(iKeyAt);
            }
            i++;
        }
    }

    public final void f0(i iVar) {
        if (iVar instanceof ab2) {
            ab2 ab2Var = (ab2) iVar;
            if (!(ab2Var.b == null)) {
                this.m.a(iVar);
            }
            ab2Var.onDestroy();
        }
    }
}
