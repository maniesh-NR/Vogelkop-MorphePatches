package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rlb extends zfh {
    public final String c;
    public final String d;
    public final /* synthetic */ rr1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlb(rr1 rr1Var, String str, String str2, gbb gbbVar) {
        super(gbbVar);
        this.e = rr1Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.cg8
    public final igh f(Function1 function1) {
        return ((va1) ((n1) this.e).b).m(98321519, "SELECT items.id, items.product_id, items.price_type, items.price_value, items.state, items.offer_hash, items.sort_order, items.extra, items.title, items.icon_url FROM items\nWHERE\n  product_id = ?\nAND\n  id = ?", function1, 2, new nna(this, (byte) 11));
    }

    @Override // defpackage.zfh
    public final void h(pd9 pd9Var) {
        ((va1) ((n1) this.e).b).h(new String[]{"items"}, pd9Var);
    }

    @Override // defpackage.zfh
    public final void i(pd9 pd9Var) {
        ((va1) ((n1) this.e).b).p(new String[]{"items"}, pd9Var);
    }

    public final String toString() {
        return "Items.sq:selectOne";
    }
}
