package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lom {
    public static final lom a;
    public static final lom b;
    public static final lom c;
    public static final lom d;
    public static final /* synthetic */ lom[] e;

    static {
        lom lomVar = new lom("UP_TO_DATE", 0);
        a = lomVar;
        lom lomVar2 = new lom("UPDATE_AVAILABLE", 1);
        b = lomVar2;
        lom lomVar3 = new lom("INSTALL_DOWNLOADING", 2);
        c = lomVar3;
        lom lomVar4 = new lom("INSTALL_AVAILABLE", 3);
        d = lomVar4;
        e = new lom[]{lomVar, lomVar2, lomVar3, lomVar4};
    }

    public static lom valueOf(String str) {
        return (lom) Enum.valueOf(lom.class, str);
    }

    public static lom[] values() {
        return (lom[]) e.clone();
    }
}
