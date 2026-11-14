package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class btk {
    public static final btk a;
    public static final btk b;
    public static final btk c;
    public static final /* synthetic */ btk[] d;

    static {
        btk btkVar = new btk("WITHOUT_FEATURE_COMBO", 0);
        a = btkVar;
        btk btkVar2 = new btk("WITH_FEATURE_COMBO", 1);
        b = btkVar2;
        btk btkVar3 = new btk("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        c = btkVar3;
        d = new btk[]{btkVar, btkVar2, btkVar3};
    }

    public static btk valueOf(String str) {
        return (btk) Enum.valueOf(btk.class, str);
    }

    public static btk[] values() {
        return (btk[]) d.clone();
    }
}
