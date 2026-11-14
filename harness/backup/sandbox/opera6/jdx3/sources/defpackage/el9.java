package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class el9 implements a5n {
    public final LinearLayout a;
    public final RecyclerView b;
    public final RecyclerView c;
    public final OperaTextView d;
    public final OperaTextView e;

    public el9(LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, OperaTextView operaTextView, OperaTextView operaTextView2) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = operaTextView;
        this.e = operaTextView2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
