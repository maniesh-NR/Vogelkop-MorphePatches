package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eol {
    public static final eol a;
    public static final eol b;
    public static final eol c;
    public static final /* synthetic */ eol[] d;

    static {
        eol eolVar = new eol("CAPTURE", 0);
        a = eolVar;
        eol eolVar2 = new eol("MEDIUM", 1);
        b = eolVar2;
        eol eolVar3 = new eol("MINI", 2);
        c = eolVar3;
        d = new eol[]{eolVar, eolVar2, eolVar3};
    }

    public static eol valueOf(String str) {
        return (eol) Enum.valueOf(eol.class, str);
    }

    public static eol[] values() {
        return (eol[]) d.clone();
    }
}
