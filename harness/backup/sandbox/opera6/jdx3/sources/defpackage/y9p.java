package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y9p extends aoo {
    public static final /* synthetic */ int v = 0;
    public final dcl u;

    public y9p(Context context, dcl dclVar) {
        super(context, ((dzo) dclVar.a).c);
        this.u = dclVar;
        h9p h9pVar = new h9p(this);
        nyo nyoVar = ((dzo) dclVar.a).c;
        nyoVar.a.add(h9pVar);
        addView(nyoVar, new FrameLayout.LayoutParams(-1, -1));
        this.j = nyoVar;
    }

    @Override // defpackage.aoo
    public final View k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aoo
    public final void o() {
        dcl dclVar = this.u;
        upj.j(((dzo) dclVar.a).c);
        dzo dzoVar = (dzo) dclVar.a;
        nyo nyoVar = dzoVar.c;
        nyoVar.destroyDrawingCache();
        nyoVar.destroy();
        WeakReference weakReference = dzoVar.b;
        if (weakReference != null) {
            weakReference.clear();
            dzoVar.b = null;
        }
    }

    @Override // defpackage.aoo
    public final void p() {
        sc scVar = this.o;
        if (scVar != null) {
            scVar.a();
        }
        dcl dclVar = this.u;
        dzo dzoVar = (dzo) dclVar.a;
        nyo nyoVar = dzoVar.c;
        if (!dzoVar.f) {
            nyoVar.getSettings().setJavaScriptEnabled(false);
            nyoVar.onPause();
            dzoVar.f = true;
        }
        upj.j(((dzo) dclVar.a).c);
    }

    @Override // defpackage.aoo
    public final void q(View view) {
        dzo dzoVar = (dzo) this.u.a;
        if (view == dzoVar.c) {
            dzoVar.g = SystemClock.uptimeMillis();
        }
        t();
    }

    @Override // defpackage.aoo
    public final void r() {
        dcl dclVar = this.u;
        if (((dzo) dclVar.a).f) {
            dclVar.i();
        }
        ((dzo) dclVar.a).c.evaluateJavascript("(function() { try {   if (typeof fireOperaAdxImpressionEvent === 'function') {       fireOperaAdxImpressionEvent();       return 'success';   }   return 'fireOperaAdxImpressionEvent not defined'; } catch(e) {   return 'error: ' + e.message; }})()", new z4d((byte) 6));
    }
}
