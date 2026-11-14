package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class b46 implements lnk {
    public static final p24 c = new p24(new b10((byte) 8), ije.b);
    public final h1b a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b46(csh r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b46.<init>(csh):void");
    }

    @Override // defpackage.lnk
    public final List getCues(long j) {
        int iF = tym.f(this.b, j, false);
        if (iF != -1) {
            return (h1b) this.a.get(iF);
        }
        a1b a1bVar = h1b.b;
        return csh.e;
    }

    @Override // defpackage.lnk
    public final long getEventTime(int i) {
        z4o.w(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.lnk
    public final int getEventTimeCount() {
        return this.a.size();
    }

    @Override // defpackage.lnk
    public final int getNextEventTimeIndex(long j) {
        int iB = tym.b(this.b, j, false);
        if (iB < this.a.size()) {
            return iB;
        }
        return -1;
    }
}
