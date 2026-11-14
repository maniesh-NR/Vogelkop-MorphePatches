package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kk {
    public static final kk a;
    public static final kk b;
    public static final kk c;
    public static final /* synthetic */ kk[] d;

    static {
        kk kkVar = new kk("BALANCED", 0);
        a = kkVar;
        kk kkVar2 = new kk("ENHANCED", 1);
        b = kkVar2;
        kk kkVar3 = new kk("CUSTOM", 2);
        c = kkVar3;
        d = new kk[]{kkVar, kkVar2, kkVar3};
    }

    public static kk valueOf(String str) {
        return (kk) Enum.valueOf(kk.class, str);
    }

    public static kk[] values() {
        return (kk[]) d.clone();
    }
}
