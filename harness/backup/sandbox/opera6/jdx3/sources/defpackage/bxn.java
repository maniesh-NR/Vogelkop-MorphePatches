package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bxn {
    public static final bxn a;
    public static final /* synthetic */ bxn[] b;

    /* JADX INFO: Fake field, exist only in values array */
    bxn EF0;

    static {
        bxn bxnVar = new bxn("ASSET_RESOURCES", 0);
        bxn bxnVar2 = new bxn("COMPOSE_RESOURCE_FILES", 1);
        a = bxnVar2;
        b = new bxn[]{bxnVar, bxnVar2};
    }

    public static bxn valueOf(String str) {
        return (bxn) Enum.valueOf(bxn.class, str);
    }

    public static bxn[] values() {
        return (bxn[]) b.clone();
    }
}
