package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s92 {
    public static final s92 a;
    public static final s92 b;
    public static final s92 c;
    public static final s92 d;
    public static final s92 e;
    public static final /* synthetic */ s92[] f;

    static {
        s92 s92Var = new s92("APPLICATION", 0);
        a = s92Var;
        s92 s92Var2 = new s92("AUDIO", 1);
        b = s92Var2;
        s92 s92Var3 = new s92("IMAGE", 2);
        c = s92Var3;
        s92 s92Var4 = new s92("TEXT", 3);
        d = s92Var4;
        s92 s92Var5 = new s92("VIDEO", 4);
        e = s92Var5;
        f = new s92[]{s92Var, s92Var2, s92Var3, s92Var4, s92Var5};
    }

    public static s92 valueOf(String str) {
        return (s92) Enum.valueOf(s92.class, str);
    }

    public static s92[] values() {
        return (s92[]) f.clone();
    }
}
