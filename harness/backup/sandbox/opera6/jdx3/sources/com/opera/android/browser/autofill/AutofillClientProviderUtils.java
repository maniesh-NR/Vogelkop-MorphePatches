package com.opera.android.browser.autofill;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.view.autofill.AutofillManager;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class AutofillClientProviderUtils {
    public static boolean shouldUseAndroidAutofillFramework() {
        AutofillManager autofillManager;
        ComponentName autofillServiceComponentName;
        try {
            if (N.MaxktGXn()) {
                return false;
            }
            new com.opera.android.autofill.AutofillManager();
            if (N.MMr_2O4r()) {
                return false;
            }
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            if (((OperaApplication) context.getApplicationContext()).J().i("automatic_card_save_ask") || (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) == null || !autofillManager.isAutofillSupported() || (autofillServiceComponentName = autofillManager.getAutofillServiceComponentName()) == null) {
                return false;
            }
            return !autofillServiceComponentName.getPackageName().equals(context.getPackageName());
        } catch (Exception unused) {
            return false;
        }
    }
}
