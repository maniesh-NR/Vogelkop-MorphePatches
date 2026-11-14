package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.BrowserActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lro extends k8 implements ioo {
    public znn o;
    public final int p;
    public final xho q;
    public final zg r;
    public qb7 s;
    public final ArrayList t;
    public final oam u;
    public noo v;
    public WeakReference w;
    public final fio x;
    public final Context y;
    public final boolean z;

    public lro(boolean z, Context context, int i, zg zgVar, xho xhoVar, ArrayList arrayList, oam oamVar, uuj uujVar, p12 p12Var, fio fioVar) {
        super(uujVar, p12Var);
        this.z = z;
        this.y = context;
        this.p = i;
        this.r = zgVar;
        this.q = xhoVar;
        this.t = arrayList;
        this.u = oamVar;
        this.x = fioVar;
    }

    @Override // defpackage.ioo
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ioo
    public final bm b() {
        return null;
    }

    @Override // defpackage.ioo
    public final void p(qb7 qb7Var) {
        this.s = qb7Var;
    }

    public final void s0(int i) {
        noo nooVar;
        ArrayList arrayList;
        String str = i == 1 ? "impressionts" : "clickts";
        for (pho phoVar : this.t) {
            if (phoVar.a == i && (arrayList = phoVar.b) != null) {
                List list = sjo.a;
                Iterator it = sjo.e(str, String.valueOf(System.currentTimeMillis()), arrayList).iterator();
                while (it.hasNext()) {
                    phj.t((String) it.next(), i);
                }
            }
        }
        int i2 = nqo.a[vep.A(i)];
        if (i2 != 1) {
            if (i2 != 2 || (nooVar = this.v) == null) {
                return;
            }
            nooVar.g();
            return;
        }
        noo nooVar2 = this.v;
        if (nooVar2 != null) {
            nooVar2.h();
        }
    }

    public final void t0(Activity activity) throws PackageManager.NameNotFoundException {
        ViewGroup viewGroup;
        Drawable applicationIcon;
        byte b;
        byte b2;
        xho xhoVar = this.q;
        String str = xhoVar.g;
        boolean z = xhoVar.f;
        String str2 = xhoVar.e;
        String str3 = xhoVar.d;
        String str4 = xhoVar.b;
        this.w = new WeakReference(activity);
        boolean z2 = this.z;
        Context context = this.y;
        if (z2) {
            viewGroup = (ViewGroup) activity.findViewById(2131361910);
        } else {
            viewGroup = (ViewGroup) activity.findViewById(2131361995);
            ImageView imageView = (ImageView) activity.findViewById(2131361993);
            TextView textView = (TextView) activity.findViewById(2131361986);
            ((ImageView) activity.findViewById(2131361990)).setOnClickListener(new pkm((AdActivity) activity, (byte) 17));
            List list = sjo.a;
            try {
                applicationIcon = context.getPackageManager().getApplicationIcon(sjo.m(context));
            } catch (PackageManager.NameNotFoundException unused) {
                applicationIcon = null;
            }
            if (applicationIcon != null) {
                imageView.setImageDrawable(applicationIcon);
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            textView.setText(i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i));
        }
        ImageView imageView2 = (ImageView) activity.findViewById(2131361992);
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(2131361987);
        ImageView imageView3 = (ImageView) activity.findViewById(2131361991);
        TextView textView2 = (TextView) activity.findViewById(2131361996);
        TextView textView3 = (TextView) activity.findViewById(2131361989);
        Button button = (Button) activity.findViewById(2131361988);
        String str5 = xhoVar.c;
        ViewGroup viewGroup3 = viewGroup;
        if (imageView2 != null) {
            if (TextUtils.isEmpty(str5)) {
                imageView2.setVisibility(8);
            } else {
                fip.b(context, str5, new ugo(this, imageView2, (byte) 1));
            }
        }
        if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z || TextUtils.isEmpty(str))) {
            viewGroup2.setVisibility(8);
        } else {
            if (imageView3 != null) {
                if (TextUtils.isEmpty(str4)) {
                    imageView3.setVisibility(8);
                } else {
                    fip.b(context, str4, new ugo(this, imageView3, (byte) 1));
                }
            }
            if (TextUtils.isEmpty(str3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str3);
            }
            if (TextUtils.isEmpty(str2)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(str2);
            }
            if (!z || TextUtils.isEmpty(str)) {
                button.setVisibility(8);
            } else {
                button.setText(str);
            }
        }
        View[] viewArr = {imageView2, imageView3, textView2, textView3, button};
        znn znnVar = this.o;
        if (znnVar == null) {
            znnVar = new znn(this.w);
            this.o = znnVar;
        }
        zg zgVar = this.r;
        xbf xbfVar = new xbf(activity, zgVar, znnVar, (aoo) null, (ltm) null);
        for (Object obj : Arrays.asList(viewArr)) {
            if (obj != null) {
                View view = (View) obj;
                view.setOnClickListener(new dv2(this, view, xbfVar, (byte) 10));
            }
        }
        fio fioVar = this.x;
        if (fioVar != null && (b2 = fioVar.a) != 1 && (fioVar.e & b2) != 0) {
            List listAsList = Arrays.asList(viewArr);
            roj rojVar = new roj(this, xbfVar, (byte) 23);
            for (Object obj2 : listAsList) {
                if (obj2 != null) {
                    ((View) obj2).setOnTouchListener(new xgo(rojVar, null, fioVar));
                }
            }
        }
        oam oamVar = this.u;
        if (oamVar != null) {
            if (!c26.q.b) {
                c26.f(context);
            }
            b = 1;
            this.v = new noo(viewGroup3, (String) zgVar.b, oamVar, b);
        } else {
            b = 1;
        }
        qb7 qb7Var = this.s;
        if (qb7Var != null) {
            qb7Var.g();
        }
        s0(b);
    }

    @Override // defpackage.ioo
    public final void v(BrowserActivity browserActivity) {
        AdActivity.b(this, browserActivity);
    }
}
