package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ob extends lim {
    public final /* synthetic */ byte a;
    public final Object b;

    public ob(cvg cvgVar, Runnable runnable) {
        this.a = (byte) 14;
        this.b = runnable;
    }

    public /* synthetic */ ob(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                lj2 lj2Var = (lj2) obj;
                lj2Var.g++;
                lj2Var.f++;
                break;
            case 15:
                x79 x79Var = (x79) obj;
                if (((ob) x79Var.e) != null) {
                    x79Var.d = new r62((ekc) x79Var.b, new tu(new rmg(x79Var, (byte) 24), (byte) 5), (byte) 2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                qb qbVar = (qb) obj;
                if (ndcVar == qbVar.f) {
                    qbVar.f = null;
                    qbVar.g = null;
                    rn9 rn9Var = qbVar.h;
                    if (rn9Var != null) {
                        rn9Var.t();
                        break;
                    }
                }
                break;
            case 3:
                ndcVar.getLifecycle().b(this);
                gg2 gg2Var = ((cg2) obj).j;
                if (gg2Var != null) {
                    int i = hi7.u;
                    gg2Var.a(ei7.a);
                    break;
                }
                break;
            case 4:
                ndcVar.getLifecycle().b(this);
                lj2 lj2Var = (lj2) obj;
                int i2 = lj2Var.g;
                if (i2 > 0) {
                    i2--;
                    lj2Var.g = i2;
                }
                if (i2 <= 0) {
                    int i3 = lj2Var.e;
                    if (i3 == 1 || i3 == 4) {
                        lj2Var.d(3);
                    }
                    lj2Var.f = 0;
                    break;
                }
                break;
            case 7:
                ndcVar.getLifecycle().b(this);
                z zVar = (z) obj;
                if (!zVar.a) {
                    int i4 = zVar.b - 1;
                    zVar.b = i4;
                    if (i4 <= 0) {
                        zVar.a = true;
                        ((m62) zVar.c).run();
                        break;
                    }
                }
                break;
            case 8:
                ndcVar.getLifecycle().b(this);
                u85 u85Var = (u85) obj;
                u85Var.j = null;
                u85Var.k = null;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ndcVar.getLifecycle().b(this);
                ((fge) obj).Q = false;
                break;
            case 15:
                x79 x79Var = (x79) obj;
                r62 r62Var = (r62) x79Var.d;
                if (r62Var != null) {
                    x79Var.d = null;
                    r62Var.cancel();
                }
                ob obVar = (ob) x79Var.e;
                if (obVar != null) {
                    x79Var.e = null;
                    ((oje) x79Var.a).d.b(obVar);
                }
                ndcVar.getLifecycle().b(this);
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                nv9 nv9Var = (nv9) obj;
                nv9Var.g = false;
                if (nv9Var.u()) {
                    nv9Var.w();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fqe fqeVar = (fqe) obj;
                tm5 tm5Var = fqeVar.e;
                if (tm5Var.b) {
                    tm5Var.b = false;
                    Iterator it = new HashSet(tm5Var.e).iterator();
                    while (it.hasNext()) {
                        ((fwh) it.next()).b(false);
                    }
                }
                Context context = fqeVar.a;
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
                if (operaApplication.w.c()) {
                    Iterator it2 = ((au8) operaApplication.w.get()).c.values().iterator();
                    while (it2.hasNext()) {
                        ((f92) it2.next()).getClass();
                    }
                    break;
                }
                break;
            case 11:
                uy8 uy8Var = ((uqe) obj).h;
                qy8 qy8Var = uy8Var.o;
                int i = qy8Var.g;
                if (i > 0) {
                    qy8Var.g = i - 1;
                }
                qy8 qy8Var2 = uy8Var.p;
                int i2 = qy8Var2.g;
                if (i2 > 0) {
                    qy8Var2.g = i2 - 1;
                }
                Set<String> set = uy8Var.w;
                for (String str : set) {
                    uy8Var.H.r(str, false);
                    uy8Var.x.remove(str);
                    uy8Var.y.remove(str);
                }
                set.clear();
                break;
            case 13:
                mdf mdfVar = (mdf) obj;
                long jUptimeMillis = SystemClock.uptimeMillis();
                mdfVar.f = (jUptimeMillis - mdfVar.g) + mdfVar.f;
                mdfVar.g = jUptimeMillis;
                mdfVar.h = false;
                mdfVar.b((kl0) CollectionsKt.R(mdfVar.e), gl0.e);
                break;
            case 16:
                qyj qyjVar = (qyj) obj;
                int i3 = qyjVar.h - 1;
                qyjVar.h = i3;
                if (i3 == 0) {
                    qyjVar.m();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        int i;
        byte b = this.a;
        final byte b2 = 2;
        boolean z = false;
        z = false;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b) {
            case 1:
                eyi eyiVar = ((xy3) obj).y;
                xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
                break;
            case 2:
                eyi eyiVar2 = ((hq3) obj).y;
                xf8.G0((kze) eyiVar2.d, eyiVar2.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar2.c).g().d));
                break;
            case 4:
                lj2 lj2Var = (lj2) obj;
                int i2 = lj2Var.f;
                if (i2 > 0) {
                    i2--;
                    lj2Var.f = i2;
                }
                if (i2 <= 0 && (i = lj2Var.e) != 4) {
                    if (!lj2Var.h) {
                        if (i == 3 && (ndcVar instanceof Fragment)) {
                            Context contextRequireContext = ((Fragment) ndcVar).requireContext();
                            lj2Var.d(2);
                            lj2Var.c(contextRequireContext, lj2Var.a, null);
                            break;
                        }
                    } else {
                        lj2Var.h = false;
                        if (ndcVar instanceof jj2) {
                            lj2Var.d(4);
                            ((jj2) ndcVar).b0();
                            break;
                        }
                    }
                }
                break;
            case 5:
                x5f x5fVar = (x5f) obj;
                AutofillManager autofillManager = new AutofillManager();
                if (N.M3pTNY7t()) {
                    final byte b4 = z ? (byte) 1 : (byte) 0;
                    autofillManager.e(new Callback(this) { // from class: op2
                        public final /* synthetic */ ob b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b4;
                            ob obVar = this.b;
                            List list = (List) obj2;
                            switch (b5) {
                                case 0:
                                    ((x5f) obVar.b).A(!list.isEmpty(), true);
                                    break;
                                case 1:
                                    ((x5f) obVar.b).z(!list.isEmpty(), true);
                                    break;
                                default:
                                    ((x5f) obVar.b).B(!list.isEmpty(), true);
                                    break;
                            }
                        }
                    });
                } else {
                    x5fVar.A(false, false);
                }
                if (!N.MMr_2O4r()) {
                    x5fVar.z(false, false);
                    x5fVar.B(false, false);
                    break;
                } else {
                    autofillManager.c(new Callback(this) { // from class: op2
                        public final /* synthetic */ ob b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b3;
                            ob obVar = this.b;
                            List list = (List) obj2;
                            switch (b5) {
                                case 0:
                                    ((x5f) obVar.b).A(!list.isEmpty(), true);
                                    break;
                                case 1:
                                    ((x5f) obVar.b).z(!list.isEmpty(), true);
                                    break;
                                default:
                                    ((x5f) obVar.b).B(!list.isEmpty(), true);
                                    break;
                            }
                        }
                    });
                    autofillManager.d(new Callback(this) { // from class: op2
                        public final /* synthetic */ ob b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b2;
                            ob obVar = this.b;
                            List list = (List) obj2;
                            switch (b5) {
                                case 0:
                                    ((x5f) obVar.b).A(!list.isEmpty(), true);
                                    break;
                                case 1:
                                    ((x5f) obVar.b).z(!list.isEmpty(), true);
                                    break;
                                default:
                                    ((x5f) obVar.b).B(!list.isEmpty(), true);
                                    break;
                            }
                        }
                    });
                    break;
                }
            case 6:
                nv9 nv9Var = (nv9) obj;
                nv9Var.g = true;
                if (nv9Var.y()) {
                    nv9Var.B();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                tm5 tm5Var = ((fqe) obj).e;
                if (!tm5Var.b) {
                    tm5Var.b = true;
                    Iterator it = new HashSet(tm5Var.e).iterator();
                    while (it.hasNext()) {
                        ((fwh) it.next()).b(true);
                    }
                    break;
                }
                break;
            case 11:
                uy8 uy8Var = ((uqe) obj).h;
                boolean z2 = uy8Var.k;
                uy8Var.k = true;
                qy8 qy8Var = uy8Var.o;
                int i3 = qy8Var.g;
                qy8Var.g = i3 + 1;
                if (i3 == 0) {
                    qy8Var.c(false);
                }
                qy8 qy8Var2 = uy8Var.p;
                int i4 = qy8Var2.g;
                qy8Var2.g = i4 + 1;
                if (i4 == 0) {
                    qy8Var2.c(false);
                }
                if (!z2 || !DateUtils.isToday(qy8Var2.a())) {
                    qy8Var2.c(true);
                    break;
                }
                break;
            case 12:
                u1f u1fVar = (u1f) obj;
                int iOrdinal = mom.a((BrowserActivity) u1fVar.f).a.ordinal();
                if (iOrdinal != 0 && iOrdinal != 2) {
                    z = true;
                }
                if (z != u1fVar.a()) {
                    ((SharedPreferences) ((b59) u1fVar.g).get()).edit().putBoolean("has_notification", z).apply();
                    u1fVar.b();
                    break;
                }
                break;
            case 13:
                mdf mdfVar = (mdf) obj;
                mdfVar.g = SystemClock.uptimeMillis();
                mdfVar.h = true;
                break;
            case 16:
                ((qyj) obj).h++;
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                ndcVar.getLifecycle().b(this);
                ((Runnable) obj).run();
                break;
            case 17:
                m59 m59Var = ((slk) obj).a;
                m59Var.c = true;
                m59Var.i();
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        switch (this.a) {
            case 17:
                m59 m59Var = ((slk) this.b).a;
                m59Var.c = false;
                oml omlVar = (oml) m59Var.e;
                if (omlVar != null) {
                    omlVar.cancel(false);
                    m59Var.e = null;
                    break;
                }
                break;
        }
    }
}
