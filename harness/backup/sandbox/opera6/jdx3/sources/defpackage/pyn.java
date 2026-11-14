package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class pyn {
    public static final HashSet a = new HashSet();

    static {
        char c = ' ';
        while (true) {
            HashSet hashSet = a;
            if (c >= 127) {
                hashSet.remove('\"');
                hashSet.remove('(');
                hashSet.remove(')');
                hashSet.remove('<');
                hashSet.remove('>');
                hashSet.remove('[');
                hashSet.remove(']');
                hashSet.remove('{');
                hashSet.remove('}');
                return;
            }
            hashSet.add(Character.valueOf(c));
            c = (char) (c + 1);
        }
    }

    public static String a(Context context) {
        Locale locale = Locale.US;
        String str = Build.VERSION.RELEASE;
        HashSet hashSet = a;
        String strQ = aik.q(str, hashSet);
        String strQ2 = aik.q(Build.MODEL, hashSet);
        String str2 = " OPR/" + r9n.t(context).versionName;
        StringBuilder sbN = z1m.n("(Linux; Android ", strQ, "; ", strQ2, ")");
        sbN.append(str2);
        return sbN.toString();
    }
}
