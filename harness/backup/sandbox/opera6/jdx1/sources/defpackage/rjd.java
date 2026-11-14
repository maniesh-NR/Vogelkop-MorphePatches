package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class rjd {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }
}
