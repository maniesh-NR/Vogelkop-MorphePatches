package com.opera.android.browser.chromium;

import androidx.annotation.NonNull;
import com.opera.android.browser.dialog.DialogDelegate;
import defpackage.qq6;

/* loaded from: classes.dex */
public class JavaScriptDialogManagerDelegate {
    public final hp2 a = new hp2((byte) 5);
    public final DialogDelegate b;
    public boolean c;

    public JavaScriptDialogManagerDelegate(@NonNull ChromiumContent chromiumContent) {
        this.b = chromiumContent.p;
    }

    public final void cancelActiveAndPendingDialogs() {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.i();
    }

    public final long getNativeClosedCallbackPointer() {
        return this.a.b;
    }

    public final boolean getSuppressMessages() {
        return this.c;
    }

    public final void handleJavaScriptDialog(boolean z, @NonNull String str) {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.m();
    }

    public final void runAlertDialog(@NonNull String str, @NonNull String str2, boolean z) {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.g(new qq6(this, (byte) 22), !z, str, str2);
    }

    public final void runBeforeUnloadDialog(boolean z) {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.f(new qq6(this, (byte) 22), z);
    }

    public final void runConfirmDialog(@NonNull String str, @NonNull String str2, boolean z) {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.k(new qq6(this, (byte) 22), !z, str, str2);
    }

    public final void runPromptDialog(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z) {
        DialogDelegate dialogDelegate = this.b;
        if (dialogDelegate == null) {
            return;
        }
        dialogDelegate.b(new qq6(this, (byte) 22), !z, str, str2, str3);
    }

    public final void suppressMessages() {
        this.c = true;
    }
}
