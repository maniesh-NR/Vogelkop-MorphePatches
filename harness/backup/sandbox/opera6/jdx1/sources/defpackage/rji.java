package defpackage;

/* loaded from: classes.dex */
public final class rji implements dth {
    public c67 a;
    public vji b;
    public String c;
    public Object d;
    public Object[] e;
    public p8f f;
    public final j3i g = new j3i(this, (byte) 5);

    public rji(c67 c67Var, vji vjiVar, String str, Object obj, Object[] objArr) {
        this.a = c67Var;
        this.b = vjiVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.dth
    public final void a() {
        d();
    }

    @Override // defpackage.dth
    public final void b() {
        p8f p8fVar = this.f;
        if (p8fVar != null) {
            p8fVar.K();
        }
    }

    @Override // defpackage.dth
    public final void c() {
        p8f p8fVar = this.f;
        if (p8fVar != null) {
            p8fVar.K();
        }
    }

    public final void d() {
        String strK;
        vji vjiVar = this.b;
        p8f p8fVar = this.f;
        if (p8fVar != null) {
            j9h.t(p8fVar, ") is not null", "entry(");
            return;
        }
        if (vjiVar != null) {
            j3i j3iVar = this.g;
            Object objInvoke = j3iVar.invoke();
            if (objInvoke == null || vjiVar.c(objInvoke)) {
                this.f = vjiVar.a(this.c, j3iVar);
                return;
            }
            if (objInvoke instanceof guj) {
                guj gujVar = (guj) objInvoke;
                if (gujVar.e() == qs7.g || gujVar.e() == zpa.k || gujVar.e() == ujp.n) {
                    strK = "MutableState containing " + gujVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strK = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strK = w1h.k(objInvoke);
            }
            throw new IllegalArgumentException(strK);
        }
    }
}
