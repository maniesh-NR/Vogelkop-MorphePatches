package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ScrollView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class vp2 extends ca3 {
    public final /* synthetic */ byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(aw7 aw7Var) {
        super((byte) 0);
        this.b = (byte) 2;
        this.d = aw7Var;
        this.c = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp2(Object obj, Object obj2, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = obj2;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp2(mv mvVar, bz0 bz0Var, EditText editText) {
        super((byte) 0);
        this.b = (byte) 1;
        this.c = bz0Var;
        this.d = editText;
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        byte b = this.b;
        boolean z = false;
        Object obj = this.d;
        switch (b) {
            case 0:
                wp2 wp2Var = (wp2) obj;
                wp2Var.c.p((CharSequence) null);
                wp2Var.d.O0(((fw) this.c).a, editable.toString());
                break;
            case 1:
                ((bz0) this.c).f(-1).setEnabled(!TextUtils.isEmpty(((EditText) obj).getText()));
                break;
            case 2:
                string = editable != null ? editable.toString() : "";
                if (!((String) this.c).equals(string)) {
                    this.c = string;
                    i4d i4dVar = ((aw7) obj).y;
                    if (i4dVar != null) {
                        w3g w3gVar = ((q4g) i4dVar.b).v;
                        String str = w3gVar.g;
                        if (!w3gVar.f.equals(string)) {
                            N.MoLZR6Z2(string, str, new dg7(this, (byte) 7));
                            break;
                        } else {
                            l(false);
                            break;
                        }
                    }
                }
                break;
            default:
                os1 os1Var = (os1) obj;
                fl3 fl3Var = (fl3) os1Var.d;
                string = editable != null ? editable.toString() : "";
                boolean zIsEmpty = string.trim().isEmpty();
                boolean zG = fl3Var.u.G(fl3Var.getResources(), string);
                bz0 bz0Var = (bz0) this.c;
                if (!zIsEmpty && !zG) {
                    z = true;
                }
                bz0Var.f(-1).setEnabled(z);
                ((TextInputLayout) ((ov0) os1Var.c).d).p(zG ? fl3Var.getString(2132019125) : null);
                break;
        }
    }

    public final void l(boolean z) {
        aw7 aw7Var = (aw7) this.d;
        rf2 rf2Var = aw7Var.x;
        if (rf2Var.k.k.q == z) {
            return;
        }
        h3m.a((ScrollView) rf2Var.b, (y2m) null);
        rf2 rf2Var2 = aw7Var.x;
        if (z) {
            rf2Var2.k.p(aw7Var.getString(2132018746));
        } else {
            rf2Var2.k.q(false);
        }
        aw7Var.H0();
    }
}
