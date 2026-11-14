package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l35 implements id {
    public final /* synthetic */ byte a = 1;
    public final fd b;
    public final Object c;
    public final Object d;

    public l35(BrowserActivity browserActivity, dt3 dt3Var, kze kzeVar, fd fdVar) {
        this.c = dt3Var;
        this.d = kzeVar;
        this.b = fdVar;
        kzeVar.j(browserActivity, new cl4(new tu7((Object) this, (byte) 29), (byte) 29));
    }

    public l35(BrowserActivity browserActivity, fd fdVar, zu3 zu3Var) {
        this.c = browserActivity;
        this.b = fdVar;
        this.d = zu3Var;
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        b2l b2lVar;
        switch (this.a) {
            case 0:
                int i = k35.a[pcVar.ordinal()];
                final byte b = 1;
                if (i != 1) {
                    return null;
                }
                final byte b2 = 0;
                return new jf(new Function2(this) { // from class: j35
                    public final /* synthetic */ l35 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        l35 l35Var = this.b;
                        View view = (View) obj;
                        switch (b3) {
                            case 0:
                                g25.b((BrowserActivity) l35Var.c, 0, 2132018551, 2132020155, new sk(l35Var, (byte) 6));
                                break;
                            default:
                                new dd(l35Var.b).o(view);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function2(this) { // from class: j35
                    public final /* synthetic */ l35 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        l35 l35Var = this.b;
                        View view = (View) obj;
                        switch (b3) {
                            case 0:
                                g25.b((BrowserActivity) l35Var.c, 0, 2132018551, 2132020155, new sk(l35Var, (byte) 6));
                                break;
                            default:
                                new dd(l35Var.b).o(view);
                                break;
                        }
                        return Unit.a;
                    }
                }, false, false, 60);
            default:
                boolean z = yk5Var.d;
                jt3 jt3Var = ((dt3) this.c).b;
                int iOrdinal = pcVar.ordinal();
                fd fdVar = this.b;
                if (iOrdinal == 5) {
                    b2l b2lVar2 = jt3Var.h;
                    if (b2lVar2 != null) {
                        return z == yk5Var.a ? b(b2lVar2) ? fdVar.f(pc.h, pcVar) : fdVar.f(pc.j, pcVar) : z ? fdVar.f(pc.j, pcVar) : fdVar.f(pc.h, pcVar);
                    }
                    return null;
                }
                if (iOrdinal != 28 || (b2lVar = jt3Var.h) == null) {
                    return null;
                }
                pc pcVar2 = pc.m;
                boolean zB = fdVar.b(pcVar2);
                jf jfVarF = (z || !b(b2lVar)) ? (yk5Var.c || !zB) ? fdVar.f(pc.i, pcVar) : fdVar.f(pcVar2, pcVar) : fdVar.f(pc.h, pcVar);
                if (jfVarF != null) {
                    return jf.a(jfVarF, null, null, null, zB, 31);
                }
                return null;
        }
    }

    public final boolean b(b2l b2lVar) {
        d7l d7lVar = (d7l) b2lVar;
        if (d7lVar.n0()) {
            return !d7lVar.j.m() && ((Boolean) ((kze) this.d).g()).booleanValue();
        }
        return true;
    }
}
