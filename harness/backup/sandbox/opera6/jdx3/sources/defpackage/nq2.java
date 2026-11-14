package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nq2 extends cej {
    public final dx3 a;
    public final int b;
    public final ChromiumContent c;
    public final iz9 d;
    public final zy9 e;
    public boolean f;
    public mq2 g;
    public List h = l08.a;

    public nq2(dx3 dx3Var, int i, ChromiumContent chromiumContent, iz9 iz9Var, zy9 zy9Var) {
        this.a = dx3Var;
        this.b = i;
        this.c = chromiumContent;
        this.d = iz9Var;
        this.e = zy9Var;
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru2 ru2VarG = j14.G((ru2) it.next());
            if (ru2VarG != null) {
                arrayList.add(ru2VarG);
            }
        }
        this.h = arrayList;
        mq2 mq2Var = this.g;
        if (mq2Var != null) {
            mq2Var.d(arrayList);
        }
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        mq2 mq2Var = new mq2(this.a, mejVar, this.c, this.e, this.b, this.d, this.h);
        this.g = mq2Var;
        mq2Var.d(this.h);
        this.f = true;
        return mq2Var;
    }

    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        return new vq3(context, 2132083097, false);
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        super.onFinished(hjmVar);
        rq2 rq2Var = (rq2) this.e.a;
        g7f g7fVar = new g7f(rq2Var.f);
        while (g7fVar.hasNext()) {
            long j = ((pu2) g7fVar.next()).a.a;
            if (j != 0) {
                N.MO_yHnir(j);
            }
        }
        rq2Var.h = null;
        this.f = false;
    }
}
