package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class jr2 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr2 b;

    public /* synthetic */ jr2(mr2 mr2Var, byte b) {
        this.a = b;
        this.b = mr2Var;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        byte b = this.a;
        boolean z = false;
        mr2 mr2Var = this.b;
        switch (b) {
            case 0:
                pq3 pq3Var = mr2Var.v;
                MaterialButton materialButton = (pq3Var != null ? pq3Var : null).d;
                fr frVarC = ic4.C(mr2Var.H0());
                if (frVarC != null && frVarC.b >= 0 && (i = frVarC.c) >= 1 && i <= 12 && !mr2Var.J0()) {
                    z = true;
                }
                materialButton.setEnabled(z);
                break;
            default:
                String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0 && !N.MP7gcyB7(string)) {
                    z = true;
                }
                cr2 cr2Var = mr2Var.u;
                if (z) {
                    if (cr2Var == null) {
                        cr2Var = null;
                    }
                    cr2Var.m.p(mr2Var.requireContext().getString(2132019351));
                } else {
                    if (cr2Var == null) {
                        cr2Var = null;
                    }
                    cr2Var.m.p((CharSequence) null);
                }
                pq3 pq3Var2 = mr2Var.v;
                (pq3Var2 != null ? pq3Var2 : null).d.setEnabled(!z);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }
}
