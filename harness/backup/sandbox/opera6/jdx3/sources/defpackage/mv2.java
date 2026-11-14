package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class mv2 extends skb {
    public final ro3 k;

    public mv2(vo3 vo3Var, ro3 ro3Var) {
        super(vo3Var);
        this.k = ro3Var;
    }

    @Override // defpackage.skb
    public final xj7 v() {
        pc pcVar;
        i iVar = this.f;
        if (iVar != null) {
            pc pcVar2 = (pc) this.k.invoke(Integer.valueOf(iVar.getBindingAdapterPosition()));
            if (pcVar2 != null) {
                View view = iVar.itemView;
                wo3 wo3Var = this.e.d;
                Rect rectR = q9n.r(view);
                ArrayList arrayList = new ArrayList();
                h6n it = new g6n(wo3Var.J0().b).iterator();
                while (true) {
                    h6n h6nVar = it;
                    if (!h6nVar.hasNext()) {
                        break;
                    }
                    View view2 = (View) h6nVar.next();
                    i iVarT = wo3Var.J0().b.T(view2);
                    vf vfVar = (vf) wo3Var.F.H(iVarT != null ? iVarT.getBindingAdapterPosition() : -1);
                    if (vfVar != null) {
                        pc pcVar3 = vfVar.a;
                        Rect rectR2 = q9n.r(view2);
                        wo3.K.getClass();
                        int iHeight = rectR2.height() * rectR2.width();
                        int i = rectR.left;
                        int i2 = rectR2.left;
                        if (i < i2) {
                            i = i2;
                        }
                        int i3 = rectR.top;
                        int i4 = rectR2.top;
                        if (i3 < i4) {
                            i3 = i4;
                        }
                        int i5 = rectR.right;
                        int i6 = rectR2.right;
                        if (i5 > i6) {
                            i5 = i6;
                        }
                        int i7 = rectR.bottom;
                        int i8 = rectR2.bottom;
                        if (i7 > i8) {
                            i7 = i8;
                        }
                        int i9 = i5 - i;
                        int i10 = i7 - i3;
                        int i11 = (i9 <= 0 || i10 <= 0) ? 0 : i9 * i10;
                        float f = (i11 <= 0 || iHeight <= 0) ? 0.0f : i11 / iHeight;
                        if (f > 0.0f && !dq3.b.contains(pcVar3)) {
                            arrayList.add(new sm7(pcVar3, (tf) iVarT, f));
                        }
                    }
                }
                sm7 sm7Var = (sm7) CollectionsKt.firstOrNull(CollectionsKt.c0(o1i.a, arrayList));
                tf tfVar = null;
                if (sm7Var == null || sm7Var.c < 0.25f) {
                    sm7Var = null;
                }
                if (sm7Var != null) {
                    pc pcVar4 = sm7Var.a;
                    tfVar = sm7Var.b;
                    pcVar = pcVar4;
                } else {
                    pcVar = null;
                }
                return new wj7(pcVar2, pcVar, tfVar);
            }
        }
        return uj7.a;
    }

    @Override // defpackage.skb
    public final void x(i iVar, xj7 xj7Var) {
        pc pcVar;
        if (xj7Var instanceof wj7) {
            wj7 wj7Var = (wj7) xj7Var;
            pc pcVar2 = wj7Var.a;
            tf tfVar = wj7Var.c;
            if (tfVar == null || (pcVar = wj7Var.b) == null) {
                return;
            }
            vo3 vo3Var = this.e;
            wo3 wo3Var = vo3Var.d;
            SettingsManager settingsManager = wo3Var.t;
            ArrayList arrayList = new ArrayList(vtp.I(settingsManager, wo3Var.x));
            int iIndexOf = arrayList.indexOf(pcVar);
            if (iIndexOf != -1) {
                arrayList.set(iIndexOf, pcVar2);
                vtp.U(settingsManager, arrayList);
                np1 np1Var = wo3Var.I;
                if (np1Var == null) {
                    np1Var = null;
                }
                np1Var.c = true;
            }
            View view = iVar.itemView;
            View view2 = ((i) tfVar).itemView;
            FrameLayout frameLayout = vo3Var.c;
            int i = xo8.l;
            t79 t79Var = vo3Var.d.H;
            xo8 xo8VarR = sgb.r(frameLayout, t79Var != null ? Integer.valueOf(t79Var.s0()) : null, vo3Var.a, vo3Var.b);
            Rect rectF = w7d.F(view, frameLayout);
            Rect rectF2 = w7d.F(view2, frameLayout);
            FrameLayout frameLayout2 = xo8VarR.c;
            frameLayout2.setTranslationX(rectF.left);
            frameLayout2.setTranslationY(rectF.top);
            RelativeLayout relativeLayout = xo8VarR.d;
            Context context = view.getContext();
            ixh ixhVar = skb.i;
            relativeLayout.setTranslationZ(ixhVar.l(context));
            xo8VarR.e.setTranslationZ(ixhVar.l(view.getContext()));
            if (pcVar2 != xo8VarR.i) {
                xo8VarR.i = pcVar2;
                xo8VarR.b();
            }
            xo8VarR.c(wo8.a);
            frameLayout.addView(frameLayout2);
            frameLayout2.animate().translationX(((rectF2.width() - rectF.width()) / 2.0f) + rectF2.left).translationY(((rectF2.height() - rectF.height()) / 2.0f) + rectF2.top).setDuration(200L).withEndAction(new eg(xo8VarR, (byte) 1));
        }
    }
}
