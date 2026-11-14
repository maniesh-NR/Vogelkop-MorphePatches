package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class kba extends oph implements lba {
    public final RecyclerView a;
    public int b;
    public byte c;

    public kba(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.lba
    public final void e(int i) {
        this.a.postDelayed(new br((Object) this, i, (byte) 13), 500L);
    }

    @Override // defpackage.lba
    public final View getView() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 0 || this.c != 2) {
            this.c = i;
            return;
        }
        i iVarM = this.a.M(this.b);
        if (iVarM != null) {
            qe6.N(iVarM.itemView);
        }
        recyclerView.t0(this);
    }
}
