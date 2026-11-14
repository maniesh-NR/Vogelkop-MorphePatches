package defpackage;

/* loaded from: classes.dex */
public final class s8a implements p4l {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.p4l
    public final void a(m4l m4lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((v8a) obj).a();
                break;
            default:
                ((z5l) obj).a();
                break;
        }
    }

    @Override // defpackage.p4l
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((v8a) obj).a();
                break;
            default:
                ((z5l) obj).a();
                break;
        }
    }
}
