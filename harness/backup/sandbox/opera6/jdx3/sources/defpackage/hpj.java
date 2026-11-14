package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hpj {
    public static final hpj a;
    public static final hpj b;
    public static final hpj c;
    public static final hpj d;
    public static final /* synthetic */ hpj[] e;

    static {
        hpj hpjVar = new hpj("COMPACT", 0);
        a = hpjVar;
        hpj hpjVar2 = new hpj("MEDIUM", 1);
        b = hpjVar2;
        hpj hpjVar3 = new hpj("EXPANDED", 2);
        c = hpjVar3;
        hpj hpjVar4 = new hpj("LARGE", 3);
        d = hpjVar4;
        e = new hpj[]{hpjVar, hpjVar2, hpjVar3, hpjVar4};
    }

    public static hpj valueOf(String str) {
        return (hpj) Enum.valueOf(hpj.class, str);
    }

    public static hpj[] values() {
        return (hpj[]) e.clone();
    }
}
