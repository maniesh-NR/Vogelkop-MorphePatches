package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ruj implements vak, Map, ttb {
    public quj a;
    public final cuj b;
    public final cuj c;
    public final cuj d;

    public ruj() {
        tag tagVar = tag.f;
        ttj ttjVarH = ytj.h();
        quj qujVar = new quj(ttjVarH.g(), tagVar);
        if (!(ttjVarH instanceof lz9)) {
            qujVar.b = new quj(1L, tagVar);
        }
        this.a = qujVar;
        this.b = new cuj(this, (byte) 0);
        this.c = new cuj(this, (byte) 1);
        this.d = new cuj(this, (byte) 2);
    }

    public static boolean a(quj qujVar, int i, tag tagVar) {
        boolean z;
        synchronized (gyg.g) {
            int i2 = qujVar.d;
            if (i2 == i) {
                qujVar.c = tagVar;
                z = true;
                qujVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.a = (quj) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.a;
    }

    @Override // java.util.Map
    public final void clear() {
        ttj ttjVarH;
        tag tagVar = ((quj) ytj.f(this.a)).c;
        tag tagVar2 = tag.f;
        if (tagVar2 != tagVar) {
            quj qujVar = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                quj qujVar2 = (quj) ytj.w(qujVar, this, ttjVarH);
                synchronized (gyg.g) {
                    qujVar2.c = tagVar2;
                    qujVar2.d++;
                }
            }
            ytj.l(ttjVarH, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    public final quj e() {
        return (quj) ytj.s(this.a, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        tag tagVar;
        int i;
        Object objPut;
        ttj ttjVarH;
        boolean zA;
        do {
            synchronized (gyg.g) {
                quj qujVar = (quj) ytj.f(this.a);
                tagVar = qujVar.c;
                i = qujVar.d;
            }
            wag wagVarG = tagVar.g();
            objPut = wagVarG.put(obj, obj2);
            tag tagVarF = wagVarG.f();
            if (Intrinsics.a(tagVarF, tagVar)) {
                break;
            }
            quj qujVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zA = a((quj) ytj.w(qujVar2, this, ttjVarH), i, tagVarF);
            }
            ytj.l(ttjVarH, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        tag tagVar;
        int i;
        ttj ttjVarH;
        boolean zA;
        do {
            synchronized (gyg.g) {
                quj qujVar = (quj) ytj.f(this.a);
                tagVar = qujVar.c;
                i = qujVar.d;
            }
            wag wagVarG = tagVar.g();
            wagVarG.putAll(map);
            tag tagVarF = wagVarG.f();
            if (Intrinsics.a(tagVarF, tagVar)) {
                return;
            }
            quj qujVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zA = a((quj) ytj.w(qujVar2, this, ttjVarH), i, tagVarF);
            }
            ytj.l(ttjVarH, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        tag tagVar;
        int i;
        V vRemove;
        ttj ttjVarH;
        boolean zA;
        do {
            synchronized (gyg.g) {
                quj qujVar = (quj) ytj.f(this.a);
                tagVar = qujVar.c;
                i = qujVar.d;
            }
            wag wagVarG = tagVar.g();
            vRemove = wagVarG.remove(obj);
            tag tagVarF = wagVarG.f();
            if (Intrinsics.a(tagVarF, tagVar)) {
                break;
            }
            quj qujVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zA = a((quj) ytj.w(qujVar2, this, ttjVarH), i, tagVarF);
            }
            ytj.l(ttjVarH, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return e().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((quj) ytj.f(this.a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
