package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yim {
    public static final yim a;
    public static final yim b;
    public static final yim c;
    public static final yim d;
    public static final yim e;
    public static final /* synthetic */ yim[] f;

    static {
        yim yimVar = new yim("NONE", 0);
        a = yimVar;
        yim yimVar2 = new yim("SHOWN", 1);
        b = yimVar2;
        yim yimVar3 = new yim("DID_NOT_SHOW", 2);
        c = yimVar3;
        yim yimVar4 = new yim("USER_SKIPPED", 3);
        d = yimVar4;
        yim yimVar5 = new yim("TIMED_OUT", 4);
        e = yimVar5;
        f = new yim[]{yimVar, yimVar2, yimVar3, yimVar4, yimVar5};
    }

    public static yim valueOf(String str) {
        return (yim) Enum.valueOf(yim.class, str);
    }

    public static yim[] values() {
        return (yim[]) f.clone();
    }
}
