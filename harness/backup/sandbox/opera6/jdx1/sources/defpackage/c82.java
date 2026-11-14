package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlinx.serialization.internal.EnumDescriptor;

/* loaded from: classes.dex */
public final class c82 implements Iterable, ptb {
    public final /* synthetic */ byte a;
    public final Object b;

    public c82(ehc ehcVar) {
        this.a = (byte) 1;
        this.b = ehcVar;
        if (ehcVar.isEmpty()) {
            qp2.n("Initialized with empty categorized sources");
            throw null;
        }
    }

    public /* synthetic */ c82(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final int b(int i) {
        Iterator it = CollectionsKt.e0((ehc) this.b, i).iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((ukb) it.next()).b();
        }
        return iB;
    }

    public final olb c(int i) {
        mea meaVarListIterator = ((ehc) this.b).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                t3p.t();
                return null;
            }
            ukb ukbVar = (ukb) meaVar.next();
            if (i < ukbVar.b()) {
                return ukbVar.a(i);
            }
            i -= ukbVar.b();
        }
    }

    public final IntRange d(ukb ukbVar) {
        ehc ehcVar = (ehc) this.b;
        if (ehcVar.contains(ukbVar)) {
            int iB = b(ehcVar.indexOf(ukbVar));
            return djh.j(iB, ukbVar.b() + iB);
        }
        qp2.n("Check failed.");
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new w4((Object[]) obj, (byte) 1);
            case 1:
                ArrayList arrayList = new ArrayList();
                for (ukb ukbVar : (ehc) obj) {
                    ukbVar.getClass();
                    IntRange intRange = new IntRange(0, ukbVar.b() - 1, 1);
                    ArrayList arrayList2 = new ArrayList(k95.o(intRange, 10));
                    acb it = intRange.iterator();
                    while (it.c) {
                        arrayList2.add(ukbVar.a(((ubb) it).nextInt()));
                    }
                    o95.t(arrayList2, arrayList);
                }
                return arrayList.iterator();
            case 2:
                return new km7((Iterator) ((Function0) obj).invoke());
            case 3:
                return new g27((h27) obj);
            default:
                return new w4((EnumDescriptor) obj);
        }
    }
}
