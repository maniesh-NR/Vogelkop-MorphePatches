package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.SQLException;
import android.os.Binder;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.OperaDownloadManagerDelegate;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class bu3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bu3(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ bu3(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 2;
        this.c = context;
        this.b = z;
        this.d = taskCompletionSource;
    }

    public /* synthetic */ bu3(pjo pjoVar, File file, String str, wci wciVar, String str2, boolean z) {
        this.a = (byte) 6;
        this.c = pjoVar;
        this.d = file;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bu3(r4m r4mVar, szb szbVar, int i) {
        this.a = (byte) 5;
        this.c = r4mVar;
        this.d = szbVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, SQLException, FileNotFoundException {
        int i;
        switch (this.a) {
            case 0:
                BrowserActivity browserActivity = (BrowserActivity) this.c;
                View view = (View) this.d;
                boolean z = this.b;
                int i2 = BrowserActivity.E1;
                browserActivity.w1(view, z);
                return;
            case 1:
                re7 re7Var = (re7) this.c;
                OperaDownloadManagerDelegate.TargetCallback targetCallback = (OperaDownloadManagerDelegate.TargetCallback) this.d;
                boolean z2 = this.b;
                re7Var.y = targetCallback;
                if (!re7Var.s) {
                    re7Var.s = true;
                }
                if (re7Var.z) {
                    re7Var.v();
                }
                cx3 cx3Var = re7Var.x;
                if (cx3Var != null) {
                    cx3Var.c(re7Var, z2);
                    return;
                }
                return;
            case 2:
                Context context = (Context) this.c;
                boolean z3 = this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    if ((Binder.getCallingUid() == context.getApplicationInfo().uid ? 1 : 0) == 0) {
                        context.getPackageName();
                    } else {
                        SharedPreferences.Editor editorEdit = z7h.m(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z3) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult((Object) null);
                }
            case 3:
                bv5 bv5Var = (bv5) this.c;
                jch jchVar = (jch) this.d;
                boolean z4 = this.b;
                dch dchVar = (dch) bv5Var.c.a.get();
                if (dchVar != null) {
                    synchronized (dchVar.e) {
                        if (dchVar.e.get(bv5Var) != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                jchVar.run(Boolean.valueOf(z4));
                return;
            case 4:
                glh glhVar = (glh) this.c;
                Collection collection = (Collection) this.d;
                boolean z5 = this.b;
                jlh jlhVar = glhVar.a;
                ArrayList arrayListH = jlhVar.h(collection, z5);
                int size = arrayListH.size();
                while (i < size) {
                    Object obj = arrayListH.get(i);
                    i++;
                    glhVar.b((String) obj);
                }
                jlhVar.getWritableDatabase().execSQL(String.format("DELETE FROM reading WHERE id IN (%1$s)", new r40(",", (byte) 3).b(collection)));
                return;
            case 5:
                r4m r4mVar = (r4m) this.c;
                final szb szbVar = (szb) this.d;
                boolean z6 = this.b;
                final y4m y4mVar = r4mVar.b;
                boolean z7 = y4mVar.j;
                v3m v3mVar = y4mVar.d;
                if (!v3mVar.g()) {
                    v3mVar.b.V(1, "translate_web_pages_enabled");
                    v3mVar.i(v3mVar.d());
                }
                if (z7 && v3mVar.e(szbVar, z6 ? 1 : 0)) {
                    plk plkVar = v3mVar.d;
                    ((xl) plkVar.b).j(new iyk(plkVar, szbVar, (byte) 2));
                    return;
                }
                final int i3 = !z6 ? 1 : 0;
                final boolean z8 = z7 && v3mVar.e(szbVar, i3);
                v3mVar.j(szbVar, z6 ? 1 : 0, true);
                r4m r4mVar2 = y4mVar.f;
                if (z6) {
                    r4mVar2.c0(new o4m(r4mVar2, (byte) 3));
                    i = 2132019496;
                } else {
                    r4mVar2.Z(r4mVar2.f.o, 1);
                    i = 2132019495;
                }
                ghf ghfVar = y4mVar.e;
                final int i4 = z6 ? 1 : 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: x4m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        y4m y4mVar2 = y4mVar;
                        boolean z9 = z8;
                        szb szbVar2 = szbVar;
                        if (z9) {
                            y4mVar2.d.j(szbVar2, i3 ? 1 : 0, true);
                        } else {
                            plk plkVar2 = y4mVar2.d.d;
                            ((xl) plkVar2.b).j(new iyk(plkVar2, szbVar2, (byte) 2));
                        }
                        if (i4) {
                            r4m r4mVar3 = y4mVar2.f;
                            r4mVar3.Y(r4mVar3.f.o, 1);
                        }
                    }
                };
                Resources resources = (Resources) ghfVar.d;
                String string = resources.getString(i, resources.getString(szbVar.b));
                b2l b2lVar = ((k6l) ghfVar.b).o;
                if (b2lVar != null) {
                    ((aal) ghfVar.c).S(new c4m(ghfVar, string, 2132021998, onClickListener), b2lVar, true);
                    return;
                }
                return;
            default:
                pjo pjoVar = (pjo) this.c;
                File file = (File) this.d;
                boolean z9 = this.b;
                pjoVar.b.remove(file.getAbsolutePath());
                if (z9 && file.exists()) {
                    sjo.g(file);
                    return;
                }
                return;
        }
    }
}
