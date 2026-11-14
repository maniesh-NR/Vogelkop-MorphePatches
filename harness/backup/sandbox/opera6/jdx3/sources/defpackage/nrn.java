package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nrn {
    public static final nrn a;
    public static final nrn b;
    public static final nrn c;
    public static final nrn d;
    public static final /* synthetic */ nrn[] e;

    static {
        nrn nrnVar = new nrn("CHAT", 0);
        a = nrnVar;
        nrn nrnVar2 = new nrn("NEEDS_UPDATE", 1);
        b = nrnVar2;
        nrn nrnVar3 = new nrn("LOADING", 2);
        c = nrnVar3;
        nrn nrnVar4 = new nrn("ERROR", 3);
        d = nrnVar4;
        e = new nrn[]{nrnVar, nrnVar2, nrnVar3, nrnVar4};
    }

    public static nrn valueOf(String str) {
        return (nrn) Enum.valueOf(nrn.class, str);
    }

    public static nrn[] values() {
        return (nrn[]) e.clone();
    }
}
