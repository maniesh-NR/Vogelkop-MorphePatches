package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rjf {
    public static final rjf a;
    public static final rjf b;
    public static final rjf c;
    public static final rjf d;
    public static final rjf e;
    public static final rjf f;
    public static final /* synthetic */ rjf[] g;

    static {
        rjf rjfVar = new rjf("ACTION_BUTTON", 0);
        a = rjfVar;
        rjf rjfVar2 = new rjf("ANCHOR_CLICKED", 1);
        b = rjfVar2;
        rjf rjfVar3 = new rjf("CANCELLED", 2);
        c = rjfVar3;
        rjf rjfVar4 = new rjf("CONTENT_CLICKED", 3);
        d = rjfVar4;
        rjf rjfVar5 = new rjf("CLOSE_BUTTON", 4);
        e = rjfVar5;
        rjf rjfVar6 = new rjf("FAILED_TO_SHOW", 5);
        f = rjfVar6;
        g = new rjf[]{rjfVar, rjfVar2, rjfVar3, rjfVar4, rjfVar5, rjfVar6};
    }

    public static rjf valueOf(String str) {
        return (rjf) Enum.valueOf(rjf.class, str);
    }

    public static rjf[] values() {
        return (rjf[]) g.clone();
    }
}
