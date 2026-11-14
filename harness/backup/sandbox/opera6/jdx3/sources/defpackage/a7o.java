package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a7o implements a5n {
    public final View a;
    public final y6o b;
    public final RecyclerView c;

    public a7o(View view, y6o y6oVar, RecyclerView recyclerView) {
        this.a = view;
        this.b = y6oVar;
        this.c = recyclerView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
