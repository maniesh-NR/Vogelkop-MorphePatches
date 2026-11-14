package defpackage;

/* loaded from: classes.dex */
public final class tkh extends a08 {
    public final /* synthetic */ p8f a;

    public tkh(p8f p8fVar) {
        this.a = p8fVar;
    }

    @Override // defpackage.a08, defpackage.r82
    public final void b(boolean z, boolean z2) {
        ukh ukhVar;
        ukh ukhVar2;
        p8f p8fVar = this.a;
        if (z2) {
            ukhVar = new ukh(z2, z, true, (byte) 0);
            p8fVar.c = ukhVar;
        } else {
            ukhVar = ukh.f;
            p8fVar.c = ukhVar;
        }
        if (!ukhVar.b && (ukhVar2 = (ukh) p8fVar.d) != ukh.e) {
            ukhVar = ukhVar2;
        }
        i7f i7fVar = (i7f) p8fVar.b;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((sbf) g7fVarC.next()).a(ukhVar);
        }
    }

    @Override // defpackage.r82
    public final void e() {
        p8f p8fVar = this.a;
        ukh ukhVar = ukh.f;
        p8fVar.c = ukhVar;
        ukh ukhVar2 = (ukh) p8fVar.d;
        if (ukhVar2 != ukh.e) {
            ukhVar = ukhVar2;
        }
        i7f i7fVar = (i7f) p8fVar.b;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((sbf) g7fVarC.next()).a(ukhVar);
        }
    }
}
