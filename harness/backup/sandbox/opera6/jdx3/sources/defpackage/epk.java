package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class epk implements urg, jr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ipk b;

    public /* synthetic */ epk(ipk ipkVar, byte b) {
        this.a = b;
        this.b = ipkVar;
    }

    public final Object apply(Object obj) {
        return dbh.t(((pne) this.b.g.get()).a, (String) obj);
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        byte b = this.a;
        ipk ipkVar = this.b;
        switch (b) {
            case 1:
                String str = ((jn7) obj).b;
                if (!ipkVar.T(str) && !ipkVar.V(str)) {
                    break;
                }
                break;
            case 2:
            default:
                n8f n8fVar = (n8f) obj;
                if (ipkVar.T(n8fVar.b) || ipkVar.U(n8fVar.b)) {
                    break;
                }
                break;
            case 3:
                String str2 = ((rca) obj).a;
                if (ipkVar.T(str2) || ipkVar.V(str2) || ipkVar.U(str2)) {
                    break;
                }
                break;
        }
        return false;
    }
}
