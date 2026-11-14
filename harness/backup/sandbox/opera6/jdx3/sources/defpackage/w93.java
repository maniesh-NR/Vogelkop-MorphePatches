package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class w93 extends LinearLayoutManager {
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        mxf mxfVar = new mxf(this, recyclerView.getContext(), (byte) 2);
        mxfVar.setTargetPosition(i);
        startSmoothScroll(mxfVar);
    }
}
