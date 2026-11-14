package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcelable;
import androidx.fragment.app.w;
import com.opera.android.OperaApplication;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0l extends ryl implements ucl {
    public final Intent c;
    public final jcj d;
    public final ArrayList e;
    public up1 f = new up1(this, (byte) 19);
    public boolean g;
    public String h;

    public g0l(Intent intent, jcj jcjVar, ArrayList arrayList) {
        this.c = intent;
        this.d = jcjVar;
        this.e = arrayList;
    }

    @Override // defpackage.ryl
    public final void h0(w wVar) {
        wVar.U();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        if (this.f == null) {
            return;
        }
        getContext().unregisterReceiver(this.f);
        this.f = null;
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.g) {
            if (this.f != null) {
                getContext().unregisterReceiver(this.f);
                this.f = null;
            }
            String str = this.h;
            jcj jcjVar = this.d;
            if (str != null) {
                Context context = getContext();
                String[] strArr = OperaApplication.K;
                ((zcj) ((OperaApplication) context.getApplicationContext()).r.Q0.get()).e(this.h);
                jcjVar.d = this.h;
                jcjVar.finish(hjm.a);
            } else {
                jcjVar.finish(hjm.b);
            }
            g0();
            return;
        }
        int i = 1;
        this.g = true;
        getContext().registerReceiver(this.f, new IntentFilter("com.opera.share.SHARE_ACTION"), null, null, 4);
        Intent intentCreateChooser = Intent.createChooser(this.c, null, PendingIntent.getBroadcast(getContext(), 0, new Intent("com.opera.share.SHARE_ACTION").setPackage(getContext().getPackageName()), w8g.a | 134217728).getIntentSender());
        if (Build.VERSION.SDK_INT >= 34) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.e;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                an8 an8Var = (an8) obj;
                Context context2 = t8.a;
                Intent intent = new Intent("com.opera.share.SHARE_ACTION");
                intent.setPackage(context2.getPackageName());
                if (Build.VERSION.SDK_INT < 33 && c26.x(intent)) {
                    intent.putExtra("trusted_application_code_extra", c26.p());
                }
                intent.putExtra("EXTRA_SHARE_TARGET_ID", an8Var.getId());
                Context context3 = getContext();
                arrayList.add(g8.E(an8Var.e(context3), an8Var.d(context3).toString(), PendingIntent.getBroadcast(context3, i, intent, 1409286144)));
                i++;
            }
            intentCreateChooser.putExtra("android.intent.extra.CHOOSER_CUSTOM_ACTIONS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        }
        startActivity(intentCreateChooser);
    }
}
