package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ds4 extends e53 {
    public int[] i;
    public int[] j;

    @Override // defpackage.e53
    public final bh2 c(bh2 bh2Var) throws dh2 {
        int i = bh2Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return bh2.e;
        }
        int i2 = bh2Var.b;
        if (!tym.I(i)) {
            throw new dh2(bh2Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new dh2("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", bh2Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new bh2(bh2Var.a, iArr.length, i) : bh2.e;
    }

    @Override // defpackage.e53
    public final void d() {
        this.j = this.i;
    }

    @Override // defpackage.e53
    public final void f() {
        this.j = null;
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    @Override // defpackage.eh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void queueInput(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds4.queueInput(java.nio.ByteBuffer):void");
    }
}
