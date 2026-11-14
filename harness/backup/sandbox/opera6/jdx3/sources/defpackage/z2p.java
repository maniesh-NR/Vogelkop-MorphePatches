package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z2p {
    public static final z2p a;
    public static final z2p b;
    public static final z2p c;
    public static final /* synthetic */ z2p[] d;

    static {
        z2p z2pVar = new z2p("DOWNLOADED", 0);
        a = z2pVar;
        z2p z2pVar2 = new z2p("ALREADY_DOWNLOADED", 1);
        z2p z2pVar3 = new z2p("UPDATE_SUCCESS", 2);
        b = z2pVar3;
        z2p z2pVar4 = new z2p("UPDATE_FAILED", 3);
        c = z2pVar4;
        d = new z2p[]{z2pVar, z2pVar2, z2pVar3, z2pVar4};
    }

    public static z2p valueOf(String str) {
        return (z2p) Enum.valueOf(z2p.class, str);
    }

    public static z2p[] values() {
        return (z2p[]) d.clone();
    }
}
