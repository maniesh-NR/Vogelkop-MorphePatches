package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gt7 {
    public static final gt7 a;
    public static final gt7 b;
    public static final gt7 c;
    public static final /* synthetic */ gt7[] d;

    static {
        gt7 gt7Var = new gt7("MOVE", 0);
        a = gt7Var;
        gt7 gt7Var2 = new gt7("TRANSFORM", 1);
        b = gt7Var2;
        gt7 gt7Var3 = new gt7("RESIZE", 2);
        c = gt7Var3;
        d = new gt7[]{gt7Var, gt7Var2, gt7Var3};
    }

    public static gt7 valueOf(String str) {
        return (gt7) Enum.valueOf(gt7.class, str);
    }

    public static gt7[] values() {
        return (gt7[]) d.clone();
    }
}
