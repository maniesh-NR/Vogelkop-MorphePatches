package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dwk extends wxe {
    public final WeakReference m;

    public dwk(SwitchCompat switchCompat) {
        this.m = new WeakReference(switchCompat);
    }

    @Override // defpackage.wxe
    public final void R() {
        SwitchCompat switchCompat = (SwitchCompat) this.m.get();
        if (switchCompat != null) {
            switchCompat.h(switchCompat.o);
            switchCompat.g(switchCompat.q);
            switchCompat.requestLayout();
        }
    }

    @Override // defpackage.wxe
    public final void S() {
        SwitchCompat switchCompat = (SwitchCompat) this.m.get();
        if (switchCompat != null) {
            switchCompat.h(switchCompat.o);
            switchCompat.g(switchCompat.q);
            switchCompat.requestLayout();
        }
    }
}
