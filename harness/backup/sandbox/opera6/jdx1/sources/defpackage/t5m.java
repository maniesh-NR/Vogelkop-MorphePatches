package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t5m {
    public static final t5m a;
    public static final t5m b;
    public static final t5m c;
    public static final /* synthetic */ t5m[] d;

    static {
        t5m t5mVar = new t5m("ContinueTraversal", 0);
        a = t5mVar;
        t5m t5mVar2 = new t5m("SkipSubtreeAndContinueTraversal", 1);
        b = t5mVar2;
        t5m t5mVar3 = new t5m("CancelTraversal", 2);
        c = t5mVar3;
        d = new t5m[]{t5mVar, t5mVar2, t5mVar3};
    }

    public static t5m valueOf(String str) {
        return (t5m) Enum.valueOf(t5m.class, str);
    }

    public static t5m[] values() {
        return (t5m[]) d.clone();
    }
}
