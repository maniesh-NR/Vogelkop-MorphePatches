package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bp9 {
    public static final bp9 a;
    public static final bp9 b;
    public static final bp9 c;
    public static final bp9 d;
    public static final /* synthetic */ bp9[] e;

    static {
        bp9 bp9Var = new bp9("UNKNOWN", 0);
        a = bp9Var;
        bp9 bp9Var2 = new bp9("ELIGIBLE", 1);
        b = bp9Var2;
        bp9 bp9Var3 = new bp9("ALREADY_CLAIMED", 2);
        c = bp9Var3;
        bp9 bp9Var4 = new bp9("NOT_COVERED", 3);
        d = bp9Var4;
        e = new bp9[]{bp9Var, bp9Var2, bp9Var3, bp9Var4};
    }

    public static bp9 valueOf(String str) {
        return (bp9) Enum.valueOf(bp9.class, str);
    }

    public static bp9[] values() {
        return (bp9[]) e.clone();
    }
}
