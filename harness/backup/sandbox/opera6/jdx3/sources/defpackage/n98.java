package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n98 {
    public static final n98 a;
    public static final n98 b;
    public static final /* synthetic */ n98[] c;

    static {
        n98 n98Var = new n98("FREE", 0);
        a = n98Var;
        n98 n98Var2 = new n98("PAID", 1);
        b = n98Var2;
        c = new n98[]{n98Var, n98Var2};
    }

    public static n98 valueOf(String str) {
        return (n98) Enum.valueOf(n98.class, str);
    }

    public static n98[] values() {
        return (n98[]) c.clone();
    }
}
