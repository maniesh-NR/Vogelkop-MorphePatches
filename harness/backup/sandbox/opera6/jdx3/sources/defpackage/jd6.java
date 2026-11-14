package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jd6 {
    public static final jd6 a;
    public static final jd6 b;
    public static final jd6 c;
    public static final /* synthetic */ jd6[] d;

    static {
        jd6 jd6Var = new jd6("INIT_TIMEOUT", 0);
        a = jd6Var;
        jd6 jd6Var2 = new jd6("INIT_FAILED", 1);
        b = jd6Var2;
        jd6 jd6Var3 = new jd6("CALLBACK_REPLACED", 2);
        c = jd6Var3;
        d = new jd6[]{jd6Var, jd6Var2, jd6Var3};
    }

    public static jd6 valueOf(String str) {
        return (jd6) Enum.valueOf(jd6.class, str);
    }

    public static jd6[] values() {
        return (jd6[]) d.clone();
    }
}
