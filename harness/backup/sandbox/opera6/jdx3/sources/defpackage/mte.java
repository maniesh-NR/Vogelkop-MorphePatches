package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class mte extends clb {
    public final /* synthetic */ pte d;

    public mte(pte pteVar) {
        this.d = pteVar;
    }

    public final int f(RecyclerView recyclerView, i iVar) {
        return clb.j(((cwf) this.d.w.get(iVar.getAdapterPosition())).c ? 0 : 15, 0);
    }

    public final boolean l(i iVar, i iVar2) {
        int adapterPosition = iVar.getAdapterPosition();
        int adapterPosition2 = iVar2.getAdapterPosition();
        pte pteVar = this.d;
        if (((cwf) pteVar.w.get(adapterPosition2)).c) {
            return false;
        }
        pteVar.w.add(adapterPosition2, (cwf) pteVar.w.remove(adapterPosition));
        pteVar.y.notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    public final void n(i iVar, int i) {
    }
}
