package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bq8 {
    public static final bq8 a;
    public static final bq8 b;
    public static final /* synthetic */ bq8[] c;

    static {
        bq8 bq8Var = new bq8("NONE", 0);
        a = bq8Var;
        bq8 bq8Var2 = new bq8("REGULAR", 1);
        b = bq8Var2;
        c = new bq8[]{bq8Var, bq8Var2, new bq8("MAX_HEIGHT", 2)};
    }

    public static bq8 valueOf(String str) {
        return (bq8) Enum.valueOf(bq8.class, str);
    }

    public static bq8[] values() {
        return (bq8[]) c.clone();
    }
}
