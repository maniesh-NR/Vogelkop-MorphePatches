package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pea extends wz4 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.rsc
    public final void cancelLoad() {
        this.k = true;
    }

    @Override // defpackage.rsc
    public final void load() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArrCopyOf = this.j;
                if (bArrCopyOf.length < i2 + 16384) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + 16384);
                    this.j = bArrCopyOf;
                }
                i = this.i.read(bArrCopyOf, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            oup.P(this.i);
        }
    }
}
