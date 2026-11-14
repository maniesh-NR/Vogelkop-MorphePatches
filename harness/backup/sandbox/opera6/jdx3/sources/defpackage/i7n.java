package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i7n implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Function1<View, Unit> b;

    public i7n(View view, Function1 function1) {
        this.a = view;
        this.b = function1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.invoke(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
