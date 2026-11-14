package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class iy extends nrl {
    public boolean e;
    public final /* synthetic */ i5o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(i5o i5oVar) {
        super((byte) 26);
        this.f = i5oVar;
    }

    @Override // defpackage.nrl
    public final Runnable d(Runnable runnable) {
        Runnable runnableD = super.d(runnable);
        if (runnableD != null && !this.e) {
            this.e = true;
            i5o i5oVar = this.f;
            Context context = (Context) i5oVar.d;
            v1.u(context);
            ab abVar = new ab(i5oVar, (byte) 2);
            xnh xnhVarT = xnh.t(context);
            String[] strArr = OperaApplication.K;
            e00 e00VarD = ((OperaApplication) context.getApplicationContext()).d();
            mz mzVar = new mz(context, abVar);
            lz lzVar = new lz(context, e00VarD, mzVar);
            avj avjVar = cak.d;
            avj.g(3, lzVar);
            if (!((wnh) xnhVarT.i()).a(1024)) {
                ava.a.b(new c4(mzVar, (byte) 13), 3000L);
                return runnableD;
            }
            if (!he2.a(mzVar, new Void[0])) {
                mzVar.f = true;
                if (mzVar.c.getCount() == 0) {
                    mzVar.onPostExecute(mzVar.a());
                }
            }
        }
        return runnableD;
    }
}
