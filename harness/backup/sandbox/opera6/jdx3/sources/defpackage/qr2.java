package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class qr2 implements View.OnFocusChangeListener {
    public final String a;
    public final TextInputLayout b;
    public String c;
    public boolean d;

    public qr2(TextInputLayout textInputLayout, String str) {
        this.b = textInputLayout;
        this.a = str;
    }

    public final void a(View view, boolean z) {
        if (z) {
            return;
        }
        TextInputLayout textInputLayout = this.b;
        if (TextUtils.isEmpty(textInputLayout.e.getText())) {
            textInputLayout.p(this.a);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.d) {
            a(view, z);
        }
        TextInputLayout textInputLayout = this.b;
        Editable text = textInputLayout.e.getText();
        if (z || TextUtils.isEmpty(text) || Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
            return;
        }
        textInputLayout.p(this.c);
    }
}
