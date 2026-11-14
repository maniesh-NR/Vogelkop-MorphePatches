package defpackage;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class wh4 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap((Comparator) new uc5((byte) 0, false));
    public final gp2 c;
    public final gp2 d;

    public wh4(a13 a13Var, int i) {
        mo2 mo2Var = mo2.e;
        ArrayList arrayList = new ArrayList(mo2.m);
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            gp2 gp2Var = null;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            mo2 mo2Var2 = (mo2) obj;
            jpo.n("Currently only support ConstantQuality", mo2Var2 instanceof mo2);
            j28 j28VarD = a13Var.d(mo2Var2.a(i));
            if (j28VarD != null) {
                j28VarD.toString();
                if (!j28VarD.b().isEmpty()) {
                    int iA = j28VarD.a();
                    int iC = j28VarD.c();
                    List listD = j28VarD.d();
                    List listB = j28VarD.b();
                    jpo.i("Should contain at least one VideoProfile.", !listB.isEmpty());
                    gp2Var = new gp2(iA, iC, Collections.unmodifiableList(new ArrayList(listD)), Collections.unmodifiableList(new ArrayList(listB)), listD.isEmpty() ? null : (fn2) listD.get(0), (hn2) listB.get(0));
                }
                if (gp2Var == null) {
                    Objects.toString(mo2Var2);
                } else {
                    this.b.put(gp2Var.f.a(), mo2Var2);
                    this.a.put(mo2Var2, gp2Var);
                }
            }
        }
        if (this.a.isEmpty()) {
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (gp2) arrayDeque.peekFirst();
            this.d = (gp2) arrayDeque.peekLast();
        }
    }

    public final gp2 a(Size size) {
        Object value;
        Size size2 = qpj.a;
        TreeMap treeMap = this.b;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        mo2 mo2Var = (mo2) value;
        if (mo2Var == null) {
            mo2Var = mo2.k;
        }
        Objects.toString(mo2Var);
        Objects.toString(size);
        if (mo2Var != mo2.k) {
            gp2 gp2VarB = b(mo2Var);
            if (gp2VarB != null) {
                return gp2VarB;
            }
            qp2.g("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }

    public final gp2 b(mo2 mo2Var) {
        jpo.i("Unknown quality: " + mo2Var, mo2.l.contains(mo2Var));
        return mo2Var == mo2.j ? this.c : mo2Var == mo2.i ? this.d : (gp2) this.a.get(mo2Var);
    }
}
