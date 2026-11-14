package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pdb {
    public static final pdb a;
    public static final pdb b;
    public static final pdb c;
    public static final /* synthetic */ pdb[] d;

    static {
        pdb pdbVar = new pdb("SWIPE", 0);
        a = pdbVar;
        pdb pdbVar2 = new pdb("X_BUTTON", 1);
        b = pdbVar2;
        pdb pdbVar3 = new pdb("MENU", 2);
        c = pdbVar3;
        d = new pdb[]{pdbVar, pdbVar2, pdbVar3};
    }

    public static pdb valueOf(String str) {
        return (pdb) Enum.valueOf(pdb.class, str);
    }

    public static pdb[] values() {
        return (pdb[]) d.clone();
    }
}
