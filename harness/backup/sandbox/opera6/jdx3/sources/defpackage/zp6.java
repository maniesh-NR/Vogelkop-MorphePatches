package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class zp6 extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp6(byte b, mt5 mt5Var, Object obj) {
        super(3, mt5Var);
        this.t = b;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp6(ArrayList arrayList, mt5 mt5Var) {
        super(3, mt5Var);
        this.t = (byte) 8;
        this.x = arrayList;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                zp6 zp6Var = new zp6((byte) 0, (mt5) obj3, (cq6) obj4);
                zp6Var.v = (l99) obj;
                zp6Var.w = obj2;
                return zp6Var.invokeSuspend(Unit.a);
            case 1:
                zp6 zp6Var2 = new zp6((byte) 1, (mt5) obj3, (pad) obj4);
                zp6Var2.v = (l99) obj;
                zp6Var2.w = obj2;
                return zp6Var2.invokeSuspend(Unit.a);
            case 2:
                zp6 zp6Var3 = new zp6((byte) 2, (mt5) obj3, (r9i) obj4);
                zp6Var3.v = (l99) obj;
                zp6Var3.w = obj2;
                return zp6Var3.invokeSuspend(Unit.a);
            case 3:
                zp6 zp6Var4 = new zp6((byte) 3, (mt5) obj3, (bpd) obj4);
                zp6Var4.v = (l99) obj;
                zp6Var4.w = obj2;
                return zp6Var4.invokeSuspend(Unit.a);
            case 4:
                zp6 zp6Var5 = new zp6((byte) 4, (mt5) obj3, (s6h) obj4);
                zp6Var5.v = (l99) obj;
                zp6Var5.w = obj2;
                return zp6Var5.invokeSuspend(Unit.a);
            case 5:
                zp6 zp6Var6 = new zp6((byte) 5, (mt5) obj3, (ya9) obj4);
                zp6Var6.v = (l99) obj;
                zp6Var6.w = obj2;
                return zp6Var6.invokeSuspend(Unit.a);
            case 6:
                zp6 zp6Var7 = new zp6((byte) 6, (mt5) obj3, (pz6) obj4);
                zp6Var7.v = (l99) obj;
                zp6Var7.w = obj2;
                return zp6Var7.invokeSuspend(Unit.a);
            case 7:
                zp6 zp6Var8 = new zp6((byte) 7, (mt5) obj3, (u78) obj4);
                zp6Var8.v = (l99) obj;
                zp6Var8.w = obj2;
                return zp6Var8.invokeSuspend(Unit.a);
            case 8:
                zp6 zp6Var9 = new zp6((ArrayList) obj4, (mt5) obj3);
                zp6Var9.v = (h1j) obj;
                zp6Var9.w = (spa) obj2;
                return zp6Var9.invokeSuspend(Unit.a);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                zp6 zp6Var10 = new zp6((byte) 9, (mt5) obj3, (xh7) obj4);
                zp6Var10.v = (l99) obj;
                zp6Var10.w = obj2;
                return zp6Var10.invokeSuspend(Unit.a);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                zp6 zp6Var11 = new zp6((byte) 10, (mt5) obj3, (dqc) obj4);
                zp6Var11.v = (l99) obj;
                zp6Var11.w = obj2;
                return zp6Var11.invokeSuspend(Unit.a);
            default:
                zp6 zp6Var12 = new zp6((byte) 11, (mt5) obj3, (nzl) obj4);
                zp6Var12.v = (l99) obj;
                zp6Var12.w = obj2;
                return zp6Var12.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        xd6 ya9Var;
        ya9 xd6Var;
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                l99 l99Var = (l99) this.v;
                Object obj3 = this.w;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    hnc hncVar = ((cq6) obj2).d.c;
                    hncVar.getClass();
                    Set set = (Set) obj3;
                    ArrayList arrayList = new ArrayList(k95.o(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Number) it.next()).longValue();
                        HashMap map = hncVar.f;
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objL0 = map.get(lValueOf);
                        if (objL0 == null) {
                            f99 f99VarL = ic4.l(f03.g(new oa7(jLongValue, hncVar, (mt5) null)), -1);
                            nx5 nx5Var = hncVar.a;
                            on7 on7Var = pn7.b;
                            objL0 = a26.l0(f99VarL, nx5Var, new f9k(pn7.f(cs5.x0(1, un7.e))), 1);
                            map.put(lValueOf, objL0);
                        }
                        arrayList.add((f99) objL0);
                    }
                    o47 o47Var = new o47((f99[]) CollectionsKt.k0(arrayList).toArray(new f99[0]), (byte) 1);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var, o47Var, this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                l99 l99Var2 = (l99) this.v;
                Object obj4 = this.w;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    xd6 xd6Var2 = !((Boolean) obj4).booleanValue() ? new xd6(Boolean.FALSE, (byte) 7) : (f99) ((g7l) ((pad) obj2).c).a.getValue();
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var2, xd6Var2, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                l99 l99Var3 = (l99) this.v;
                Object obj5 = this.w;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    f99 xd6Var3 = ((Boolean) obj5).booleanValue() ? ((qp6) ((r9i) obj2).c).b : new xd6(l08.a, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var3, xd6Var3, this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 3:
                l99 l99Var4 = (l99) this.v;
                Object obj6 = this.w;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    xd6 xd6Var4 = !((Boolean) obj6).booleanValue() ? new xd6(bp9.d, (byte) 7) : ((ip6) ((bpd) obj2).b).b;
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var4, xd6Var4, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 4:
                l99 l99Var5 = (l99) this.v;
                Object obj7 = this.w;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    xd6 xd6Var5 = ((Boolean) obj7).booleanValue() ? new xd6(((ft6) ((s6h) obj2).b).d, (byte) 3) : new xd6(Boolean.FALSE, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var5, xd6Var5, this) == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 5:
                l99 l99Var6 = (l99) this.v;
                Object obj8 = this.w;
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    ya9 xd6Var6 = ((Boolean) obj8).booleanValue() ? (ya9) obj2 : new xd6(Boolean.FALSE, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var6, xd6Var6, this) == px5Var6) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 6:
                l99 l99Var7 = (l99) this.v;
                Object obj9 = this.w;
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    if (((Boolean) obj9).booleanValue()) {
                        pz6 pz6Var = (pz6) obj2;
                        ya9Var = new ya9(((au6) pz6Var.b.a).e, ((oz6) pz6Var.d.b).c, new im4((byte) 1, (mt5) null, pz6Var), (byte) 0);
                    } else {
                        ya9Var = new xd6(vpn.a, (byte) 7);
                    }
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var7, ya9Var, this) == px5Var7) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 7:
                l99 l99Var8 = (l99) this.v;
                Object obj10 = this.w;
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    if (((Boolean) obj10).booleanValue()) {
                        u78 u78Var = (u78) obj2;
                        xd6Var = new ya9(u78Var.e.a.f, u78Var.c.G(), new sn4(3, (mt5) null, (byte) 3), (byte) 0);
                    } else {
                        xd6Var = new xd6(def.a, (byte) 7);
                    }
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var8, xd6Var, this) == px5Var8) {
                        break;
                    }
                } else if (!z8) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 8:
                h1j h1jVar = (h1j) this.v;
                spa spaVar = (spa) this.w;
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    ArrayList arrayListW = CollectionsKt.W(new x84(h1jVar), (ArrayList) obj2);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (!arrayListW.isEmpty()) {
                        xoa xoaVar = new xoa(arrayListW.subList(1, arrayListW.size()));
                        woa woaVar = (woa) CollectionsKt.K(arrayListW);
                        spa spaVar2 = new spa();
                        spaVar2.b(spaVar);
                        Object objA = woaVar.a(spaVar2, xoaVar, this);
                        if (objA == px5Var9) {
                            break;
                        }
                    } else {
                        qp2.n("Check failed.");
                    }
                } else if (z9) {
                    ybh.y(obj);
                    break;
                } else {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                l99 l99Var9 = (l99) this.v;
                Object obj11 = this.w;
                px5 px5Var10 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    ur4 ur4Var = ((Boolean) obj11).booleanValue() ? (ur4) ((xh7) obj2).e : g08.a;
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var9, ur4Var, this) == px5Var10) {
                        break;
                    }
                } else if (!z10) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                l99 l99Var10 = (l99) this.v;
                Object obj12 = this.w;
                px5 px5Var11 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    cw xd6Var7 = ((Boolean) obj12).booleanValue() ? ((dqc) obj2).h : new xd6(eqc.a, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var10, xd6Var7, this) == px5Var11) {
                        break;
                    }
                } else if (!z11) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                l99 l99Var11 = (l99) this.v;
                Object obj13 = this.w;
                px5 px5Var12 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    f99 f99VarM = ((Boolean) obj13).booleanValue() ? ((y3i) ((nzl) obj2).a.get()).m() : new xd6(n08.a, (byte) 7);
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (j14.F(l99Var11, f99VarM, this) == px5Var12) {
                        break;
                    }
                } else if (!z12) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
