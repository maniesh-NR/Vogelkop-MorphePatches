package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class qu implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ru b;

    public /* synthetic */ qu(ru ruVar, byte b) {
        this.a = b;
        this.b = ruVar;
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
        byte b = this.a;
        boolean z = false;
        ru ruVar = this.b;
        switch (b) {
            case 0:
                if (!ruVar.I0().g.k.q && (editable == null || editable.length() == 0)) {
                    z = true;
                }
                ruVar.M0(z);
                ruVar.L0();
                break;
            default:
                if (ruVar.I0().j.k.q) {
                    ruVar.I0().j.q(false);
                    break;
                }
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
