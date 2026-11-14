package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class eok extends h6e {
    public final /* synthetic */ kok d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eok(kok kokVar) {
        super(30);
        this.d = kokVar;
    }

    @Override // defpackage.h6e
    public final void e(RecyclerView recyclerView, int i, int i2) {
        kok kokVar = this.d;
        w6j w6jVar = kokVar.i;
        List listUnmodifiableList = Collections.unmodifiableList(kokVar.h.h);
        for (int i3 = 0; i3 < listUnmodifiableList.size(); i3++) {
            ook ookVar = (ook) listUnmodifiableList.get(i3);
            if (i3 >= i && i3 <= i2) {
                w6jVar.f(i3, ookVar);
            } else if (((SparseArray) w6jVar.a).get(i3) == null) {
                ((SparseArray) w6jVar.b).append(i3, ookVar);
            }
        }
    }
}
