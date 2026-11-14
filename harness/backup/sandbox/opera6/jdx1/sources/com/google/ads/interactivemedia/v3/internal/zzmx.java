package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import defpackage.p3p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmx {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(android.content.Context r16, com.google.ads.interactivemedia.v3.internal.zzmf r17) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzmx.a(android.content.Context, com.google.ads.interactivemedia.v3.internal.zzmf):int");
    }

    public static final void b(byte[] bArr, String str, zzmf zzmfVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            p3p.v(sb, "dbg:", str, ";");
        }
        zzmfVar.d(4007, 0L, (Exception) null, (String) null, sb.toString());
    }
}
