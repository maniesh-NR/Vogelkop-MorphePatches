package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ApkAssets {
    public static String a;

    public static long[] open(String str, String str2) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenNonAssetFd = null;
        a = null;
        try {
            try {
                Context contextA = t8.a;
                if (!TextUtils.isEmpty(str2) && BundleUtils.d(str2)) {
                    contextA = BundleUtils.a(str2);
                }
                assetFileDescriptorOpenNonAssetFd = contextA.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptorOpenNonAssetFd.getParcelFileDescriptor().detachFd(), assetFileDescriptorOpenNonAssetFd.getStartOffset(), assetFileDescriptorOpenNonAssetFd.getLength()};
                try {
                    assetFileDescriptorOpenNonAssetFd.close();
                } catch (IOException unused) {
                }
                return jArr;
            } catch (IOException e) {
                a = "Error while loading asset " + str + " from " + str2 + ": " + String.valueOf(e);
                if (!TextUtils.isEmpty(e.getMessage())) {
                    e.getMessage().equals(str);
                }
                long[] jArr2 = {-1, -1, -1};
                if (assetFileDescriptorOpenNonAssetFd != null) {
                    try {
                        assetFileDescriptorOpenNonAssetFd.close();
                    } catch (IOException unused2) {
                    }
                }
                return jArr2;
            }
        } catch (Throwable th) {
            if (assetFileDescriptorOpenNonAssetFd != null) {
                try {
                    assetFileDescriptorOpenNonAssetFd.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static String takeLastErrorString() {
        String str = a;
        a = null;
        return str;
    }
}
