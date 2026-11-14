package defpackage;

import android.widget.Filter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qdn extends Filter {
    public final List a;
    public final m2g b;

    public qdn(List list, m2g m2gVar) {
        this.a = list;
        this.b = m2gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0022 A[SYNTHETIC] */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r14) {
        /*
            r13 = this;
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            int r1 = r14.length()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L12
            r0.values = r3
            r0.count = r2
            return r0
        L12:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r13 = r13.a
            java.util.Iterator r13 = r13.iterator()
        L22:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r13.next()
            fdn r5 = (defpackage.fdn) r5
            boolean r6 = r5.b()
            fdn r7 = r5.f
            if (r6 == 0) goto L42
            x1b r6 = defpackage.pdn.a
            java.lang.String r8 = r5.a
            java.lang.Object r6 = r6.e
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L22
        L42:
            boolean r6 = r5.e
            r8 = 1
            if (r6 != 0) goto L99
            boolean r6 = r5.b()
            if (r6 == 0) goto L53
            scd r6 = new scd
            r6.<init>(r5, r8)
            goto L58
        L53:
            scd r6 = new scd
            r6.<init>(r5, r2)
        L58:
            java.lang.String r9 = r14.toString()
            byte r10 = r6.a
            fdn r6 = r6.b
            switch(r10) {
                case 0: goto L6f;
                default: goto L63;
            }
        L63:
            rcd r9 = scd.S(r9, r6)
            if (r9 == 0) goto L99
            wxc r10 = new wxc
            r10.<init>(r9, r6)
            goto La0
        L6f:
            if (r6 == 0) goto L99
            fdn r10 = r6.f
            rcd r11 = scd.S(r9, r10)
            rcd r9 = scd.S(r9, r6)
            if (r11 != 0) goto L7f
            if (r9 == 0) goto L99
        L7f:
            if (r9 != 0) goto L8d
            java.util.ArrayList r10 = r10.g
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            int r10 = r10.size()
            if (r10 <= r8) goto L99
        L8d:
            x1b r10 = defpackage.pdn.a
            java.lang.String r12 = r6.a
            java.lang.Object r10 = r10.e
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L9b
        L99:
            r10 = r3
            goto La0
        L9b:
            vxc r10 = new vxc
            r10.<init>(r11, r9, r6)
        La0:
            if (r10 == 0) goto L22
            r4.add(r10)
            boolean r5 = r5.b()
            if (r5 != 0) goto L22
            java.util.ArrayList r5 = r7.g
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            int r5 = r5.size()
            if (r5 != r8) goto L22
            java.lang.String r5 = r7.c
            r1.add(r5)
            goto L22
        Lbe:
            f15 r13 = new f15
            r14 = 8
            r13.<init>(r1, r14)
            sfe.A0(r4, r13)
            r0.values = r4
            int r13 = r4.size()
            r0.count = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdn.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list = (List) filterResults.values;
        if (list != null) {
            Collections.sort(list, new omj((byte) 18));
        }
        this.b.run(list);
    }
}
