package ads_mobile_sdk;

import android.view.View;
import defpackage.ajp;

/* loaded from: classes.dex */
public final class t6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ os a;

    public t6(os osVar) {
        this.a = osVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        os osVar = this.a;
        if (((ajp) osVar.b) != null) {
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnWindowFocusChangeListener((ajp) osVar.b);
            }
            osVar.b = null;
        }
    }
}
