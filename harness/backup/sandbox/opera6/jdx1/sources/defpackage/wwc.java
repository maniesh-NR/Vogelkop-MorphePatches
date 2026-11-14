package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class wwc {
    public static final Locale a = Locale.getDefault();

    public static void a(ContextWrapper contextWrapper, Locale locale) {
        if (!locale.equals(Locale.getDefault())) {
            Locale.setDefault(locale);
        }
        if (ocp.k() || contextWrapper.getApplicationContext() != contextWrapper) {
            return;
        }
        Resources system = Resources.getSystem();
        system.getConfiguration().setLocales(new LocaleList(locale));
        Configuration configuration = system.getConfiguration();
        l5b l5bVar = q9n.c;
        system.updateConfiguration(configuration, system.getDisplayMetrics());
        Resources resources = contextWrapper.getResources();
        resources.getConfiguration().setLocales(new LocaleList(locale));
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public static boolean b(String str, String str2) {
        String strC = c(str);
        String strC2 = c(str2);
        if (TextUtils.equals(strC, strC2)) {
            return true;
        }
        Locale localeF = f(strC);
        String language = localeF.getLanguage();
        Locale locale = Locale.US;
        String lowerCase = language.toLowerCase(locale);
        String strD = d(localeF);
        String str3 = "";
        if (ywc.b(strD, false) != null) {
            lowerCase = strD;
        } else if (ywc.b(lowerCase, false) == null) {
            lowerCase = "";
        }
        Locale localeF2 = f(strC2);
        String lowerCase2 = localeF2.getLanguage().toLowerCase(locale);
        String strD2 = d(localeF2);
        if (ywc.b(strD2, false) != null) {
            str3 = strD2;
        } else if (ywc.b(lowerCase2, false) != null) {
            str3 = lowerCase2;
        }
        return TextUtils.equals(lowerCase, str3);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int iIndexOf = lowerCase.indexOf(45);
        String strSubstring = iIndexOf != -1 ? lowerCase.substring(0, iIndexOf) : lowerCase;
        String strSubstring2 = iIndexOf != -1 ? lowerCase.substring(iIndexOf + 1) : "";
        if (strSubstring.equals("iw")) {
            strSubstring = "he";
        } else if (strSubstring.equals("id")) {
            strSubstring = "in";
        } else if (strSubstring.equals("no")) {
            strSubstring = "nb";
        }
        if (strSubstring2.isEmpty()) {
            return strSubstring;
        }
        return strSubstring + '-' + strSubstring2;
    }

    public static String d(Locale locale) {
        String country = locale.getCountry();
        Locale locale2 = Locale.US;
        String lowerCase = country.toLowerCase(locale2);
        String lowerCase2 = locale.getLanguage().toLowerCase(locale2);
        return TextUtils.isEmpty(lowerCase) ? lowerCase2 : sko.v(lowerCase2, "-", lowerCase);
    }

    public static String e(Context context) {
        return ipe.z(context).getString("language_code", null);
    }

    public static Locale f(String str) {
        if (TextUtils.isEmpty(str)) {
            return a;
        }
        int iIndexOf = str.indexOf(45);
        return iIndexOf != -1 ? u8.l(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : u8.k(str);
    }

    public static Locale g(Context context) {
        return f(e(context));
    }

    public static Context h(Context context, Locale locale) {
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocales(new LocaleList(locale));
        return context.createConfigurationContext(configuration);
    }

    public static void i(Context context, String str) {
        if (TextUtils.equals(str, e(context))) {
            return;
        }
        context.getSharedPreferences("localize", 0).edit().putString("language_code", str).apply();
        ac8.a(new vwc());
    }
}
