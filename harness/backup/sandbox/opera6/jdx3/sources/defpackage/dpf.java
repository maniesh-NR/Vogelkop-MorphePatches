package defpackage;

/* loaded from: classes.dex */
public final class dpf {
    public final ipf a;

    public dpf(ipf ipfVar) {
        this.a = ipfVar;
    }

    public final void a(hpf hpfVar) {
        ipf ipfVar = this.a;
        if (ipfVar != null) {
            if (ipfVar instanceof epf) {
                hpfVar.n((epf) ipfVar);
                return;
            }
            if (ipfVar instanceof gpf) {
                hpfVar.r((gpf) ipfVar);
                return;
            } else if (ipfVar instanceof cpf) {
                hpfVar.h((cpf) ipfVar);
                return;
            } else if (ipfVar instanceof fpf) {
                hpfVar.I((fpf) ipfVar);
                return;
            }
        }
        h9o.p();
    }
}
