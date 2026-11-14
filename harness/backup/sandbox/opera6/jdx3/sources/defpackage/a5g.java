package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a5g extends a38 {
    public final int e;
    public EditText f;
    public final zvd g;

    public a5g(z28 z28Var, int i) {
        super(z28Var);
        this.e = 2131231367;
        this.g = new zvd(this, (byte) 12);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        p();
    }

    public final int c() {
        return 2132020328;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.g;
    }

    public final boolean j() {
        return true;
    }

    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
