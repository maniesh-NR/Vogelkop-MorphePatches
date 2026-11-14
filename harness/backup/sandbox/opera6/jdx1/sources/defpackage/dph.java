package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;

/* loaded from: classes.dex */
public final class dph implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ dph(RecyclerView recyclerView, byte b) {
        this.a = b;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.x) {
                        recyclerView.u();
                        break;
                    } else {
                        recyclerView.w = true;
                        break;
                    }
                }
                break;
            default:
                e eVar = recyclerView.M;
                if (eVar != null) {
                    eVar.j();
                }
                recyclerView.m0 = false;
                break;
        }
    }
}
