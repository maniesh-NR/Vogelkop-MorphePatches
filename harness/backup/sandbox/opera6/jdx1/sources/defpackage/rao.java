package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public final class rao extends j0i implements Function2 {
    public int u;
    public int v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ax7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rao(ax7 ax7Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = ax7Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        rao raoVar = new rao(this.y, mt5Var);
        raoVar.x = obj;
        return raoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int length;
        int i;
        Node node = (Node) ((i4d) this.y).b;
        l1j l1jVar = (l1j) this.x;
        px5 px5Var = px5.a;
        boolean z = this.w;
        if (!z) {
            ybh.y(obj);
            length = node.getChildNodes().getLength();
            i = 0;
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.v;
            int i2 = this.u;
            ybh.y(obj);
            i = i2 + 1;
        }
        if (i >= length) {
            return Unit.a;
        }
        node.getChildNodes().getLength();
        Node nodeItem = node.getChildNodes().item(i);
        Object ax7Var = nodeItem instanceof Element ? new ax7((Element) nodeItem) : new i4d(nodeItem, (byte) 7);
        this.x = l1jVar;
        this.u = i;
        this.v = length;
        this.w = true;
        l1jVar.a(this, ax7Var);
        return px5Var;
    }
}
