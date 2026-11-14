package defpackage;

import J.N;
import com.opera.android.browser.blocklist.bridge.BlockListRepositoryBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ij3 extends lim {
    public final ech a;
    public final cj3 b;
    public final BlockListRepositoryBridge c;
    public final f9d d;
    public final zyk e = z4c.b(new oc2(this, 12));
    public final kze f;
    public final LinkedHashSet g;
    public final ej3 h;

    public ij3(ech echVar, cj3 cj3Var, BlockListRepositoryBridge blockListRepositoryBridge, f9d f9dVar) {
        this.a = echVar;
        this.b = cj3Var;
        this.c = blockListRepositoryBridge;
        this.d = f9dVar;
        l08 l08Var = l08.a;
        this.f = new kze(new zie(l08Var, l08Var, l08Var, l08Var));
        this.g = new LinkedHashSet();
        this.h = new ej3(this);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.c.c.b(this.h);
        aib.B(this.a.b, ndcVar, new fj3(this), new vme((byte) 19));
        cj3 cj3Var = this.b;
        final byte b = 0;
        cj3Var.d.j(ndcVar, new ug(new Function1(this) { // from class: gj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                int i;
                byte b2 = b;
                int i2 = 0;
                ij3 ij3Var = this.b;
                switch (b2) {
                    case 0:
                        BlockListRepositoryBridge blockListRepositoryBridge = ij3Var.c;
                        LinkedHashSet linkedHashSet = ij3Var.g;
                        Set<vj3> set = (Set) obj;
                        Iterator it = b5j.d(linkedHashSet, set).iterator();
                        while (true) {
                            int i3 = 1;
                            if (!it.hasNext()) {
                                for (vj3 vj3Var : set) {
                                    if (linkedHashSet.add(vj3Var)) {
                                        sj3 sj3Var = vj3Var.a;
                                        String strX = kfo.X(vj3Var.b);
                                        int iOrdinal = sj3Var.ordinal();
                                        if (iOrdinal == 0) {
                                            i = 0;
                                        } else if (iOrdinal == 1) {
                                            i = 1;
                                        } else if (iOrdinal == 2) {
                                            i = 2;
                                        } else if (iOrdinal != 3) {
                                            h9o.p();
                                            break;
                                        } else {
                                            i = 3;
                                        }
                                        N.Mw9$UdZ2(blockListRepositoryBridge.a, i, strX);
                                    }
                                }
                                break;
                            } else {
                                vj3 vj3Var2 = (vj3) it.next();
                                linkedHashSet.remove(vj3Var2);
                                sj3 sj3Var2 = vj3Var2.a;
                                String strX2 = kfo.X(vj3Var2.b);
                                int iOrdinal2 = sj3Var2.ordinal();
                                if (iOrdinal2 == 0) {
                                    i3 = 0;
                                } else if (iOrdinal2 == 1) {
                                    continue;
                                } else if (iOrdinal2 == 2) {
                                    i3 = 2;
                                } else if (iOrdinal2 != 3) {
                                    h9o.p();
                                    break;
                                } else {
                                    i3 = 3;
                                }
                                N.MXETNLFE(blockListRepositoryBridge.a, i3, strX2);
                            }
                        }
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            N.M2NvereD(ij3Var.c.a);
                        }
                        break;
                    default:
                        zie zieVar = (zie) obj;
                        ArrayList arrayListV = CollectionsKt.V(zieVar.d, CollectionsKt.V(zieVar.c, CollectionsKt.V(zieVar.b, zieVar.a)));
                        int size = arrayListV.size();
                        while (i2 < size) {
                            Object obj2 = arrayListV.get(i2);
                            i2++;
                            yie yieVar = (yie) obj2;
                            qyn qynVar = yieVar.b;
                            if (!qynVar.equals(wie.j) && !(qynVar instanceof xie)) {
                                if (!(qynVar instanceof vie)) {
                                    h9o.p();
                                    break;
                                } else {
                                    ij3Var.d.a(new d9d(yieVar.a, ((vie) yieVar.b).j));
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 12));
        final byte b2 = 1;
        cj3Var.e.j(ndcVar, new ug(new Function1(this) { // from class: gj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                int i;
                byte b22 = b2;
                int i2 = 0;
                ij3 ij3Var = this.b;
                switch (b22) {
                    case 0:
                        BlockListRepositoryBridge blockListRepositoryBridge = ij3Var.c;
                        LinkedHashSet linkedHashSet = ij3Var.g;
                        Set<vj3> set = (Set) obj;
                        Iterator it = b5j.d(linkedHashSet, set).iterator();
                        while (true) {
                            int i3 = 1;
                            if (!it.hasNext()) {
                                for (vj3 vj3Var : set) {
                                    if (linkedHashSet.add(vj3Var)) {
                                        sj3 sj3Var = vj3Var.a;
                                        String strX = kfo.X(vj3Var.b);
                                        int iOrdinal = sj3Var.ordinal();
                                        if (iOrdinal == 0) {
                                            i = 0;
                                        } else if (iOrdinal == 1) {
                                            i = 1;
                                        } else if (iOrdinal == 2) {
                                            i = 2;
                                        } else if (iOrdinal != 3) {
                                            h9o.p();
                                            break;
                                        } else {
                                            i = 3;
                                        }
                                        N.Mw9$UdZ2(blockListRepositoryBridge.a, i, strX);
                                    }
                                }
                                break;
                            } else {
                                vj3 vj3Var2 = (vj3) it.next();
                                linkedHashSet.remove(vj3Var2);
                                sj3 sj3Var2 = vj3Var2.a;
                                String strX2 = kfo.X(vj3Var2.b);
                                int iOrdinal2 = sj3Var2.ordinal();
                                if (iOrdinal2 == 0) {
                                    i3 = 0;
                                } else if (iOrdinal2 == 1) {
                                    continue;
                                } else if (iOrdinal2 == 2) {
                                    i3 = 2;
                                } else if (iOrdinal2 != 3) {
                                    h9o.p();
                                    break;
                                } else {
                                    i3 = 3;
                                }
                                N.MXETNLFE(blockListRepositoryBridge.a, i3, strX2);
                            }
                        }
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            N.M2NvereD(ij3Var.c.a);
                        }
                        break;
                    default:
                        zie zieVar = (zie) obj;
                        ArrayList arrayListV = CollectionsKt.V(zieVar.d, CollectionsKt.V(zieVar.c, CollectionsKt.V(zieVar.b, zieVar.a)));
                        int size = arrayListV.size();
                        while (i2 < size) {
                            Object obj2 = arrayListV.get(i2);
                            i2++;
                            yie yieVar = (yie) obj2;
                            qyn qynVar = yieVar.b;
                            if (!qynVar.equals(wie.j) && !(qynVar instanceof xie)) {
                                if (!(qynVar instanceof vie)) {
                                    h9o.p();
                                    break;
                                } else {
                                    ij3Var.d.a(new d9d(yieVar.a, ((vie) yieVar.b).j));
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 12));
        final byte b3 = 2;
        ((ize) this.e.getValue()).j(ndcVar, new ug(new Function1(this) { // from class: gj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                int i;
                byte b22 = b3;
                int i2 = 0;
                ij3 ij3Var = this.b;
                switch (b22) {
                    case 0:
                        BlockListRepositoryBridge blockListRepositoryBridge = ij3Var.c;
                        LinkedHashSet linkedHashSet = ij3Var.g;
                        Set<vj3> set = (Set) obj;
                        Iterator it = b5j.d(linkedHashSet, set).iterator();
                        while (true) {
                            int i3 = 1;
                            if (!it.hasNext()) {
                                for (vj3 vj3Var : set) {
                                    if (linkedHashSet.add(vj3Var)) {
                                        sj3 sj3Var = vj3Var.a;
                                        String strX = kfo.X(vj3Var.b);
                                        int iOrdinal = sj3Var.ordinal();
                                        if (iOrdinal == 0) {
                                            i = 0;
                                        } else if (iOrdinal == 1) {
                                            i = 1;
                                        } else if (iOrdinal == 2) {
                                            i = 2;
                                        } else if (iOrdinal != 3) {
                                            h9o.p();
                                            break;
                                        } else {
                                            i = 3;
                                        }
                                        N.Mw9$UdZ2(blockListRepositoryBridge.a, i, strX);
                                    }
                                }
                                break;
                            } else {
                                vj3 vj3Var2 = (vj3) it.next();
                                linkedHashSet.remove(vj3Var2);
                                sj3 sj3Var2 = vj3Var2.a;
                                String strX2 = kfo.X(vj3Var2.b);
                                int iOrdinal2 = sj3Var2.ordinal();
                                if (iOrdinal2 == 0) {
                                    i3 = 0;
                                } else if (iOrdinal2 == 1) {
                                    continue;
                                } else if (iOrdinal2 == 2) {
                                    i3 = 2;
                                } else if (iOrdinal2 != 3) {
                                    h9o.p();
                                    break;
                                } else {
                                    i3 = 3;
                                }
                                N.MXETNLFE(blockListRepositoryBridge.a, i3, strX2);
                            }
                        }
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            N.M2NvereD(ij3Var.c.a);
                        }
                        break;
                    default:
                        zie zieVar = (zie) obj;
                        ArrayList arrayListV = CollectionsKt.V(zieVar.d, CollectionsKt.V(zieVar.c, CollectionsKt.V(zieVar.b, zieVar.a)));
                        int size = arrayListV.size();
                        while (i2 < size) {
                            Object obj2 = arrayListV.get(i2);
                            i2++;
                            yie yieVar = (yie) obj2;
                            qyn qynVar = yieVar.b;
                            if (!qynVar.equals(wie.j) && !(qynVar instanceof xie)) {
                                if (!(qynVar instanceof vie)) {
                                    h9o.p();
                                    break;
                                } else {
                                    ij3Var.d.a(new d9d(yieVar.a, ((vie) yieVar.b).j));
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 12));
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.c.c(this.h);
    }
}
