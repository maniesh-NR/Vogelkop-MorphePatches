package defpackage;

/* loaded from: classes.dex */
public final class prb extends pqb {
    public final hgc a;

    public prb() {
        au9 au9Var = hgc.i;
        this.a = new hgc(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof prb) && ((prb) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void o(String str, pqb pqbVar) {
        if (pqbVar == null) {
            pqbVar = mrb.a;
        }
        this.a.put(str, pqbVar);
    }

    public final void p(Number number, String str) {
        o(str, new zrb(number));
    }

    public final void q(String str, Boolean bool) {
        o(str, bool == null ? mrb.a : new zrb(bool));
    }

    public final void r(String str, String str2) {
        o(str, str2 == null ? mrb.a : new zrb(str2));
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final prb b() {
        prb prbVar = new prb();
        egc it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ggc ggcVarA = it.a();
            prbVar.o((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).b());
        }
        return prbVar;
    }

    public final fgc t() {
        return this.a.entrySet();
    }

    public final pqb u(String str) {
        return (pqb) this.a.get(str);
    }

    public final wpb v(String str) {
        return (wpb) this.a.get(str);
    }

    public final prb w(String str) {
        return (prb) this.a.get(str);
    }

    public final boolean x() {
        return this.a.containsKey("ping_strategy");
    }
}
