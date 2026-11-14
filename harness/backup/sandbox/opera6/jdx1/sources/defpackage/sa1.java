package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class sa1 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sa1(String str, va1 va1Var, int i) {
        this.c = str;
        this.d = va1Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sa1(ud4 ud4Var, int i, v3n v3nVar) {
        this.c = ud4Var;
        this.b = i;
        this.d = v3nVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new aa1((String) this.c, ((va1) this.d).n(), this.b);
            default:
                ud4 ud4Var = (ud4) this.c;
                byte b = this.b;
                v3n v3nVar = (v3n) this.d;
                xd4 xd4Var = (xd4) ud4Var;
                boolean z = true;
                int i = b == 2 ? 2 : 1;
                h28 h28VarF = xd4Var.F();
                if (i != 2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TreeMap treeMap = new TreeMap((Comparator) new uc5((byte) 0, false));
                    mo2 mo2Var = mo2.e;
                    ArrayList arrayList = new ArrayList(mo2.m);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        mo2 mo2Var2 = (mo2) obj;
                        jpo.n("Currently only support ConstantQuality", mo2Var2 instanceof mo2);
                        j28 j28VarB = h28VarF.b(mo2Var2.a(i));
                        if (j28VarB != null) {
                            j28VarB.toString();
                            gp2 gp2Var = null;
                            if (!j28VarB.b().isEmpty()) {
                                int iA = j28VarB.a();
                                int iC = j28VarB.c();
                                List listD = j28VarB.d();
                                List listB = j28VarB.b();
                                jpo.i("Should contain at least one VideoProfile.", listB.isEmpty() ^ z);
                                gp2Var = new gp2(iA, iC, Collections.unmodifiableList(new ArrayList(listD)), Collections.unmodifiableList(new ArrayList(listB)), listD.isEmpty() ? null : (fn2) listD.get(0), (hn2) listB.get(0));
                            }
                            if (gp2Var == null) {
                                Objects.toString(mo2Var2);
                            } else {
                                treeMap.put(gp2Var.f.a(), mo2Var2);
                                linkedHashMap.put(mo2Var2, gp2Var);
                            }
                            z = true;
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
                    }
                    if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                        h28VarF = new zn6(xd4Var, Arrays.asList(mo2.g, mo2.f, mo2.e), v3nVar);
                    }
                    ygh yghVar = b77.a;
                    a13 a13Var = new a13(new tfh(h28VarF, yghVar, xd4Var, v3nVar), yghVar);
                    Set setA = xd4Var.a();
                    if (!(setA instanceof Collection) || !setA.isEmpty()) {
                        Iterator it = setA.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ip7 ip7Var = (ip7) it.next();
                                if (ip7Var.a == 3 && ip7Var.b == 10) {
                                    a13Var = new a13(a13Var, v3nVar);
                                }
                            }
                        }
                    }
                    h28VarF = new yfh(a13Var, xd4Var, yghVar);
                } else if (!xd4Var.z()) {
                    h28VarF = h28.a;
                }
                return new k28(h28VarF, i, xd4Var.a());
        }
    }
}
