package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u88 {
    public static final /* synthetic */ u88[] a = {new u88("PRODUCTION", 0), new u88("DEV", 1), new u88("STAGING", 2), new u88("CUSTOM", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    u88 EF5;

    public static u88 valueOf(String str) {
        return (u88) Enum.valueOf(u88.class, str);
    }

    public static u88[] values() {
        return (u88[]) a.clone();
    }
}
