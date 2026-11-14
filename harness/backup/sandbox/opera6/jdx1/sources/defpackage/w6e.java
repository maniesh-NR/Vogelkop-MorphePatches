package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w6e extends ce5 {
    public Function0 e;
    public j7e f;
    public long g;
    public final View h;
    public final t6e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6e(Function0 function0, j7e j7eVar, long j, View view, d2c d2cVar, n27 n27Var, UUID uuid, cd1 cd1Var, nx5 nx5Var) {
        super(new ContextThemeWrapper(view.getContext(), 2132083145), 0);
        boolean z = false;
        this.e = function0;
        this.f = j7eVar;
        this.g = j;
        this.h = view;
        Window window = getWindow();
        if (window == null) {
            qp2.n("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        ocp.p(window, false);
        t6e t6eVar = new t6e(getContext(), window);
        t6eVar.setTag(2131362390, "Dialog:" + uuid);
        t6eVar.setClipChildren(false);
        t6eVar.setElevation(n27Var.o0(8.0f));
        t6eVar.setOutlineProvider(new zq3((byte) 3));
        this.i = t6eVar;
        setContentView(t6eVar);
        t6eVar.setTag(2131365017, z7h.j(view));
        t6eVar.setTag(2131365021, w8h.k(view));
        t6eVar.setTag(2131365020, b8h.e(view));
        d(this.e, this.f, this.g, d2cVar);
        oji ojiVar = new oji(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        w1h j3oVar = i >= 35 ? new j3o(window, ojiVar) : i >= 30 ? new i3o(window, ojiVar) : new h3o(window, ojiVar);
        this.f.getClass();
        long j2 = this.g;
        long j3 = u95.f;
        j3oVar.w(!jgm.a(j2, j3) && ((double) cs5.f0(j2)) <= 0.5d);
        this.f.getClass();
        if (!jgm.a(this.g, j3) && cs5.f0(r3) <= 0.5d) {
            z = true;
        }
        j3oVar.v(z);
        kcf onBackPressedDispatcher = getOnBackPressedDispatcher();
        this.f.getClass();
        onBackPressedDispatcher.a(this, new v6e(nx5Var, cd1Var, new q4b(this, (byte) 29)));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(Function0 function0, j7e j7eVar, long j, d2c d2cVar) {
        this.e = function0;
        this.f = j7eVar;
        this.g = j;
        j7eVar.getClass();
        cwi cwiVar = cwi.a;
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        getWindow().setFlags(layoutParams2 != null && (layoutParams2.flags & 8192) != 0 ? 8192 : -8193, 8192);
        int iOrdinal = d2cVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            h9o.p();
            return;
        }
        this.i.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.e.invoke();
        }
        return zOnTouchEvent;
    }
}
