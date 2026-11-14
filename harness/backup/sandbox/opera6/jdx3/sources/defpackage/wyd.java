package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class wyd implements Runnable, hh4 {
    public final Context a;
    public final SettingsManager b;
    public final glh c;
    public final ExecutorService d;
    public final HashSet e = new HashSet();
    public pad f;
    public boolean g;
    public boolean h;

    public wyd(Context context, SettingsManager settingsManager, ExecutorService executorService, glh glhVar, pad padVar) {
        this.a = context;
        this.b = settingsManager;
        this.d = executorService;
        this.c = glhVar;
        this.f = padVar;
    }

    public static String b(ContentResolver contentResolver, Uri uri) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        String[] strArr = {"_display_name"};
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(uri, strArr, null, null, null);
            try {
                int columnIndex = cursorQuery.getColumnIndex(strArr[0]);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(columnIndex);
                cursorQuery.close();
                return string;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean c(Uri uri, Uri uri2) {
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = uri2.getPathSegments();
        return pathSegments.size() + 1 == pathSegments2.size() && pathSegments.equals(pathSegments2.subList(0, pathSegments.size()));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4 A[PHI: r5
      0x00f4: PHI (r5v12 java.lang.String) = 
      (r5v10 java.lang.String)
      (r5v11 java.lang.String)
      (r5v11 java.lang.String)
      (r5v11 java.lang.String)
      (r5v25 java.lang.String)
      (r5v28 java.lang.String)
     binds: [B:46:0x00f2, B:37:0x00c4, B:39:0x00ca, B:41:0x00dc, B:30:0x00a7, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.a(java.util.List):void");
    }

    @Override // defpackage.hh4
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        pad padVar = this.f;
        if (padVar != null) {
            ((ArrayDeque) ((syd) padVar.c).e.c).remove(this);
            padVar.b = null;
        }
    }

    public final void d(boolean z) {
        pad padVar = this.f;
        if (padVar == null) {
            return;
        }
        syd sydVar = (syd) padVar.c;
        if (z) {
            j.d((SharedPreferences) sydVar.c.get(), "active", false);
        }
        bpd bpdVar = sydVar.e;
        bpdVar.b = null;
        wyd wydVar = (wyd) ((ArrayDeque) bpdVar.c).poll();
        bpdVar.b = wydVar;
        if (wydVar != null) {
            wydVar.run();
        }
        esg esgVar = (esg) padVar.b;
        if (esgVar != null) {
            l94 l94Var = (l94) esgVar.c;
            if (z) {
                l94Var.b(new yic());
            } else {
                l94Var.b(new wic());
            }
        }
        padVar.b = null;
        this.f = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g || this.h) {
            return;
        }
        this.g = true;
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        CommandLine commandLine = ((OperaApplication) context.getApplicationContext()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(context, commandLine);
        e7d.a(context, new wt2(this, (byte) 4));
    }
}
