package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vh5 implements n1j {
    public final csh a;
    public long b;

    public vh5(List list, List list2) {
        z0b z0bVarP = h1b.p();
        z4o.w(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            z0bVarP.c(new uh5((n1j) list.get(i), (List) list2.get(i)));
        }
        this.a = z0bVarP.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        boolean zG;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zG = false;
            while (true) {
                csh cshVar = this.a;
                if (i >= cshVar.d) {
                    break;
                }
                long nextLoadPositionUs2 = ((uh5) cshVar.get(i)).a.getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= gtcVar.a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zG |= ((uh5) cshVar.get(i)).a.g(gtcVar);
                }
                i++;
            }
            z |= zG;
        } while (zG);
        return z;
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            csh cshVar = this.a;
            if (i >= cshVar.d) {
                break;
            }
            uh5 uh5Var = (uh5) cshVar.get(i);
            long bufferedPositionUs = uh5Var.a.getBufferedPositionUs();
            h1b h1bVar = uh5Var.b;
            if ((h1bVar.contains(1) || h1bVar.contains(2) || h1bVar.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            csh cshVar = this.a;
            if (i >= cshVar.d) {
                break;
            }
            long nextLoadPositionUs = ((uh5) cshVar.get(i)).a.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            csh cshVar = this.a;
            if (i >= cshVar.d) {
                return false;
            }
            if (((uh5) cshVar.get(i)).a.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        int i = 0;
        while (true) {
            csh cshVar = this.a;
            if (i >= cshVar.d) {
                return;
            }
            ((uh5) cshVar.get(i)).reevaluateBuffer(j);
            i++;
        }
    }
}
