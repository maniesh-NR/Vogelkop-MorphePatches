package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mjb {
    public static final mjb a;
    public static final mjb b;
    public static final mjb c;
    public static final mjb d;
    public static final /* synthetic */ mjb[] e;

    static {
        mjb mjbVar = new mjb("IGNORED", 0);
        a = mjbVar;
        mjb mjbVar2 = new mjb("SCHEDULED", 1);
        b = mjbVar2;
        mjb mjbVar3 = new mjb("DEFERRED", 2);
        c = mjbVar3;
        mjb mjbVar4 = new mjb("IMMINENT", 3);
        d = mjbVar4;
        e = new mjb[]{mjbVar, mjbVar2, mjbVar3, mjbVar4};
    }

    public static mjb valueOf(String str) {
        return (mjb) Enum.valueOf(mjb.class, str);
    }

    public static mjb[] values() {
        return (mjb[]) e.clone();
    }
}
