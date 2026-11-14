package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cuj implements Set, utb {
    public final ruj a;
    public final /* synthetic */ byte b;

    public cuj(ruj rujVar, byte b) {
        this.b = b;
        this.a = rujVar;
    }

    private final boolean b(Collection collection) {
        tag tagVar;
        int i;
        ttj ttjVarH;
        boolean zA;
        Set setN0 = CollectionsKt.n0(collection);
        ruj rujVar = this.a;
        boolean z = false;
        do {
            synchronized (gyg.g) {
                quj qujVar = (quj) ytj.f(rujVar.a);
                tagVar = qujVar.c;
                i = qujVar.d;
            }
            wag wagVarG = tagVar.g();
            uak it = rujVar.b.iterator();
            while (((s4) it).hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!setN0.contains(entry.getKey())) {
                    wagVarG.remove(entry.getKey());
                    z = true;
                }
            }
            tag tagVarF = wagVarG.f();
            if (Intrinsics.a(tagVarF, tagVar)) {
                break;
            }
            quj qujVar2 = rujVar.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zA = ruj.a((quj) ytj.w(qujVar2, rujVar, ttjVarH), i, tagVarF);
            }
            ytj.l(ttjVarH, rujVar);
        } while (!zA);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                gyg.Y();
                throw null;
            case 1:
                gyg.Y();
                throw null;
            default:
                gyg.Y();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                gyg.Y();
                throw null;
            case 1:
                gyg.Y();
                throw null;
            default:
                gyg.Y();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.b;
        ruj rujVar = this.a;
        switch (b) {
            case 0:
                if (!y9m.T(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.a(rujVar.get(entry.getKey()), entry.getValue());
            case 1:
                return rujVar.containsKey(obj);
            default:
                return rujVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.b;
        ruj rujVar = this.a;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!rujVar.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!rujVar.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        ruj rujVar = this.a;
        switch (b) {
            case 0:
                return new uak(rujVar, ((w1b) rujVar.e().c.entrySet()).iterator(), (byte) 0);
            case 1:
                return new uak(rujVar, ((w1b) rujVar.e().c.entrySet()).iterator(), (byte) 1);
            default:
                return new uak(rujVar, ((w1b) rujVar.e().c.entrySet()).iterator(), (byte) 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        byte b = this.b;
        ruj rujVar = this.a;
        switch (b) {
            case 0:
                if (y9m.T(obj) && rujVar.remove(((Map.Entry) obj).getKey()) != null) {
                    break;
                }
                break;
            case 1:
                if (rujVar.remove(obj) != null) {
                    break;
                }
                break;
            default:
                uak it = rujVar.b.iterator();
                while (true) {
                    if (((s4) it).hasNext()) {
                        next = it.next();
                        if (Intrinsics.a(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    rujVar.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        tag tagVar;
        int i;
        ttj ttjVarH;
        boolean zA;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set setN0 = CollectionsKt.n0(collection);
                ruj rujVar = this.a;
                do {
                    synchronized (gyg.g) {
                        quj qujVar = (quj) ytj.f(rujVar.a);
                        tagVar = qujVar.c;
                        i = qujVar.d;
                    }
                    wag wagVarG = tagVar.g();
                    uak it3 = rujVar.b.iterator();
                    while (((s4) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        if (setN0.contains(entry.getValue())) {
                            wagVarG.remove(entry.getKey());
                            z = true;
                        }
                    }
                    tag tagVarF = wagVarG.f();
                    if (!Intrinsics.a(tagVarF, tagVar)) {
                        quj qujVar2 = rujVar.a;
                        synchronized (ytj.c) {
                            ttjVarH = ytj.h();
                            zA = ruj.a((quj) ytj.w(qujVar2, rujVar, ttjVarH), i, tagVarF);
                        }
                        ytj.l(ttjVarH, rujVar);
                    }
                    return z;
                } while (!zA);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        tag tagVar;
        int i;
        ttj ttjVarH;
        boolean zA;
        tag tagVar2;
        int i2;
        ttj ttjVarH2;
        boolean zA2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iA = qbd.a(k95.o(collection2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                ruj rujVar = this.a;
                do {
                    synchronized (gyg.g) {
                        quj qujVar = (quj) ytj.f(rujVar.a);
                        tagVar = qujVar.c;
                        i = qujVar.d;
                    }
                    wag wagVarG = tagVar.g();
                    uak it = rujVar.b.iterator();
                    while (((s4) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            wagVarG.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    tag tagVarF = wagVarG.f();
                    if (!Intrinsics.a(tagVarF, tagVar)) {
                        quj qujVar2 = rujVar.a;
                        synchronized (ytj.c) {
                            ttjVarH = ytj.h();
                            zA = ruj.a((quj) ytj.w(qujVar2, rujVar, ttjVarH), i, tagVarF);
                        }
                        ytj.l(ttjVarH, rujVar);
                    }
                    return z;
                } while (!zA);
                return z;
            case 1:
                return b(collection);
            default:
                Set setN0 = CollectionsKt.n0(collection);
                ruj rujVar2 = this.a;
                do {
                    synchronized (gyg.g) {
                        quj qujVar3 = (quj) ytj.f(rujVar2.a);
                        tagVar2 = qujVar3.c;
                        i2 = qujVar3.d;
                    }
                    wag wagVarG2 = tagVar2.g();
                    uak it2 = rujVar2.b.iterator();
                    while (((s4) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it2.next();
                        if (!setN0.contains(entry3.getValue())) {
                            wagVarG2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    tag tagVarF2 = wagVarG2.f();
                    if (!Intrinsics.a(tagVarF2, tagVar2)) {
                        quj qujVar4 = rujVar2.a;
                        synchronized (ytj.c) {
                            ttjVarH2 = ytj.h();
                            zA2 = ruj.a((quj) ytj.w(qujVar4, rujVar2, ttjVarH2), i2, tagVarF2);
                        }
                        ytj.l(ttjVarH2, rujVar2);
                    }
                    return z;
                } while (!zA2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return lcp.K(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lcp.L(this, objArr);
    }
}
