package defpackage;

import J.N;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Pattern;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class vqm {
    public static final ArrayList a;

    static {
        Pattern.compile("^(www[0-9]*|web|ftp|wap|home|mobile|amp)\\.");
        a = new ArrayList(Arrays.asList("about", Constants.Params.DATA, "file", "http", "https", "inline", "javascript"));
        new ArrayList(Arrays.asList(Constants.Params.DATA, "blob", "file", "filesystem", "http", "https"));
        Object[] objArr = {"chrome", "chrome-native", "about"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                qp2.o(rfp.o(obj, "duplicate element: "));
                return;
            }
        }
        Collections.unmodifiableSet(hashSet);
    }

    public static boolean a(GURL gurl) {
        return gurl.f().equals("android-app") || gurl.f().equals("intent");
    }

    public static boolean b(GURL gurl) {
        if (!GURL.i(gurl)) {
            if (a.contains(gurl.f())) {
                return true;
            }
            if (gurl.f().equals("chrome") && N.MRiRQ_Ey(N.MvX_j9h6(0))) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str) {
        return "http".equals(str) || "https".equals(str);
    }
}
