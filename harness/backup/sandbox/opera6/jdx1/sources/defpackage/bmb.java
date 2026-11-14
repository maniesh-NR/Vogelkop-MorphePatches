package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class bmb extends omm {
    public int e;
    public Object f;
    public final /* synthetic */ byte g;
    public final Iterator h;
    public final /* synthetic */ Object i;

    public bmb() {
        super((byte) 0);
        this.e = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bmb(Iterator it, srg srgVar) {
        this();
        this.g = (byte) 0;
        this.h = it;
        this.i = srgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bmb(u1b u1bVar, u1b u1bVar2) {
        this();
        this.g = (byte) 1;
        this.i = u1bVar2;
        this.h = u1bVar.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean hasNext() {
        Object next;
        z4o.H(this.e != 4);
        int iA = vep.A(this.e);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.e = 4;
            byte b = this.g;
            Object obj = null;
            Object obj2 = this.i;
            Iterator it = this.h;
            switch (b) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((srg) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.e = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((u1b) obj2).contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.e = 3;
                    break;
            }
            this.f = obj;
            if (this.e != 3) {
                this.e = 1;
                return true;
            }
        }
        return false;
    }

    public final Object next() {
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        this.e = 2;
        Object obj = this.f;
        this.f = null;
        return obj;
    }
}
