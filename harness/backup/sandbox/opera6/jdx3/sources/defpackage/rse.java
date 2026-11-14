package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rse extends xjk {
    public final zyk r = z4c.b(new t2(this, 29));
    public final ua7 s;
    public ev5 t;

    public rse(gjm gjmVar) {
        this.s = new ua7((Fragment) this, gjmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xjk, defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        sse sseVar = (sse) this.r.getValue();
        Context context = fadingRecyclerView.getContext();
        ua7 ua7Var = this.s;
        String str = ((qse) ua7Var.p()).b;
        ArrayList arrayList = ((qse) ua7Var.p()).c;
        sseVar.getClass();
        sseVar.b = new pad(sseVar, context, str, arrayList);
        this.t = new ev5(this);
        super.B0(layoutInflater, fadingRecyclerView);
    }

    @Override // defpackage.xjk
    public final ev5 G0() {
        ev5 ev5Var = this.t;
        if (ev5Var != null) {
            return ev5Var;
        }
        return null;
    }

    @Override // defpackage.xjk
    public final sse H0() {
        return (sse) this.r.getValue();
    }
}
