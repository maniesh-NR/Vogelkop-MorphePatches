package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ei7 {
    public static final ei7 a;
    public static final ei7 b;
    public static final ei7 c;
    public static final /* synthetic */ ei7[] d;

    static {
        ei7 ei7Var = new ei7("UNKNOWN", 0);
        a = ei7Var;
        ei7 ei7Var2 = new ei7("MOVED_TO_DROP_ZONE", 1);
        b = ei7Var2;
        ei7 ei7Var3 = new ei7("CLOSE_BUTTON", 2);
        c = ei7Var3;
        d = new ei7[]{ei7Var, ei7Var2, ei7Var3};
    }

    public static ei7 valueOf(String str) {
        return (ei7) Enum.valueOf(ei7.class, str);
    }

    public static ei7[] values() {
        return (ei7[]) d.clone();
    }
}
