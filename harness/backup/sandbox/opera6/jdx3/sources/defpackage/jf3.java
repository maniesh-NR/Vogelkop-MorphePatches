package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jf3 {
    public static final jf3 a;
    public static final jf3 b;
    public static final jf3 c;
    public static final /* synthetic */ jf3[] d;

    static {
        jf3 jf3Var = new jf3("SUCCESS", 0);
        a = jf3Var;
        jf3 jf3Var2 = new jf3("CANCELLED", 1);
        b = jf3Var2;
        jf3 jf3Var3 = new jf3("FAILURE", 2);
        c = jf3Var3;
        d = new jf3[]{jf3Var, jf3Var2, jf3Var3};
    }

    public static jf3 valueOf(String str) {
        return (jf3) Enum.valueOf(jf3.class, str);
    }

    public static jf3[] values() {
        return (jf3[]) d.clone();
    }
}
