package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zf2 {
    public static final zf2 a;
    public static final zf2 b;
    public static final zf2 c;
    public static final /* synthetic */ zf2[] d;

    static {
        zf2 zf2Var = new zf2("PLAY", 0);
        a = zf2Var;
        zf2 zf2Var2 = new zf2("PAUSE", 1);
        b = zf2Var2;
        zf2 zf2Var3 = new zf2("DISABLED", 2);
        c = zf2Var3;
        d = new zf2[]{zf2Var, zf2Var2, zf2Var3};
    }

    public static zf2 valueOf(String str) {
        return (zf2) Enum.valueOf(zf2.class, str);
    }

    public static zf2[] values() {
        return (zf2[]) d.clone();
    }
}
