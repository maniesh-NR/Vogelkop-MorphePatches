package defpackage;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class z4g extends ca3 {
    public final TextInputLayout b;
    public final String c;
    public final q2 d;

    public z4g(TextInputLayout textInputLayout, String str, q2 q2Var) {
        super((byte) 0);
        this.b = textInputLayout;
        this.c = str;
        this.d = q2Var;
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = editable == null || editable.length() == 0;
        boolean z2 = !z;
        TextInputLayout textInputLayout = this.b;
        if ((!textInputLayout.k.q) == z2) {
            return;
        }
        if (z) {
            String str = this.c;
            textInputLayout.p(str.length() > 0 ? textInputLayout.getResources().getString(2132018744, str) : null);
        } else {
            textInputLayout.q(false);
        }
        this.d.invoke();
    }
}
