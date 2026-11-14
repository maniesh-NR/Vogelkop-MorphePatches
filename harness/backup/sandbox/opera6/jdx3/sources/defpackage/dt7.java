package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class dt7 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.invalidate();
        kff.a(view, new wr9(view, view, (byte) 8));
    }
}
