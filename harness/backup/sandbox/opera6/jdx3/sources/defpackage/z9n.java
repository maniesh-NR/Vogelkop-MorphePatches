package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class z9n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final RecyclerView a;
    public float b = -1.0f;
    public float c = -1.0f;
    public final /* synthetic */ aan d;

    public z9n(aan aanVar, RecyclerView recyclerView) {
        this.d = aanVar;
        this.a = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        RecyclerView recyclerView = this.a;
        float x = recyclerView.getX();
        float y = recyclerView.getY();
        if (x == this.b && y == this.c) {
            return;
        }
        this.b = x;
        this.c = y;
        this.d.d();
    }
}
