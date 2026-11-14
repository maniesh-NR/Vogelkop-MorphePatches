package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nrc {
    public static final nrc a;
    public static final nrc b;
    public static final nrc c;
    public static final /* synthetic */ nrc[] d;

    static {
        nrc nrcVar = new nrc("LOADING", 0);
        a = nrcVar;
        nrc nrcVar2 = new nrc("LIVESCORE", 1);
        b = nrcVar2;
        nrc nrcVar3 = new nrc("ERROR", 2);
        c = nrcVar3;
        d = new nrc[]{nrcVar, nrcVar2, nrcVar3};
    }

    public static nrc valueOf(String str) {
        return (nrc) Enum.valueOf(nrc.class, str);
    }

    public static nrc[] values() {
        return (nrc[]) d.clone();
    }
}
