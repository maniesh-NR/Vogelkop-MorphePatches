package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ea8 {
    public static final ea8 a;
    public static final ea8 b;
    public static final ea8 c;
    public static final /* synthetic */ ea8[] d;

    static {
        ea8 ea8Var = new ea8("UNKNOWN", 0);
        a = ea8Var;
        ea8 ea8Var2 = new ea8("SUPPORTED", 1);
        b = ea8Var2;
        ea8 ea8Var3 = new ea8("UNSUPPORTED", 2);
        c = ea8Var3;
        d = new ea8[]{ea8Var, ea8Var2, ea8Var3};
    }

    public static ea8 valueOf(String str) {
        return (ea8) Enum.valueOf(ea8.class, str);
    }

    public static ea8[] values() {
        return (ea8[]) d.clone();
    }
}
