package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mmc {
    public static final mmc a;
    public static final mmc b;
    public static final mmc c;
    public static final /* synthetic */ mmc[] d;

    static {
        mmc mmcVar = new mmc("FULL_TIME", 0);
        a = mmcVar;
        mmc mmcVar2 = new mmc("AFTER_EXTRA_TIME", 1);
        b = mmcVar2;
        mmc mmcVar3 = new mmc("AFTER_PENALTIES", 2);
        c = mmcVar3;
        d = new mmc[]{mmcVar, mmcVar2, mmcVar3};
    }

    public static mmc valueOf(String str) {
        return (mmc) Enum.valueOf(mmc.class, str);
    }

    public static mmc[] values() {
        return (mmc[]) d.clone();
    }
}
