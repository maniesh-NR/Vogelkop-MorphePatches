package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k3c {
    public static final k3c a;
    public static final k3c b;
    public static final k3c c;
    public static final /* synthetic */ k3c[] d;

    static {
        k3c k3cVar = new k3c("InMeasureBlock", 0);
        a = k3cVar;
        k3c k3cVar2 = new k3c("InLayoutBlock", 1);
        b = k3cVar2;
        k3c k3cVar3 = new k3c("NotUsed", 2);
        c = k3cVar3;
        d = new k3c[]{k3cVar, k3cVar2, k3cVar3};
    }

    public static k3c valueOf(String str) {
        return (k3c) Enum.valueOf(k3c.class, str);
    }

    public static k3c[] values() {
        return (k3c[]) d.clone();
    }
}
