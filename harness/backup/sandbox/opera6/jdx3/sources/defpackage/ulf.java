package defpackage;

import android.widget.Checkable;
import android.widget.CompoundButton;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public abstract class ulf extends uup implements Checkable {
    public final void G(pxh pxhVar) {
        int i = OperaListItem.C;
        CompoundButton compoundButtonO = O();
        CharSequence charSequenceA = pxhVar.a(compoundButtonO.getResources());
        compoundButtonO.setContentDescription(charSequenceA);
        compoundButtonO.setTooltipText(charSequenceA);
    }

    public final void H(boolean z) {
        O().setEnabled(z);
    }

    public final void I(boolean z) {
        O().setImportantForAccessibility(z ? 1 : 2);
    }

    public final boolean J() {
        return true;
    }

    public abstract CompoundButton O();

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return O().isChecked();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        O().setChecked(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        O().toggle();
    }

    public final void x() {
        toggle();
    }
}
