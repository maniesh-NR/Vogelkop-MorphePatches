package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fsf {
    public static final fsf a;
    public static final fsf b;
    public static final /* synthetic */ fsf[] c;

    static {
        fsf fsfVar = new fsf("Vertical", 0);
        a = fsfVar;
        fsf fsfVar2 = new fsf("Horizontal", 1);
        b = fsfVar2;
        c = new fsf[]{fsfVar, fsfVar2};
    }

    public static fsf valueOf(String str) {
        return (fsf) Enum.valueOf(fsf.class, str);
    }

    public static fsf[] values() {
        return (fsf[]) c.clone();
    }
}
