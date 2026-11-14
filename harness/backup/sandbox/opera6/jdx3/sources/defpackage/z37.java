package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z37 {
    public static final z37 a;
    public static final z37 b;
    public static final /* synthetic */ z37[] c;

    static {
        z37 z37Var = new z37("NOT_DETECTED", 0);
        a = z37Var;
        z37 z37Var2 = new z37("DETECTED", 1);
        b = z37Var2;
        c = new z37[]{z37Var, z37Var2};
    }

    public static z37 valueOf(String str) {
        return (z37) Enum.valueOf(z37.class, str);
    }

    public static z37[] values() {
        return (z37[]) c.clone();
    }
}
