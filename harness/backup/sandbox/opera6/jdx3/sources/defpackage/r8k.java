package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r8k {
    public static final r8k a;
    public static final r8k b;
    public static final /* synthetic */ r8k[] c;

    static {
        r8k r8kVar = new r8k("DISABLED", 0);
        a = r8kVar;
        r8k r8kVar2 = new r8k("AI_AND_PRIVATE", 1);
        b = r8kVar2;
        c = new r8k[]{r8kVar, r8kVar2};
    }

    public static r8k valueOf(String str) {
        return (r8k) Enum.valueOf(r8k.class, str);
    }

    public static r8k[] values() {
        return (r8k[]) c.clone();
    }
}
