package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jk6 {
    public static final jk6 a;
    public static final jk6 b;
    public static final jk6 c;
    public static final jk6 d;
    public static final /* synthetic */ jk6[] e;

    static {
        jk6 jk6Var = new jk6("AVAILABLE", 0);
        a = jk6Var;
        jk6 jk6Var2 = new jk6("NOT_SUPPORTED", 1);
        b = jk6Var2;
        jk6 jk6Var3 = new jk6("ALREADY_ACTIVE", 2);
        c = jk6Var3;
        jk6 jk6Var4 = new jk6("ERROR", 3);
        d = jk6Var4;
        e = new jk6[]{jk6Var, jk6Var2, jk6Var3, jk6Var4};
    }

    public static jk6 valueOf(String str) {
        return (jk6) Enum.valueOf(jk6.class, str);
    }

    public static jk6[] values() {
        return (jk6[]) e.clone();
    }
}
