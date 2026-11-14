package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class xk9 implements a5n {
    public final LinearLayout a;
    public final SeparatorView b;
    public final RecyclerView c;
    public final OperaListItem d;
    public final jq2 e;

    public xk9(jq2 jq2Var, LinearLayout linearLayout, RecyclerView recyclerView, SeparatorView separatorView, OperaListItem operaListItem) {
        this.a = linearLayout;
        this.b = separatorView;
        this.c = recyclerView;
        this.d = operaListItem;
        this.e = jq2Var;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
