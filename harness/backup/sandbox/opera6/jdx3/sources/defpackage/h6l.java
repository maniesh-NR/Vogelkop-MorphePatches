package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h6l {
    public static final h6l a;
    public static final h6l b;
    public static final h6l c;
    public static final h6l d;
    public static final h6l e;
    public static final h6l f;
    public static final /* synthetic */ h6l[] g;

    static {
        h6l h6lVar = new h6l("SESSION_RESTORE", 0);
        a = h6lVar;
        h6l h6lVar2 = new h6l("UNDO", 1);
        b = h6lVar2;
        h6l h6lVar3 = new h6l("REORDERING", 2);
        c = h6lVar3;
        h6l h6lVar4 = new h6l("GROUP_CHANGE", 3);
        d = h6lVar4;
        h6l h6lVar5 = new h6l("VOLUME", 4);
        e = h6lVar5;
        h6l h6lVar6 = new h6l("CLONE_GROUP", 5);
        h6l h6lVar7 = new h6l("CLOSING_MANY", 6);
        f = h6lVar7;
        g = new h6l[]{h6lVar, h6lVar2, h6lVar3, h6lVar4, h6lVar5, h6lVar6, h6lVar7, new h6l("MANAGE_TABS_ACTIONS", 7)};
    }

    public static h6l valueOf(String str) {
        return (h6l) Enum.valueOf(h6l.class, str);
    }

    public static h6l[] values() {
        return (h6l[]) g.clone();
    }
}
