package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class ew7 implements TextWatcher {
    public final fz2 c;
    public static final /* synthetic */ xtb[] f = {new pee(ew7.class, "interacting", "getInteracting()Z", 0)};
    public static final i06 e = new i06((byte) 5);
    public final Handler a = new Handler(Looper.getMainLooper());
    public final bn7 b = new bn7((Object) this, (byte) 7);
    public String d = "";

    public ew7(ci7 ci7Var) {
        this.c = new fz2(ci7Var);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.d = string;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (this.d.equals(string)) {
            return;
        }
        this.d = string;
        this.c.g(f[0], Boolean.TRUE);
        Handler handler = this.a;
        bn7 bn7Var = this.b;
        handler.removeCallbacks(bn7Var);
        handler.postDelayed(bn7Var, 1000L);
    }
}
