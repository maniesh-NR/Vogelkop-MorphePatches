package defpackage;

import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0a {
    public static final o0a a;
    public static final o0a b;
    public static final /* synthetic */ o0a[] c;

    static {
        o0a o0aVar = new o0a("AI_MODE", 0);
        a = o0aVar;
        o0a o0aVar2 = new o0a("CREATE_IMAGE", 1);
        b = o0aVar2;
        c = new o0a[]{o0aVar, o0aVar2};
    }

    public static o0a valueOf(String str) {
        return (o0a) Enum.valueOf(o0a.class, str);
    }

    public static o0a[] values() {
        return (o0a[]) c.clone();
    }

    public final boolean d(l08 l08Var) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                h9o.p();
                return false;
            }
            if (l08Var != null) {
                return true;
            }
            Iterator it = l08Var.iterator();
            while (it.hasNext()) {
                b0a b0aVar = (b0a) it.next();
                if (b0aVar != null) {
                    if (b0aVar instanceof zz9) {
                        if (n0a.a[((zz9) b0aVar).c.ordinal()] != 1) {
                            return false;
                        }
                    } else if (b0aVar instanceof a0a) {
                        if (n0a.a[((a0a) b0aVar).c.ordinal()] != 1) {
                            return false;
                        }
                    }
                }
                h9o.p();
                return false;
            }
        }
        return true;
    }
}
