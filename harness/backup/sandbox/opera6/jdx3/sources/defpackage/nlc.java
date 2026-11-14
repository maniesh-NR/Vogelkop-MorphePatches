package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nlc {
    public static final nlc a;
    public static final nlc b;
    public static final nlc c;
    public static final /* synthetic */ nlc[] d;

    static {
        nlc nlcVar = new nlc("ENABLED", 0);
        a = nlcVar;
        nlc nlcVar2 = new nlc("DISABLED", 1);
        b = nlcVar2;
        nlc nlcVar3 = new nlc("LOADING", 2);
        c = nlcVar3;
        d = new nlc[]{nlcVar, nlcVar2, nlcVar3};
    }

    public static nlc valueOf(String str) {
        return (nlc) Enum.valueOf(nlc.class, str);
    }

    public static nlc[] values() {
        return (nlc[]) d.clone();
    }
}
