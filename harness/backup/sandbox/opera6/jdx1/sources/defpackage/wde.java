package defpackage;

/* loaded from: classes.dex */
public final class wde extends y9d implements stb {
    public final bbg d;
    public Object e;

    public wde(bbg bbgVar, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.d = bbgVar;
        this.e = obj2;
    }

    @Override // defpackage.y9d, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.y9d, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        yag yagVar = (yag) this.d.b;
        wag wagVar = yagVar.e;
        Object obj3 = this.b;
        if (!wagVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ((uag) yagVar).c;
        if (!z) {
            wagVar.put(obj3, obj);
        } else {
            if (!z) {
                t3p.y();
                return null;
            }
            v6m v6mVar = ((v6m[]) ((uag) yagVar).d)[((uag) yagVar).b];
            Object obj4 = v6mVar.b[v6mVar.d];
            wagVar.put(obj3, obj);
            yagVar.e(obj4 != null ? obj4.hashCode() : 0, wagVar.c, obj4, 0);
        }
        yagVar.h = wagVar.e;
        return obj2;
    }
}
