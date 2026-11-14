package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class py7 {
    public static final py7 a;
    public static final py7 b;
    public static final py7 c;
    public static final py7 d;
    public static final /* synthetic */ py7[] e;

    static {
        py7 py7Var = new py7("FLAT", 0);
        a = py7Var;
        py7 py7Var2 = new py7("SQUARE", 1);
        b = py7Var2;
        py7 py7Var3 = new py7("SQUARE_WITH_SKIN_TONE_CIRCLE", 2);
        c = py7Var3;
        py7 py7Var4 = new py7("BIDIRECTIONAL", 3);
        d = py7Var4;
        e = new py7[]{py7Var, py7Var2, py7Var3, py7Var4};
    }

    public static py7 valueOf(String str) {
        return (py7) Enum.valueOf(py7.class, str);
    }

    public static py7[] values() {
        return (py7[]) e.clone();
    }
}
