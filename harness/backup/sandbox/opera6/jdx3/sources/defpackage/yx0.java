package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yx0 {
    public static final yx0 a;
    public static final yx0 b;
    public static final yx0 c;
    public static final yx0 d;
    public static final yx0 e;
    public static final yx0 f;
    public static final yx0 g;
    public static final yx0 h;
    public static final yx0 i;
    public static final /* synthetic */ yx0[] j;

    static {
        yx0 yx0Var = new yx0("NO_FILES", 0);
        a = yx0Var;
        yx0 yx0Var2 = new yx0("IMAGES_ONLY", 1);
        b = yx0Var2;
        yx0 yx0Var3 = new yx0("TEXT_FILES_ONLY", 2);
        c = yx0Var3;
        yx0 yx0Var4 = new yx0("IMAGES_TEXT_FILES_MIX", 3);
        d = yx0Var4;
        yx0 yx0Var5 = new yx0("ONE_PAGE_CONTEXT_ONLY", 4);
        e = yx0Var5;
        yx0 yx0Var6 = new yx0("OTHER", 5);
        f = yx0Var6;
        yx0 yx0Var7 = new yx0("ATTACHED_TEXT", 6);
        g = yx0Var7;
        yx0 yx0Var8 = new yx0("ATTACHED_TEXT_LONG", 7);
        h = yx0Var8;
        yx0 yx0Var9 = new yx0("ATTACHED_TEXT_SHORT", 8);
        i = yx0Var9;
        j = new yx0[]{yx0Var, yx0Var2, yx0Var3, yx0Var4, yx0Var5, yx0Var6, yx0Var7, yx0Var8, yx0Var9};
    }

    public static yx0 valueOf(String str) {
        return (yx0) Enum.valueOf(yx0.class, str);
    }

    public static yx0[] values() {
        return (yx0[]) j.clone();
    }
}
