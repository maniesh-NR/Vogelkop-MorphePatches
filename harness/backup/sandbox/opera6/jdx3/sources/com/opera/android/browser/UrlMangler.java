package com.opera.android.browser;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.mdb;
import defpackage.wqm;
import java.util.HashMap;
import java.util.Map;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class UrlMangler {

    public static class Builder {
        public final String a;
        public String b;
        public final HashMap c;

        public Builder(String str, String str2) {
            HashMap map = new HashMap();
            this.c = map;
            this.a = str;
            map.put(ImagesContract.URL, str2);
        }

        @NonNull
        public static Builder create(@NonNull String str, @NonNull String str2) {
            return new Builder(str, str2);
        }

        @NonNull
        public final String build() {
            Uri.Builder builderAuthority = new Uri.Builder().scheme("opera-internal").authority(this.a);
            String str = this.b;
            if (str != null) {
                builderAuthority.path(str);
            }
            for (Map.Entry entry : this.c.entrySet()) {
                builderAuthority.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderAuthority.build().toString();
        }

        @NonNull
        public final Builder displayString(@NonNull String str) {
            this.c.put("display_string", str);
            return this;
        }

        @NonNull
        public final Builder externalUrl(@NonNull String str) {
            this.c.put("external_url", str);
            return this;
        }

        @NonNull
        public final Builder path(@Nullable String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final Builder title(@NonNull String str) {
            this.c.put("title", str);
            return this;
        }
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        if ("opera-internal".equals(uri.getScheme())) {
            return uri.getQueryParameter(str2);
        }
        return null;
    }

    public static boolean b(String str) {
        return "newsevent".equals(getAuthority(str));
    }

    public static boolean c(String str) {
        return "readermode".equals(getAuthority(str));
    }

    public static boolean d(String str) {
        Uri uri = Uri.parse(str);
        return "opera-internal".equals(uri.getScheme()) && uri.getQueryParameter("article_transcoded") != null;
    }

    public static boolean e(String str) {
        return "opera-internal".equals(new GURL(mdb.h(str)).f());
    }

    @Nullable
    public static String getAuthority(@NonNull String str) {
        Uri uri = Uri.parse(str);
        if ("opera-internal".equals(uri.getScheme())) {
            return uri.getAuthority();
        }
        return null;
    }

    @Nullable
    public static String getDisplayString(@NonNull String str) {
        return a(str, "display_string");
    }

    @Nullable
    public static String getExternalUrl(@NonNull String str) {
        return a(str, "external_url");
    }

    @Nullable
    public static String getPath(@NonNull String str) {
        Uri uri = Uri.parse(str);
        if ("opera-internal".equals(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    @Nullable
    public static String getRendererUrl(@NonNull String str) {
        return a(str, ImagesContract.URL);
    }

    @Nullable
    public static String getTitle(@NonNull String str) {
        return a(str, "title");
    }

    public static boolean isMangled(@NonNull String str) {
        return "opera-internal".equals(Uri.parse(str).getScheme());
    }

    public static boolean isOffline(@NonNull String str) {
        return "offline".equals(getAuthority(str));
    }

    @Nullable
    public static String redirectUrl(@NonNull String str, @NonNull String str2) {
        if (a(str, ImagesContract.URL) == null) {
            return null;
        }
        return wqm.E(Uri.parse(str), ImagesContract.URL, str2).toString();
    }
}
