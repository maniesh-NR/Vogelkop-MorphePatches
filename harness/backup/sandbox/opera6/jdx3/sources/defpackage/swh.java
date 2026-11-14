package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class swh {
    public static final swh a;
    public static final swh b;
    public static final /* synthetic */ swh[] c;

    static {
        swh swhVar = new swh("EMPTY", 0);
        a = swhVar;
        swh swhVar2 = new swh("EXPIRED", 1);
        b = swhVar2;
        c = new swh[]{swhVar, swhVar2, new swh("PTR", 2), new swh("DEBUG", 3)};
    }

    public static swh valueOf(String str) {
        return (swh) Enum.valueOf(swh.class, str);
    }

    public static swh[] values() {
        return (swh[]) c.clone();
    }
}
