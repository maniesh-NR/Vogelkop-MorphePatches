package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class myg {
    public static final myg a;
    public static final myg b;
    public static final myg c;
    public static final /* synthetic */ myg[] d;

    static {
        myg mygVar = new myg("DEFAULT", 0);
        a = mygVar;
        myg mygVar2 = new myg("VERY_LOW", 1);
        b = mygVar2;
        myg mygVar3 = new myg("HIGHEST", 2);
        c = mygVar3;
        d = new myg[]{mygVar, mygVar2, mygVar3};
    }

    public static myg valueOf(String str) {
        return (myg) Enum.valueOf(myg.class, str);
    }

    public static myg[] values() {
        return (myg[]) d.clone();
    }
}
