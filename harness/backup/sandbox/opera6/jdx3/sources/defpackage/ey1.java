package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ey1 {
    public static final ey1 a;
    public static final ey1 b;
    public static final ey1 c;
    public static final ey1 d;
    public static final ey1 e;
    public static final /* synthetic */ ey1[] f;

    static {
        ey1 ey1Var = new ey1("TIMEOUT", 0);
        a = ey1Var;
        ey1 ey1Var2 = new ey1("NETWORK_ERROR", 1);
        b = ey1Var2;
        ey1 ey1Var3 = new ey1("FILE_QUOTA_REACHED", 2);
        c = ey1Var3;
        ey1 ey1Var4 = new ey1("FILE_SIZE_TOO_BIG", 3);
        d = ey1Var4;
        ey1 ey1Var5 = new ey1("FILE_FORMAT_NOT_SUPPORTED", 4);
        e = ey1Var5;
        f = new ey1[]{ey1Var, ey1Var2, ey1Var3, ey1Var4, ey1Var5};
    }

    public static ey1 valueOf(String str) {
        return (ey1) Enum.valueOf(ey1.class, str);
    }

    public static ey1[] values() {
        return (ey1[]) f.clone();
    }
}
