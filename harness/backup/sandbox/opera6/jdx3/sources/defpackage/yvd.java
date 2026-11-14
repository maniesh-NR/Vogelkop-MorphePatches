package defpackage;

import android.view.View;
import androidx.fragment.app.r;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class yvd extends dwd {
    public final /* synthetic */ byte g = 0;
    public final Object h;
    public Object i;

    public yvd(mej mejVar, ib9 ib9Var, fge fgeVar) {
        super(mejVar, ib9Var);
        this.h = fgeVar;
    }

    public yvd(mej mejVar, jb9 jb9Var, String str, vk2 vk2Var) {
        super(mejVar, jb9Var);
        this.h = str;
        this.i = vk2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0167 A[PHI: r9
      0x0167: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:25:0x00c8, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.dej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvd.a(android.content.Context):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.dwd
    public final void f(View view) {
        switch (this.g) {
            case 0:
                if (((vs) this.i) != null) {
                    ib9 ib9Var = (ib9) this.d;
                    String str = ib9Var.e;
                    String str2 = ib9Var.h;
                    int[][] iArr = lg7.a;
                    kg7 kg7VarG = lg7.g(c5o.m().o(str, str2));
                    view.setBackgroundColor(f03.t(kg7VarG.d, view.getContext(), 2131101243));
                    ?? r1 = (StylingImageView) ((vs) this.i).c;
                    r1.setImageDrawable(kg7VarG.h(2, r1.getContext()));
                    r1.setBackground(kg7VarG.g(2, r1.getContext()));
                    int iT = f03.t(kg7VarG.e, view.getContext(), 2131101243);
                    ((StylingTextView) ((vs) this.i).d).setTextColor(iT);
                    ((StylingTextView) ((vs) this.i).e).setTextColor(iT);
                    break;
                } else {
                    super.f(view);
                    break;
                }
            default:
                super.f(view);
                break;
        }
    }

    @Override // defpackage.dwd
    public final void h(hb9 hb9Var) {
        switch (this.g) {
            case 0:
                ib9 ib9Var = (ib9) hb9Var;
                fge fgeVar = (fge) this.h;
                fgeVar.getClass();
                if (ib9Var.l != null && !ib9Var.d.equals(fgeVar.t.a.u())) {
                    r rVarRequireActivity = fgeVar.requireActivity();
                    String[] strArr = OperaApplication.K;
                    rf7 rf7Var = ((OperaApplication) rVarRequireActivity.getApplication()).m().a;
                    re7 re7VarE = rf7Var.e(ib9Var.l, 0);
                    if (re7VarE != null) {
                        rf7Var.c(re7VarE, new ufe(fgeVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.dwd
    public final void j() {
        switch (this.g) {
            case 0:
                this.f = null;
                this.i = null;
                break;
            default:
                super.j();
                break;
        }
    }
}
