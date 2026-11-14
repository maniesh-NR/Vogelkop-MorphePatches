package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class af9 {
    public static final af9 a;
    public static final af9 b;
    public static final af9 c;
    public static final /* synthetic */ af9[] d;

    static {
        af9 af9Var = new af9("SUCCESS", 0);
        a = af9Var;
        af9 af9Var2 = new af9("NO_NEED", 1);
        b = af9Var2;
        af9 af9Var3 = new af9("ERROR", 2);
        c = af9Var3;
        d = new af9[]{af9Var, af9Var2, af9Var3};
    }

    public static af9 valueOf(String str) {
        return (af9) Enum.valueOf(af9.class, str);
    }

    public static af9[] values() {
        return (af9[]) d.clone();
    }
}
