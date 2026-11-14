package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import java.util.List;

/* loaded from: classes.dex */
public final class qkc extends d {
    public final rkc a;
    public final js6 b;
    public final noc c;
    public final rlh d;
    public final fwf e;
    public final wub f;
    public boolean m;
    public final aan g = new aan();
    public final yzb h = new yzb((Object) this, (byte) 7);
    public final okc i = new okc(this);
    public final pkc j = new pkc(this);
    public boolean k = true;
    public boolean l = true;
    public List n = l08.a;

    public qkc(rkc rkcVar, js6 js6Var, noc nocVar, rlh rlhVar, fwf fwfVar, wub wubVar) {
        this.a = rkcVar;
        this.b = js6Var;
        this.c = nocVar;
        this.d = rlhVar;
        this.e = fwfVar;
        this.f = wubVar;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        return this.n.size();
    }

    public final long getItemId(int i) {
        return ((llc) this.n.get(i)).a();
    }

    public final int getItemViewType(int i) {
        llc llcVar = (llc) this.n.get(i);
        if (llcVar != null) {
            if (llcVar instanceof jlc) {
                ykc[] ykcVarArr = ykc.b;
                return 0;
            }
            if (llcVar instanceof hlc) {
                ykc[] ykcVarArr2 = ykc.b;
                return 1;
            }
            if (llcVar instanceof dlc) {
                ykc[] ykcVarArr3 = ykc.b;
                return 2;
            }
            if (llcVar instanceof blc) {
                ykc[] ykcVarArr4 = ykc.b;
                return 3;
            }
            if (llcVar instanceof flc) {
                ykc[] ykcVarArr5 = ykc.b;
                return 4;
            }
        }
        h9o.p();
        return 0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        aan aanVar = this.g;
        aanVar.e(recyclerView);
        aanVar.b(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.i r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkc.onBindViewHolder(androidx.recyclerview.widget.i, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02b5 A[PHI: r1
      0x02b5: PHI (r1v9 int) = (r1v8 int), (r1v10 int), (r1v13 int), (r1v15 int) binds: [B:102:0x0257, B:104:0x0262, B:108:0x0277, B:112:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c A[PHI: r5
      0x017c: PHI (r5v8 int) = (r5v0 int), (r5v9 int) binds: [B:55:0x0142, B:57:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i onCreateViewHolder(android.view.ViewGroup r27, int r28) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkc.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.i");
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        aan aanVar = this.g;
        recyclerView.t0(aanVar.d);
        z61 z61Var = aanVar.e;
        if (z61Var != null) {
            recyclerView.removeOnAttachStateChangeListener(z61Var);
            if (recyclerView.isAttachedToWindow()) {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) z61Var.b);
            }
            aanVar.e = null;
        }
        aanVar.b(false);
    }

    public final void onViewRecycled(i iVar) {
        zkc zkcVar = (zkc) iVar;
        super.onViewRecycled(zkcVar);
        if (zkcVar != null) {
            if (zkcVar instanceof zoc) {
                zoc zocVar = (zoc) zkcVar;
                zocVar.j = null;
                ((LiveScoreCarouselStarButton) zocVar.c.i).setOnClickListener(null);
                zocVar.i.c0();
            } else if (zkcVar instanceof hoc) {
                hoc hocVar = (hoc) zkcVar;
                hocVar.h = null;
                hocVar.g.c0();
            } else if (zkcVar instanceof znc) {
                znc zncVar = (znc) zkcVar;
                zncVar.h = null;
                zncVar.g.c0();
            } else if (zkcVar instanceof xkc) {
                xkc xkcVar = (xkc) zkcVar;
                xkcVar.g = null;
                xkcVar.f.c0();
            } else if (zkcVar instanceof foc) {
                foc focVar = (foc) zkcVar;
                focVar.g = null;
                focVar.f.c0();
            }
            aan aanVar = this.g;
            aanVar.getClass();
            aanVar.a(((i) zkcVar).itemView);
            return;
        }
        h9o.p();
    }
}
