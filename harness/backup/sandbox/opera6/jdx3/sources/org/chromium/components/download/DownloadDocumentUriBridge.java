package org.chromium.components.download;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class DownloadDocumentUriBridge {
    public static boolean isDocumentUri(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Context context = t8.a;
            if (context == null) {
                return false;
            }
            return DocumentsContract.isDocumentUri(context, Uri.parse(str));
        } catch (Exception unused) {
            Locale locale = Locale.US;
            return false;
        }
    }

    public static boolean renameDocumentUri(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Context context = t8.a;
                if (context == null) {
                    return false;
                }
                return DocumentsContract.renameDocument(context.getContentResolver(), Uri.parse(str), str2) != null;
            } catch (Exception unused) {
                Locale locale = Locale.US;
            }
        }
        return false;
    }
}
