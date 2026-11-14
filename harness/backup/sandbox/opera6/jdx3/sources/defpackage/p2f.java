package defpackage;

/* loaded from: classes.dex */
public final class p2f extends ua7 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ q2f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2f(q2f q2fVar, byte b) {
        super((byte) 21);
        this.e = b;
        this.f = q2fVar;
    }

    @Override // defpackage.ua7
    public final Object y(g3d g3dVar) {
        byte b = this.e;
        q2f q2fVar = this.f;
        switch (b) {
            case 0:
                return Integer.valueOf(q2fVar.l);
            default:
                return Integer.valueOf(q2fVar.k);
        }
    }
}
