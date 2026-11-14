package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class hf4 implements rfb {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public o94 d;
    public l94 e;
    public tah f;

    @Override // defpackage.rfb
    public final void a(List list) {
        HashSet hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                map.put(str, this.f.p(str));
            }
            synchronized (this.a) {
                HashSet hashSet2 = new HashSet(this.b.keySet());
                hashSet2.removeAll(list);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    arrayList.add((zd4) this.b.get((String) it2.next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList2 = (ArrayList) list;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    String str2 = (String) obj;
                    if (this.b.containsKey(str2)) {
                        linkedHashMap.put(str2, (zd4) this.b.get(str2));
                    } else {
                        linkedHashMap.put(str2, (zd4) map.get(str2));
                    }
                }
                this.b.clear();
                this.b.putAll(linkedHashMap);
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    zd4 zd4Var = (zd4) obj2;
                    if (zd4Var != null) {
                        zd4Var.o();
                    }
                }
            }
        } catch (hg4 e) {
            throw new ig4("Failed to create CameraInternal", e);
        }
    }

    public final zd4 b(String str) {
        zd4 zd4Var;
        synchronized (this.a) {
            zd4Var = (zd4) this.b.get(str);
            if (zd4Var == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return zd4Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(tah tahVar) {
        this.f = tahVar;
        synchronized (this.a) {
            try {
                for (String str : tahVar.o()) {
                    zd4 zd4Var = (zd4) this.b.put(str, tahVar.p(str));
                    if (zd4Var != null) {
                        zd4Var.release();
                    }
                }
            } catch (hg4 e) {
                throw new s7b(e);
            }
        }
    }
}
