package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lmm {
    public static final lmm a;
    public static final /* synthetic */ lmm[] b;

    static {
        lmm lmmVar = new lmm("AUTHORIZED", 0);
        a = lmmVar;
        b = new lmm[]{lmmVar};
    }

    public static lmm valueOf(String str) {
        return (lmm) Enum.valueOf(lmm.class, str);
    }

    public static lmm[] values() {
        return (lmm[]) b.clone();
    }
}
