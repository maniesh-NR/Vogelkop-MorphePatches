package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.LayoutDirectionLinearLayoutManager;

/* loaded from: classes.dex */
public final class dge extends LayoutDirectionLinearLayoutManager {
    public final /* synthetic */ byte b = 0;

    public /* synthetic */ dge() {
    }

    public /* synthetic */ dge(int i, boolean z) {
        super(i, z);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        switch (this.b) {
            case 0:
                mxf mxfVar = new mxf(this, recyclerView.getContext(), (byte) 4);
                mxfVar.setTargetPosition(i);
                startSmoothScroll(mxfVar);
                break;
            default:
                mxf mxfVar2 = new mxf(this, recyclerView.getContext(), (byte) 5);
                mxfVar2.setTargetPosition(i);
                startSmoothScroll(mxfVar2);
                break;
        }
    }
}
