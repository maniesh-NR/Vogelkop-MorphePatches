package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p0n extends uzm {
    public final y4a b;
    public String c;
    public boolean d;
    public final jk7 e;
    public Function0 f;
    public final t0g g;
    public kh3 h;
    public final t0g i;
    public long j;
    public float k;
    public float l;
    public final o0n m;

    public p0n(y4a y4aVar) {
        this.b = y4aVar;
        y4aVar.i = new o0n(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new jk7();
        this.f = new yam((byte) 9);
        this.g = hyg.k((Object) null);
        this.i = hyg.k(new bpj(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new o0n(this, (byte) 1);
    }

    @Override // defpackage.uzm
    public final void a(mk7 mk7Var) {
        e(mk7Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.mk7 r33, float r34, defpackage.kh3 r35) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0n.e(mk7, float, kh3):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        t0g t0gVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((bpj) t0gVar.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((bpj) t0gVar.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
