package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eya {
    public static final eya b;
    public static final eya c;
    public static final eya d;
    public static final eya e;
    public static final eya f;
    public static final /* synthetic */ eya[] g;
    public static final /* synthetic */ h58 h;
    public final int a;

    static {
        eya eyaVar = new eya("BLUR", 0, 0);
        b = eyaVar;
        eya eyaVar2 = new eya("PATH", 1, 1);
        c = eyaVar2;
        eya eyaVar3 = new eya("TEXT", 2, 2);
        d = eyaVar3;
        eya eyaVar4 = new eya("EMOJI", 3, 2);
        e = eyaVar4;
        eya eyaVar5 = new eya("CUTOUT", 4, Integer.MAX_VALUE);
        f = eyaVar5;
        eya[] eyaVarArr = {eyaVar, eyaVar2, eyaVar3, eyaVar4, eyaVar5};
        g = eyaVarArr;
        h = new h58(eyaVarArr);
    }

    public eya(String str, int i, int i2) {
        this.a = i2;
    }

    public static eya valueOf(String str) {
        return (eya) Enum.valueOf(eya.class, str);
    }

    public static eya[] values() {
        return (eya[]) g.clone();
    }
}
