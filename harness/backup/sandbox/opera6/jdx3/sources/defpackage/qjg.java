package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.opera.android.media.PlayerService;

/* loaded from: classes.dex */
public final class qjg implements eig {
    public final /* synthetic */ tjg a;

    public qjg(tjg tjgVar) {
        this.a = tjgVar;
    }

    public final void B(int i, qjd qjdVar) {
        tjg tjgVar = this.a;
        if (qjdVar != null && i != 0) {
            tjgVar.i.c(thg.d);
        }
        if (i == 3) {
            tjgVar.g();
        }
    }

    public final void F(rhg rhgVar) throws Resources.NotFoundException {
        vjd vjdVar;
        tjg tjgVar = this.a;
        qjd qjdVarG = ((gk9) tjgVar.i).b.g();
        CharSequence charSequenceA = null;
        egd egdVar = qjdVarG != null ? (egd) tjgVar.k.e.get(qjdVarG.a) : null;
        djg djgVar = tjgVar.c;
        Context context = tjgVar.a;
        if (qjdVarG != null && (charSequenceA = (vjdVar = qjdVarG.e).e) == null) {
            charSequenceA = vjdVar.a;
        }
        if (charSequenceA == null && egdVar != null) {
            charSequenceA = egdVar.a();
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        String string = context.getResources().getString(2132021996, charSequenceA);
        pjg pjgVar = new pjg(this, (byte) 0);
        g7f g7fVar = new g7f(djgVar.a);
        while (g7fVar.hasNext()) {
            zw3 zw3Var = (zw3) g7fVar.next();
            qim qimVar = zw3Var.a.o;
            if (qimVar != null) {
                ysj ysjVar = qimVar.e;
                tl3 tl3Var = new tl3(zw3Var, string, pjgVar, (byte) 3);
                ysjVar.getClass();
                ysjVar.b(tl3Var, ijm.b);
            }
        }
    }

    public final void K(gql gqlVar, int i) {
        this.a.g();
    }

    public final void P(boolean z) throws SecurityException {
        Context context = this.a.a;
        if (z) {
            bp.S(context, PlayerService.class, "launch");
            bp.R(context, PlayerService.class);
        }
    }

    public final void h(int i) {
    }

    public final void onPositionDiscontinuity(int i) {
        mjd mjdVar;
        tjg tjgVar = this.a;
        qjd qjdVarG = ((gk9) tjgVar.i).b.g();
        if (!tjgVar.p && i == 1) {
            tjgVar.i.setPlayWhenReady(true);
        }
        if (i == 1 || i == 0) {
            tjgVar.h();
        }
        if (tjgVar.g != null) {
            boolean z = false;
            if (qjdVarG != null && (mjdVar = qjdVarG.c) != null && !s29.g(mjdVar.a)) {
                z = true;
            }
            tjgVar.g.S0(z ? 2 : 1);
        }
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        tjg tjgVar = this.a;
        if (!z) {
            okg okgVar = tjgVar.k;
            okgVar.c.b();
            okgVar.b.b();
        }
        tjgVar.h();
    }
}
