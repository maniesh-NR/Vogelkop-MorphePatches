package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class idh {
    public static final idh a;
    public static final idh b;
    public static final /* synthetic */ idh[] c;
    public static final /* synthetic */ h58 d;

    static {
        idh idhVar = new idh("CLICK", 0);
        a = idhVar;
        idh idhVar2 = new idh("IMPRESSION", 1);
        b = idhVar2;
        idh[] idhVarArr = {idhVar, idhVar2};
        c = idhVarArr;
        d = new h58(idhVarArr);
    }

    public static idh valueOf(String str) {
        return (idh) Enum.valueOf(idh.class, str);
    }

    public static idh[] values() {
        return (idh[]) c.clone();
    }
}
