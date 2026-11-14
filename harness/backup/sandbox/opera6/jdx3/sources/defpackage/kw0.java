package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;
import com.opera.android.BrowserActivity;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import java.util.Arrays;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class kw0 implements dkj, wgb, n5o, rll, urg, fua, psk {
    public final /* synthetic */ Context a;

    public /* synthetic */ kw0(Context context) {
        this.a = context;
    }

    @Override // defpackage.dkj
    public final void a() {
        wzg wzgVar = new wzg(null, rbn.class, (byte) 4);
        Bundle bundle = new Bundle();
        bundle.putBoolean("highlight_active", true);
        new zhj(wzgVar, bundle, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(this.a);
    }

    public final qsk b(ev4 ev4Var) {
        String str = (String) ev4Var.e;
        e04 e04Var = (e04) ev4Var.f;
        if (str != null && str.length() != 0) {
            return new yo9(this.a, str, e04Var, true, true);
        }
        qp2.o("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public final Object g(Object obj) {
        Context context = this.a;
        lcp.F(context, (String) obj, false);
        Toast.makeText(context, "Data set to clipboard", 1).show();
        return Unit.a;
    }

    @Override // defpackage.wgb
    public final pne get() {
        int i = BrowserActivity.E1;
        return cqp.h0(this.a);
    }

    @Override // defpackage.rll
    public final Object getValue() {
        int i = LiveScoreAudioCommentaryView.f;
        return Integer.valueOf(f03.t(2130969284, this.a, 2131101243));
    }

    @Override // defpackage.fua
    public final Drawable i() {
        Context context = this.a;
        return ddh.p(false, sgb.F(2131231939, context), context);
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        return w8h.o(this.a, (String) obj);
    }
}
