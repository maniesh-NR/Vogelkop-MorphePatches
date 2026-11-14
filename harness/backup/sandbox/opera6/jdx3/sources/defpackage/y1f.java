package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y1f {
    public static final y1f a;
    public static final y1f b;
    public static final /* synthetic */ y1f[] c;

    static {
        y1f y1fVar = new y1f("ENABLE", 0);
        a = y1fVar;
        y1f y1fVar2 = new y1f("DISABLE", 1);
        b = y1fVar2;
        c = new y1f[]{y1fVar, y1fVar2};
    }

    public static y1f valueOf(String str) {
        return (y1f) Enum.valueOf(y1f.class, str);
    }

    public static y1f[] values() {
        return (y1f[]) c.clone();
    }
}
