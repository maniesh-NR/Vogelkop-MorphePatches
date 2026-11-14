package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class kyl {
    public static final String c;
    public static final String d;
    public final eyl a;
    public final h1b b;

    static {
        String str = tym.a;
        c = "0";
        d = "1";
    }

    public kyl(eyl eylVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= eylVar.a)) {
            t3p.t();
            throw null;
        }
        this.a = eylVar;
        this.b = h1b.s(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kyl.class == obj.getClass()) {
            kyl kylVar = (kyl) obj;
            if (this.a.equals(kylVar.a) && this.b.equals(kylVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
