package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class peg {
    public static final peg a;
    public static final peg b;
    public static final peg c;
    public static final /* synthetic */ peg[] d;

    static {
        peg pegVar = new peg("NO", 0);
        a = pegVar;
        peg pegVar2 = new peg("ICON", 1);
        b = pegVar2;
        peg pegVar3 = new peg("MENU", 2);
        c = pegVar3;
        d = new peg[]{pegVar, pegVar2, pegVar3};
    }

    public static peg valueOf(String str) {
        return (peg) Enum.valueOf(peg.class, str);
    }

    public static peg[] values() {
        return (peg[]) d.clone();
    }
}
