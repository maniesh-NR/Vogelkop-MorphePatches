package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g8f {
    public static final g8f a;
    public static final g8f b;
    public static final /* synthetic */ g8f[] c;

    static {
        g8f g8fVar = new g8f("EXECUTE", 0);
        a = g8fVar;
        g8f g8fVar2 = new g8f("DRY_RUN", 1);
        b = g8fVar2;
        c = new g8f[]{g8fVar, g8fVar2};
    }

    public static g8f valueOf(String str) {
        return (g8f) Enum.valueOf(g8f.class, str);
    }

    public static g8f[] values() {
        return (g8f[]) c.clone();
    }
}
