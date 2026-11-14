package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ntb {
    public static final /* synthetic */ ntb[] a = {new ntb("Verbose", 0), new ntb("Debug", 1), new ntb("Info", 2), new ntb("Warn", 3), new ntb("Error", 4), new ntb("Assert", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    ntb EF5;

    public static ntb valueOf(String str) {
        return (ntb) Enum.valueOf(ntb.class, str);
    }

    public static ntb[] values() {
        return (ntb[]) a.clone();
    }
}
