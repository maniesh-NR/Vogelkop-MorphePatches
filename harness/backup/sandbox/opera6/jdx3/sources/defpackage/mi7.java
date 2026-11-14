package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mi7 {
    public static final mi7 a;
    public static final mi7 b;
    public static final mi7 c;
    public static final mi7 d;
    public static final /* synthetic */ mi7[] e;

    static {
        mi7 mi7Var = new mi7("IDLE", 0);
        a = mi7Var;
        mi7 mi7Var2 = new mi7("ENTERING_ZONE", 1);
        b = mi7Var2;
        mi7 mi7Var3 = new mi7("LEAVING_ZONE", 2);
        c = mi7Var3;
        mi7 mi7Var4 = new mi7("SLIDING", 3);
        d = mi7Var4;
        e = new mi7[]{mi7Var, mi7Var2, mi7Var3, mi7Var4};
    }

    public static mi7 valueOf(String str) {
        return (mi7) Enum.valueOf(mi7.class, str);
    }

    public static mi7[] values() {
        return (mi7[]) e.clone();
    }
}
