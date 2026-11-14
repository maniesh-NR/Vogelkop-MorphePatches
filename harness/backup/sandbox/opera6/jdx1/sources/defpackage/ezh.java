package defpackage;

/* loaded from: classes.dex */
public final class ezh extends y3d {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezh(byte b, int i) {
        super(i);
        this.a = b;
    }

    @Override // defpackage.y3d
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 1:
                break;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                break;
        }
    }

    @Override // defpackage.y3d
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return ((xhp) obj2).a();
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
