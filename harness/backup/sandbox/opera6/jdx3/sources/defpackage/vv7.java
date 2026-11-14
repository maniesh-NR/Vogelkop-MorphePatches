package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vv7 {
    public static final vv7 a;
    public static final vv7 b;
    public static final vv7 c;
    public static final vv7 d;
    public static final /* synthetic */ vv7[] e;

    static {
        vv7 vv7Var = new vv7("GO_TO_WEBSITE", 0);
        a = vv7Var;
        vv7 vv7Var2 = new vv7("NONE", 1);
        b = vv7Var2;
        vv7 vv7Var3 = new vv7("SEARCH_ENGINE_SEARCH", 2);
        c = vv7Var3;
        vv7 vv7Var4 = new vv7("SEARCH_ENGINE_SEARCH_AI_MODE", 3);
        vv7 vv7Var5 = new vv7("SUBMIT_TO_ARIA", 4);
        d = vv7Var5;
        e = new vv7[]{vv7Var, vv7Var2, vv7Var3, vv7Var4, vv7Var5};
    }

    public static vv7 valueOf(String str) {
        return (vv7) Enum.valueOf(vv7.class, str);
    }

    public static vv7[] values() {
        return (vv7[]) e.clone();
    }
}
