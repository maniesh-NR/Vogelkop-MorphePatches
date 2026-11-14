package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class vk implements p3a, kd1 {
    public final ArrayList a;

    public vk(byte b) {
        switch (b) {
            case 3:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public vk(ArrayList arrayList) {
        this.a = arrayList;
    }

    public vk(wk wkVar, ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.kd1
    public final a73 D() {
        ArrayList arrayList = this.a;
        return ((zvb) arrayList.get(0)).c() ? new h2a(arrayList, (byte) 1) : new b7g(arrayList);
    }

    @Override // defpackage.kd1
    public final List G() {
        return this.a;
    }

    @Override // defpackage.kd1
    public final boolean H() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((zvb) arrayList.get(0)).c();
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            t1m t1mVar = (t1m) obj;
            if (t1mVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(t1mVar.b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public final int d() {
        return this.a.size();
    }

    public final long e(int i) {
        return ((ri5) this.a.get(i)).d;
    }

    public final ta6 f(int i) {
        return (ta6) this.a.get(i);
    }
}
