package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class she {
    public static final she a;
    public static final she b;
    public static final she c;
    public static final she d;
    public static final she e;
    public static final /* synthetic */ she[] f;

    static {
        she sheVar = new she("UNKNOWN", 0);
        a = sheVar;
        she sheVar2 = new she("ANY", 1);
        b = sheVar2;
        she sheVar3 = new she("LANDSCAPE", 2);
        c = sheVar3;
        she sheVar4 = new she("PORTRAIT", 3);
        d = sheVar4;
        she sheVar5 = new she("SQUARE", 4);
        e = sheVar5;
        f = new she[]{sheVar, sheVar2, sheVar3, sheVar4, sheVar5};
    }

    public static she[] values() {
        return (she[]) f.clone();
    }
}
