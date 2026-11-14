package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ahb {
    public static final ahb a;
    public static final ahb b;
    public static final ahb c;
    public static final /* synthetic */ ahb[] d;

    static {
        ahb ahbVar = new ahb("STATIC", 0);
        a = ahbVar;
        ahb ahbVar2 = new ahb("MANUAL", 1);
        b = ahbVar2;
        ahb ahbVar3 = new ahb("SKIP", 2);
        c = ahbVar3;
        d = new ahb[]{ahbVar, ahbVar2, ahbVar3};
    }

    public static ahb valueOf(String str) {
        return (ahb) Enum.valueOf(ahb.class, str);
    }

    public static ahb[] values() {
        return (ahb[]) d.clone();
    }
}
