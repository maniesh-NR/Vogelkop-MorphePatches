package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class wfd {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final sd3 e;
    public final d2c f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public wfd(int i, int i2, List list, long j, Object obj, sd3 sd3Var, d2c d2cVar) {
        fsf fsfVar = fsf.a;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = sd3Var;
        this.f = d2cVar;
        fsf fsfVar2 = fsf.a;
        this.g = false;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ifg ifgVar = (ifg) list.get(i3);
            iMax = Math.max(iMax, !this.g ? ifgVar.b : ifgVar.a);
        }
        this.h = iMax;
        this.i = new int[this.b.size() << 1];
        this.k = LinearLayoutManager.INVALID_OFFSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6) {
        /*
            r5 = this;
            int r0 = r5.j
            int r0 = r0 + r6
            r5.j = r0
            int[] r0 = r5.i
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L21
            boolean r3 = r5.g
            if (r3 == 0) goto L15
            int r3 = r2 % 2
            r4 = 1
            if (r3 == r4) goto L19
            goto L1e
        L15:
            int r3 = r2 % 2
            if (r3 != 0) goto L1e
        L19:
            r3 = r0[r2]
            int r3 = r3 + r6
            r0[r2] = r3
        L1e:
            int r2 = r2 + 1
            goto L9
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfd.a(int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void b(int i, int i2, int i3) throws pxb {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ifg ifgVar = (ifg) list.get(i5);
            int i6 = i5 << 1;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != d2c.a ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - ifgVar.a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = ifgVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                sd3 sd3Var = this.e;
                if (sd3Var == null) {
                    throw o18.k("null verticalAlignment");
                }
                iArr[i7] = sd3Var.a(ifgVar.b, i3);
                i4 = ifgVar.a;
            }
            i += i4;
        }
    }
}
