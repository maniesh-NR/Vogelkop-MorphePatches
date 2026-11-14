package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y3g {
    public static final y3g a;
    public static final y3g b;
    public static final /* synthetic */ y3g[] c;
    public static final /* synthetic */ h58 d;

    static {
        y3g y3gVar = new y3g("FORM_SUBMISSION", 0);
        a = y3gVar;
        y3g y3gVar2 = new y3g("GENERATED", 1);
        y3g y3gVar3 = new y3g("API", 2);
        y3g y3gVar4 = new y3g("MANUALLY_ADDED", 3);
        b = y3gVar4;
        y3g[] y3gVarArr = {y3gVar, y3gVar2, y3gVar3, y3gVar4, new y3g("IMPORTED", 4), new y3g("RECEIVED_VIA_SHARING", 5)};
        c = y3gVarArr;
        d = new h58(y3gVarArr);
    }

    public static y3g valueOf(String str) {
        return (y3g) Enum.valueOf(y3g.class, str);
    }

    public static y3g[] values() {
        return (y3g[]) c.clone();
    }
}
