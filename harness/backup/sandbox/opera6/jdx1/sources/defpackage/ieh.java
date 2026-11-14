package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ieh {
    public static final ieh a;
    public static final ieh b;
    public static final ieh c;
    public static final ieh d;
    public static final ieh e;
    public static final ieh f;
    public static final ieh g;
    public static final ieh h;
    public static final ieh i;
    public static final ieh j;
    public static final ieh k;
    public static final /* synthetic */ ieh[] l;

    static {
        ieh iehVar = new ieh("TOP_LEFT_CORNER", 0);
        a = iehVar;
        ieh iehVar2 = new ieh("TOP_RIGHT_CORNER", 1);
        b = iehVar2;
        ieh iehVar3 = new ieh("TOP_MID", 2);
        c = iehVar3;
        ieh iehVar4 = new ieh("LEFT_MID", 3);
        d = iehVar4;
        ieh iehVar5 = new ieh("RIGHT_MID", 4);
        e = iehVar5;
        ieh iehVar6 = new ieh("CENTER", 5);
        f = iehVar6;
        ieh iehVar7 = new ieh("BOTTOM_LEFT_CORNER", 6);
        g = iehVar7;
        ieh iehVar8 = new ieh("BOTTOM_RIGHT_CORNER", 7);
        h = iehVar8;
        ieh iehVar9 = new ieh("BOTTOM_MID", 8);
        i = iehVar9;
        ieh iehVar10 = new ieh("MARGIN", 9);
        j = iehVar10;
        ieh iehVar11 = new ieh("UNKNOWN", 10);
        k = iehVar11;
        l = new ieh[]{iehVar, iehVar2, iehVar3, iehVar4, iehVar5, iehVar6, iehVar7, iehVar8, iehVar9, iehVar10, iehVar11};
    }

    public static ieh valueOf(String str) {
        return (ieh) Enum.valueOf(ieh.class, str);
    }

    public static ieh[] values() {
        return (ieh[]) l.clone();
    }
}
