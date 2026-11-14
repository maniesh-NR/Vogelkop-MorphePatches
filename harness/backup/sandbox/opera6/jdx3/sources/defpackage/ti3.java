package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ti3 {
    public static final ti3 b;
    public static final ti3 c;
    public static final ti3 d;
    public static final /* synthetic */ ti3[] e;
    public static final /* synthetic */ h58 f;
    public final byte a;

    static {
        ti3 ti3Var = new ti3("RECOMMENDED", 0, 0);
        b = ti3Var;
        ti3 ti3Var2 = new ti3("OTHER", 1, 1);
        c = ti3Var2;
        ti3 ti3Var3 = new ti3("REGIONAL", 2, 2);
        d = ti3Var3;
        ti3[] ti3VarArr = {ti3Var, ti3Var2, ti3Var3};
        e = ti3VarArr;
        f = new h58(ti3VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ti3(String str, int i, int i2) {
        this.a = i2;
    }

    public static ti3 valueOf(String str) {
        return (ti3) Enum.valueOf(ti3.class, str);
    }

    public static ti3[] values() {
        return (ti3[]) e.clone();
    }
}
