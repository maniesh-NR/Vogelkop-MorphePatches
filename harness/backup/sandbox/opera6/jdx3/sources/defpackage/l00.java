package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l00 extends xv8 {
    public static final /* synthetic */ int D = 0;

    @Override // defpackage.bu8, defpackage.o43, defpackage.cr
    public void i(boolean z) {
        super.i(z);
        cie cieVar = f0().u;
        if (!z) {
            cieVar.unregister();
            return;
        }
        ((i) this).itemView.setOnTouchListener(null);
        ((i) this).itemView.setOnClickListener(null);
        View view = ((i) this).itemView;
        pve pveVar = new pve((byte) 1);
        q9n.I(view, pveVar);
        ArrayList arrayList = pveVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view2 = (View) obj;
            view2.setOnTouchListener(null);
            view2.setOnClickListener(null);
            view2.setClickable(false);
        }
        cieVar.R = ((i) this).itemView;
        View[] viewArr = (View[]) arrayList.toArray(new View[0]);
        ArrayList arrayList2 = new ArrayList(viewArr.length);
        cieVar.Q = arrayList2;
        arrayList2.addAll(Arrays.asList(viewArr));
        cieVar.S = this.x;
        View view3 = this.y;
        if (view3 instanceof jsd) {
            cieVar.h((jsd) view3);
        } else {
            cieVar.h(null);
        }
    }

    @Override // defpackage.o43
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final x10 e0() {
        return (x10) ((mq) this.b);
    }

    @Override // defpackage.bu8
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final w10 f0() {
        return (w10) Z().d;
    }

    @Override // defpackage.ab2
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final x10 Z() {
        return (x10) ((mq) a0());
    }
}
