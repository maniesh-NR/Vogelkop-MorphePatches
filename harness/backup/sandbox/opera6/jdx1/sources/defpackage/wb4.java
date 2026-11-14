package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wb4 {
    public static final wb4 a;
    public static final wb4 b;
    public static final wb4 c;
    public static final wb4 d;
    public static final wb4 e;
    public static final /* synthetic */ wb4[] f;

    static {
        wb4 wb4Var = new wb4("UNKNOWN", 0);
        a = wb4Var;
        wb4 wb4Var2 = new wb4("INACTIVE", 1);
        b = wb4Var2;
        wb4 wb4Var3 = new wb4("METERING", 2);
        c = wb4Var3;
        wb4 wb4Var4 = new wb4("CONVERGED", 3);
        d = wb4Var4;
        wb4 wb4Var5 = new wb4("LOCKED", 4);
        e = wb4Var5;
        f = new wb4[]{wb4Var, wb4Var2, wb4Var3, wb4Var4, wb4Var5};
    }

    public static wb4 valueOf(String str) {
        return (wb4) Enum.valueOf(wb4.class, str);
    }

    public static wb4[] values() {
        return (wb4[]) f.clone();
    }
}
