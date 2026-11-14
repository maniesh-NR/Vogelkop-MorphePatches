package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class u4l implements w6f {
    public static final rxh f = new rxh(2132019219);
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public int c;
    public final t4l d;
    public final i7f e;

    public u4l(umi umiVar) {
        t4l t4lVar = new t4l(umiVar, new lrk(1, this, u4l.class, "applyLoaded", "applyLoaded(Lcom/opera/android/browser/TabGroupRep$PersistentState;)V", 0, (byte) 2));
        this.d = t4lVar;
        this.e = new i7f();
        t4lVar.h();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.e.b((p4l) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.e.c((p4l) obj);
    }

    public final m4l a(int i) {
        t4l t4lVar = this.d;
        t4lVar.i();
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(numValueOf);
        if (obj != null) {
            return (m4l) obj;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        m4l.Companion.getClass();
        int size = m4l.d.size();
        int i3 = i2 % size;
        m4l m4lVar = new m4l(i, null, i3 + (size & (((i3 ^ size) & ((-i3) | i3)) >> 31)));
        t4lVar.i();
        linkedHashMap.put(Integer.valueOf(i), m4lVar);
        t4lVar.g(new s4l(CollectionsKt.k0(linkedHashMap.values()), this.c));
        return m4lVar;
    }

    public final void b(m4l m4lVar) {
        int i = m4lVar.a;
        if (m4lVar.equals(a(i))) {
            return;
        }
        t4l t4lVar = this.d;
        t4lVar.i();
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(numValueOf, m4lVar);
        t4lVar.g(new s4l(CollectionsKt.k0(linkedHashMap.values()), this.c));
        this.a++;
        i7f i7fVar = this.e;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((p4l) g7fVarC.next()).a(m4lVar);
        }
    }
}
