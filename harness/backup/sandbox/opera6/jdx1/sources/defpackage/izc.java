package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class izc {
    public static final ezc a = new ezc();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = ezc.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void c(String str) {
        a.getClass();
        HashSet hashSet = ezc.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
