package defpackage;

import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.h;
import com.opera.api.Callback;
import java.util.AbstractList;

/* loaded from: classes.dex */
public final class o25 extends r25 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o25(byte b) {
        super("Bookmarks", new rxh(2132018047), null, 2131232005, a35.m);
        this.f = b;
        switch (b) {
            case 1:
                super("AIAssistant", new rxh(2132017402), new rxh(2132017402), 2131231724, a35.n);
                break;
            case 2:
                super("SpeedDial", new rxh(2132021619), null, 2131232250, a35.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        switch (this.f) {
            case 0:
                h hVar = (h) s25Var.j;
                hVar.q(hVar.l());
                hVar.q(hVar.n());
                hVar.e((AbstractList) hVar.o().i());
                runnable.run();
                break;
            case 1:
                ((aw0) s25Var.h.get()).a(runnable);
                break;
            default:
                fp1 fp1Var = s25Var.a;
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) fp1Var.getApplicationContext();
                operaApplication.o().f(new fh4(operaApplication, runnable, (byte) 6));
                break;
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                int iB = s25Var.j.b();
                fp1 fp1Var = s25Var.a;
                ((iu2) callback).run(iB == 0 ? fp1Var.getString(2132021319) : fp1Var.getResources().getQuantityString(2131886104, iB, Integer.valueOf(iB)));
                break;
            case 1:
                new r62(((aw0) s25Var.h.get()).f.h, new ab(new iu2(new k25((iu2) callback, s25Var, (byte) 0), (byte) 13), (byte) 5), (byte) 1);
                break;
            default:
                ((iu2) callback).run(s25Var.a.getString(2132021393));
                break;
        }
    }

    @Override // defpackage.r25
    public final boolean d(s25 s25Var) {
        switch (this.f) {
            case 1:
                return ((Boolean) ((aw0) s25Var.h.get()).c.i.g()).booleanValue();
            default:
                return super.d(s25Var);
        }
    }
}
