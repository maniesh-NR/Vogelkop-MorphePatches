package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kcn {
    public static final /* synthetic */ kcn[] a = {new kcn("REMINDER", 0), new kcn("PAUSED", 1), new kcn("CANCELED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    kcn EF5;

    public static kcn valueOf(String str) {
        return (kcn) Enum.valueOf(kcn.class, str);
    }

    public static kcn[] values() {
        return (kcn[]) a.clone();
    }
}
