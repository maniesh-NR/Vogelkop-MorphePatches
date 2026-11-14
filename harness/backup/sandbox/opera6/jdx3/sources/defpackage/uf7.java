package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.leanplum.internal.Constants;
import com.opera.android.downloads.DownloadNotifierReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class uf7 extends n14 {
    public final int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf7(Context context, int i, String str, vf7 vf7Var, byte b) {
        super(context, str, vf7Var.a, R.drawable.stat_sys_download_done, null);
        this.h = b;
        ua7 ua7Var = this.c;
        Intent intent = new Intent(context, (Class<?>) DownloadNotifierReceiver.class);
        intent.setAction("com.opera.android.action.DOWNLOAD_NOTIFICATION_DELETED");
        intent.putExtra(Constants.Kinds.DICTIONARY, vf7Var.ordinal());
        ((l1f) ua7Var.b).G.deleteIntent = PendingIntent.getBroadcast(context, 0, intent, 1140850688);
        this.g = i;
    }

    @Override // defpackage.n14
    public final void f(List list) throws Resources.NotFoundException {
        switch (this.h) {
            case 0:
                g(list);
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Uri uriG = ((re7) it.next()).g();
                    if (uriG != null) {
                        arrayList.add(uriG.toString());
                    }
                }
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                Context context = this.b;
                Intent intent = new Intent(context, (Class<?>) DownloadNotifierReceiver.class);
                intent.setAction("com.opera.android.action.RESUME_FAILED_DOWNLOADS");
                intent.putExtra("to-resume", strArr);
                e(2132018646, PendingIntent.getBroadcast(context, 0, intent, 201326592));
                break;
            default:
                g(list);
                break;
        }
    }

    public final void g(List list) throws Resources.NotFoundException {
        int size = list.size();
        Context context = this.b;
        String quantityString = context.getResources().getQuantityString(this.g, size, Integer.valueOf(size));
        this.e.setTextViewText(2131363485, quantityString);
        this.f.setTextViewText(2131363485, quantityString);
        int[][] iArr = lg7.a;
        StringBuilder sb = new StringBuilder();
        String string = context.getResources().getString(2132018714);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            re7 re7Var = (re7) it.next();
            if (sb.length() > 512) {
                sb.append(String.format(Locale.getDefault(), string, "", "…"));
                break;
            }
            String strF = re7Var.f();
            String[] strArr = aik.a;
            String strA = ehi.a(strF);
            if (i == 0) {
                sb.append(strA);
            } else {
                sb.append(String.format(Locale.getDefault(), string, "", strA));
            }
            i++;
        }
        if (sb.length() > 1024) {
            sb.setLength(1024);
        }
        String string2 = sb.toString();
        this.f.setViewVisibility(2131362297, 0);
        this.f.setTextViewText(2131362297, string2);
    }
}
