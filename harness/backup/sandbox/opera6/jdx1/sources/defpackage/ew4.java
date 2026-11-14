package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ew4 {
    public static final ew4 a;
    public static final ew4 b;
    public static final /* synthetic */ ew4[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ew4 EF0;

    static {
        ew4 ew4Var = new ew4("DESTROYED", 0);
        ew4 ew4Var2 = new ew4("CREATED", 1);
        a = ew4Var2;
        ew4 ew4Var3 = new ew4("STARTED", 2);
        ew4 ew4Var4 = new ew4("RESUMED", 3);
        b = ew4Var4;
        c = new ew4[]{ew4Var, ew4Var2, ew4Var3, ew4Var4};
    }

    public static ew4 valueOf(String str) {
        return (ew4) Enum.valueOf(ew4.class, str);
    }

    public static ew4[] values() {
        return (ew4[]) c.clone();
    }
}
