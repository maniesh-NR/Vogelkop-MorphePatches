package defpackage;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m72 implements Iterator, ptb {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public m72(int i) {
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m72(ArrayMap arrayMap, byte b) {
        this(arrayMap.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = arrayMap;
                this(arrayMap.c);
                break;
            default:
                this.e = arrayMap;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m72(t72 t72Var) {
        this(t72Var.c);
        this.d = (byte) 2;
        this.e = t72Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                objF = ((ArrayMap) obj).f(i);
                break;
            case 1:
                objF = ((ArrayMap) obj).k(i);
                break;
            default:
                objF = ((t72) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            qp2.n("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((ArrayMap) obj).h(i);
                break;
            case 1:
                ((ArrayMap) obj).h(i);
                break;
            default:
                ((t72) obj).b(i);
                break;
        }
        this.a--;
        this.c = false;
    }
}
