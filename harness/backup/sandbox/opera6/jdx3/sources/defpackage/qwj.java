package defpackage;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class qwj extends tx7 {
    public final RecyclerView e;
    public final ro9 f;
    public final ow8 g;
    public final isd h;
    public final byte i;

    /* JADX WARN: Multi-variable type inference failed */
    public qwj(RecyclerView recyclerView, ow8 ow8Var, isd isdVar, int i) {
        this.e = recyclerView;
        this.f = recyclerView.c.c();
        this.g = ow8Var;
        this.h = isdVar;
        this.i = i;
    }

    public final int f(int i) throws Throwable {
        RecyclerView recyclerView;
        i iVarT;
        Throwable th;
        ow8 ow8Var = this.g;
        int itemViewType = ow8Var.getItemViewType(i);
        isd isdVar = this.h;
        int i2 = ((SparseIntArray) isdVar.b).get(itemViewType, -2);
        if (i2 == -2) {
            boolean z = false;
            int i3 = 0;
            while (true) {
                recyclerView = this.e;
                if (i3 >= recyclerView.getChildCount()) {
                    iVarT = null;
                    break;
                }
                iVarT = recyclerView.T(recyclerView.getChildAt(i3));
                if (iVarT != null && iVarT.getItemViewType() == itemViewType) {
                    break;
                }
                i3++;
            }
            ro9 ro9Var = this.f;
            boolean z2 = true;
            if (iVarT == null) {
                try {
                    iVarT = ro9Var.t(itemViewType);
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    if (iVarT != null && z2) {
                        ro9Var.F(iVarT);
                    }
                    throw th;
                }
            }
            if (iVarT == null) {
                iVarT = ow8Var.createViewHolder(recyclerView, itemViewType);
                z = true;
            }
            try {
                if (iVarT instanceof ab2) {
                    int iU = ((ab2) iVarT).U();
                    if (iVarT != null && z) {
                        ro9Var.F(iVarT);
                    }
                    i2 = iU;
                } else {
                    if (iVarT != null && z) {
                        ro9Var.F(iVarT);
                    }
                    i2 = 1;
                }
                ((SparseIntArray) isdVar.b).put(itemViewType, i2);
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                if (iVarT != null) {
                    ro9Var.F(iVarT);
                }
                throw th;
            }
        }
        return i2 == -1 ? this.i : i2;
    }
}
