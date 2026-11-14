package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f02 {
    public static final f02 a;
    public static final f02 b;
    public static final f02 c;
    public static final f02 d;
    public static final f02 e;
    public static final /* synthetic */ f02[] f;

    static {
        f02 f02Var = new f02("FIRST_RESPONSE", 0);
        a = f02Var;
        f02 f02Var2 = new f02("COMPLETE_RESPONSE", 1);
        b = f02Var2;
        f02 f02Var3 = new f02("FIRST_PRINT", 2);
        c = f02Var3;
        f02 f02Var4 = new f02("COMPLETE_PRINT", 3);
        d = f02Var4;
        f02 f02Var5 = new f02("STOPPED_CHAT", 4);
        e = f02Var5;
        f = new f02[]{f02Var, f02Var2, f02Var3, f02Var4, f02Var5};
    }

    public static f02 valueOf(String str) {
        return (f02) Enum.valueOf(f02.class, str);
    }

    public static f02[] values() {
        return (f02[]) f.clone();
    }
}
