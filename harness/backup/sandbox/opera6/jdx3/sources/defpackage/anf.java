package defpackage;

import J.N;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import com.opera.android.media.OperaMediaNotificationControllerDelegate$PlaybackListenerService;
import java.util.List;
import org.chromium.base.PowerMonitor;
import org.chromium.net.X509Util;

/* loaded from: classes.dex */
public final class anf extends BroadcastReceiver {
    public final /* synthetic */ byte a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DownloadManager downloadManager;
        switch (this.a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    SparseArray sparseArray = bnf.c;
                    Intent intent2 = new Intent(t8.a, (Class<?>) OperaMediaNotificationControllerDelegate$PlaybackListenerService.class);
                    intent2.setAction(intent.getAction());
                    t8.a.startService(intent2);
                    break;
                }
                break;
            case 1:
                boolean zEquals = "android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction());
                boolean z = PowerMonitor.a;
                PowerMonitor.b = zEquals ? (byte) 1 : (byte) 2;
                N.MCImhGql();
                break;
            case 2:
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    rog.a(context);
                    break;
                }
                break;
            case 3:
                if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                    if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                        if ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                            N.MJdorYDE();
                            break;
                        }
                    } else {
                        N.MJdorYDE();
                        break;
                    }
                } else {
                    p8o p8oVarC = X509Util.c();
                    p8oVarC.b = p8oVarC.a.m();
                    N.M6C2IQIc();
                    break;
                }
                break;
            case 4:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            j7h.a = 2;
                            break;
                        }
                    } else {
                        j7h.a = 1;
                        break;
                    }
                }
                break;
            case 5:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra2 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra2 != 0) {
                        if (intExtra2 == 1) {
                            r9h.a = (byte) 2;
                            break;
                        }
                    } else {
                        r9h.a = (byte) 1;
                        break;
                    }
                }
                break;
            case 6:
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                List list = sjo.a;
                if (longExtra == ((Context) phf.a.a).getSharedPreferences("ad_config", 0).getLong("reference", 0L) && (downloadManager = (DownloadManager) context.getSystemService("download")) != null) {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(longExtra);
                    Cursor cursorQuery = downloadManager.query(query);
                    if (cursorQuery != null) {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("status");
                            int columnIndex2 = cursorQuery.getColumnIndex("local_uri");
                            if (columnIndex2 >= 0 && 8 == cursorQuery.getInt(columnIndex)) {
                                String string = cursorQuery.getString(columnIndex2);
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                intent3.addFlags(268435456);
                                intent3.setDataAndType(Uri.parse(string), "application/vnd.android.package-archive");
                                try {
                                    context.startActivity(intent3);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        cursorQuery.close();
                        break;
                    }
                }
                break;
            default:
                s8p s8pVar = s8p.d;
                if (!intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        s8pVar.a(false, s8pVar.c);
                        s8pVar.b = false;
                        break;
                    }
                } else {
                    s8pVar.a(true, s8pVar.c);
                    s8pVar.b = true;
                    break;
                }
                break;
        }
    }
}
