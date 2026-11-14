package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pqc implements id {
    public final BrowserActivity a;
    public final BrowserActivity b;
    public final et3 c;
    public final fd d;
    public boolean e;
    public final zyk f = z4c.b(new q4b(this, 19));

    public pqc(BrowserActivity browserActivity, BrowserActivity browserActivity2, kze kzeVar, et3 et3Var, fd fdVar) {
        this.a = browserActivity;
        this.b = browserActivity2;
        this.c = et3Var;
        this.d = fdVar;
        this.e = ((Boolean) kzeVar.g()).booleanValue();
        kzeVar.j(browserActivity2, new iwa(new rkc((Object) this, (byte) 3), (byte) 2));
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        if (oqc.a[pcVar.ordinal()] != 1 || !this.e) {
            return null;
        }
        final byte b = 0;
        Function2 function2 = new Function2(this) { // from class: nqc
            public final /* synthetic */ pqc b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                pqc pqcVar = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        ((rnc) pqcVar.f.getValue()).a(pqcVar.b).D(pqcVar.a, hqc.b, null);
                        break;
                    default:
                        new dd(pqcVar.d).o(view);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        return new jf(function2, new Function2(this) { // from class: nqc
            public final /* synthetic */ pqc b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                pqc pqcVar = this.b;
                View view = (View) obj;
                switch (b22) {
                    case 0:
                        ((rnc) pqcVar.f.getValue()).a(pqcVar.b).D(pqcVar.a, hqc.b, null);
                        break;
                    default:
                        new dd(pqcVar.d).o(view);
                        break;
                }
                return Unit.a;
            }
        }, false, false, 60);
    }
}
