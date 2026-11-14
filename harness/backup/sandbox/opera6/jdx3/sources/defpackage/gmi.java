package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gmi {
    public static final gmi a;
    public static final gmi b;
    public static final /* synthetic */ gmi[] c;
    public static final /* synthetic */ h58 d;

    static {
        gmi gmiVar = new gmi("QR_CODE", 0);
        a = gmiVar;
        gmi gmiVar2 = new gmi("OTHER", 1);
        b = gmiVar2;
        gmi[] gmiVarArr = {gmiVar, gmiVar2};
        c = gmiVarArr;
        d = new h58(gmiVarArr);
    }

    public static gmi valueOf(String str) {
        return (gmi) Enum.valueOf(gmi.class, str);
    }

    public static gmi[] values() {
        return (gmi[]) c.clone();
    }
}
