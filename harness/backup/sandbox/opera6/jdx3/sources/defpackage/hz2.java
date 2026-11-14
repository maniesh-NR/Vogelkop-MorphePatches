package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hz2 {
    public static final hz2 a;
    public static final hz2 b;
    public static final hz2 c;
    public static final /* synthetic */ hz2[] d;

    static {
        hz2 hz2Var = new hz2("UNKNOWN", 0);
        a = hz2Var;
        hz2 hz2Var2 = new hz2("LEFT", 1);
        b = hz2Var2;
        hz2 hz2Var3 = new hz2("RIGHT", 2);
        c = hz2Var3;
        d = new hz2[]{hz2Var, hz2Var2, hz2Var3};
    }

    public static hz2 valueOf(String str) {
        return (hz2) Enum.valueOf(hz2.class, str);
    }

    public static hz2[] values() {
        return (hz2[]) d.clone();
    }
}
