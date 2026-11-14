package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w2e extends zfh {
    public final /* synthetic */ byte c;
    public final String d;
    public final /* synthetic */ n1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2e(n1 n1Var, String str, Function1 function1, byte b) {
        super(function1);
        this.c = b;
        this.e = n1Var;
        this.d = str;
    }

    @Override // defpackage.cg8
    public final igh f(Function1 function1) {
        byte b = this.c;
        rr1 rr1Var = this.e;
        switch (b) {
            case 0:
                return ((va1) ((n1) rr1Var).b).m(312271382, "SELECT missions.id, missions.name, missions.description, missions.variant, missions.reward_type, missions.reward_value, missions.periodicity, missions.action_text, missions.action_url, missions.action_target, missions.counter_count, missions.counter_limit, missions.counter_step, missions.counter_updated_at, missions.counter_synced_at, missions.counter_synced_count, missions.sort_order, missions.icon_url, missions.status, missions.extra, missions.boost, missions.boost_active, missions.can_be_boosted, missions.info, missions.rewards, missions.type FROM missions WHERE id = ? LIMIT 1", function1, 1, new rkc(this, (byte) 19));
            case 1:
                return ((va1) ((n1) rr1Var).b).m(null, "SELECT missions.id, missions.name, missions.description, missions.variant, missions.reward_type, missions.reward_value, missions.periodicity, missions.action_text, missions.action_url, missions.action_target, missions.counter_count, missions.counter_limit, missions.counter_step, missions.counter_updated_at, missions.counter_synced_at, missions.counter_synced_count, missions.sort_order, missions.icon_url, missions.status, missions.extra, missions.boost, missions.boost_active, missions.can_be_boosted, missions.info, missions.rewards, missions.type FROM missions WHERE type = ? ORDER BY sort_order", function1, 1, new rkc(this, (byte) 20));
            default:
                return ((va1) ((n1) rr1Var).b).m(98308010, "SELECT items.id, items.product_id, items.price_type, items.price_value, items.state, items.offer_hash, items.sort_order, items.extra, items.title, items.icon_url FROM items\nWHERE\n  product_id = ?\nORDER BY sort_order", function1, 1, new nna(this, (byte) 10));
        }
    }

    @Override // defpackage.zfh
    public final void h(pd9 pd9Var) {
        byte b = this.c;
        rr1 rr1Var = this.e;
        switch (b) {
            case 0:
                ((va1) ((n1) rr1Var).b).h(new String[]{"missions"}, pd9Var);
                break;
            case 1:
                ((va1) ((n1) rr1Var).b).h(new String[]{"missions"}, pd9Var);
                break;
            default:
                ((va1) ((n1) rr1Var).b).h(new String[]{"items"}, pd9Var);
                break;
        }
    }

    @Override // defpackage.zfh
    public final void i(pd9 pd9Var) {
        byte b = this.c;
        rr1 rr1Var = this.e;
        switch (b) {
            case 0:
                ((va1) ((n1) rr1Var).b).p(new String[]{"missions"}, pd9Var);
                break;
            case 1:
                ((va1) ((n1) rr1Var).b).p(new String[]{"missions"}, pd9Var);
                break;
            default:
                ((va1) ((n1) rr1Var).b).p(new String[]{"items"}, pd9Var);
                break;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "Missions.sq:selectById";
            case 1:
                return "Missions.sq:selectByType";
            default:
                return "Items.sq:selectAll";
        }
    }
}
