package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sj3 {
    public static final sj3 a;
    public static final sj3 b;
    public static final sj3 c;
    public static final sj3 d;
    public static final /* synthetic */ sj3[] e;

    static {
        sj3 sj3Var = new sj3("ADBLOCK_URL", 0);
        a = sj3Var;
        sj3 sj3Var2 = new sj3("CDB_URL", 1);
        b = sj3Var2;
        sj3 sj3Var3 = new sj3("TRACKER_URL", 2);
        c = sj3Var3;
        sj3 sj3Var4 = new sj3("ADBLOCK_CSS", 3);
        d = sj3Var4;
        e = new sj3[]{sj3Var, sj3Var2, sj3Var3, sj3Var4};
    }

    public static sj3 valueOf(String str) {
        return (sj3) Enum.valueOf(sj3.class, str);
    }

    public static sj3[] values() {
        return (sj3[]) e.clone();
    }
}
