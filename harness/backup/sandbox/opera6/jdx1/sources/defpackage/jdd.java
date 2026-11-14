package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class jdd extends LinearLayoutManager {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ldd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jdd(ldd lddVar, int i, int i2) {
        super(i, false);
        this.b = lddVar;
        this.a = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(vph vphVar, int[] iArr) {
        ldd lddVar = this.b;
        RecyclerView recyclerView = lddVar.h;
        if (this.a) {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = lddVar.h.getHeight();
        } else {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = lddVar.h.getWidth();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qrj qrjVar = new qrj(recyclerView.getContext(), (byte) 0);
        qrjVar.setTargetPosition(i);
        startSmoothScroll(qrjVar);
    }
}
