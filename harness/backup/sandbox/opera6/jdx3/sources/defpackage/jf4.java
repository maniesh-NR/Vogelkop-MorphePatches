package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class jf4 {
    public static final jf4 b;
    public static final jf4 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new qbc(0));
        b = new jf4(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new qbc(1));
        c = new jf4(linkedHashSet2);
    }

    public jf4(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            qbc qbcVar = (qbc) it.next();
            List<ud4> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            qbcVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (ud4 ud4Var : listUnmodifiableList) {
                jpo.i("The camera info doesn't contain internal implementation.", ud4Var instanceof xd4);
                if (ud4Var.j() == qbcVar.a) {
                    arrayList3.add(ud4Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            qbc qbcVar = (qbc) it.next();
            if (qbcVar instanceof qbc) {
                Integer numValueOf = Integer.valueOf(qbcVar.a ? 1 : 0);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    qp2.n("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final zd4 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((zd4) it.next()).a());
        }
        ArrayList arrayListA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            zd4 zd4Var = (zd4) it2.next();
            if (arrayListA.contains(zd4Var.a())) {
                linkedHashSet2.add(zd4Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (zd4) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            xd4 xd4VarG = ((zd4) it4.next()).g();
            sb.append(" Id:" + xd4VarG.e() + "  Lens:" + xd4VarG.j());
        }
        String string = sb.toString();
        LinkedHashSet linkedHashSet3 = this.a;
        StringBuilder sb2 = new StringBuilder(sko.i(linkedHashSet3.size(), "PhyId:null  Filters:"));
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            qbc qbcVar = (qbc) it5.next();
            sb2.append(" Id:");
            qbcVar.getClass();
            sb2.append(qbc.b);
            if (qbcVar instanceof qbc) {
                sb2.append(" LensFilter:");
                sb2.append(qbcVar.a ? 1 : 0);
            }
        }
        qp2.o(p3p.w("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }
}
