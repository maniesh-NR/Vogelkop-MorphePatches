package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class ps extends qr {
    public final zs c;
    public final at d;

    public ps(zs zsVar, at atVar, at atVar2) {
        super(atVar);
        this.c = zsVar;
        this.d = atVar2;
    }

    @Override // defpackage.qr
    public final d a(RecyclerView recyclerView) {
        recyclerView.getContext();
        Resources resources = recyclerView.getResources();
        os osVar = new os(this.c, ((Boolean) this.d.invoke()).booleanValue());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1, 0);
        t79 t79Var = new t79(recyclerView, gridLayoutManager, (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), fan.a(8.0f, resources), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), 1, (byte) 0);
        gridLayoutManager.g = new j4a(gridLayoutManager, 1, osVar);
        recyclerView.C0(gridLayoutManager);
        recyclerView.y0(osVar);
        recyclerView.m(new i4a(t79Var));
        return osVar;
    }
}
