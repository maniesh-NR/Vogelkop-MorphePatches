package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f89 {
    public static final f89 a;
    public static final f89 b;
    public static final f89 c;
    public static final /* synthetic */ f89[] d;

    static {
        f89 f89Var = new f89("NO_INSTALL", 0);
        a = f89Var;
        f89 f89Var2 = new f89("INSTALL_DOWNLOADING", 1);
        b = f89Var2;
        f89 f89Var3 = new f89("INSTALL_AVAILABLE", 2);
        c = f89Var3;
        d = new f89[]{f89Var, f89Var2, f89Var3};
    }

    public static f89 valueOf(String str) {
        return (f89) Enum.valueOf(f89.class, str);
    }

    public static f89[] values() {
        return (f89[]) d.clone();
    }
}
