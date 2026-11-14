package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kla {
    public static final kla a;
    public static final /* synthetic */ kla[] b;

    /* JADX INFO: Fake field, exist only in values array */
    kla EF0;

    static {
        kla klaVar = new kla("UNDEFINED", 0);
        kla klaVar2 = new kla("OFA", 1);
        a = klaVar2;
        b = new kla[]{klaVar, klaVar2, new kla("OFI", 2), new kla("MINI", 3)};
    }

    public static kla valueOf(String str) {
        return (kla) Enum.valueOf(kla.class, str);
    }

    public static kla[] values() {
        return (kla[]) b.clone();
    }
}
