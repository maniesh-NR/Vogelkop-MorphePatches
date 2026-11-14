package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LocaleUtils {
    public static String a(Locale locale) {
        String language;
        language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                language = "id";
                break;
            case "iw":
                language = "he";
                break;
            case "ji":
                language = "yi";
                break;
            case "jw":
                language = "jv";
                break;
            case "tl":
                language = "fil";
                break;
            case "gom":
                language = "kok";
                break;
        }
        String country = locale.getCountry();
        return (language.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? language : sko.k(language, "-", country);
    }

    public static String getDefaultCountryCode() {
        String strB = CommandLine.d.b("default-country-code");
        return strB != null ? strB : Locale.getDefault().getCountry();
    }

    public static String getDefaultLocaleListString() {
        String language;
        String str;
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            Locale localeBuild = localeList.get(i);
            language = localeBuild.getLanguage();
            language.getClass();
            switch (language) {
                case "in":
                    str = "id";
                    break;
                case "iw":
                    str = "he";
                    break;
                case "ji":
                    str = "yi";
                    break;
                case "jw":
                    str = "jv";
                    break;
                case "tl":
                    str = "fil";
                    break;
                case "gom":
                    str = "kok";
                    break;
                default:
                    str = language;
                    break;
            }
            if (!str.equals(language)) {
                localeBuild = new Locale.Builder().setLocale(localeBuild).setLanguage(str).build();
            }
            arrayList.add(a(localeBuild));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String getDefaultLocaleString() {
        return a(Locale.getDefault());
    }
}
