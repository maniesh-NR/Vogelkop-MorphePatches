package defpackage;

/* loaded from: classes.dex */
public final class zg4 implements hg9 {
    public static final zg4 a = new zg4();
    public static Boolean b;

    @Override // defpackage.hg9
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.hg9
    public final boolean d() throws pxb {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw vep.q("canFocus is read before it is written");
    }
}
