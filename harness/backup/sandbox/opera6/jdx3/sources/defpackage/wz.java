package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wz {
    public static final wz a;
    public static final wz b;
    public static final wz c;
    public static final wz d;
    public static final /* synthetic */ wz[] e;

    static {
        wz wzVar = new wz("NOT_RELEVANT", 0);
        a = wzVar;
        wz wzVar2 = new wz("NOT_INTERESTED", 1);
        b = wzVar2;
        wz wzVar3 = new wz("TOO_OFTEN", 2);
        c = wzVar3;
        wz wzVar4 = new wz("INAPPROPRIATE", 3);
        d = wzVar4;
        e = new wz[]{wzVar, wzVar2, wzVar3, wzVar4};
    }

    public static wz valueOf(String str) {
        return (wz) Enum.valueOf(wz.class, str);
    }

    public static wz[] values() {
        return (wz[]) e.clone();
    }
}
