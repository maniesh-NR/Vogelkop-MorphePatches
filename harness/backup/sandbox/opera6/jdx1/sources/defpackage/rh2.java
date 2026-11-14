package defpackage;

import J.N;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.google.android.gms.safetynet.SafeBrowsingThreat;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.browser.SafeBrowsingBridge;
import java.util.Iterator;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class rh2 implements fjc, vid, op5, mr8, wdi, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ long a;

    public /* synthetic */ rh2(long j) {
        this.a = j;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        ((xkg) obj).seekTo(this.a);
    }

    public final Object apply(Object obj) {
        long j = this.a;
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            cursor.moveToNext();
            return new xpl(cursor.getLong(0), j);
        } finally {
            cursorRawQuery.close();
        }
    }

    public final boolean d(hq8 hq8Var) {
        return hq8Var.e() == this.a;
    }

    public final void invoke(Object obj) {
        qq6 qq6Var;
        il6 il6Var = (il6) obj;
        ll6 ll6Var = il6Var.a;
        if (il6Var != ll6Var.j || (qq6Var = ll6Var.n) == null) {
            return;
        }
        pad padVar = ((kgd) qq6Var.b).E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, this.a));
        }
    }

    public final void onFailure(Exception exc) {
        vgi vgiVar = SafeBrowsingBridge.a;
        N.MY0CkqZH(this.a, false, 0);
    }

    public final void onSuccess(Object obj) {
        vgi vgiVar = SafeBrowsingBridge.a;
        Iterator it = ((SafetyNetApi.SafeBrowsingResponse) obj).getDetectedThreats().iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                N.MY0CkqZH(this.a, true, i);
                return;
            }
            int threatType = ((SafeBrowsingThreat) it.next()).getThreatType();
            if (threatType == 4) {
                i2 = 3;
            } else if (threatType == 5) {
                i2 = 2;
            } else if (threatType != 15) {
            }
            if (i2 > i) {
                i = i2;
            }
        }
    }

    public final void run(long j) {
        UUID uuid = MediaDrmBridge.n;
        N.MOzXytse(j, this.a);
    }
}
