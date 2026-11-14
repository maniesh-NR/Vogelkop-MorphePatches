package defpackage;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class ky4 implements z6f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 1:
                int iB = lg7.b(editable.toString());
                iji ijiVar = (iji) this.b;
                ((StylingTextView) ijiVar.o.i).setText(ijiVar.b.getContext().getString(2132018610, Integer.valueOf(iB), 255));
                ijiVar.o.k.setEnabled(iB > 0);
                ijiVar.S();
                break;
        }
    }

    public final void b(boolean z) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.z6f
    public final void d(int i, int i2) {
    }

    @Override // defpackage.z6f
    public final void e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ly4) obj).u.clearFocus();
                break;
            case 1:
                ((iji) obj).l(false);
                break;
            default:
                r9l r9lVar = (r9l) obj;
                if (r9lVar.f().v.o.b.size() <= 0) {
                    r9lVar.r(false);
                    break;
                } else {
                    r9lVar.u();
                    break;
                }
        }
    }

    @Override // defpackage.z6f
    public final void f(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                TextInputLayout textInputLayout = ((ly4) obj).u;
                if (!z) {
                    q9n.u(textInputLayout);
                    break;
                } else {
                    textInputLayout.post(new ig(this, (byte) 17));
                    break;
                }
            case 1:
                if (!z) {
                    ((iji) obj).l(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z6f
    public final void h() {
    }

    @Override // defpackage.z6f
    public final void i() {
    }

    public final void j(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                if (i2 == 0 || i3 == 0) {
                    ((ly4) this.b).G0();
                    break;
                }
        }
    }
}
