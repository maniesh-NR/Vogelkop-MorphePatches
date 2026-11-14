package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.r;
import com.appsflyer.internal.j;
import com.opera.android.account.auth.FinishAccountSetupAuthActivity;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nj2 extends cb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // defpackage.cb
    public final void a() {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 2:
                ghj ghjVar = (ghj) obj;
                ArrayList arrayList = ghjVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ghjVar.a((Callback) obj2);
                }
                arrayList.clear();
                break;
            case 4:
                ((klk) obj).s();
                break;
            case 5:
                xbf xbfVar = (xbf) obj;
                xbfVar.G(j());
                ArrayList arrayList2 = (ArrayList) xbfVar.e;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    xbfVar.A((Callback) obj3);
                }
                arrayList2.clear();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((i9c) obj).c();
                break;
        }
    }

    @Override // defpackage.cb
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pj2 pj2Var = (pj2) obj;
                pj2Var.G0(false);
                pj2Var.g0();
                r activity = pj2Var.getActivity();
                rxh rxhVar = new rxh(2132021590);
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = null;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 2132020155;
                gkjVar.l = 0;
                gkjVar.m = 2132021591;
                gkjVar.n = true;
                gkjVar.o = rxhVar;
                z77 z77VarU = sfe.U(activity);
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                break;
            case 3:
                break;
            case 7:
                ((myk) obj).a();
                break;
        }
    }

    @Override // defpackage.cb
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ghj ghjVar = (ghj) obj;
                fhj fhjVar = ghjVar.e;
                if (fhjVar != null && fhjVar.b) {
                    ghjVar.e = null;
                    break;
                }
                break;
            case 3:
                fp1 fp1Var = (yij) obj;
                fp1Var.setResult(-1);
                fp1Var.finish();
                break;
            case 4:
                ((klk) obj).s();
                break;
            case 5:
                ((xbf) obj).G(j());
                break;
            case 6:
                ((gyk) obj).a();
                break;
            case 8:
                am2.x(((SharedPreferences) ((som) obj).f.get()).edit(), "last_signin");
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((i9c) obj).c();
                break;
        }
    }

    @Override // defpackage.cb
    public final void d(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ghj ghjVar = (ghj) obj;
                fhj fhjVar = ghjVar.e;
                if (fhjVar != null && !fhjVar.b) {
                    ghjVar.e = null;
                    break;
                }
                break;
            case 4:
                ((klk) obj).s();
                break;
            case 5:
                xbf xbfVar = (xbf) obj;
                xbfVar.G(h0d.a);
                xbfVar.f = null;
                break;
            case 7:
                ((myk) obj).a();
                break;
            case 8:
                j.a((SharedPreferences) ((som) obj).f.get(), "last_signin");
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if (z) {
                    ((i9c) obj).e(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cb
    public final void f() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                int i = FinishAccountSetupAuthActivity.W;
                ((FinishAccountSetupAuthActivity) obj).N0();
                break;
            case 5:
                ((xbf) obj).G(j());
                break;
        }
    }

    public final h0d j() {
        db dbVar = (db) ((xbf) this.b).b;
        return !dbVar.f() ? h0d.a : dbVar.d() ? h0d.b : h0d.c;
    }
}
