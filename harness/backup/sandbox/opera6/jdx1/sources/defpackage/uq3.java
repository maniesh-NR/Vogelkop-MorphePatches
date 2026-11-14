package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class uq3 extends aq1 {
    @Override // androidx.fragment.app.i
    public final void dismiss() {
        tq3 dialog = getDialog();
        if (dialog instanceof tq3) {
            tq3 tq3Var = dialog;
            if (tq3Var.g == null) {
                tq3Var.f();
            }
            boolean z = tq3Var.g.J;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.i
    public final void dismissAllowingStateLoss() {
        tq3 dialog = getDialog();
        if (dialog instanceof tq3) {
            tq3 tq3Var = dialog;
            if (tq3Var.g == null) {
                tq3Var.f();
            }
            boolean z = tq3Var.g.J;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // defpackage.aq1, androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        return new tq3(getContext(), getTheme());
    }
}
