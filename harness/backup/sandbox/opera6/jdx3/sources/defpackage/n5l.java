package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class n5l implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ n5l(KeyEvent.Callback callback, View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        View view2 = this.b;
        switch (b) {
            case 0:
                view2.getVisibility();
                break;
            default:
                view2.removeOnLayoutChangeListener(this);
                view2.setVisibility(0);
                view2.setTranslationY(-view2.getHeight());
                view2.animate().setDuration(200L).setInterpolator(vgb.b).translationY(0.0f).start();
                break;
        }
    }
}
