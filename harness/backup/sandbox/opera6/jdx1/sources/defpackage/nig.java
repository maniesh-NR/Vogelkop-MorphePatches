package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nig extends d {
    public List a = new ArrayList();
    public final /* synthetic */ uig b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ uig d;

    public nig(uig uigVar, byte b) {
        this.c = b;
        this.d = uigVar;
        this.b = uigVar;
    }

    private final void K(String str) {
    }

    public final boolean G(nyl nylVar) {
        for (int i = 0; i < this.a.size(); i++) {
            if (nylVar.H.containsKey(((sig) this.a.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public final void H(List list) {
        uig uigVar = this.d;
        ImageView imageView = uigVar.B;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((csh) list).d) {
                break;
            }
            sig sigVar = (sig) ((csh) list).get(i);
            if (sigVar.a.e[sigVar.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? uigVar.g0 : uigVar.h0);
            imageView.setContentDescription(z ? uigVar.i0 : uigVar.j0);
        }
        this.a = list;
    }

    public final void I(rig rigVar, int i) {
        switch (this.c) {
            case 1:
                J(rigVar, i);
                if (i > 0) {
                    sig sigVar = (sig) this.a.get(i - 1);
                    rigVar.c.setVisibility(sigVar.a.e[sigVar.b] ? 0 : 4);
                    break;
                }
                break;
            default:
                J(rigVar, i);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.rig r8, int r9) {
        /*
            r7 = this;
            uig r0 = r7.b
            gig r3 = r0.o0
            if (r3 != 0) goto L7
            return
        L7:
            r0 = 4
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L7a
            byte r9 = r7.c
            switch(r9) {
                case 0: goto L4e;
                default: goto L11;
            }
        L11:
            android.widget.TextView r9 = r8.b
            r3 = 2132018959(0x7f14070f, float:1.967624E38)
            r9.setText(r3)
            r9 = r1
        L1a:
            java.util.List r3 = r7.a
            int r3 = r3.size()
            if (r9 >= r3) goto L39
            java.util.List r3 = r7.a
            java.lang.Object r3 = r3.get(r9)
            sig r3 = (defpackage.sig) r3
            ezl r4 = r3.a
            int r3 = r3.b
            boolean[] r4 = r4.e
            boolean r3 = r4[r3]
            if (r3 == 0) goto L36
            r2 = r1
            goto L39
        L36:
            int r9 = r9 + 1
            goto L1a
        L39:
            android.view.View r9 = r8.c
            if (r2 == 0) goto L3e
            r0 = r1
        L3e:
            r9.setVisibility(r0)
            android.view.View r8 = r8.itemView
            zvd r9 = new zvd
            r0 = 18
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
            goto L79
        L4e:
            android.widget.TextView r9 = r8.b
            r2 = 2132018958(0x7f14070e, float:1.9676237E38)
            r9.setText(r2)
            uig r9 = r7.d
            gig r9 = r9.o0
            r9.getClass()
            nyl r9 = r9.L()
            boolean r9 = r7.G(r9)
            android.view.View r2 = r8.c
            if (r9 != 0) goto L6a
            r0 = r1
        L6a:
            r2.setVisibility(r0)
            android.view.View r8 = r8.itemView
            zvd r9 = new zvd
            r0 = 16
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
        L79:
            return
        L7a:
            java.util.List r4 = r7.a
            int r9 = r9 - r2
            java.lang.Object r9 = r4.get(r9)
            r5 = r9
            sig r5 = (defpackage.sig) r5
            ezl r9 = r5.a
            eyl r4 = r9.b
            nyl r9 = r3.L()
            l1b r9 = r9.H
            java.lang.Object r9 = r9.get(r4)
            if (r9 == 0) goto L9e
            ezl r9 = r5.a
            int r6 = r5.b
            boolean[] r9 = r9.e
            boolean r9 = r9[r6]
            if (r9 != 0) goto L9f
        L9e:
            r2 = r1
        L9f:
            android.widget.TextView r9 = r8.b
            java.lang.String r6 = r5.c
            r9.setText(r6)
            android.view.View r9 = r8.c
            if (r2 == 0) goto Lab
            r0 = r1
        Lab:
            r9.setVisibility(r0)
            android.view.View r8 = r8.itemView
            tig r1 = new tig
            r6 = 0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nig.J(rig, int):void");
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.d
    public final /* bridge */ /* synthetic */ void onBindViewHolder(i iVar, int i) {
        switch (this.c) {
            case 1:
                I((rig) iVar, i);
                break;
            default:
                I((rig) iVar, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rig(LayoutInflater.from(this.b.getContext()).inflate(2131558708, viewGroup, false));
    }
}
