package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import com.google.android.material.chip.Chip;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ote extends i implements View.OnClickListener {
    public final Chip b;
    public final /* synthetic */ pte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ote(pte pteVar, View view) {
        super(view);
        this.c = pteVar;
        this.b = (Chip) view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        pte pteVar = this.c;
        cwf cwfVar = (cwf) pteVar.w.get(adapterPosition);
        boolean z = cwfVar.b;
        boolean z2 = !z;
        if (z) {
            Iterator it = pteVar.w.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((cwf) it.next()).b) {
                    i++;
                }
            }
            if (i == 1) {
                pteVar.n.f(new glj(new rxh(2132018544), 2500));
                return;
            }
        }
        cwfVar.b = z2;
        if (cwfVar instanceof cwf) {
            bwf bwfVar = cwfVar.f;
            if ("cur_city_id".equals(bwfVar.a())) {
                pteVar.E = z2;
                ste steVar = (ste) pteVar.z.e.g();
                if (steVar != null) {
                    pteVar.L0(steVar);
                }
            }
            if (!z) {
                bwfVar.a();
            }
        }
        pteVar.y.notifyItemChanged(adapterPosition);
        pteVar.J0();
    }
}
