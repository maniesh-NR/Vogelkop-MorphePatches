package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public class am5 extends lj {
    public xl5 r;
    public bf9 s;

    public am5() {
        super(2132018347, 0);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.s.H(this.r);
        this.s = null;
        this.r = null;
        super.onDestroyView();
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerViewFindViewById = layoutInflater.inflate(2131558611, viewGroup).findViewById(2131364032);
        xl5 xl5Var = new xl5(this);
        this.r = xl5Var;
        xl5Var.setHasStableIds(true);
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        bf9 bf9VarS = ((OperaApplication) context.getApplicationContext()).s();
        this.s = bf9VarS;
        bf9VarS.F(this.r);
        this.r.G();
        getContext();
        recyclerViewFindViewById.C0(new LinearLayoutManager(1, false));
        recyclerViewFindViewById.y0(this.r);
    }
}
