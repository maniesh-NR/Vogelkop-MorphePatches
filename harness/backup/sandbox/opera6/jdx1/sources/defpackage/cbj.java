package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cbj {
    public static final cbj a;
    public static final cbj b;
    public static final cbj c;
    public static final cbj d;
    public static final cbj e;
    public static final cbj f;
    public static final cbj g;
    public static final /* synthetic */ cbj[] h;

    /* JADX INFO: Fake field, exist only in values array */
    cbj EF0;

    static {
        cbj cbjVar = new cbj("CornerExtraExtraLarge", 0);
        cbj cbjVar2 = new cbj("CornerExtraLarge", 1);
        cbj cbjVar3 = new cbj("CornerExtraLargeIncreased", 2);
        cbj cbjVar4 = new cbj("CornerExtraLargeTop", 3);
        a = cbjVar4;
        cbj cbjVar5 = new cbj("CornerExtraSmall", 4);
        b = cbjVar5;
        cbj cbjVar6 = new cbj("CornerExtraSmallTop", 5);
        c = cbjVar6;
        cbj cbjVar7 = new cbj("CornerFull", 6);
        d = cbjVar7;
        cbj cbjVar8 = new cbj("CornerLarge", 7);
        cbj cbjVar9 = new cbj("CornerLargeEnd", 8);
        cbj cbjVar10 = new cbj("CornerLargeIncreased", 9);
        cbj cbjVar11 = new cbj("CornerLargeStart", 10);
        cbj cbjVar12 = new cbj("CornerLargeTop", 11);
        cbj cbjVar13 = new cbj("CornerMedium", 12);
        e = cbjVar13;
        cbj cbjVar14 = new cbj("CornerNone", 13);
        f = cbjVar14;
        cbj cbjVar15 = new cbj("CornerSmall", 14);
        g = cbjVar15;
        h = new cbj[]{cbjVar, cbjVar2, cbjVar3, cbjVar4, cbjVar5, cbjVar6, cbjVar7, cbjVar8, cbjVar9, cbjVar10, cbjVar11, cbjVar12, cbjVar13, cbjVar14, cbjVar15};
    }

    public static cbj valueOf(String str) {
        return (cbj) Enum.valueOf(cbj.class, str);
    }

    public static cbj[] values() {
        return (cbj[]) h.clone();
    }
}
