package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e4b {
    public static final /* synthetic */ e4b[] a = {new e4b("BUILD", 0), new e4b("DIALOG_NOT_SHOWN", 1), new e4b("ALREADY_RATED", 2), new e4b("NOT_ENOUGH_TIME", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    e4b EF5;

    public static e4b valueOf(String str) {
        return (e4b) Enum.valueOf(e4b.class, str);
    }

    public static e4b[] values() {
        return (e4b[]) a.clone();
    }
}
