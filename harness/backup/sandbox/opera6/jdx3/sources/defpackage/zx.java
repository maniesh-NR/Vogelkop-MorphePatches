package defpackage;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.leanplum.messagetemplates.OperaRateSheet;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class zx implements ry, did, OnCompleteListener, wdi, yyk {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zx(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public /* synthetic */ zx(u55 u55Var, long j, Callback callback) {
        this.b = u55Var;
        this.a = j;
        this.c = callback;
    }

    @Override // defpackage.ry
    public final void a(String str, String str2, tn tnVar) {
        cy cyVar = (cy) this.b;
        r9i r9iVar = (r9i) this.c;
        wjh wjhVar = (wjh) cyVar.h;
        ay ayVar = (ay) cyVar.b;
        cyVar.a = false;
        ie0 ie0Var = ie0.c;
        if (str == null) {
            wjhVar.y(ie0Var);
            return;
        }
        if (((wy) ((tw2) cyVar.c).b).T()) {
            return;
        }
        if (!((ml) ayVar.get()).d(str, tnVar)) {
            wjhVar.y(ie0Var);
            return;
        }
        boolean zEquals = str.equals(cyVar.b());
        ((SharedPreferences) ((b59) cyVar.d).get()).edit().putString("controller_config_data", str).putString("controller_config_url", ((Uri) r9iVar.b).toString()).putString("controller_config_full_url", str2).putLong("controller_config_timestamp", System.currentTimeMillis()).putLong("controller_config_request_time", this.a).putString("ads_config_last_ip_address", ((ml) ayVar.get()).b).apply();
        if (zEquals) {
            return;
        }
        ((rx) cyVar.g).s((ml) ayVar.get());
    }

    @Override // defpackage.wdi
    public final Object apply(Object obj) throws SQLException {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((xyc) this.c).a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL(z1m.j(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public final void c(ssa ssaVar, int i) {
        ssaVar.Y(((gid) this.b).c, i, ((qjd) this.c).c(true), this.a);
    }

    @Override // defpackage.yyk
    public final Object execute() {
        ks3 ks3Var = (ks3) this.b;
        dp2 dp2Var = (dp2) this.c;
        ydi ydiVar = (ydi) ks3Var.c;
        long jD = ((t55) ks3Var.g).d() + this.a;
        ydiVar.getClass();
        ydiVar.l(new qhd(jD, dp2Var));
        return null;
    }

    public final void onComplete(Task task) {
        OperaRateSheet.requestReviewInfo$lambda$0((u55) this.b, this.a, (Callback) this.c, task);
    }
}
