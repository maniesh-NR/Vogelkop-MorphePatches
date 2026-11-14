package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class zvi implements TextWatcher {
    public final Handler a = new Handler(Looper.getMainLooper());
    public fh4 b;
    public final /* synthetic */ awi c;

    public zvi(awi awiVar) {
        this.c = awiVar;
    }

    public final void a(Editable editable) {
        Runnable runnable = this.b;
        Handler handler = this.a;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        fh4 fh4Var = new fh4(this, editable, (byte) 16);
        this.b = fh4Var;
        handler.postDelayed(fh4Var, 1500L);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a(editable);
        this.c.K0();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
