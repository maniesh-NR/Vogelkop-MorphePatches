package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kjb {
    public static final kjb a;
    public static final kjb b;
    public static final kjb c;
    public static final kjb d;
    public static final /* synthetic */ kjb[] e;

    static {
        kjb kjbVar = new kjb("LookaheadMeasurement", 0);
        a = kjbVar;
        kjb kjbVar2 = new kjb("LookaheadPlacement", 1);
        b = kjbVar2;
        kjb kjbVar3 = new kjb("Measurement", 2);
        c = kjbVar3;
        kjb kjbVar4 = new kjb("Placement", 3);
        d = kjbVar4;
        e = new kjb[]{kjbVar, kjbVar2, kjbVar3, kjbVar4};
    }

    public static kjb valueOf(String str) {
        return (kjb) Enum.valueOf(kjb.class, str);
    }

    public static kjb[] values() {
        return (kjb[]) e.clone();
    }
}
