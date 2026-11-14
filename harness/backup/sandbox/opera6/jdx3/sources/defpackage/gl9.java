package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class gl9 implements a5n {
    public final LinearLayout a;
    public final RecyclerView b;
    public final OperaListItem c;
    public final jq2 d;
    public final SeparatorView e;

    public gl9(jq2 jq2Var, LinearLayout linearLayout, RecyclerView recyclerView, SeparatorView separatorView, OperaListItem operaListItem) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = operaListItem;
        this.d = jq2Var;
        this.e = separatorView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
