package defpackage;

import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public abstract class cmf extends i41 implements Checkable {
    public final View D() {
        return t0();
    }

    public final void W() {
        toggle();
    }

    public final void g0() {
        t0().setImportantForAccessibility(2);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return t0().isChecked();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        t0().setChecked(z);
    }

    public abstract CompoundButton t0();

    @Override // android.widget.Checkable
    public final void toggle() {
        t0().toggle();
    }
}
