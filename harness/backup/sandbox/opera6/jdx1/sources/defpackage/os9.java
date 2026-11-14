package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class os9 {
    public static final os9 a;
    public static final os9 b;
    public static final os9 c;
    public static final /* synthetic */ os9[] d;

    static {
        os9 os9Var = new os9("UNKNOWN", 0);
        a = os9Var;
        os9 os9Var2 = new os9("DEFAULT", 1);
        b = os9Var2;
        os9 os9Var3 = new os9("YUV", 2);
        c = os9Var3;
        d = new os9[]{os9Var, os9Var2, os9Var3};
    }

    public static os9 valueOf(String str) {
        return (os9) Enum.valueOf(os9.class, str);
    }

    public static os9[] values() {
        return (os9[]) d.clone();
    }
}
