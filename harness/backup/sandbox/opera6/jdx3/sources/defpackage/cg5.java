package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cg5 {
    public static final cg5 a;
    public static final /* synthetic */ cg5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    cg5 EF0;

    static {
        cg5 cg5Var = new cg5("AlignTop", 0);
        cg5 cg5Var2 = new cg5("AlignVerticalCenter", 1);
        cg5 cg5Var3 = new cg5("AlignTopIfNotVisible", 2);
        cg5 cg5Var4 = new cg5("AlignVerticalCenterIfNotVisible", 3);
        a = cg5Var4;
        b = new cg5[]{cg5Var, cg5Var2, cg5Var3, cg5Var4};
    }

    public static cg5 valueOf(String str) {
        return (cg5) Enum.valueOf(cg5.class, str);
    }

    public static cg5[] values() {
        return (cg5[]) b.clone();
    }
}
