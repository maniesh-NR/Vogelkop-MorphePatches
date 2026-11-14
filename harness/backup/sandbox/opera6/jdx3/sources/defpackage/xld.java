package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class xld implements eig {
    public final /* synthetic */ zld a;

    public xld(zld zldVar) {
        this.a = zldVar;
    }

    public final void K(gql gqlVar, int i) {
        this.a.H();
    }

    public final void P(boolean z) {
        d();
    }

    public final void d() {
        RecyclerView recyclerView = this.a.a;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            cmd cmdVar = (cmd) recyclerView.T(recyclerView.getChildAt(i));
            if (cmdVar != null) {
                cmdVar.V();
            }
        }
    }

    public final void onPositionDiscontinuity(int i) {
        d();
        this.a.G();
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        this.a.H();
    }
}
