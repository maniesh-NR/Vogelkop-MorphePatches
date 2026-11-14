package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b5h {
    public static final b5h a;
    public static final b5h b;
    public static final b5h c;
    public static final /* synthetic */ b5h[] d;

    static {
        b5h b5hVar = new b5h("PASS_THROUGH", 0);
        a = b5hVar;
        b5h b5hVar2 = new b5h("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = b5hVar2;
        b5h b5hVar3 = new b5h("DISCARDING", 2);
        c = b5hVar3;
        d = new b5h[]{b5hVar, b5hVar2, b5hVar3};
    }

    public static b5h valueOf(String str) {
        return (b5h) Enum.valueOf(b5h.class, str);
    }

    public static b5h[] values() {
        return (b5h[]) d.clone();
    }
}
