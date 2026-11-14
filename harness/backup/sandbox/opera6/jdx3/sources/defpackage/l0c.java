package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l0c {
    public final String a;
    public final String b;

    public l0c(String str, String str2) {
        Locale locale = Locale.US;
        this.a = str.toLowerCase(locale);
        this.b = str2.toLowerCase(locale);
    }

    public static l0c a(String str) {
        ArrayList arrayListR = aik.r(true, str, ':');
        if (arrayListR.size() == 2) {
            return new l0c((String) arrayListR.get(0), (String) arrayListR.get(1));
        }
        return null;
    }

    public final Locale b() {
        String str = this.a;
        boolean zEquals = str.equals("zz");
        String str2 = this.b;
        return zEquals ? u8.k(str2) : u8.l(str2, str);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l0c)) {
            l0c l0cVar = (l0c) obj;
            if (this.a.equals(l0cVar.a) && this.b.equals(l0cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + z1m.f(527, 31, this.a);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }
}
