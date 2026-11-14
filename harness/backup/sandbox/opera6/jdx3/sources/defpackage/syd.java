package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.readlater.MigrationWorker;
import com.opera.android.settings.SettingsManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class syd {
    public static final lhe g = new lhe("Opera Migration");
    public final Context a;
    public final SettingsManager b;
    public final b59 c;
    public final ExecutorService d = Executors.newSingleThreadExecutor(g);
    public final bpd e = new bpd((byte) 24);
    public boolean f;

    public syd(Context context, umi umiVar, SettingsManager settingsManager) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = settingsManager;
        this.c = w1h.l(applicationContext, umiVar, "offline-pages-migration-service", new bg1[]{new b94(umiVar, new y0a(this, (byte) 23), (byte) 0)});
    }

    public final void a(SharedPreferences sharedPreferences, boolean z) {
        boolean z2 = sharedPreferences.getBoolean("active", false);
        String str = null;
        String string = sharedPreferences.getString("target-location", null);
        SettingsManager settingsManager = this.b;
        if (!settingsManager.O()) {
            String strZ = settingsManager.z("offline_pages_location");
            if (!strZ.isEmpty()) {
                str = strZ;
            }
        }
        if (str != null && (!str.equals(string) || z)) {
            j.c(sharedPreferences, "target-location", str);
            z2 = true;
        }
        j.d((SharedPreferences) this.c.get(), "active", z2);
        x4o x4oVarC = x4o.c(this.a);
        if (!z2) {
            a26.O(x4oVarC.b.j, "CancelWorkByName_com.opera.android.MigrationWorker", x4oVarC.d.a, new gh4(x4oVarC, (byte) 0));
            return;
        }
        tn tnVar = new tn(MigrationWorker.class);
        h5o h5oVar = (h5o) tnVar.c;
        h5oVar.q = true;
        h5oVar.r = 1;
        x4oVarC.b("com.opera.android.MigrationWorker", tnVar.j());
    }
}
