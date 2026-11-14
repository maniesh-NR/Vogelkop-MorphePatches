package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class j9n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ m9n a;
    public final /* synthetic */ View b;

    public j9n(m9n m9nVar, View view) {
        this.a = m9nVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.j();
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
