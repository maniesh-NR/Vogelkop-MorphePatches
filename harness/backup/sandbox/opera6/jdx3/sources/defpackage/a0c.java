package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.FadingRecyclerView;

/* loaded from: classes.dex */
public class a0c extends bqh {
    public int s;
    public u85 t;
    public String u;

    public a0c() {
        super(2132021147, 0);
    }

    @Override // defpackage.ryl
    public final void g0() {
        super.g0();
        if (this.t != null) {
            new vl6(requireActivity(), this.t, this.u);
            this.t = null;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i == this.s && i2 == 0) {
            g0();
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (FadingRecyclerView) this.r.c;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        zzb zzbVar = new zzb(this, getContext());
        recyclerView.y0(zzbVar);
        int i = zzbVar.b;
        if (i < zzbVar.c) {
            return;
        }
        recyclerView.x0(i);
    }
}
