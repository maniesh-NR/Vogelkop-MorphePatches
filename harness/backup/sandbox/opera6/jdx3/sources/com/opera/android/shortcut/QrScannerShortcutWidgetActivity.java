package com.opera.android.shortcut;

import defpackage.ru9;
import defpackage.wz5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/shortcut/QrScannerShortcutWidgetActivity;", "Lwz5;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QrScannerShortcutWidgetActivity extends wz5 {
    public QrScannerShortcutWidgetActivity() {
        super("qrWidgetShortcut", 2131820548, "com.opera.android.action.SCAN_QR_CODE_FROM_SHORTCUT_WIDGET");
    }

    @Override // defpackage.wz5
    public final int a() {
        return ru9.c(this).a.getBoolean("qr.google_lens_supported", false) ? 2131820552 : 2131820548;
    }

    @Override // defpackage.wz5
    public final CharSequence b() {
        return getString(ru9.c(this).a.getBoolean("qr.google_lens_supported", false) ? 2132019372 : 2132020980);
    }
}
