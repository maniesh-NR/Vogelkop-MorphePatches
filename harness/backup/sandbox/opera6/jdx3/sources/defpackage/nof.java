package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nof {
    public static final nof a;
    public static final nof b;
    public static final nof c;
    public static final nof d;
    public static final nof e;
    public static final nof f;
    public static final nof g;
    public static final nof h;
    public static final nof i;
    public static final nof j;
    public static final /* synthetic */ nof[] k;

    static {
        nof nofVar = new nof("ONE", 0);
        a = nofVar;
        nof nofVar2 = new nof("ORANGE", 1);
        b = nofVar2;
        nof nofVar3 = new nof("PURPLE", 2);
        c = nofVar3;
        nof nofVar4 = new nof("TEAL", 3);
        d = nofVar4;
        nof nofVar5 = new nof("KHAKI", 4);
        e = nofVar5;
        nof nofVar6 = new nof("BLUE", 5);
        f = nofVar6;
        nof nofVar7 = new nof("RED", 6);
        g = nofVar7;
        nof nofVar8 = new nof("GREEN", 7);
        h = nofVar8;
        nof nofVar9 = new nof("GREY", 8);
        i = nofVar9;
        nof nofVar10 = new nof("VPN_PRO", 9);
        j = nofVar10;
        k = new nof[]{nofVar, nofVar2, nofVar3, nofVar4, nofVar5, nofVar6, nofVar7, nofVar8, nofVar9, nofVar10};
    }

    public static nof valueOf(String str) {
        return (nof) Enum.valueOf(nof.class, str);
    }

    public static nof[] values() {
        return (nof[]) k.clone();
    }
}
