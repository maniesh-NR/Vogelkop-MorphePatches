package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hri {
    public static final hri a;
    public static final hri b;
    public static final hri c;
    public static final /* synthetic */ hri[] d;
    public static final /* synthetic */ h58 e;

    static {
        hri hriVar = new hri("ACTIVE_SEARCH_ENGINE", 0);
        a = hriVar;
        hri hriVar2 = new hri("ARIA_SEARCH_ENGINE", 1);
        b = hriVar2;
        hri hriVar3 = new hri("DEFAULT_SEARCH_ENGINE", 2);
        c = hriVar3;
        hri[] hriVarArr = {hriVar, hriVar2, hriVar3};
        d = hriVarArr;
        e = new h58(hriVarArr);
    }

    public static hri valueOf(String str) {
        return (hri) Enum.valueOf(hri.class, str);
    }

    public static hri[] values() {
        return (hri[]) d.clone();
    }
}
