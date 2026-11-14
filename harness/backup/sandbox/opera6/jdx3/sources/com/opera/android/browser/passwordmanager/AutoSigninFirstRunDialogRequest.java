package com.opera.android.browser.passwordmanager;

import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import defpackage.mm2;

/* loaded from: classes.dex */
public final class AutoSigninFirstRunDialogRequest {
    public final DialogDelegate a;
    public long b;
    public mm2 c;

    public AutoSigninFirstRunDialogRequest(long j, DialogDelegate dialogDelegate) {
        this.a = dialogDelegate;
        this.b = j;
    }

    public static AutoSigninFirstRunDialogRequest create(long j, @NonNull ChromiumContent chromiumContent) {
        return new AutoSigninFirstRunDialogRequest(j, chromiumContent.p);
    }

    public final void destroy() {
        this.b = 0L;
    }

    public final void dismiss() {
        mm2 mm2Var = this.c;
        if (mm2Var == null) {
            return;
        }
        this.a.l(mm2Var);
    }

    public final void show() {
        mm2 mm2Var = new mm2(this);
        this.c = mm2Var;
        this.a.a(mm2Var);
    }
}
