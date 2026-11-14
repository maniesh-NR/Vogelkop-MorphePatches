package ads_mobile_sdk;

import defpackage.hyo;
import defpackage.t3p;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yx2 implements Iterator {
    public final ArrayDeque a;
    public hyo b;

    public yx2(hr hrVar) {
        if (!(hrVar instanceof zx2)) {
            this.a = null;
            this.b = (hyo) hrVar;
            return;
        }
        zx2 zx2Var = (zx2) hrVar;
        ArrayDeque arrayDeque = new ArrayDeque(zx2Var.h);
        this.a = arrayDeque;
        arrayDeque.push(zx2Var);
        while (true) {
            hr hrVar2 = zx2Var.e;
            if (!(hrVar2 instanceof zx2)) {
                this.b = (hyo) hrVar2;
                return;
            } else {
                zx2Var = (zx2) hrVar2;
                this.a.push(zx2Var);
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hyo next() {
        hyo hyoVar = this.b;
        hyo hyoVar2 = null;
        if (hyoVar == null) {
            t3p.y();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            hr hrVar = ((zx2) arrayDeque.pop()).f;
            while (hrVar instanceof zx2) {
                zx2 zx2Var = (zx2) hrVar;
                arrayDeque.push(zx2Var);
                hrVar = zx2Var.e;
            }
            hyo hyoVar3 = (hyo) hrVar;
            if (hyoVar3.size() != 0) {
                hyoVar2 = hyoVar3;
                break;
            }
        }
        this.b = hyoVar2;
        return hyoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
