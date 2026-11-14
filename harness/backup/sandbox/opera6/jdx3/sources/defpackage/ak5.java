package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ak5 {
    public static final ak5 a;
    public static final ak5 b;
    public static final ak5 c;
    public static final ak5 d;
    public static final /* synthetic */ ak5[] e;

    static {
        ak5 ak5Var = new ak5("IDLE", 0);
        a = ak5Var;
        ak5 ak5Var2 = new ak5("LOADING", 1);
        b = ak5Var2;
        ak5 ak5Var3 = new ak5("VALIDATING", 2);
        c = ak5Var3;
        ak5 ak5Var4 = new ak5("APPLYING", 3);
        d = ak5Var4;
        e = new ak5[]{ak5Var, ak5Var2, ak5Var3, ak5Var4};
    }

    public static ak5 valueOf(String str) {
        return (ak5) Enum.valueOf(ak5.class, str);
    }

    public static ak5[] values() {
        return (ak5[]) e.clone();
    }
}
