package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j64 {
    public static final j64 a;
    public static final j64 b;
    public static final /* synthetic */ j64[] c;

    static {
        j64 j64Var = new j64("all", 0);
        a = j64Var;
        j64 j64Var2 = new j64("aural", 1);
        j64 j64Var3 = new j64("braille", 2);
        j64 j64Var4 = new j64("embossed", 3);
        j64 j64Var5 = new j64("handheld", 4);
        j64 j64Var6 = new j64("print", 5);
        j64 j64Var7 = new j64("projection", 6);
        j64 j64Var8 = new j64("screen", 7);
        b = j64Var8;
        c = new j64[]{j64Var, j64Var2, j64Var3, j64Var4, j64Var5, j64Var6, j64Var7, j64Var8, new j64("speech", 8), new j64("tty", 9), new j64("tv", 10)};
    }

    public static j64 valueOf(String str) {
        return (j64) Enum.valueOf(j64.class, str);
    }

    public static j64[] values() {
        return (j64[]) c.clone();
    }
}
