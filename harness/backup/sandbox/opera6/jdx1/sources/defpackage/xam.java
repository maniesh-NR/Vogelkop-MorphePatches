package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xam {
    public static final xam a;
    public static final xam b;
    public static final xam c;
    public static final xam d;
    public static final xam e;
    public static final xam f;
    public static final xam g;
    public static final xam h;
    public static final /* synthetic */ xam[] i;

    static {
        xam xamVar = new xam("BodyLarge", 0);
        a = xamVar;
        xam xamVar2 = new xam("BodyMedium", 1);
        b = xamVar2;
        xam xamVar3 = new xam("BodySmall", 2);
        c = xamVar3;
        xam xamVar4 = new xam("DisplayLarge", 3);
        xam xamVar5 = new xam("DisplayMedium", 4);
        xam xamVar6 = new xam("DisplaySmall", 5);
        xam xamVar7 = new xam("HeadlineLarge", 6);
        xam xamVar8 = new xam("HeadlineMedium", 7);
        d = xamVar8;
        xam xamVar9 = new xam("HeadlineSmall", 8);
        e = xamVar9;
        xam xamVar10 = new xam("LabelLarge", 9);
        f = xamVar10;
        xam xamVar11 = new xam("LabelMedium", 10);
        xam xamVar12 = new xam("LabelSmall", 11);
        g = xamVar12;
        xam xamVar13 = new xam("TitleLarge", 12);
        h = xamVar13;
        i = new xam[]{xamVar, xamVar2, xamVar3, xamVar4, xamVar5, xamVar6, xamVar7, xamVar8, xamVar9, xamVar10, xamVar11, xamVar12, xamVar13, new xam("TitleMedium", 13), new xam("TitleSmall", 14), new xam("BodyLargeEmphasized", 15), new xam("BodyMediumEmphasized", 16), new xam("BodySmallEmphasized", 17), new xam("DisplayLargeEmphasized", 18), new xam("DisplayMediumEmphasized", 19), new xam("DisplaySmallEmphasized", 20), new xam("HeadlineLargeEmphasized", 21), new xam("HeadlineMediumEmphasized", 22), new xam("HeadlineSmallEmphasized", 23), new xam("LabelLargeEmphasized", 24), new xam("LabelMediumEmphasized", 25), new xam("LabelSmallEmphasized", 26), new xam("TitleLargeEmphasized", 27), new xam("TitleMediumEmphasized", 28), new xam("TitleSmallEmphasized", 29)};
    }

    public static xam valueOf(String str) {
        return (xam) Enum.valueOf(xam.class, str);
    }

    public static xam[] values() {
        return (xam[]) i.clone();
    }
}
