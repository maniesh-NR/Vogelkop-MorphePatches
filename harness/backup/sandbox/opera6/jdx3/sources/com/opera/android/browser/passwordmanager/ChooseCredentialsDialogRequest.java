package com.opera.android.browser.passwordmanager;

import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import defpackage.hy4;
import defpackage.iy4;

/* loaded from: classes.dex */
public final class ChooseCredentialsDialogRequest {
    public final DialogDelegate a;
    public long b;

    public ChooseCredentialsDialogRequest(long j, DialogDelegate dialogDelegate) {
        this.a = dialogDelegate;
        this.b = j;
    }

    public static ChooseCredentialsDialogRequest create(long j, @NonNull ChromiumContent chromiumContent) {
        return new ChooseCredentialsDialogRequest(j, chromiumContent.p);
    }

    public final void destroy() {
        this.b = 0L;
    }

    public final void show(@NonNull String str, @NonNull String[] strArr) {
        iy4[] iy4VarArr = new iy4[strArr.length / 2];
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            String str3 = strArr[i + 1];
            int i2 = i / 2;
            if (str3.isEmpty()) {
                str3 = null;
            }
            iy4VarArr[i2] = new iy4(str2, str3);
        }
        this.a.a(new hy4(this, str, iy4VarArr));
    }
}
