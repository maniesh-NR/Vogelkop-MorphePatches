package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class dti {
    public static final Pattern a = Pattern.compile("((?i)google(\\.([a-z]{2,3})){1,2})/.*[?&#]q=.+");
    public static final Pattern b = Pattern.compile("((?i)yandex(\\.([a-z]{2,3})){1,2})/.*[?&]text=.+");
    public static final Pattern c = Pattern.compile("((?i)([a-z0-9]+\\.)*yahoo(\\.([a-z]{2,3})){1,2})/.*[?&](q=|p=).+");
    public static final Pattern d = Pattern.compile("((?i)https?://duckduckgo\\.com)/\\?(q|.*[&]q)=.+");
    public static final Pattern e = Pattern.compile("((?i)startpage\\.com)/do/search/?\\?(q|.*[&]q)=.+");

    public static boolean a(String str) {
        return a.matcher(aik.s(str, aik.a)).matches();
    }
}
