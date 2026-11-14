package defpackage;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Pair;
import com.opera.android.OperaApplication;
import com.opera.android.downloads.DownloadNotifierReceiver;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cg extends n14 {
    public final HashSet g;
    public final ag h;
    public final bg i;
    public long j;
    public boolean k;

    public cg(Service service, Callback callback) {
        super(service, "downloads_active", 2131362541, R.drawable.stat_sys_download, callback);
        this.g = new HashSet();
        byte b = 0;
        this.h = new ag(this, b);
        this.i = new bg(this, b);
        this.c.R(true);
        ((l1f) this.c.b).d(false);
    }

    @Override // defpackage.n14
    public final yhe b(long j) {
        if (this.k) {
            return super.b(j);
        }
        Context context = this.b;
        return yhe.f(context, 0, mdb.b(context), 201326592, false);
    }

    @Override // defpackage.n14
    public final void f(List list) throws Resources.NotFoundException {
        long j;
        double d;
        long j2;
        double d2;
        String string;
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) DownloadNotifierReceiver.class);
        intent.setAction("com.opera.android.action.PAUSE_ACTIVE_DOWNLOADS");
        e(2132018631, PendingIntent.getBroadcast(context, 0, intent, 67108864));
        int size = list.size();
        String quantityString = context.getResources().getQuantityString(2131886122, size, Integer.valueOf(size));
        this.e.setTextViewText(2131363485, quantityString);
        this.f.setTextViewText(2131363485, quantityString);
        HashSet hashSet = this.g;
        hashSet.addAll(list);
        long j3 = this.j;
        int[][] iArr = lg7.a;
        if (hashSet.isEmpty()) {
            j2 = j3;
            d2 = 0.0d;
            j = 0;
            d = 0.0d;
        } else {
            Iterator it = hashSet.iterator();
            boolean z = false;
            long j4 = 0;
            j = 0;
            d = 0.0d;
            while (it.hasNext()) {
                re7 re7Var = (re7) it.next();
                long j5 = j3;
                j += re7Var.i;
                if (re7Var.i()) {
                    j4 += re7Var.j;
                } else {
                    z = true;
                }
                j3 = j5;
            }
            j2 = j3;
            d2 = z ? -1.0d : j4 <= 0 ? 0.0d : j / j4;
        }
        Pair pairCreate = Pair.create(Double.valueOf(d2), Long.valueOf(j));
        double dDoubleValue = ((Double) pairCreate.first).doubleValue();
        long jLongValue = ((Long) pairCreate.second).longValue();
        if (dDoubleValue < d) {
            int[][] iArr2 = lg7.a;
            string = aik.i(jLongValue, context);
        } else {
            string = context.getResources().getString(2132018639, Integer.valueOf((int) (100.0d * dDoubleValue)));
        }
        CharSequence charSequenceC = lg7.c(context, j2, false);
        n14.d(this.e, dDoubleValue, string, charSequenceC);
        n14.d(this.f, dDoubleValue, string, charSequenceC);
        this.k = false;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((re7) it2.next()).q()) {
                this.k = true;
                return;
            }
        }
    }

    public final Notification g() {
        String[] strArr = OperaApplication.K;
        return a(((OperaApplication) this.b.getApplicationContext()).m().a.l());
    }

    public final void h() {
        String[] strArr = OperaApplication.K;
        sf7 sf7VarM = ((OperaApplication) this.b.getApplicationContext()).m();
        sf7VarM.a.u(this.h);
        ArrayList arrayList = sf7VarM.c.b;
        bg bgVar = this.i;
        arrayList.remove(bgVar);
        bgVar.getClass();
    }
}
