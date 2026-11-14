package com.opera.android.siteicons;

import J.N;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import defpackage.aik;
import defpackage.oa5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class URLColorTable {

    public static class NativeColorResult {
        public final oa5 a;
        public final boolean b;

        public NativeColorResult(int i, int i2, boolean z) {
            this.a = new oa5(i, i2);
            this.b = z;
        }
    }

    public static oa5 a(String str) {
        NativeColorResult nativeColorResult = (NativeColorResult) N.MKfNycY4(str);
        if (nativeColorResult.b) {
            String str2 = lah.h(str).b;
            String strS = aik.s(str, aik.a);
            if (!str2.isEmpty() && strS.startsWith(str2)) {
                nativeColorResult = (NativeColorResult) N.MKfNycY4(str.substring(0, str.length() - strS.length()).concat(strS.substring(str2.length() + 1)));
            }
        }
        return nativeColorResult.a;
    }

    @NonNull
    public static byte[] getDataTable() throws IOException {
        try {
            InputStream inputStreamOpen = t8.a.getAssets().open("lut_pruned.bin");
            int iAvailable = inputStreamOpen.available();
            if (iAvailable <= 0 || !(inputStreamOpen instanceof AssetManager.AssetInputStream)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iAvailable);
                xvg.n(inputStreamOpen, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            byte[] bArr = new byte[iAvailable];
            inputStreamOpen.read(bArr);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
