package com.opera.android;

import android.content.Context;
import androidx.annotation.Nullable;
import defpackage.ld9;
import defpackage.umi;

/* loaded from: classes.dex */
public final class GpuWorkarounds {
    public final Context a;
    public final umi b;

    public GpuWorkarounds(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
    }

    public final void gpuInformation(@Nullable String str, @Nullable String str2) {
        if (str2 == null || !str2.startsWith("Adreno (TM) ") || str2.length() <= 12) {
            return;
        }
        char cCharAt = str2.charAt(12);
        if (cCharAt == '4' || cCharAt == '5') {
            this.b.c(new ld9(this, (byte) 15)).a(null);
        }
    }
}
