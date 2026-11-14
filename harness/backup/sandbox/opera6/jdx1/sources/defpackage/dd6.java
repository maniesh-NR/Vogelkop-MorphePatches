package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dd6 {
    public static final dd6 a;
    public static final dd6 b;
    public static final dd6 c;
    public static final dd6 d;
    public static final /* synthetic */ dd6[] e;

    static {
        dd6 dd6Var = new dd6("MEMORY_CACHE", 0);
        a = dd6Var;
        dd6 dd6Var2 = new dd6("MEMORY", 1);
        b = dd6Var2;
        dd6 dd6Var3 = new dd6("DISK", 2);
        c = dd6Var3;
        dd6 dd6Var4 = new dd6("NETWORK", 3);
        d = dd6Var4;
        e = new dd6[]{dd6Var, dd6Var2, dd6Var3, dd6Var4};
    }

    public static dd6 valueOf(String str) {
        return (dd6) Enum.valueOf(dd6.class, str);
    }

    public static dd6[] values() {
        return (dd6[]) e.clone();
    }
}
