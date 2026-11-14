package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class u3m extends bqh {
    public final Set s;
    public final s3m t;
    public final szb u;
    public final ArrayList v;

    public u3m(int i, Set set, s3m s3mVar, szb szbVar, ArrayList arrayList) {
        ArrayList arrayListJ;
        super(i, 0);
        this.s = set;
        this.t = s3mVar;
        this.u = szbVar;
        if (arrayList != null) {
            Objects.requireNonNull(set);
            arrayListJ = nb6.J(new zlb(arrayList, new e6l(set, (byte) 1), (byte) 0));
        } else {
            arrayListJ = null;
        }
        this.v = arrayListJ;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (FadingRecyclerView) this.r.c;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        recyclerView.y0(new ev5(this, recyclerView.getContext()));
    }
}
