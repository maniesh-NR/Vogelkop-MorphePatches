package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jv9 {
    public static final jv9 a;
    public static final /* synthetic */ jv9[] b;
    public static final /* synthetic */ h58 c;

    static {
        jv9 jv9Var = new jv9("NO_SIGNAL_SENT", 0);
        a = jv9Var;
        jv9[] jv9VarArr = {jv9Var, new jv9("POSITIVE_SIGNAL_SENT", 1), new jv9("NEGATIVE_SIGNAL_SENT", 2)};
        b = jv9VarArr;
        c = new h58(jv9VarArr);
    }

    public static jv9 valueOf(String str) {
        return (jv9) Enum.valueOf(jv9.class, str);
    }

    public static jv9[] values() {
        return (jv9[]) b.clone();
    }
}
