package defpackage;

/* loaded from: classes.dex */
public final class g3f extends sc {
    public final /* synthetic */ byte d = 0;
    public final w6f e;

    public g3f(i3j i3jVar, kze kzeVar, pc pcVar, hd hdVar, p1f p1fVar) {
        super(i3jVar, pcVar, hdVar);
        this.e = p1fVar;
        a26.V(p1fVar, kzeVar, new f3f(this));
    }

    public g3f(pjn pjnVar, kze kzeVar, pc pcVar, hd hdVar, k6l k6lVar) {
        super(pjnVar, pcVar, hdVar);
        this.e = k6lVar;
        a26.V(k6lVar, kzeVar, new w3l(this));
    }

    @Override // defpackage.sc
    public final rc i(jf jfVar) {
        byte b = this.d;
        w6f w6fVar = this.e;
        switch (b) {
            case 0:
                return new rc((pc) this.b, jfVar, ((p1f) w6fVar).a());
            default:
                k6l k6lVar = (k6l) w6fVar;
                b2l b2lVar = k6lVar.o;
                return new v3l((pc) this.b, jfVar, k6lVar.s(b2lVar != null ? b2lVar.T() : p6l.a));
        }
    }
}
