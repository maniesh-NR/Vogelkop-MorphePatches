package defpackage;

import android.os.Build;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class yu2 {
    public final yhe a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public yu2(hjf hjfVar) {
        this.a = new yhe(hjfVar);
        this.b = hjfVar.getPackageManager().hasSystemFeature("android.software.autofill");
    }

    public final boolean a() {
        AutofillManager autofillManager;
        if (!b()) {
            return false;
        }
        try {
            autofillManager = (AutofillManager) this.a.b;
        } catch (Throwable unused) {
        }
        boolean zHasEnabledAutofillServices = autofillManager != null ? autofillManager.hasEnabledAutofillServices() : false;
        return zHasEnabledAutofillServices;
    }

    public final boolean b() {
        AutofillManager autofillManager;
        if (Build.VERSION.SDK_INT < 30 || !this.b) {
            return false;
        }
        try {
            autofillManager = (AutofillManager) this.a.b;
        } catch (Throwable unused) {
        }
        boolean zIsAutofillSupported = autofillManager != null ? autofillManager.isAutofillSupported() : false;
        return zIsAutofillSupported;
    }
}
