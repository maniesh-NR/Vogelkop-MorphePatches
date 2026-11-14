package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.tabui2.TabGridLayoutManager;

/* loaded from: classes.dex */
public final class i4l extends y1c {
    public final tx7 g;
    public final byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public i4l(RecyclerView recyclerView, TabGridLayoutManager tabGridLayoutManager, qsh qshVar, tx7 tx7Var, int i) {
        super(recyclerView, tabGridLayoutManager, qshVar);
        this.g = tx7Var;
        this.h = i;
    }

    @Override // defpackage.y1c
    public final boolean a(int i) {
        return this.g.e(i, this.h) == 0;
    }
}
