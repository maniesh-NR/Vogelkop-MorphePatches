package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o2i implements id {
    public final BrowserActivity a;
    public final ikc b;
    public final ew3 c;
    public final fd d;
    public boolean e = b();

    public o2i(BrowserActivity browserActivity, ikc ikcVar, ew3 ew3Var, fd fdVar) {
        this.a = browserActivity;
        this.b = ikcVar;
        this.c = ew3Var;
        this.d = fdVar;
        ikcVar.j(browserActivity, new iwa(new rmg(this, (byte) 19), (byte) 25));
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        if (n2i.a[pcVar.ordinal()] != 1 || !this.e) {
            return null;
        }
        final byte b = 0;
        Function2 function2 = new Function2(this) { // from class: m2i
            public final /* synthetic */ o2i b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                o2i o2iVar = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        e4i e4iVar = (e4i) o2iVar.c.get();
                        BrowserActivity browserActivity = o2iVar.a;
                        o3i o3iVar = o3i.TOOLBAR_SHORTCUT;
                        ikc ikcVarA = e4iVar.a.a();
                        ikcVarA.j(browserActivity, new d4i(e4iVar, browserActivity, o3iVar, null, ikcVarA));
                        break;
                    default:
                        new dd(o2iVar.d).o(view);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        return new jf(function2, new Function2(this) { // from class: m2i
            public final /* synthetic */ o2i b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                o2i o2iVar = this.b;
                View view = (View) obj;
                switch (b22) {
                    case 0:
                        e4i e4iVar = (e4i) o2iVar.c.get();
                        BrowserActivity browserActivity = o2iVar.a;
                        o3i o3iVar = o3i.TOOLBAR_SHORTCUT;
                        ikc ikcVarA = e4iVar.a.a();
                        ikcVarA.j(browserActivity, new d4i(e4iVar, browserActivity, o3iVar, null, ikcVarA));
                        break;
                    default:
                        new dd(o2iVar.d).o(view);
                        break;
                }
                return Unit.a;
            }
        }, false, false, 60);
    }

    public final boolean b() {
        int iOrdinal = ((m18) this.b.g()).ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        h9o.p();
        return false;
    }
}
