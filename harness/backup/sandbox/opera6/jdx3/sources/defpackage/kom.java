package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kom {
    public static final kom a;
    public static final kom b;
    public static final /* synthetic */ kom[] c;

    static {
        kom komVar = new kom("DYNAMIC_CONTENT", 0);
        a = komVar;
        kom komVar2 = new kom("GOOGLE_PLAY_FLEXIBLE_UPDATE", 1);
        b = komVar2;
        c = new kom[]{komVar, komVar2};
    }

    public static kom valueOf(String str) {
        return (kom) Enum.valueOf(kom.class, str);
    }

    public static kom[] values() {
        return (kom[]) c.clone();
    }
}
