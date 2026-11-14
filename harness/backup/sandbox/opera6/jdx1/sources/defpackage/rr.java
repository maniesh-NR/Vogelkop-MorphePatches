package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rr {
    public static final rr a;
    public static final rr b;
    public static final rr c;
    public static final rr d;
    public static final rr e;
    public static final /* synthetic */ rr[] f;

    static {
        rr rrVar = new rr("NOT_STARTED", 0);
        a = rrVar;
        rr rrVar2 = new rr("INITIALIZING", 1);
        b = rrVar2;
        rr rrVar3 = new rr("COMPLETE", 2);
        c = rrVar3;
        rr rrVar4 = new rr("TIMED_OUT", 3);
        d = rrVar4;
        rr rrVar5 = new rr("FAILED", 4);
        e = rrVar5;
        f = new rr[]{rrVar, rrVar2, rrVar3, rrVar4, rrVar5};
    }

    public static rr[] values() {
        return (rr[]) f.clone();
    }
}
