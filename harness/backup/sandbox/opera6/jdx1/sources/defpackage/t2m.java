package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t2m extends e3m {
    public boolean b;
    public boolean c;
    public x1k e;
    public final uuj f;
    public fh4 g;
    public final /* synthetic */ j3m h;
    public long a = -1;
    public byte d = 0;

    public t2m(j3m j3mVar) {
        this.h = j3mVar;
        uuj uujVar = new uuj();
        long[] jArr = new long[20];
        uujVar.b = jArr;
        uujVar.c = new float[20];
        uujVar.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = uujVar;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void d(y2m y2mVar) {
        this.c = true;
    }

    public final void h() {
        if (this.b) {
            i();
            this.e.a(this.h.y + 1);
        } else {
            this.d = (byte) 1;
            this.g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2m.i():void");
    }
}
