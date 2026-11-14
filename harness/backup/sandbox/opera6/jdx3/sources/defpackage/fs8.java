package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.a;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;

/* loaded from: classes.dex */
public abstract class fs8 extends es8 implements View.OnClickListener, View.OnLongClickListener, th7, gq8 {
    public hq8 f;
    public final fr8 g;
    public final fr8 h;

    public fs8(fr8 fr8Var) {
        super(fr8Var);
        this.g = fr8Var;
        this.h = fr8Var;
    }

    @Override // defpackage.th7
    public final void B() {
        this.h.setBackground(null);
        setIsRecyclable(false);
    }

    @Override // defpackage.th7
    public final boolean C() {
        return true;
    }

    @Override // defpackage.th7
    public final void E() {
        fr8 fr8Var = this.h;
        fr8Var.setBackground(fr8Var.q);
        setIsRecyclable(true);
    }

    @Override // defpackage.th7
    public final boolean I(i iVar) {
        return true;
    }

    @Override // defpackage.th7
    public final void K(i iVar) {
        int adapterPosition = iVar.getAdapterPosition();
        e eVarY = Y();
        hq8 hq8Var = this.f;
        eVarY.d(hq8Var, hq8Var.b, adapterPosition);
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
        Z(null);
    }

    @Override // defpackage.es8
    public final void U(StringBuilder sb) {
        super.U(sb);
        if (this.f != null) {
            sb.append("/-");
            sb.append(aik.b(this.f.g(), "null"));
            sb.append("-/");
            hq8 hq8Var = this.f;
            sb.append(hq8Var instanceof tq8 ? Integer.valueOf(((tq8) hq8Var).e.size()) : "x");
            sb.append("/0");
        }
    }

    @Override // defpackage.es8
    public final void V() {
        super.V();
        ((i) this).itemView.setOnClickListener(this);
        ((i) this).itemView.setOnLongClickListener(this);
        ((i) this).itemView.setOnTouchListener(new hs8(this, (byte) 0));
    }

    public final e Y() {
        Context context = ((i) this).itemView.getContext();
        String[] strArr = OperaApplication.K;
        return (e) ((OperaApplication) context.getApplicationContext()).o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.Drawable, ol7, zu4] */
    public void Z(hq8 hq8Var) {
        hq8 hq8Var2 = this.f;
        if (hq8Var2 == hq8Var) {
            return;
        }
        if (hq8Var2 != null) {
            hq8Var2.o(this);
        }
        ((i) this).itemView.setVisibility(0);
        this.f = hq8Var;
        if (hq8Var != null) {
            hq8Var.b(this);
            boolean zIsEmpty = this.f.h().isEmpty();
            fr8 fr8Var = this.g;
            ?? r2 = fr8Var.q;
            if (zIsEmpty) {
                Rect rect = fr8Var.r;
                r2.c = rect;
                Drawable drawable = ((ol7) r2).a;
                if (drawable != null) {
                    drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                }
                r2.invalidateSelf();
                fr8Var.setBackground(r2);
            } else {
                r2.c = null;
                r2.invalidateSelf();
                fr8Var.setBackground(r2);
            }
        }
        a0(this.f, false);
    }

    @Override // defpackage.th7
    public final void a(i iVar) {
        hq8 hq8Var;
        int i;
        hq8 hq8Var2 = ((fs8) iVar).f;
        if (hq8Var2 == null || (hq8Var = this.f) == null) {
            return;
        }
        if ((hq8Var instanceof tq8) && !(hq8Var2 instanceof tq8)) {
            tq8 tq8Var = (tq8) hq8Var;
            Y().d(hq8Var2, tq8Var, tq8Var.e.size());
            return;
        }
        e eVarY = Y();
        hq8 hq8Var3 = this.f;
        eVarY.getClass();
        if (!hq8Var2.j()) {
            tq8 tq8Var2 = hq8Var3.b;
            tq8Var2.getClass();
            i = hq8Var3.b == tq8Var2 ? hq8Var3.c : -1;
            i7f i7fVar = FavoritesBridge.a;
            FavoritesBridge.Folder folder = (FavoritesBridge.Folder) N.M98NjnEk(i, "");
            N.MPjvJx9a(folder.a, ((a) hq8Var3).f.a);
            N.MPjvJx9a(folder.a, ((a) hq8Var2).f.a);
            return;
        }
        if (hq8Var3.j()) {
            tq8 tq8Var3 = (tq8) hq8Var2;
            tq8 tq8Var4 = (tq8) hq8Var3;
            String strH = tq8Var4.h();
            String strH2 = tq8Var3.h();
            if (strH.length() == 0 && strH2.length() > 0) {
                tq8Var4.q(strH2);
            }
            N.MADVX$$f(((b) tq8Var4).i.a, ((b) tq8Var3).i.a);
            return;
        }
        b bVar = (b) hq8Var2;
        tq8 tq8Var5 = hq8Var3.b;
        tq8Var5.getClass();
        i = hq8Var3.b == tq8Var5 ? hq8Var3.c : -1;
        if (i > 0 && tq8Var5.u(i - 1) == hq8Var2) {
            i--;
        }
        eVarY.d(hq8Var3, bVar, 0);
        N.Mv32kuYR(((b) tq8Var5).i.a, i, bVar.i.a);
    }

    public void a0(hq8 hq8Var, boolean z) {
        this.b.m = false;
    }

    @Override // defpackage.th7
    public final View e() {
        return ((i) this).itemView;
    }

    @Override // defpackage.th7
    public final Object f() {
        return this.f;
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        boolean z = i == 7;
        hq8 hq8Var2 = this.f;
        if (hq8Var2 != null) {
            a0(hq8Var2, z);
        }
    }
}
