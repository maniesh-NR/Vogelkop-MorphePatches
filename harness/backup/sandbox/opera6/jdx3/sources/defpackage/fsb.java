package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fsb {
    public static final fsb a;
    public static final /* synthetic */ fsb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    fsb EF0;

    static {
        fsb fsbVar = new fsb("PARSE_ERROR", 0);
        fsb fsbVar2 = new fsb("INVALID_REQUEST", 1);
        fsb fsbVar3 = new fsb("METHOD_NOT_FOUND", 2);
        fsb fsbVar4 = new fsb("INVALID_PARAMS", 3);
        fsb fsbVar5 = new fsb("INTERNAL_ERROR", 4);
        fsb fsbVar6 = new fsb("MODULE_ERROR", 5);
        fsb fsbVar7 = new fsb("FAILED_TO_AUTHENTICATE", 6);
        a = fsbVar7;
        b = new fsb[]{fsbVar, fsbVar2, fsbVar3, fsbVar4, fsbVar5, fsbVar6, fsbVar7};
    }

    public static fsb valueOf(String str) {
        return (fsb) Enum.valueOf(fsb.class, str);
    }

    public static fsb[] values() {
        return (fsb[]) b.clone();
    }
}
