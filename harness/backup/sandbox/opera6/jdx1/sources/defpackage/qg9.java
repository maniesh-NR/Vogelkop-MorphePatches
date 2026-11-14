package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qg9 {
    public static final qg9 a;
    public static final qg9 b;
    public static final qg9 c;
    public static final /* synthetic */ qg9[] d;

    static {
        qg9 qg9Var = new qg9("Active", 0);
        a = qg9Var;
        qg9 qg9Var2 = new qg9("ActiveParent", 1);
        b = qg9Var2;
        qg9 qg9Var3 = new qg9("Captured", 2);
        qg9 qg9Var4 = new qg9("Inactive", 3);
        c = qg9Var4;
        d = new qg9[]{qg9Var, qg9Var2, qg9Var3, qg9Var4};
    }

    public static qg9 valueOf(String str) {
        return (qg9) Enum.valueOf(qg9.class, str);
    }

    public static qg9[] values() {
        return (qg9[]) d.clone();
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        h9o.p();
        return false;
    }

    public final boolean g() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                h9o.p();
                return false;
            }
        }
        return true;
    }
}
