package com.opera.android.browser;

import J.N;
import androidx.annotation.NonNull;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class SimpleUrlLoader {
    public long a;

    public interface MimeTypeFilter {
        boolean i(String str);
    }

    public SimpleUrlLoader(String str, String str2, String str3, String str4, MimeTypeFilter mimeTypeFilter) {
        this.a = N.MBF_TLVI(str, str2, str3, str4, mimeTypeFilter, this);
    }

    public static SimpleUrlLoader a(String str, String str2, yun yunVar) {
        return new SimpleUrlLoader(str, str2, "", "", yunVar);
    }

    public static boolean callMimeTypeFilter(@NonNull MimeTypeFilter mimeTypeFilter, @NonNull String str) {
        return mimeTypeFilter.i(str);
    }

    public final void b(boolean z, Callback callback, Callback callback2) {
        N.Me$eQJ4y(this.a, z, callback, callback2);
    }

    public final void onRequestDone() {
        this.a = 0L;
    }
}
