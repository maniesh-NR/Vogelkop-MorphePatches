package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fri {
    public static final fri a;
    public static final fri b;
    public static final fri c;
    public static final fri d;
    public static final /* synthetic */ fri[] e;

    static {
        fri friVar = new fri("PLAIN", 0);
        a = friVar;
        fri friVar2 = new fri("FOREGROUND_TINT", 1);
        b = friVar2;
        fri friVar3 = new fri("CIRCLE_BACKGROUND", 2);
        c = friVar3;
        fri friVar4 = new fri("CIRCLE_BACKGROUND_WITH_TINTED_ICON", 3);
        d = friVar4;
        e = new fri[]{friVar, friVar2, friVar3, friVar4};
    }

    public static fri valueOf(String str) {
        return (fri) Enum.valueOf(fri.class, str);
    }

    public static fri[] values() {
        return (fri[]) e.clone();
    }
}
