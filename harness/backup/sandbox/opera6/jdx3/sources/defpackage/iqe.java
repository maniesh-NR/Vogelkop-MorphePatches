package defpackage;

/* loaded from: classes.dex */
public final class iqe extends a7f {
    public final /* synthetic */ byte c;
    public final /* synthetic */ jqe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqe(jqe jqeVar, byte b) {
        super(0);
        this.c = b;
        switch (b) {
            case 1:
                this.d = jqeVar;
                super(0);
                break;
            case 2:
                this.d = jqeVar;
                super(0);
                break;
            default:
                this.d = jqeVar;
                break;
        }
    }

    @Override // defpackage.a7f
    public final void a(Object obj, Object obj2) {
        byte b = this.c;
        jqe jqeVar = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                jqeVar.invalidateSelf();
                break;
            case 1:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                jqeVar.invalidateSelf();
                break;
            default:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                jqeVar.invalidateSelf();
                break;
        }
    }
}
