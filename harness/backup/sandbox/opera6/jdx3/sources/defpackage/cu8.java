package defpackage;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class cu8 extends ha2 {
    public byte k;
    public tx7 l;

    public cu8(tni tniVar) {
        super(tniVar);
        this.k = (byte) 1;
        this.l = new w4a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ha2
    public final void T(ab2 ab2Var) {
        if (ab2Var instanceof za2) {
            ((za2) ab2Var).H();
        }
    }

    public final boolean Y(boolean z) {
        if (this.k == 1) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            int iF = this.l.f(i);
            byte b = this.k;
            if (iF == 1) {
                i2 = i2 == b + (-1) ? 0 : i2 + 1;
            } else if (iF != b || i2 != 0) {
                tx7 tx7Var = this.l;
                int i3 = i + 1;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    }
                    if (tx7Var.f(i3) == 1) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    break;
                }
                int i4 = i3;
                while (i4 > i) {
                    int i5 = i4 - 1;
                    Collections.swap(arrayList, i5, i4);
                    if (z) {
                        notifyItemMoved(i5, i4);
                    }
                    i4--;
                    z2 = true;
                }
                this.l.g();
                this.l.h();
                i2 = 0;
                i = i3;
            }
            i++;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(int i, tx7 tx7Var) {
        if (this.j != i) {
            this.j = i;
            bmb it = sfe.R((i7f) this.d.a, bu8.class).iterator();
            while (true) {
                bmb bmbVar = it;
                if (!bmbVar.hasNext()) {
                    break;
                }
                int adapterPosition = ((ab2) bmbVar.next()).getAdapterPosition();
                if (adapterPosition != -1) {
                    notifyItemChanged(adapterPosition);
                }
            }
        }
        this.l = tx7Var;
        if (this.k != i) {
            this.k = i;
            if (i > 1) {
                Y(true);
            }
        }
    }

    public final void b0(Collection collection) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(collection);
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((fa2) it.next()).S().d(0, arrayList);
        }
        this.l.g();
        this.l.h();
        Y(false);
        notifyDataSetChanged();
    }

    @Override // defpackage.ha2
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(i iVar) {
        T((ab2) iVar);
        return true;
    }
}
