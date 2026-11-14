package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eaj {
    public static final eaj a;
    public static final eaj b;
    public static final eaj c;
    public static final eaj d;
    public static final eaj e;
    public static final eaj f;
    public static final /* synthetic */ eaj[] g;

    static {
        eaj eajVar = new eaj("Verbose", 0);
        a = eajVar;
        eaj eajVar2 = new eaj("Debug", 1);
        b = eajVar2;
        eaj eajVar3 = new eaj("Info", 2);
        c = eajVar3;
        eaj eajVar4 = new eaj("Warn", 3);
        d = eajVar4;
        eaj eajVar5 = new eaj("Error", 4);
        e = eajVar5;
        eaj eajVar6 = new eaj("Assert", 5);
        f = eajVar6;
        g = new eaj[]{eajVar, eajVar2, eajVar3, eajVar4, eajVar5, eajVar6};
    }

    public static eaj valueOf(String str) {
        return (eaj) Enum.valueOf(eaj.class, str);
    }

    public static eaj[] values() {
        return (eaj[]) g.clone();
    }
}
