package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nta {
    public static final nta a;
    public static final nta b;
    public static final nta c;
    public static final nta d;
    public static final nta e;
    public static final nta f;
    public static final /* synthetic */ nta[] g;

    static {
        nta ntaVar = new nta("Initial", 0);
        a = ntaVar;
        nta ntaVar2 = new nta("Moving", 1);
        b = ntaVar2;
        nta ntaVar3 = new nta("Spinning", 2);
        c = ntaVar3;
        nta ntaVar4 = new nta("Disappearing", 3);
        d = ntaVar4;
        nta ntaVar5 = new nta("Docking", 4);
        e = ntaVar5;
        nta ntaVar6 = new nta("Gone", 5);
        f = ntaVar6;
        g = new nta[]{ntaVar, ntaVar2, ntaVar3, ntaVar4, ntaVar5, ntaVar6};
    }

    public static nta valueOf(String str) {
        return (nta) Enum.valueOf(nta.class, str);
    }

    public static nta[] values() {
        return (nta[]) g.clone();
    }
}
