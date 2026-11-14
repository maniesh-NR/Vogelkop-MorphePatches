package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zlg {
    public static final zlg a;
    public static final zlg b;
    public static final zlg c;
    public static final zlg d;
    public static final zlg e;
    public static final /* synthetic */ zlg[] f;

    static {
        zlg zlgVar = new zlg("PAUSE", 0);
        a = zlgVar;
        zlg zlgVar2 = new zlg("PLAY", 1);
        b = zlgVar2;
        zlg zlgVar3 = new zlg("NEXT", 2);
        c = zlgVar3;
        zlg zlgVar4 = new zlg("PREVIOUS", 3);
        d = zlgVar4;
        zlg zlgVar5 = new zlg("SPEED", 4);
        zlg zlgVar6 = new zlg("CLOSE", 5);
        e = zlgVar6;
        f = new zlg[]{zlgVar, zlgVar2, zlgVar3, zlgVar4, zlgVar5, zlgVar6};
    }

    public static zlg valueOf(String str) {
        return (zlg) Enum.valueOf(zlg.class, str);
    }

    public static zlg[] values() {
        return (zlg[]) f.clone();
    }
}
