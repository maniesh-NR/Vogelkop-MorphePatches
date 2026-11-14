package com.google.android.gms.internal.atv_ads_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzar {
    private static final Set zza = zzb("http", "https", "mailto", "ftp");
    private static final Set zzb = zzb("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");
    private static final Set zzc = Collections.EMPTY_SET;

    public static String zza(String str, String str2) {
        char cCharAt;
        int i;
        char cCharAt2;
        char cCharAt3;
        Set set = zzc;
        String lowerCase = str.toLowerCase();
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return str;
            }
        }
        if (!lowerCase.startsWith("data:")) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (lowerCase.startsWith(String.valueOf(((zzaq) it2.next()).name().toLowerCase().replace('_', '-')).concat(":"))) {
                    return str;
                }
            }
            for (int i2 = 0; i2 < str.length() && (cCharAt = str.charAt(i2)) != '#' && cCharAt != '/'; i2++) {
                if (cCharAt != ':') {
                    if (cCharAt == '?') {
                        return str;
                    }
                }
            }
            return str;
        }
        String lowerCase2 = str.toLowerCase();
        if (lowerCase2.startsWith("data:") && lowerCase2.length() > 5) {
            int i3 = 5;
            while (i3 < lowerCase2.length() && (cCharAt3 = lowerCase2.charAt(i3)) != ';' && cCharAt3 != ',') {
                i3++;
            }
            if (zzb.contains(lowerCase2.substring(5, i3)) && lowerCase2.startsWith(";base64,", i3) && (i = i3 + 8) < lowerCase2.length()) {
                while (i < lowerCase2.length() && (cCharAt2 = lowerCase2.charAt(i)) != '=') {
                    if ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                        break;
                    }
                    i++;
                }
                while (i < lowerCase2.length()) {
                    if (lowerCase2.charAt(i) == '=') {
                        i++;
                    }
                }
                return str;
            }
        }
        return "about:invalid#zTvAdsFrameworkz";
    }

    private static final Set zzb(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
