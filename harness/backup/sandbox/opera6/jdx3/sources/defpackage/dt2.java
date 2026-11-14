package defpackage;

import com.opera.android.autofill.AutofillManager;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class dt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AutofillManager b;
    public final /* synthetic */ Callback c;

    public /* synthetic */ dt2(AutofillManager autofillManager, Callback callback, byte b) {
        this.a = b;
        this.b = autofillManager;
        this.c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Callback callback = this.c;
        AutofillManager autofillManager = this.b;
        switch (b) {
            case 0:
                autofillManager.e(callback);
                break;
            case 1:
                autofillManager.c(callback);
                break;
            default:
                autofillManager.d(callback);
                break;
        }
    }
}
