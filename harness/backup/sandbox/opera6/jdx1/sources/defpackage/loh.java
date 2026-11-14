package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class loh {
    public static final loh a;
    public static final loh b;
    public static final loh c;
    public static final loh d;
    public static final loh e;
    public static final loh f;
    public static final loh g;
    public static final loh h;
    public static final /* synthetic */ loh[] i;

    static {
        loh lohVar = new loh("CONFIGURING", 0);
        a = lohVar;
        loh lohVar2 = new loh("PENDING_RECORDING", 1);
        b = lohVar2;
        loh lohVar3 = new loh("PENDING_PAUSED", 2);
        c = lohVar3;
        loh lohVar4 = new loh("IDLING", 3);
        d = lohVar4;
        loh lohVar5 = new loh("RECORDING", 4);
        e = lohVar5;
        loh lohVar6 = new loh("PAUSED", 5);
        loh lohVar7 = new loh("STOPPING", 6);
        f = lohVar7;
        loh lohVar8 = new loh("RESETTING", 7);
        g = lohVar8;
        loh lohVar9 = new loh("ERROR", 8);
        h = lohVar9;
        i = new loh[]{lohVar, lohVar2, lohVar3, lohVar4, lohVar5, lohVar6, lohVar7, lohVar8, lohVar9};
    }

    public static loh valueOf(String str) {
        return (loh) Enum.valueOf(loh.class, str);
    }

    public static loh[] values() {
        return (loh[]) i.clone();
    }
}
