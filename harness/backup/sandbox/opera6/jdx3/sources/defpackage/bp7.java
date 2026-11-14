package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bp7 {
    public static final bp7 a;
    public static final bp7 b;
    public static final bp7 c;
    public static final /* synthetic */ bp7[] d;

    static {
        bp7 bp7Var = new bp7("LOADING", 0);
        a = bp7Var;
        bp7 bp7Var2 = new bp7("ERROR", 1);
        b = bp7Var2;
        bp7 bp7Var3 = new bp7("AVAILABLE", 2);
        c = bp7Var3;
        d = new bp7[]{bp7Var, bp7Var2, bp7Var3};
    }

    public static bp7 valueOf(String str) {
        return (bp7) Enum.valueOf(bp7.class, str);
    }

    public static bp7[] values() {
        return (bp7[]) d.clone();
    }
}
