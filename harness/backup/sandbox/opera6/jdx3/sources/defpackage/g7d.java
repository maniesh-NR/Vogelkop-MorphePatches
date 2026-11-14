package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.CircleImageView;

/* loaded from: classes.dex */
public final class g7d implements a5n {
    public final /* synthetic */ byte a = 0;
    public final FrameLayout b;
    public final CircleImageView c;

    public g7d(FrameLayout frameLayout, CircleImageView circleImageView) {
        this.b = frameLayout;
        this.c = circleImageView;
    }

    public g7d(pq3 pq3Var, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, RecyclerView recyclerView, CircleImageView circleImageView) {
        this.b = frameLayout;
        this.c = circleImageView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
