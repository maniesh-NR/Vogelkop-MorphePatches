package com.opera.android.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import defpackage.dx3;
import defpackage.fi4;
import defpackage.u59;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CaptureDevicesDialogDelegate {
    public final long a;

    public CaptureDevicesDialogDelegate(long j, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String[] strArr4, @NonNull DialogDelegate dialogDelegate) {
        this.a = j;
        dialogDelegate.c(a(strArr, strArr2), a(strArr3, strArr4), new u59(this, (byte) 21));
    }

    public static List a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            arrayList.add(new fi4(strArr[i], strArr2[i]));
        }
        return arrayList;
    }

    @NonNull
    public static String getAutomaticDeviceName(@NonNull ChromiumContent chromiumContent) {
        dx3 dx3VarC = chromiumContent.c();
        return dx3VarC == null ? "" : dx3VarC.getResources().getString(2132017975);
    }
}
