package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x1f {
    public static final x1f a;
    public static final x1f b;
    public static final x1f c;
    public static final x1f d;
    public static final /* synthetic */ x1f[] e;

    static {
        x1f x1fVar = new x1f("SHOWN", 0);
        a = x1fVar;
        x1f x1fVar2 = new x1f("DISABLED", 1);
        b = x1fVar2;
        x1f x1fVar3 = new x1f("REJECTED", 2);
        c = x1fVar3;
        x1f x1fVar4 = new x1f("CANNOT_SHOW_NOW", 3);
        d = x1fVar4;
        e = new x1f[]{x1fVar, x1fVar2, x1fVar3, x1fVar4};
    }

    public static x1f valueOf(String str) {
        return (x1f) Enum.valueOf(x1f.class, str);
    }

    public static x1f[] values() {
        return (x1f[]) e.clone();
    }
}
