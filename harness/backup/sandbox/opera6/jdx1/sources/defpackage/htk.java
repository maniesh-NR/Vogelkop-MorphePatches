package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class htk {
    public static final htk a;
    public static final htk b;
    public static final htk c;
    public static final htk d;
    public static final htk e;
    public static final /* synthetic */ htk[] f;

    static {
        htk htkVar = new htk("PRIV", 0);
        a = htkVar;
        htk htkVar2 = new htk("YUV", 1);
        b = htkVar2;
        htk htkVar3 = new htk("JPEG", 2);
        c = htkVar3;
        htk htkVar4 = new htk("JPEG_R", 3);
        d = htkVar4;
        htk htkVar5 = new htk("RAW", 4);
        e = htkVar5;
        f = new htk[]{htkVar, htkVar2, htkVar3, htkVar4, htkVar5};
    }

    public static htk valueOf(String str) {
        return (htk) Enum.valueOf(htk.class, str);
    }

    public static htk[] values() {
        return (htk[]) f.clone();
    }
}
