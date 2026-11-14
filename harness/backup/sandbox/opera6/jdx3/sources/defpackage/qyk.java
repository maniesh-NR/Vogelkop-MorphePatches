package defpackage;

import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.favorites.FavoriteGridLayoutManager;

/* loaded from: classes.dex */
public final class qyk extends FavoriteGridLayoutManager {
    public final /* synthetic */ RecyclerView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyk(syk sykVar, gw7 gw7Var, gw7 gw7Var2, RecyclerView recyclerView) {
        super(gw7Var, gw7Var2, false);
        this.m = recyclerView;
    }

    public final void K(int i) {
        if (i != ((CustomGridLayoutManager) this).b) {
            this.m.a0();
        }
        super/*androidx.recyclerview.widget.CustomGridLayoutManager*/.K(i);
    }
}
