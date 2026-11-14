package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vsm {
    public final rrm a;
    public final mf4 b;
    public final o3a c;
    public final rrm d;
    public final zyk e;
    public final zyk f;

    public vsm(rrm rrmVar, mf4 mf4Var, o3a o3aVar, rrm rrmVar2) {
        this.a = rrmVar;
        this.b = mf4Var;
        this.c = o3aVar;
        this.d = rrmVar2;
        final byte b = 0;
        this.e = z4c.b(new Function0(this) { // from class: usm
            public final /* synthetic */ vsm b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                vsm vsmVar = this.b;
                switch (b2) {
                    case 0:
                        return (nd4) vsmVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) vsmVar.d.get()).entrySet()) {
                            bg4 bg4Var = (bg4) entry.getKey();
                            g07 g07Var = (g07) entry.getValue();
                            cg4 cg4Var = (cg4) vsmVar.a().c.b.get(bg4Var);
                            if (cg4Var != null) {
                                linkedHashMap.put(g07Var, new yfk(cg4Var.a));
                            }
                        }
                        return rbd.i(linkedHashMap);
                }
            }
        });
        final byte b2 = 1;
        this.f = z4c.b(new Function0(this) { // from class: usm
            public final /* synthetic */ vsm b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                vsm vsmVar = this.b;
                switch (b22) {
                    case 0:
                        return (nd4) vsmVar.a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) vsmVar.d.get()).entrySet()) {
                            bg4 bg4Var = (bg4) entry.getKey();
                            g07 g07Var = (g07) entry.getValue();
                            cg4 cg4Var = (cg4) vsmVar.a().c.b.get(bg4Var);
                            if (cg4Var != null) {
                                linkedHashMap.put(g07Var, new yfk(cg4Var.a));
                            }
                        }
                        return rbd.i(linkedHashMap);
                }
            }
        });
    }

    public final nd4 a() {
        return (nd4) this.e.getValue();
    }

    public final LinkedHashSet b(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yfk yfkVar = (yfk) ((Map) this.f.getValue()).get((g07) it.next());
            if (yfkVar != null) {
                linkedHashSet.add(yfkVar);
            }
        }
        return linkedHashSet;
    }
}
