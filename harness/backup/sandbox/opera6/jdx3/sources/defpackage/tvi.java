package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class tvi implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvi b;

    public /* synthetic */ tvi(uvi uviVar, byte b) {
        this.a = b;
        this.b = uviVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        uvi uviVar = this.b;
        switch (b) {
            case 0:
                view.setOnScrollChangeListener(uviVar.e);
                break;
            default:
                view.addOnLayoutChangeListener(uviVar.d);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                view.setOnScrollChangeListener(null);
                break;
            default:
                view.removeOnLayoutChangeListener(this.b.d);
                break;
        }
    }
}
