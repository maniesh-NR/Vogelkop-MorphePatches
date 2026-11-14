package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class nl9 implements a5n {
    public final ConstraintLayout a;
    public final StylingImageView b;
    public final OperaTextInputEditText c;
    public final TextInputLayout d;
    public final or2 e;
    public final StylingTextView f;
    public final OperaTextInputEditText g;
    public final TextInputLayout h;

    public nl9(ConstraintLayout constraintLayout, StylingImageView stylingImageView, OperaTextInputEditText operaTextInputEditText, TextInputLayout textInputLayout, or2 or2Var, StylingTextView stylingTextView, OperaTextInputEditText operaTextInputEditText2, TextInputLayout textInputLayout2) {
        this.a = constraintLayout;
        this.b = stylingImageView;
        this.c = operaTextInputEditText;
        this.d = textInputLayout;
        this.e = or2Var;
        this.f = stylingTextView;
        this.g = operaTextInputEditText2;
        this.h = textInputLayout2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
