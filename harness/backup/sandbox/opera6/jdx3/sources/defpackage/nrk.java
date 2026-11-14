package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nrk {
    public static final cpj a;
    public static final nrk b;
    public static final /* synthetic */ nrk[] c;
    public static final /* synthetic */ h58 d;

    static {
        nrk nrkVar = new nrk("Production", 0);
        nrk[] nrkVarArr = {nrkVar, new nrk("Staging", 1)};
        c = nrkVarArr;
        d = new h58(nrkVarArr);
        a = new cpj((byte) 3);
        b = nrkVar;
    }

    public static nrk valueOf(String str) {
        return (nrk) Enum.valueOf(nrk.class, str);
    }

    public static nrk[] values() {
        return (nrk[]) c.clone();
    }
}
