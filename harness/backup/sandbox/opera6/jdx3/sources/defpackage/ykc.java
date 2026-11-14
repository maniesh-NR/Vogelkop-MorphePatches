package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ykc {
    public static final /* synthetic */ ykc[] b;
    public static final /* synthetic */ h58 c;
    public final int a;

    static {
        ykc[] ykcVarArr = {new ykc("SCHEDULED_MATCH", 0, 2131558971), new ykc("LIVE_MATCH", 1, 2131558967), new ykc("FINISHED_MATCH", 2, 2131558965), new ykc("CANCELLED_MATCH", 3, 2131558964), new ykc("INTERRUPTED_MATCH", 4, 2131558966)};
        b = ykcVarArr;
        c = new h58(ykcVarArr);
    }

    public ykc(String str, int i, int i2) {
        this.a = i2;
    }

    public static ykc valueOf(String str) {
        return (ykc) Enum.valueOf(ykc.class, str);
    }

    public static ykc[] values() {
        return (ykc[]) b.clone();
    }
}
