package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.EmptyListView;

/* loaded from: classes.dex */
public final class es extends ygc implements d4a {
    public static final cs e = new cs((byte) 0);
    public final tta b;
    public final boolean c;
    public final bs d;

    public es(tta ttaVar, boolean z, bs bsVar) {
        super(e);
        this.b = ttaVar;
        this.c = z;
        this.d = bsVar;
    }

    public final void I(RecyclerView recyclerView) {
        Resources resources = recyclerView.getResources();
        int integer = resources.getInteger(2131493000);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(integer, 1);
        gridLayoutManager.g = new j4a(gridLayoutManager, integer, this);
        int i = this.b.c;
        Rect rect = fan.a;
        t79 t79Var = new t79(recyclerView, gridLayoutManager, i, (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), integer, (byte) 1);
        recyclerView.C0(gridLayoutManager);
        while (recyclerView.p.size() > 0) {
            recyclerView.r0(0);
        }
        recyclerView.m(new i4a(t79Var));
        if (this.c) {
            q87 q87Var = new q87(recyclerView.getContext());
            u7 u7Var = new u7(q87Var, (byte) 5);
            l5b l5bVar = q9n.c;
            dll dllVarV = hjf.v(recyclerView.getContext());
            if (dllVarV != null) {
                u8n.b(dllVarV, recyclerView, u7Var);
            }
            recyclerView.m(q87Var);
        }
        recyclerView.a0();
    }

    @Override // defpackage.d4a
    public final e4a getItem(int i) {
        return (js) ((ygc) this).a.f.get(i);
    }

    public final int getItemViewType(int i) {
        return ((js) ((ygc) this).a.f.get(i)).b.ordinal();
    }

    public final void onBindViewHolder(i iVar, int i) {
        ((eu) iVar).U((js) ((ygc) this).a.f.get(i));
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        ds.b.getClass();
        int iOrdinal = ((ds) ds.i.get(i)).ordinal();
        bs bsVar = this.d;
        if (iOrdinal == 0) {
            return new au(viewGroup, this.b, bsVar);
        }
        if (iOrdinal == 1) {
            return new cu(viewGroup, bsVar);
        }
        if (iOrdinal == 2) {
            return new du(viewGroup, bsVar);
        }
        if (iOrdinal == 3) {
            return new bu(viewGroup);
        }
        if (iOrdinal != 4) {
            h9o.p();
            return null;
        }
        EmptyListView emptyListViewD = EmptyListView.d(2132018830, viewGroup.getContext(), 2131232709);
        emptyListViewD.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new yt(emptyListViewD);
    }
}
