package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nsn {
    public static final nsn a;
    public static final nsn b;
    public static final nsn c;
    public static final nsn d;
    public static final nsn e;
    public static final nsn f;
    public static final /* synthetic */ nsn[] g;

    static {
        nsn nsnVar = new nsn("CHAT_LOADING", 0);
        a = nsnVar;
        nsn nsnVar2 = new nsn("CHAT", 1);
        b = nsnVar2;
        nsn nsnVar3 = new nsn("NEW_CHAT", 2);
        c = nsnVar3;
        nsn nsnVar4 = new nsn("NEEDS_UPDATE", 3);
        d = nsnVar4;
        nsn nsnVar5 = new nsn("INITIALIZING", 4);
        e = nsnVar5;
        nsn nsnVar6 = new nsn("ERROR", 5);
        f = nsnVar6;
        g = new nsn[]{nsnVar, nsnVar2, nsnVar3, nsnVar4, nsnVar5, nsnVar6};
    }

    public static nsn valueOf(String str) {
        return (nsn) Enum.valueOf(nsn.class, str);
    }

    public static nsn[] values() {
        return (nsn[]) g.clone();
    }
}
