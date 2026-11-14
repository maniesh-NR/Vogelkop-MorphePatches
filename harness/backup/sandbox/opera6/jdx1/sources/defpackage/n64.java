package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n64 {
    public static final n64 a;
    public static final n64 b;
    public static final n64 c;
    public static final n64 d;
    public static final HashMap e;
    public static final /* synthetic */ n64[] f;

    /* JADX INFO: Fake field, exist only in values array */
    n64 EF1;

    static {
        n64 n64Var = new n64("target", 0);
        n64 n64Var2 = new n64("root", 1);
        n64 n64Var3 = new n64("nth_child", 2);
        a = n64Var3;
        n64 n64Var4 = new n64("nth_last_child", 3);
        n64 n64Var5 = new n64("nth_of_type", 4);
        b = n64Var5;
        n64 n64Var6 = new n64("nth_last_of_type", 5);
        c = n64Var6;
        n64 n64Var7 = new n64("first_child", 6);
        n64 n64Var8 = new n64("last_child", 7);
        n64 n64Var9 = new n64("first_of_type", 8);
        n64 n64Var10 = new n64("last_of_type", 9);
        n64 n64Var11 = new n64("only_child", 10);
        n64 n64Var12 = new n64("only_of_type", 11);
        n64 n64Var13 = new n64("empty", 12);
        n64 n64Var14 = new n64("not", 13);
        n64 n64Var15 = new n64("lang", 14);
        n64 n64Var16 = new n64("link", 15);
        n64 n64Var17 = new n64("visited", 16);
        n64 n64Var18 = new n64("hover", 17);
        n64 n64Var19 = new n64("active", 18);
        n64 n64Var20 = new n64("focus", 19);
        n64 n64Var21 = new n64("enabled", 20);
        n64 n64Var22 = new n64("disabled", 21);
        n64 n64Var23 = new n64("checked", 22);
        n64 n64Var24 = new n64("indeterminate", 23);
        n64 n64Var25 = new n64("UNSUPPORTED", 24);
        d = n64Var25;
        f = new n64[]{n64Var, n64Var2, n64Var3, n64Var4, n64Var5, n64Var6, n64Var7, n64Var8, n64Var9, n64Var10, n64Var11, n64Var12, n64Var13, n64Var14, n64Var15, n64Var16, n64Var17, n64Var18, n64Var19, n64Var20, n64Var21, n64Var22, n64Var23, n64Var24, n64Var25};
        e = new HashMap();
        for (n64 n64Var26 : values()) {
            if (n64Var26 != d) {
                e.put(n64Var26.name().replace('_', '-'), n64Var26);
            }
        }
    }

    public static n64 valueOf(String str) {
        return (n64) Enum.valueOf(n64.class, str);
    }

    public static n64[] values() {
        return (n64[]) f.clone();
    }
}
