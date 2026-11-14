package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class utn {
    public static final utn a;
    public static final utn b;
    public static final utn c;
    public static final /* synthetic */ utn[] d;

    static {
        utn utnVar = new utn("SECTION", 0);
        a = utnVar;
        utn utnVar2 = new utn("GROUP", 1);
        b = utnVar2;
        utn utnVar3 = new utn("ITEM", 2);
        c = utnVar3;
        d = new utn[]{utnVar, utnVar2, utnVar3};
    }

    public static utn valueOf(String str) {
        return (utn) Enum.valueOf(utn.class, str);
    }

    public static utn[] values() {
        return (utn[]) d.clone();
    }
}
