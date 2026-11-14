package defpackage;

import J.N;
import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b5g extends ca3 {
    public final TextInputLayout b;
    public final String c;
    public final String d;
    public final q2 e;
    public String f;

    public b5g(TextInputLayout textInputLayout, String str, String str2, q2 q2Var) {
        super((byte) 0);
        this.b = textInputLayout;
        this.c = str;
        this.d = str2;
        this.e = q2Var;
        this.f = "";
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        if (this.f.equals(string)) {
            return;
        }
        this.f = string;
        if (Intrinsics.a(this.d, string)) {
            l(false);
        } else {
            N.MoLZR6Z2(string, this.c, new o8f(this, (byte) 11));
        }
    }

    public final void l(boolean z) {
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.k.q == z) {
            return;
        }
        if (z) {
            textInputLayout.p(textInputLayout.getResources().getString(2132018746));
        } else {
            textInputLayout.q(false);
        }
        this.e.invoke();
    }
}
