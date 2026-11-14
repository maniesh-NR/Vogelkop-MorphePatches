package defpackage;

/* loaded from: classes.dex */
public final class rv3 implements w7l {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void c(int i, b8l b8lVar) {
    }

    @Override // defpackage.w7l
    public final void a(int i, dyg dygVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (!(dygVar instanceof s7l)) {
                    ((Runnable) obj).run();
                    break;
                } else {
                    ((Runnable) obj2).run();
                    break;
                }
            default:
                ((w7l) obj2).a(i, dygVar);
                g7f g7fVar = new g7f(((c8l) obj).g);
                while (g7fVar.hasNext()) {
                    ((w7l) g7fVar.next()).a(i, dygVar);
                }
                break;
        }
    }

    @Override // defpackage.w7l
    public final void b(int i, b8l b8lVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((w7l) this.b).b(i, b8lVar);
                g7f g7fVar = new g7f(((c8l) this.c).g);
                while (g7fVar.hasNext()) {
                    ((w7l) g7fVar.next()).b(i, b8lVar);
                }
                break;
        }
    }
}
