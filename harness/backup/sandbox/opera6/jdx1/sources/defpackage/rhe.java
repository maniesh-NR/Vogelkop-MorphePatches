package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rhe {
    public static final rhe a;
    public static final rhe b;
    public static final rhe c;
    public static final /* synthetic */ rhe[] d;

    static {
        rhe rheVar = new rhe("NATIVE", 0);
        a = rheVar;
        rhe rheVar2 = new rhe("CUSTOM_NATIVE", 1);
        b = rheVar2;
        rhe rheVar3 = new rhe("BANNER", 2);
        c = rheVar3;
        d = new rhe[]{rheVar, rheVar2, rheVar3};
    }

    public static rhe[] values() {
        return (rhe[]) d.clone();
    }
}
