package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fg extends skb {
    public final ro3 k;
    public xo8 l;

    public fg(vo3 vo3Var, ro3 ro3Var) {
        super(vo3Var);
        this.k = ro3Var;
    }

    @Override // defpackage.skb, defpackage.blb
    public final void o(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        super.o(canvas, recyclerView, iVar, f, f2, i, z);
        xo8 xo8Var = this.l;
        if (xo8Var != null) {
            y(xo8Var, iVar.itemView);
        }
    }

    @Override // defpackage.blb
    public final boolean r(RecyclerView recyclerView, i iVar, i iVar2) {
        pc pcVar;
        Integer numValueOf = Integer.valueOf(iVar.getBindingAdapterPosition());
        ro3 ro3Var = this.k;
        pc pcVar2 = (pc) ro3Var.invoke(numValueOf);
        if (pcVar2 == null || (pcVar = (pc) ro3Var.invoke(Integer.valueOf(iVar2.getBindingAdapterPosition()))) == null) {
            return false;
        }
        wo3 wo3Var = this.e.d;
        SettingsManager settingsManager = wo3Var.t;
        ArrayList arrayList = new ArrayList(vtp.I(settingsManager, wo3Var.x));
        int iIndexOf = arrayList.indexOf(pcVar2);
        int iIndexOf2 = arrayList.indexOf(pcVar);
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return false;
        }
        arrayList.add(iIndexOf2, arrayList.remove(iIndexOf));
        wo3Var.F.P(arrayList);
        vtp.U(settingsManager, arrayList);
        np1 np1Var = wo3Var.I;
        if (np1Var == null) {
            np1Var = null;
        }
        np1Var.b = true;
        return true;
    }

    @Override // defpackage.skb
    public final void w(i iVar) {
        pc pcVar = (pc) this.k.invoke(Integer.valueOf(iVar.getBindingAdapterPosition()));
        if (pcVar == null) {
            return;
        }
        int i = xo8.l;
        vo3 vo3Var = this.e;
        FrameLayout frameLayout = vo3Var.c;
        t79 t79Var = vo3Var.d.H;
        xo8 xo8VarR = sgb.r(frameLayout, t79Var != null ? Integer.valueOf(t79Var.s0()) : null, vo3Var.a, vo3Var.b);
        this.l = xo8VarR;
        y(xo8VarR, iVar.itemView);
        if (pcVar != xo8VarR.i) {
            xo8VarR.i = pcVar;
            xo8VarR.b();
        }
        vo3Var.c.addView(xo8VarR.c);
        RelativeLayout relativeLayout = xo8VarR.e;
        Context context = iVar.itemView.getContext();
        ixh ixhVar = skb.i;
        relativeLayout.setTranslationZ(ixhVar.l(context));
        xo8VarR.d.animate().setDuration(pn7.f(skb.j)).translationZ(ixhVar.l(iVar.itemView.getContext())).withEndAction(new eg(xo8VarR, (byte) 0));
    }

    @Override // defpackage.skb
    public final void x(i iVar, xj7 xj7Var) {
        xo8 xo8Var = this.l;
        if (xo8Var != null) {
            xo8Var.c.postOnAnimationDelayed(new y1n(new x2(this, xo8Var, (byte) 3), (byte) 7), 200L);
        }
    }

    public final void y(xo8 xo8Var, View view) {
        vo3 vo3Var = this.e;
        FrameLayout frameLayout = vo3Var.c;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        frameLayout.getLocationInWindow(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        FrameLayout frameLayout2 = xo8Var.c;
        int i3 = rect.left;
        int iWidth = rect.width();
        FrameLayout frameLayout3 = xo8Var.c;
        int width = ((iWidth - frameLayout3.getWidth()) / 2) + i3;
        FrameLayout frameLayout4 = vo3Var.c;
        frameLayout2.setTranslationX(width - frameLayout4.getPaddingLeft());
        frameLayout3.setTranslationY((((rect.height() - frameLayout3.getHeight()) / 2) + rect.top) - frameLayout4.getPaddingTop());
    }
}
