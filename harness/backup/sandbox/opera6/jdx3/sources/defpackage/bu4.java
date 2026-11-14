package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bu4 extends j0i implements Function2 {
    public int u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ CharSequence x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu4(CharSequence charSequence, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = charSequence;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        bu4 bu4Var = new bu4(this.x, mt5Var);
        bu4Var.w = obj;
        return bu4Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        Pair pair;
        Pair pair2;
        l1j l1jVar = (l1j) this.w;
        px5 px5Var = px5.a;
        boolean z = this.v;
        if (!z) {
            ybh.y(obj);
            i = 0;
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.u;
            ybh.y(obj);
            i = i2 + 1;
        }
        CharSequence charSequence = this.x;
        if (i >= charSequence.length()) {
            return Unit.a;
        }
        char cCharAt = charSequence.charAt(i);
        char c = cCharAt;
        if (!Character.isHighSurrogate(c) || i >= charSequence.length() - 1) {
            pair = new Pair(new Integer(i), new Integer(cCharAt));
        } else {
            int i3 = i + 1;
            char cCharAt2 = charSequence.charAt(i3);
            if (Character.isLowSurrogate(cCharAt2)) {
                pair2 = new Pair(new Integer(i), new Integer(Character.toCodePoint(c, cCharAt2)));
                i = i3;
                this.w = l1jVar;
                this.u = i;
                this.v = true;
                l1jVar.a(this, pair2);
                return px5Var;
            }
            pair = new Pair(new Integer(i), new Integer(cCharAt));
        }
        pair2 = pair;
        this.w = l1jVar;
        this.u = i;
        this.v = true;
        l1jVar.a(this, pair2);
        return px5Var;
    }
}
