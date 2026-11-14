package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kd6 {
    public static final kd6 a;
    public static final kd6 b;
    public static final kd6 c;
    public static final /* synthetic */ kd6[] d;

    static {
        kd6 kd6Var = new kd6("UNINITIALIZED", 0);
        a = kd6Var;
        kd6 kd6Var2 = new kd6("INITIALIZING", 1);
        b = kd6Var2;
        kd6 kd6Var3 = new kd6("INITIALIZED", 2);
        c = kd6Var3;
        d = new kd6[]{kd6Var, kd6Var2, kd6Var3};
    }

    public static kd6 valueOf(String str) {
        return (kd6) Enum.valueOf(kd6.class, str);
    }

    public static kd6[] values() {
        return (kd6[]) d.clone();
    }
}
