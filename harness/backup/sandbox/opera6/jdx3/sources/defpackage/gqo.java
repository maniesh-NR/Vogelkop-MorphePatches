package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class gqo implements n1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gqo(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.n1p
    public final void invoke(Object obj) {
        p7p p7pVar;
        switch (this.a) {
            case 0:
                gep gepVar = (gep) this.b;
                wjh wjhVar = (wjh) this.c;
                Object obj2 = ((t0i) obj).a;
                if (!(obj2 instanceof q0i)) {
                    p0i p0iVar = t0i.b;
                    gepVar.invoke(new t0i((yjo) ((zyk) wjhVar.e).getValue()));
                }
                if (t0i.d(obj2) != null) {
                    gepVar.invoke(new t0i(new q0i(new vjo(9003, (String) null))));
                    break;
                }
                break;
            case 1:
                o7p o7pVar = (o7p) this.b;
                y2p y2pVar = (y2p) this.c;
                Object obj3 = ((t0i) obj).a;
                if (!(obj3 instanceof q0i)) {
                    o7pVar.e = o7pVar.e.g();
                    if (y2pVar.q != null) {
                        qb7.h.f(o7pVar.a).a(new kgo(o7pVar, (byte) 2));
                    }
                }
                if (t0i.d(obj3) != null) {
                    o7pVar.e = o7pVar.e.a();
                    break;
                }
                break;
            default:
                sro sroVar = (sro) this.b;
                o7p o7pVar2 = (o7p) this.c;
                Object obj4 = ((t0i) obj).a;
                if (!(obj4 instanceof q0i)) {
                    na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new y6p(sroVar, o7pVar2, (mt5) null), 3);
                }
                if (t0i.d(obj4) != null && (p7pVar = o7pVar2.i) != null) {
                    p7pVar.g(9001, sroVar.b);
                    break;
                }
                break;
        }
    }
}
