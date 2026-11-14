package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class qw4 implements Comparator, sic {
    public static int c(pw4 pw4Var, pw4 pw4Var2) {
        boolean z = pw4Var.d;
        if (z && !pw4Var2.d) {
            return -1;
        }
        if (z || !pw4Var2.d) {
            return Long.signum(pw4Var.c - pw4Var2.c);
        }
        return 1;
    }

    public abstract void I(int i, int i2, Object obj);

    public boolean a(Object obj, Object obj2) {
        return false;
    }

    public boolean b(Object obj, Object obj2) {
        return ((qhc) obj).equals((qhc) obj2);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public Object d(Object obj, Object obj2) {
        return null;
    }
}
