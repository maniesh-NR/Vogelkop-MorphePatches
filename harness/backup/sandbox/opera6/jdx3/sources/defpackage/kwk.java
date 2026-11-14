package defpackage;

import android.content.AbstractThreadedSyncAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class kwk extends AbstractThreadedSyncAdapter {
    public static final /* synthetic */ int b = 0;
    public final b59 a;

    public kwk(Context context) {
        super(context, false);
        this.a = w1h.l(context, vml.d, "sync_ping", new bg1[0]);
    }

    public final void a(SyncResult syncResult, lkk lkkVar, int i) {
        int i2;
        if (lkkVar == null) {
            boolean zD = h11.j.D(getContext(), true);
            axh.j.D(getContext(), true);
            tc3.j.D(getContext(), true);
            cef.j.D(getContext(), true);
            be7.j.D(getContext(), true);
            b59 b59Var = this.a;
            if (zD || (i2 = i + 1) >= 5) {
                j.a((SharedPreferences) b59Var.get(), "ui.retry");
                return;
            } else {
                ((SharedPreferences) b59Var.get()).edit().putInt("ui.retry", i2).apply();
                syncResult.delayUntil = (System.currentTimeMillis() / 1000) + 1;
                return;
            }
        }
        int iOrdinal = lkkVar.ordinal();
        if (iOrdinal == 0) {
            h11.j.D(getContext(), true);
            return;
        }
        if (iOrdinal == 1) {
            axh.j.D(getContext(), true);
            return;
        }
        if (iOrdinal == 2) {
            tc3.j.D(getContext(), true);
        } else if (iOrdinal == 3) {
            cef.j.D(getContext(), true);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            be7.j.D(getContext(), true);
        }
    }

    public final void b(long j) {
        b59 b59Var = this.a;
        long j2 = ((SharedPreferences) b59Var.get()).getLong("avro.last.ping", -1L);
        if (j2 < 0) {
            ((SharedPreferences) b59Var.get()).edit().putLong("avro.last.ping", j).apply();
        } else if (j < j2 || j - j2 >= 21600000) {
            ((SharedPreferences) b59Var.get()).edit().putLong("avro.last.ping", j).apply();
            h11.j.D(getContext(), false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // android.content.AbstractThreadedSyncAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPerformSync(android.accounts.Account r17, android.os.Bundle r18, java.lang.String r19, android.content.ContentProviderClient r20, android.content.SyncResult r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwk.onPerformSync(android.accounts.Account, android.os.Bundle, java.lang.String, android.content.ContentProviderClient, android.content.SyncResult):void");
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onSyncCanceled() {
        super.onSyncCanceled();
        xf8.E(getContext().getApplicationContext(), false);
    }
}
