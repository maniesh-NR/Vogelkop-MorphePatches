package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l2n {
    public static final l2n a;
    public static final l2n b;
    public static final l2n c;
    public static final /* synthetic */ l2n[] d;

    static {
        l2n l2nVar = new l2n("HeightCompact", 0);
        a = l2nVar;
        l2n l2nVar2 = new l2n("HeightMedium", 1);
        b = l2nVar2;
        l2n l2nVar3 = new l2n("HeightExpanded", 2);
        c = l2nVar3;
        d = new l2n[]{l2nVar, l2nVar2, l2nVar3};
    }

    public static l2n valueOf(String str) {
        return (l2n) Enum.valueOf(l2n.class, str);
    }

    public static l2n[] values() {
        return (l2n[]) d.clone();
    }
}
