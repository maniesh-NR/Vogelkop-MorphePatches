package defpackage;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import androidx.media3.ui.PlayerView;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public class kx8 extends ltl {
    public qi8 r;
    public PlayerView s;

    /* JADX WARN: Illegal instructions before constructor call */
    public kx8() {
        itl itlVar = (itl) u7k.j(2131558726).a;
        itlVar.e = true;
        super(itlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0056  */
    @Override // defpackage.ltl, defpackage.ryl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx8.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.r.release();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.s.g((gig) null);
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        this.r.setPlayWhenReady(false);
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.k.e(-16777216);
        Context context = view.getContext();
        String[] strArr = OperaApplication.K;
        ((View) m5n.f(view, ((LightingColorFilter) ((OperaApplication) context.getApplicationContext()).B().a.b) != null ? 2131364583 : 2131364582)).setVisibility(0);
        PlayerView playerView = (View) m5n.f(view, 2131364455);
        this.s = playerView;
        playerView.g(this.r);
        this.r.setPlayWhenReady(true);
    }
}
