package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class aq1 extends i {
    @Override // androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        return new zp1(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.i
    public final void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof zp1)) {
            super.setupDialog(dialog, i);
            return;
        }
        zp1 zp1Var = (zp1) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        zp1Var.d().g(1);
    }
}
