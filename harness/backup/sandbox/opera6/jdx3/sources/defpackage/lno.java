package defpackage;

import android.text.TextUtils;
import com.opera.ad.entity.Macros;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class lno {
    public static final Pattern a = Pattern.compile("\\{([^}]+)\\}");

    public static String a(String str, Macros macros) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        try {
            matcher.reset();
            String strReplace = str;
            while (matcher.find()) {
                strReplace = strReplace.replace(matcher.group(), macros.getClass().getDeclaredField(matcher.group(1)).get(macros).toString());
            }
            f1p.a().getClass();
            return f1p.g(strReplace);
        } catch (Throwable unused) {
            return str;
        }
    }
}
