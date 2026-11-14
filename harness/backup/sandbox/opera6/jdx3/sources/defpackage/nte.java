package defpackage;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class nte extends tx7 {
    public ote e;
    public boolean f;
    public final /* synthetic */ pte g;

    public nte(pte pteVar) {
        this.g = pteVar;
        ((tx7) this).a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(int r12) {
        /*
            r11 = this;
            boolean r0 = r11.f
            pte r1 = r11.g
            if (r0 != 0) goto Lc8
            r0 = 1
            r11.f = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r3 = r1.w
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L24
            java.lang.Object r4 = r3.next()
            cwf r4 = (defpackage.cwf) r4
            r4.e = r5
            goto L14
        L24:
            r3 = r5
            r4 = r3
        L26:
            java.util.List r6 = r1.w
            int r6 = r6.size()
            if (r3 >= r6) goto Lc8
            java.util.List r6 = r1.w
            java.lang.Object r6 = r6.get(r3)
            cwf r6 = (defpackage.cwf) r6
            int r7 = r11.i(r3)
            r8 = 2
            r9 = 6
            if (r7 != r0) goto L40
            r7 = r8
            goto L4e
        L40:
            r10 = 3
            if (r7 != r10) goto L45
            r7 = 4
            goto L4e
        L45:
            r10 = 5
            if (r7 != r10) goto L4a
            r7 = r9
            goto L4e
        L4a:
            int r7 = java.lang.Math.min(r9, r7)
        L4e:
            r6.e = r7
            int r7 = r7 + r4
            if (r7 > r9) goto L5a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r2.add(r7)
        L5a:
            int r7 = r6.e
            int r4 = r4 + r7
            java.util.List r7 = r1.w
            int r7 = r7.size()
            int r7 = r7 - r0
            if (r3 != r7) goto L68
            r7 = r0
            goto L69
        L68:
            r7 = r5
        L69:
            if (r4 >= r9) goto L6d
            if (r7 == 0) goto Lc4
        L6d:
            if (r7 != 0) goto L8d
            int r7 = r2.size()
            if (r7 != r0) goto L80
            int r7 = r6.e
            if (r7 == r9) goto L80
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r2.add(r7)
        L80:
            int r7 = r2.size()
            if (r7 != r8) goto L9d
            if (r4 == r9) goto L9d
            int r4 = r11.j(r2)
            goto Laa
        L8d:
            int r4 = r2.size()
            if (r4 > 0) goto L9f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L9f
        L9d:
            r4 = r5
            goto Laa
        L9f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
            int r4 = r11.j(r2)
        Laa:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto Lc1
            int r4 = r6.e
            r2.clear()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r2.add(r6)
            goto Lc4
        Lc1:
            r2.clear()
        Lc4:
            int r3 = r3 + 1
            goto L26
        Lc8:
            java.util.List r11 = r1.w
            java.lang.Object r11 = r11.get(r12)
            cwf r11 = (defpackage.cwf) r11
            int r11 = r11.e
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nte.f(int):int");
    }

    public final void h() {
        super.h();
        this.f = false;
    }

    public final int i(int i) {
        pte pteVar = this.g;
        int measuredWidth = (pteVar.B.getMeasuredWidth() - pteVar.B.getPaddingLeft()) - pteVar.B.getPaddingRight();
        if (measuredWidth <= 0) {
            return 1;
        }
        int i2 = measuredWidth / 6;
        cwf cwfVar = (cwf) pteVar.w.get(i);
        int measuredWidth2 = cwfVar.d;
        if (measuredWidth2 == 0) {
            ote oteVar = this.e;
            if (oteVar == null) {
                oteVar = (ote) pteVar.y.createViewHolder(pteVar.B, 0);
                this.e = oteVar;
            }
            pteVar.y.J(oteVar, i);
            ((i) this.e).itemView.measure(0, 0);
            measuredWidth2 = ((i) this.e).itemView.getMeasuredWidth();
            cwfVar.d = measuredWidth2;
        }
        return (int) Math.ceil(measuredWidth2 / i2);
    }

    public final int j(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 6 / size;
        Collections.reverse(arrayList);
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 6;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            int i4 = i(num.intValue());
            pte pteVar = this.g;
            List list = pteVar.w;
            if (i4 > i) {
                int i5 = ((cwf) list.get(num.intValue())).e + 1;
                ((cwf) pteVar.w.get(num.intValue())).e = i5 == 1 ? 2 : i5 == 3 ? 4 : i5 == 5 ? 6 : Math.min(6, i5);
                size--;
                if (size > 0) {
                    i = 6 / size;
                }
            } else {
                ((cwf) list.get(num.intValue())).e = i;
                i3 -= i;
            }
        }
        return i3;
    }
}
