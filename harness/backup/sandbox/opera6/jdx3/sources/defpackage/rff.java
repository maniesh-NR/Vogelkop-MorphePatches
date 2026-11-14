package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rff extends qff {
    public final ArrayList a = new ArrayList();
    public boolean b;

    @Override // defpackage.qff
    public final void a(pzh pzhVar, byte[] bArr) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qff) obj).a(pzhVar, bArr);
        }
        arrayList.clear();
    }

    @Override // defpackage.qff
    public final void b(pzh pzhVar, byte[] bArr) {
        ArrayList arrayList;
        synchronized (this.a) {
            this.b = true;
            arrayList = new ArrayList(this.a);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qff) obj).b(pzhVar, bArr);
        }
    }

    @Override // defpackage.qff
    public final void c(String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qff) obj).c(str, z);
        }
        arrayList.clear();
    }

    @Override // defpackage.qff
    public final boolean d(pzh pzhVar, byte[] bArr) {
        HashSet hashSet = new HashSet(1);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qff qffVar = (qff) obj;
            try {
                if (qffVar.d(pzhVar, bArr)) {
                    hashSet.add(qffVar);
                }
            } catch (IOException unused) {
            }
        }
        arrayList.removeAll(hashSet);
        return arrayList.isEmpty();
    }

    @Override // defpackage.qff
    public final void e(pzh pzhVar, byte[] bArr) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qff) obj).e(pzhVar, bArr);
        }
        arrayList.clear();
    }

    @Override // defpackage.qff
    public final boolean f(pzh pzhVar, byte[] bArr) {
        HashSet hashSet = new HashSet(1);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qff qffVar = (qff) obj;
            if (qffVar.f(pzhVar, bArr)) {
                hashSet.add(qffVar);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            qff qffVar2 = (qff) obj2;
            if (!hashSet.contains(qffVar2)) {
                qffVar2.c("Precondition failed", false);
            }
        }
        arrayList.clear();
        return true;
    }

    public final boolean g(qff qffVar) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            return this.a.add(qffVar);
        }
    }
}
