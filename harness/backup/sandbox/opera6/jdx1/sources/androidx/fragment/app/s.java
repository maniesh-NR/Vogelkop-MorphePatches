package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class s implements View.OnAttachStateChangeListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ t b;

    public s(t tVar, z zVar) {
        this.b = tVar;
        this.a = zVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        z zVar = this.a;
        Fragment fragment = zVar.c;
        zVar.i();
        h.j((ViewGroup) fragment.mView.getParent(), this.b.a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
