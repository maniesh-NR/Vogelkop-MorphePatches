package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public final class zu implements a5n {
    public final /* synthetic */ byte a = 1;
    public final LinearLayout b;
    public final OperaTextInputEditText c;
    public final TextInputLayout d;

    public zu(LinearLayout linearLayout, EqualWidthLinearLayout equalWidthLinearLayout, OperaTextInputEditText operaTextInputEditText, TextInputLayout textInputLayout) {
        this.b = linearLayout;
        this.c = operaTextInputEditText;
        this.d = textInputLayout;
    }

    public zu(LinearLayout linearLayout, OperaTextInputEditText operaTextInputEditText, TextInputLayout textInputLayout) {
        this.b = linearLayout;
        this.c = operaTextInputEditText;
        this.d = textInputLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
