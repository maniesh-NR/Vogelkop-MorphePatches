package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u4b {
    public static final u4b a;
    public static final /* synthetic */ u4b[] b;

    static {
        u4b u4bVar = new u4b("AUTO_REMOVE_ON_LOW_MEMORY", 0);
        a = u4bVar;
        b = new u4b[]{u4bVar};
    }

    public static u4b valueOf(String str) {
        return (u4b) Enum.valueOf(u4b.class, str);
    }

    public static u4b[] values() {
        return (u4b[]) b.clone();
    }
}
