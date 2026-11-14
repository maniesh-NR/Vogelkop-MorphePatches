package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jk8 {
    public static final jk8 a;
    public static final /* synthetic */ jk8[] b;
    public static final /* synthetic */ h58 c;

    static {
        jk8 jk8Var = new jk8("Forrest", 0);
        jk8 jk8Var2 = new jk8("Purple", 1);
        a = jk8Var2;
        jk8[] jk8VarArr = {jk8Var, jk8Var2, new jk8("Crystal", 2), new jk8("Bean", 3), new jk8("Persian", 4), new jk8("Pink", 5), new jk8("CobaltBlue", 6), new jk8("Cheese", 7)};
        b = jk8VarArr;
        c = new h58(jk8VarArr);
    }

    public static jk8 valueOf(String str) {
        return (jk8) Enum.valueOf(jk8.class, str);
    }

    public static jk8[] values() {
        return (jk8[]) b.clone();
    }
}
