package defpackage;

/* loaded from: classes.dex */
public final class zy7 {
    public final cyd b;
    public long d;
    public kam e;
    public int f;
    public int g;
    public byte a = 1;
    public int c = -1;

    public zy7(cyd cydVar) {
        this.b = cydVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a A[EDGE_INSN: B:64:0x007a->B:36:0x007a BREAK  A[LOOP:0: B:22:0x004e->B:27:0x005b]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy7.a(int):int");
    }

    public final boolean b() {
        return ((this.d >>> 16) & 65535) != 0;
    }

    public final boolean c() {
        if (this.a == 2 && this.c != -1 && b()) {
            return this.g > 1 || e();
        }
        return false;
    }

    public final void d() {
        this.a = (byte) 1;
        this.c = -1;
        this.d = 0L;
        this.g = 0;
    }

    public final boolean e() {
        if (b()) {
            return ((this.d >>> 48) & 1) != 0 || this.f == 65039;
        }
        return false;
    }
}
