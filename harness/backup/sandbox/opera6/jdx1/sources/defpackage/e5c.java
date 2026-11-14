package defpackage;

/* loaded from: classes.dex */
public final class e5c extends b8e implements e3c {
    public static final c5c r = new c5c();
    public f5c o;
    public nv6 p;
    public fsf q;

    public final boolean T0(a5c a5cVar, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.q != fsf.a) {
                }
            } else if (i != 1 && i != 2) {
                qp2.n("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (U0(i)) {
            }
        } else if (this.q != fsf.b) {
            if (U0(i) ? a5cVar.a > 0 : a5cVar.b < this.o.getItemCount() - 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean U0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = ui6.e0(this).z.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            h9o.p();
            return false;
        }
        if (i != 4) {
            qp2.n("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = ui6.e0(this).z.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        h9o.p();
        return false;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 8));
    }
}
