package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i3c {
    public static final i3c a;
    public static final i3c b;
    public static final i3c c;
    public static final i3c d;
    public static final i3c e;
    public static final /* synthetic */ i3c[] f;

    static {
        i3c i3cVar = new i3c("Measuring", 0);
        a = i3cVar;
        i3c i3cVar2 = new i3c("LookaheadMeasuring", 1);
        b = i3cVar2;
        i3c i3cVar3 = new i3c("LayingOut", 2);
        c = i3cVar3;
        i3c i3cVar4 = new i3c("LookaheadLayingOut", 3);
        d = i3cVar4;
        i3c i3cVar5 = new i3c("Idle", 4);
        e = i3cVar5;
        f = new i3c[]{i3cVar, i3cVar2, i3cVar3, i3cVar4, i3cVar5};
    }

    public static i3c valueOf(String str) {
        return (i3c) Enum.valueOf(i3c.class, str);
    }

    public static i3c[] values() {
        return (i3c[]) f.clone();
    }
}
