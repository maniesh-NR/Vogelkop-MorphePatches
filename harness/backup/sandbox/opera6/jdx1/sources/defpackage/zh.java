package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zh {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        wh whVar = (wh) this.e.get(str);
        if ((whVar != null ? whVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                whVar.a.k(whVar.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new oh(i2, intent));
        return true;
    }

    public abstract void b(int i, rh rhVar, Object obj, nh nhVar);

    public final yh c(String str, rh rhVar, ph phVar) {
        e(str);
        this.e.put(str, new wh(rhVar, phVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            phVar.k(obj);
        }
        Bundle bundle = this.g;
        oh ohVar = (oh) j14.T(bundle, str, oh.class);
        if (ohVar != null) {
            bundle.remove(str);
            phVar.k(rhVar.c(ohVar.a, ohVar.b));
        }
        return new yh(this, str, rhVar, (byte) 1);
    }

    public final yh d(final String str, ndc ndcVar, final rh rhVar, final ph phVar) {
        tcc lifecycle = ndcVar.getLifecycle();
        if (((qdc) lifecycle).i.d(qcc.d)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(ndcVar);
            qcc qccVar = ((qdc) lifecycle).i;
            sb.append(" is attempting to register while current state is ");
            sb.append(qccVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        xh xhVar = (xh) linkedHashMap.get(str);
        if (xhVar == null) {
            xhVar = new xh(lifecycle);
        }
        idc idcVar = new idc() { // from class: vh
            @Override // defpackage.idc
            public final void E(ndc ndcVar2, occ occVar) {
                occ occVar2 = occ.ON_START;
                zh zhVar = this.a;
                String str2 = str;
                if (occVar2 != occVar) {
                    if (occ.ON_STOP == occVar) {
                        zhVar.e.remove(str2);
                        return;
                    } else {
                        if (occ.ON_DESTROY == occVar) {
                            zhVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = zhVar.e;
                Bundle bundle = zhVar.g;
                LinkedHashMap linkedHashMap3 = zhVar.f;
                rh rhVar2 = rhVar;
                ph phVar2 = phVar;
                linkedHashMap2.put(str2, new wh(rhVar2, phVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    phVar2.k(obj);
                }
                oh ohVar = (oh) j14.T(bundle, str2, oh.class);
                if (ohVar != null) {
                    bundle.remove(str2);
                    phVar2.k(rhVar2.c(ohVar.a, ohVar.b));
                }
            }
        };
        xhVar.a.a(idcVar);
        xhVar.b.add(idcVar);
        linkedHashMap.put(str, xhVar);
        return new yh(this, str, rhVar, (byte) 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        lb lbVar = new lb((byte) 2);
        Iterator it = new do5(new ec7(lbVar, new tji(lbVar, (byte) 12), (byte) 1)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        h9o.h("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((oh) j14.T(bundle, str, oh.class));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        xh xhVar = (xh) linkedHashMap2.get(str);
        if (xhVar != null) {
            ArrayList arrayList = xhVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                xhVar.a.b((idc) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
