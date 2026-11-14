package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class epj {
    public static final cpj a;
    public static final epj b;
    public static final epj c;
    public static final epj d;
    public static final epj e;
    public static final epj f;
    public static final /* synthetic */ epj[] g;

    static {
        epj epjVar = new epj("HEIGHT_COMPACT", 0);
        b = epjVar;
        epj epjVar2 = new epj("COMPACT", 1);
        c = epjVar2;
        epj epjVar3 = new epj("MEDIUM", 2);
        d = epjVar3;
        epj epjVar4 = new epj("EXPANDED", 3);
        e = epjVar4;
        epj epjVar5 = new epj("LARGE", 4);
        f = epjVar5;
        g = new epj[]{epjVar, epjVar2, epjVar3, epjVar4, epjVar5};
        a = new cpj((byte) 0);
    }

    public static epj valueOf(String str) {
        return (epj) Enum.valueOf(epj.class, str);
    }

    public static epj[] values() {
        return (epj[]) g.clone();
    }
}
