package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rt7 {
    public static final rt7 a;
    public static final rt7 b;
    public static final rt7 c;
    public static final rt7 d;
    public static final /* synthetic */ rt7[] e;

    static {
        rt7 rt7Var = new rt7("QR_CODE", 0);
        a = rt7Var;
        rt7 rt7Var2 = new rt7("ADD_ATTACHMENT", 1);
        b = rt7Var2;
        rt7 rt7Var3 = new rt7("COPY_LINK", 2);
        c = rt7Var3;
        rt7 rt7Var4 = new rt7("NONE", 3);
        d = rt7Var4;
        e = new rt7[]{rt7Var, rt7Var2, rt7Var3, rt7Var4};
    }

    public static rt7 valueOf(String str) {
        return (rt7) Enum.valueOf(rt7.class, str);
    }

    public static rt7[] values() {
        return (rt7[]) e.clone();
    }
}
