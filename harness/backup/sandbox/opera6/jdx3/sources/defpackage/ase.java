package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ase extends wbh {
    public final nrl r;
    public final String s;
    public final cue t;
    public final ua7 u;
    public final boolean v;

    public ase(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar, ua7 ua7Var) {
        super(context, ormVar, skmVar, bundle, s0fVar);
        this.v = true;
        this.u = ua7Var;
        if (!bundle.containsKey("news_backend")) {
            throw new djb("news_backend");
        }
        cue cueVarD = cue.d(bundle.getInt("news_backend", -1));
        if (cueVarD == null) {
            throw new djb("news_backend", null);
        }
        if (cueVarD == cue.None) {
            throw new djb("news_backend", null);
        }
        this.t = cueVarD;
        this.s = bundle.getString("news_article_id", "");
        this.r = new nrl(context.getApplicationContext().getResources(), bundle.getBoolean("news_icon_fetch_failed"));
    }

    public static void y(RemoteViews remoteViews, Bitmap bitmap) {
        if (bitmap != null) {
            remoteViews.setViewVisibility(2131362236, 8);
            remoteViews.setImageViewBitmap(2131362594, bitmap);
        } else {
            remoteViews.setViewVisibility(2131362594, 0);
            remoteViews.setImageViewResource(2131362236, 2131233013);
            remoteViews.setImageViewResource(2131362594, 2131231359);
        }
    }

    @Override // defpackage.qyl
    public final Boolean b() {
        return Boolean.valueOf(this.r.a);
    }

    @Override // defpackage.wbh
    public final ua7 d() {
        ua7 ua7VarD = super.d();
        ((l1f) ua7VarD.b).B = x();
        return ua7VarD;
    }

    @Override // defpackage.wbh
    public final String l() {
        return "news";
    }

    @Override // defpackage.wbh
    public final String o() {
        return "news";
    }

    @Override // defpackage.wbh
    public final void s(long j, boolean z) {
        gse gseVar;
        super.s(j, z);
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "click", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public final void u() {
        gse gseVar;
        super.u();
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "receive", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public final void v(boolean z) {
        gse gseVar;
        super.v(z);
        zn0 zn0VarI = i();
        yn0 yn0VarC = c();
        String str = this.k;
        hd hdVar = hd.h;
        if (hdVar == null) {
            return;
        }
        if (yn0.f == yn0VarC && (zn0VarI == zn0.d || zn0VarI == zn0.e || zn0VarI == zn0.j || zn0VarI == zn0.l)) {
            gseVar = new gse("firebase", str, this.l, "show", System.currentTimeMillis());
        } else {
            gseVar = null;
        }
        hdVar.s(gseVar);
    }

    @Override // defpackage.wbh
    public boolean w() {
        boolean z;
        vn0 vn0Var;
        Context context = this.a;
        if (wbh.m(context, "news") != 1) {
            t(vn0.k);
            return true;
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        ite iteVar = hte.k;
        hte hteVarW = na2.w(context);
        boolean zI = operaApplication.J().i("enable_newsfeed");
        ite iteVar2 = (ite) hteVarW.i();
        cse cseVar = iteVar2 == null ? cse.c : iteVar2.c ? cse.b : (iteVar2.d || zI) ? cse.a : cse.b;
        if (cseVar != cse.a) {
            t(vn0.j);
            return true;
        }
        if (this.v && this.t == cue.NewsFeed) {
            String str = this.s;
            if (!TextUtils.isEmpty(str)) {
                ua7 ua7Var = this.u;
                String string = ((SharedPreferences) ((ni6) ua7Var.d).a.get()).getString("recent_news_push_history", null);
                List listAsList = string != null ? Arrays.asList(string.split("\n")) : Collections.EMPTY_LIST;
                int size = listAsList.size() - 1;
                while (true) {
                    if (size < 0) {
                        z = false;
                        break;
                    }
                    if (str.equals(listAsList.get(size))) {
                        z = true;
                        break;
                    }
                    size--;
                }
                if (!z) {
                    b59 b59Var = ((ni6) ua7Var.d).a;
                    String string2 = ((SharedPreferences) b59Var.get()).getString("recent_news_push_history", null);
                    ArrayList arrayList = new ArrayList(string2 != null ? Arrays.asList(string2.split("\n")) : Collections.EMPTY_LIST);
                    arrayList.add(str);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                    ((SharedPreferences) b59Var.get()).edit().putString("recent_news_push_history", TextUtils.join("\n", arrayList)).apply();
                }
                if (z) {
                    vn0Var = vn0.i;
                } else if (xqe.c((Context) ua7Var.b, str, (qre) ((ii) ua7Var.c).get(), new rqd((byte) 18)) != null) {
                    vn0Var = vn0.g;
                }
                t(vn0Var);
                return true;
            }
        }
        return false;
    }

    public abstract RemoteViews x();
}
