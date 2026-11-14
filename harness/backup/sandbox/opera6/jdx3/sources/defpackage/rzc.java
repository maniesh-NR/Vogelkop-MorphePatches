package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rzc {
    public static final rzc a;
    public static final rzc b;
    public static final rzc c;
    public static final rzc d;
    public static final /* synthetic */ rzc[] e;

    static {
        rzc rzcVar = new rzc("NONE", 0);
        a = rzcVar;
        rzc rzcVar2 = new rzc("CONSTRAINT_VIOLATION", 1);
        b = rzcVar2;
        rzc rzcVar3 = new rzc("ENCRYPTION_SERVICE_VIOLATION", 2);
        c = rzcVar3;
        rzc rzcVar4 = new rzc("DB_ERROR", 3);
        d = rzcVar4;
        e = new rzc[]{rzcVar, rzcVar2, rzcVar3, rzcVar4};
    }

    public static rzc valueOf(String str) {
        return (rzc) Enum.valueOf(rzc.class, str);
    }

    public static rzc[] values() {
        return (rzc[]) e.clone();
    }
}
