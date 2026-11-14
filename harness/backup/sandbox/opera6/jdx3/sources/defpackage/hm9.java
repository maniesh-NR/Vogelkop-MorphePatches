package defpackage;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageButton;

/* loaded from: classes.dex */
public final class hm9 implements a5n {
    public final ScrollView a;
    public final MaterialAutoCompleteTextView b;
    public final TextInputLayout c;
    public final MaterialButton d;
    public final StylingImageButton e;
    public final OperaTextInputEditText f;
    public final TextInputLayout g;
    public final MaterialButton h;
    public final OperaTextInputEditText i;
    public final TextInputLayout j;

    public hm9(ScrollView scrollView, MaterialAutoCompleteTextView materialAutoCompleteTextView, TextInputLayout textInputLayout, MaterialButton materialButton, StylingImageButton stylingImageButton, OperaTextInputEditText operaTextInputEditText, TextInputLayout textInputLayout2, MaterialButton materialButton2, OperaTextInputEditText operaTextInputEditText2, TextInputLayout textInputLayout3) {
        this.a = scrollView;
        this.b = materialAutoCompleteTextView;
        this.c = textInputLayout;
        this.d = materialButton;
        this.e = stylingImageButton;
        this.f = operaTextInputEditText;
        this.g = textInputLayout2;
        this.h = materialButton2;
        this.i = operaTextInputEditText2;
        this.j = textInputLayout3;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
