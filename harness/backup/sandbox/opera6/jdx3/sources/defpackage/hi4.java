package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class hi4 implements a5n {
    public final /* synthetic */ byte a;
    public final TextInputLayout b;
    public final TextInputLayout c;

    public /* synthetic */ hi4(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, byte b) {
        this.a = b;
        this.b = textInputLayout;
        this.c = textInputLayout2;
    }

    public static hi4 a(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        if (((AutoCompleteTextView) w1h.j(2131364529, view)) != null) {
            return new hi4(textInputLayout, textInputLayout, (byte) 0);
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131364529)));
        return null;
    }

    public static hi4 b(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        if (((AutoCompleteTextView) w1h.j(2131364529, view)) != null) {
            return new hi4(textInputLayout, textInputLayout, (byte) 1);
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131364529)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
