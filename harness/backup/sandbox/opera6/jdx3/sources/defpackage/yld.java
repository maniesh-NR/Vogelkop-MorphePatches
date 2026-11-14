package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class yld implements lig {
    public final /* synthetic */ zld a;

    public yld(zld zldVar) {
        this.a = zldVar;
    }

    @Override // defpackage.lig
    public final void e(long j) {
        RecyclerView recyclerView = this.a.a;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            cmd cmdVar = (cmd) recyclerView.T(recyclerView.getChildAt(i));
            if (cmdVar != null && ((SelectableRelativeLayout) cmdVar.c.e).isSelected()) {
                cmdVar.X();
            }
        }
    }
}
