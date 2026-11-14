package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hwg {
    public static final hwg a;
    public static final hwg b;
    public static final hwg c;
    public static final hwg d;
    public static final hwg e;
    public static final hwg f;
    public static final hwg g;
    public static final hwg h;
    public static final hwg i;
    public static final hwg j;
    public static final /* synthetic */ hwg[] k;

    static {
        hwg hwgVar = new hwg("none", 0);
        a = hwgVar;
        hwg hwgVar2 = new hwg("xMinYMin", 1);
        b = hwgVar2;
        hwg hwgVar3 = new hwg("xMidYMin", 2);
        c = hwgVar3;
        hwg hwgVar4 = new hwg("xMaxYMin", 3);
        d = hwgVar4;
        hwg hwgVar5 = new hwg("xMinYMid", 4);
        e = hwgVar5;
        hwg hwgVar6 = new hwg("xMidYMid", 5);
        f = hwgVar6;
        hwg hwgVar7 = new hwg("xMaxYMid", 6);
        g = hwgVar7;
        hwg hwgVar8 = new hwg("xMinYMax", 7);
        h = hwgVar8;
        hwg hwgVar9 = new hwg("xMidYMax", 8);
        i = hwgVar9;
        hwg hwgVar10 = new hwg("xMaxYMax", 9);
        j = hwgVar10;
        k = new hwg[]{hwgVar, hwgVar2, hwgVar3, hwgVar4, hwgVar5, hwgVar6, hwgVar7, hwgVar8, hwgVar9, hwgVar10};
    }

    public static hwg valueOf(String str) {
        return (hwg) Enum.valueOf(hwg.class, str);
    }

    public static hwg[] values() {
        return (hwg[]) k.clone();
    }
}
