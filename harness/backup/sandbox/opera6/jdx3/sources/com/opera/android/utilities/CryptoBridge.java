package com.opera.android.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.annotations.RequiredForTest;
import defpackage.c36;
import defpackage.t1;

/* loaded from: classes.dex */
public final class CryptoBridge {
    public static t1 a;

    @RequiredForTest
    public static void a(boolean z) {
        c36.d = !z;
    }

    @Nullable
    public static byte[] decrypt(@NonNull byte[] bArr) {
        return ((c36) a.get()).b(bArr);
    }

    @Nullable
    public static byte[] encrypt(@NonNull byte[] bArr) {
        return ((c36) a.get()).d(bArr);
    }
}
