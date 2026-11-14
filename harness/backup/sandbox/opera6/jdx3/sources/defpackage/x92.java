package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x92 {
    public static final x92 a;
    public static final x92 b;
    public static final x92 c;
    public static final x92 d;
    public static final x92 e;
    public static final x92 f;
    public static final x92 g;
    public static final /* synthetic */ x92[] h;

    static {
        x92 x92Var = new x92("IMAGE_CONTEXT_MENU", 0);
        a = x92Var;
        x92 x92Var2 = new x92("DOWNLOAD_ITEM_MENU", 1);
        b = x92Var2;
        x92 x92Var3 = new x92("DOWNLOAD_SELECTION_MENU", 2);
        c = x92Var3;
        x92 x92Var4 = new x92("DOWNLOAD_CONTEXT_MENU", 3);
        d = x92Var4;
        x92 x92Var5 = new x92("PAGE_MENU", 4);
        e = x92Var5;
        x92 x92Var6 = new x92("OMNIBAR", 5);
        f = x92Var6;
        x92 x92Var7 = new x92("TEXT_SELECTION_CONTEXT_MENU", 6);
        g = x92Var7;
        h = new x92[]{x92Var, x92Var2, x92Var3, x92Var4, x92Var5, x92Var6, x92Var7};
    }

    public static x92 valueOf(String str) {
        return (x92) Enum.valueOf(x92.class, str);
    }

    public static x92[] values() {
        return (x92[]) h.clone();
    }
}
