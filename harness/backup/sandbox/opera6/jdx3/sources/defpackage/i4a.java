package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i4a extends iph {
    public final k8 a;

    public i4a(k8 k8Var) {
        this.a = k8Var;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        super.getItemOffsets(rect, view, recyclerView, vphVar);
        int iS = RecyclerView.S(view);
        if (iS == -1) {
            return;
        }
        Rect rectT = this.a.T(iS);
        h4a h4aVarT = recyclerView.T(view);
        h4a h4aVar = h4aVarT instanceof h4a ? h4aVarT : null;
        if (h4aVar != null) {
            h4aVar.l(rectT);
        }
        rect.set(rectT);
    }
}
