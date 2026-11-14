package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ac8 {
    public static final ac8 d = new ac8();
    public int c;
    public final ArrayList b = new ArrayList();
    public final wjh a = new wjh((byte) 12);

    public static void a(Object obj) {
        ac8 ac8Var = d;
        ArrayList arrayList = ac8Var.b;
        ac8Var.c++;
        ac8Var.a.v(obj);
        int i = ac8Var.c - 1;
        ac8Var.c = i;
        if (i == 0) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
            arrayList.clear();
        }
    }

    public static void b(Object obj) {
        if (vml.b()) {
            a(obj);
        } else {
            vml.c(new ig(obj, (byte) 26));
        }
    }

    public static void c(Object obj) {
        wjh wjhVar = d.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wjhVar.c;
        psp pspVar = psp.d;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) wjhVar.b;
        if (obj == null) {
            t3p.q("Object to register must not be null.");
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder("Event bus ");
            sb.append(wjhVar);
            t14.g(sb, " accessed from non-main thread ", Looper.myLooper());
            return;
        }
        HashMap mapK = pspVar.k(obj);
        for (Class cls : mapK.keySet()) {
            cd8 cd8Var = (cd8) mapK.get(cls);
            cd8 cd8Var2 = (cd8) concurrentHashMap.putIfAbsent(cls, cd8Var);
            if (cd8Var2 != null) {
                StringBuilder sb2 = new StringBuilder("Producer method for type ");
                sb2.append(cls);
                sb2.append(" found on type ");
                sb2.append(cd8Var.a.getClass());
                Class<?> cls2 = cd8Var2.a.getClass();
                sb2.append(", but already registered by type ");
                sb2.append(cls2);
                sb2.append(".");
                throw new IllegalArgumentException(sb2.toString());
            }
            Set set = (Set) concurrentHashMap2.get(cls);
            if (set != null && !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    wjh.j((dc8) it.next(), cd8Var);
                }
            }
        }
        HashMap mapL = pspVar.l(obj);
        for (Class cls3 : mapL.keySet()) {
            Set copyOnWriteArraySet = (Set) concurrentHashMap2.get(cls3);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                Set set2 = (Set) concurrentHashMap2.putIfAbsent(cls3, copyOnWriteArraySet);
                if (set2 != null) {
                    copyOnWriteArraySet = set2;
                }
            }
            if (!copyOnWriteArraySet.addAll((Set) mapL.get(cls3))) {
                qp2.o("Object already registered.");
                return;
            }
        }
        for (Map.Entry entry : mapL.entrySet()) {
            cd8 cd8Var3 = (cd8) concurrentHashMap.get((Class) entry.getKey());
            if (cd8Var3 != null && cd8Var3.d) {
                for (dc8 dc8Var : (Set) entry.getValue()) {
                    if (cd8Var3.d) {
                        if (dc8Var.d) {
                            wjh.j(dc8Var, cd8Var3);
                        }
                    }
                }
            }
        }
    }

    public static void d(Object obj) {
        wjh wjhVar = d.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wjhVar.c;
        psp pspVar = psp.d;
        if (obj == null) {
            t3p.q("Object to unregister must not be null.");
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder("Event bus ");
            sb.append(wjhVar);
            t14.g(sb, " accessed from non-main thread ", Looper.myLooper());
            return;
        }
        for (Map.Entry entry : pspVar.k(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            cd8 cd8Var = (cd8) concurrentHashMap.get(cls);
            cd8 cd8Var2 = (cd8) entry.getValue();
            if (cd8Var2 == null || !cd8Var2.equals(cd8Var)) {
                uac.k(obj.getClass(), " registered?", "Missing event producer for an annotated method. Is ");
                return;
            }
            ((cd8) concurrentHashMap.remove(cls)).d = false;
        }
        for (Map.Entry entry2 : pspVar.l(obj).entrySet()) {
            Set<dc8> set = (Set) ((ConcurrentHashMap) wjhVar.b).get((Class) entry2.getKey());
            Collection<?> collection = (Collection) entry2.getValue();
            if (set == null || !set.containsAll(collection)) {
                uac.k(obj.getClass(), " registered?", "Missing event handler for an annotated method. Is ");
                return;
            }
            for (dc8 dc8Var : set) {
                if (collection.contains(dc8Var)) {
                    dc8Var.d = false;
                }
            }
            set.removeAll(collection);
        }
    }
}
