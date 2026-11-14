package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public final class mp2 extends mr2 {
    @Override // defpackage.mr2, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cr2 cr2Var = this.u;
        if (cr2Var == null) {
            cr2Var = null;
        }
        cr2Var.m.setVisibility(8);
        cr2 cr2Var2 = this.u;
        if (cr2Var2 == null) {
            cr2Var2 = null;
        }
        cr2Var2.l.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method");
        cr2 cr2Var3 = this.u;
        inputMethodManager.showSoftInput((OperaTextInputEditText) (cr2Var3 != null ? cr2Var3 : null).i, 1);
    }
}
