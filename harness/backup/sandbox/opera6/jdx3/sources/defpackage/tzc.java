package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tzc {
    public static final /* synthetic */ tzc[] b;
    public static final /* synthetic */ h58 c;
    public final String a;

    static {
        tzc[] tzcVarArr = {new tzc("PARENT_ID", 0, "parent_id"), new tzc("INSECURITY_TYPE", 1, "insecurity_type"), new tzc("CREATE_TIME", 2, "create_time"), new tzc("IS_MUTED", 3, "is_muted"), new tzc("TRIGGER_NOTIFICATION_FROM_BACKEND", 4, "trigger_notification_from_backend")};
        b = tzcVarArr;
        c = new h58(tzcVarArr);
    }

    public tzc(String str, int i, String str2) {
        this.a = str2;
    }

    public static tzc valueOf(String str) {
        return (tzc) Enum.valueOf(tzc.class, str);
    }

    public static tzc[] values() {
        return (tzc[]) b.clone();
    }
}
