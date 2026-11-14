package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class gjn implements a5n {
    public final ConstraintLayout a;
    public final OperaMaterialButton b;
    public final FadingRecyclerView c;

    public gjn(ConstraintLayout constraintLayout, OperaMaterialButton operaMaterialButton, FadingRecyclerView fadingRecyclerView) {
        this.a = constraintLayout;
        this.b = operaMaterialButton;
        this.c = fadingRecyclerView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
