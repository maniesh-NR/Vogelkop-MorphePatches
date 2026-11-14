package defpackage;

import ads_mobile_sdk.bs1;
import ads_mobile_sdk.cs1;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.fq1;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* loaded from: classes.dex */
public final /* synthetic */ class gyo implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gyo(cs1 cs1Var, String str, String str2, String str3, Activity activity, cy0 cy0Var) {
        this.e = cs1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = activity;
        this.g = cy0Var;
    }

    public /* synthetic */ gyo(String str, String str2, String str3, Long l, Long l2, fq1 fq1Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = l2;
        this.g = fq1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                Long l = (Long) obj3;
                Long l2 = (Long) obj2;
                fq1 fq1Var = (fq1) obj;
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", this.b);
                data.putExtra("eventLocation", this.c);
                data.putExtra("description", this.d);
                if (l != null) {
                    data.putExtra("beginTime", l.longValue());
                }
                if (l2 != null) {
                    data.putExtra("endTime", l2.longValue());
                }
                data.setFlags(268435456);
                fq1Var.c.a(data);
                break;
            default:
                cs1 cs1Var = (cs1) obj3;
                nx5 nx5Var = cs1Var.d;
                String str = this.b;
                na2.B(nx5Var, null, null, new bs1(cs1Var, str, (cy0) obj, this.c, this.d, (Activity) obj2, null), 3);
                break;
        }
    }
}
