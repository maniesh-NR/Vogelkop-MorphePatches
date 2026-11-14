package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class kdg implements TextWatcher {
    public boolean a;
    public String b;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        String str = (String) N.M1nHIb6x(editable.toString(), this.b);
        this.a = true;
        editable.replace(0, editable.length(), str, 0, str.length());
        this.a = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
