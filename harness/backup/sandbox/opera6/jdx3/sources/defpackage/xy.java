package defpackage;

import com.opera.android.OperaApplication;
import java.util.Locale;

/* loaded from: classes.dex */
public final class xy implements q8j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.q8j
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yy yyVar = (yy) obj;
                if (!yyVar.e) {
                    yyVar.b.a(this);
                    break;
                }
                break;
            case 1:
                mw8 mw8Var = (mw8) obj;
                if (!mw8Var.x) {
                    fp1 fp1Var = mw8Var.p;
                    String[] strArr = OperaApplication.K;
                    ((OperaApplication) fp1Var.getApplicationContext()).y().a(mw8Var.o);
                    break;
                }
                break;
            case 2:
                jvc jvcVar = (jvc) obj;
                jvcVar.c.c().g(jvcVar.a);
                break;
            case 3:
                lvc lvcVar = (lvc) obj;
                uqe uqeVar = lvcVar.g;
                if (uqeVar != null) {
                    uqeVar.g(lvcVar.c);
                    break;
                }
                break;
            default:
                aum aumVar = (aum) obj;
                aumVar.b = null;
                aumVar.a();
                break;
        }
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        l0c l0cVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                l1c l1cVar = (l1c) obj;
                yy yyVar = (yy) obj2;
                if (!yyVar.e && l1cVar != null) {
                    wy wyVar = yyVar.a;
                    l0c l0cVar2 = l1cVar.c;
                    String str = l0cVar2.a;
                    String str2 = l0cVar2.b;
                    i5o i5oVar = (i5o) wyVar.e.d;
                    i5oVar.l = str;
                    i5oVar.m = str2;
                    i5oVar.i();
                    break;
                }
                break;
            case 1:
                l1c l1cVar2 = (l1c) obj;
                mw8 mw8Var = (mw8) obj2;
                if (!mw8Var.x && l1cVar2 != null) {
                    l0c l0cVar3 = l1cVar2.c;
                    mw8Var.v = l0cVar3;
                    if (mw8Var.i) {
                        if (l0cVar3 == null || !((bef) mw8Var.s.getValue()).h().contains(mw8Var.v.toString())) {
                            mw8Var.w();
                            break;
                        }
                    }
                }
                break;
            case 2:
                jvc jvcVar = (jvc) obj2;
                jvcVar.f = (nre) obj;
                jvcVar.T();
                break;
            case 3:
                nre nreVar = (nre) obj;
                lvc lvcVar = (lvc) obj2;
                String str3 = lvcVar.e;
                String lowerCase = (nreVar == null || (l0cVar = nreVar.c) == null) ? "" : l0cVar.a.toLowerCase(Locale.US);
                lvcVar.e = lowerCase;
                if (lvcVar.f != null && !str3.equals(lowerCase)) {
                    lvcVar.f.run();
                    break;
                }
                break;
            default:
                ((aum) obj2).b = (pu8) obj;
                break;
        }
    }
}
