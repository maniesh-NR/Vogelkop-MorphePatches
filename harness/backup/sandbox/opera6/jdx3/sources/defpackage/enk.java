package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class enk {
    public static final enk a;
    public static final /* synthetic */ enk[] b;

    static {
        enk enkVar = new enk("GOOGLE_BILLING", 0);
        a = enkVar;
        b = new enk[]{enkVar};
    }

    public static enk valueOf(String str) {
        return (enk) Enum.valueOf(enk.class, str);
    }

    public static enk[] values() {
        return (enk[]) b.clone();
    }
}
