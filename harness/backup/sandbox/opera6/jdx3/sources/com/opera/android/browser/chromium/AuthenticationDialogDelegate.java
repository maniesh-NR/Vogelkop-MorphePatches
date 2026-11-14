package com.opera.android.browser.chromium;

import J.N;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.opera.android.browser.dialog.AuthenticationDialog;
import defpackage.wth;

/* loaded from: classes.dex */
public class AuthenticationDialogDelegate {
    public final long a;

    public AuthenticationDialogDelegate(long j, @NonNull String str, @NonNull String str2) {
        this.a = N.MTyv4zKw(j, new AuthenticationDialog(str, str2, new wth(this, (byte) 14)));
    }

    public static void onCancelled(@NonNull AuthenticationDialog authenticationDialog) {
        authenticationDialog.finish(hjm.b);
    }

    public static void onShow(@NonNull AuthenticationDialog authenticationDialog, @NonNull ChromiumContent chromiumContent) {
        chromiumContent.p.a(authenticationDialog);
    }

    public static void savedDataAvailable(@NonNull AuthenticationDialog authenticationDialog, @NonNull String str, @NonNull String str2) {
        authenticationDialog.getClass();
        if (str == null || str2 == null) {
            return;
        }
        authenticationDialog.c = str;
        authenticationDialog.d = str2;
        bz0 bz0Var = authenticationDialog.f;
        if (bz0Var != null) {
            EditText editText = (EditText) bz0Var.findViewById(2131362076);
            EditText editText2 = (EditText) authenticationDialog.f.findViewById(2131362075);
            if (editText.getText().length() > 0 || editText2.getText().length() > 0) {
                return;
            }
            editText.setText(authenticationDialog.c);
            editText2.setText(authenticationDialog.d);
        }
    }

    public final void finalize() throws Throwable {
        N.MND51mcr(this.a);
        super.finalize();
    }
}
