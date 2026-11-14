package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzb extends d {
    public final ArrayList a = new ArrayList();
    public int b;
    public final int c;
    public int d;
    public final /* synthetic */ a0c e;

    public zzb(a0c a0cVar, Context context) {
        String str;
        this.e = a0cVar;
        int i = 1;
        setHasStableIds(true);
        Locale locale = wwc.a;
        ywc.d();
        ArrayList arrayList = new ArrayList(ywc.a.keySet());
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            arrayList2.add(new tzb(context, (String) obj));
        }
        Collections.sort(arrayList2, new rp2((byte) 1));
        ArrayList arrayListC = ywc.c();
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            arrayList3.add(((tzb) obj2).a);
        }
        String[] strArr = OperaApplication.K;
        ffb ffbVarD = ((nok) ((lpe) ((OperaApplication) applicationContext.getApplicationContext()).A.get()).b.getValue()).d();
        String string = applicationContext.getSharedPreferences("localize", 0).getString("language_code", null);
        Locale locale2 = wwc.a;
        uac uacVar = ((OperaApplication) applicationContext.getApplicationContext()).K().j().size() >= 46 ? new uac((byte) 10) : new kw0(applicationContext);
        ArrayList arrayList4 = new ArrayList(ffbVarD.size());
        if (string != null && ywc.b(string, true) != null) {
            arrayList4.add(wwc.c(string));
        }
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            String strC = wwc.c((String) obj3);
            if (!arrayListC.contains(strC) && ywc.b(strC, true) != null && uacVar.test(strC) && !arrayList4.contains(strC)) {
                arrayList4.add(strC);
            }
        }
        Iterator it = ffbVarD.iterator();
        while (it.hasNext()) {
            String strC2 = wwc.c((String) it.next());
            if (!arrayList4.contains(strC2) && !arrayListC.contains(strC2) && ywc.b(strC2, true) != null) {
                arrayList4.add(strC2);
            }
        }
        String strD = wwc.d(locale2);
        int size4 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                str = "en";
                break;
            }
            Object obj4 = arrayList3.get(i6);
            i6++;
            if (wwc.b((String) obj4, strD)) {
                str = "";
                break;
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            if (wwc.b((String) it2.next(), str)) {
                it2.remove();
            }
        }
        arrayList4.add((string == null || wwc.b(str, string)) ? 0 : 1, str);
        int size5 = arrayList2.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList2.get(i7);
            i7++;
            tzb tzbVar = (tzb) obj5;
            if (!arrayListC.contains(tzbVar.a)) {
                Locale localeF = wwc.f(tzbVar.a);
                Locale locale3 = wwc.a;
                boolean zB = wwc.b(wwc.d(localeF), wwc.d(locale3));
                ArrayList arrayList5 = this.a;
                if (zB) {
                    arrayList5.add(new tzb(context, wwc.d(locale3)));
                } else {
                    arrayList5.add(tzbVar);
                }
            }
        }
        this.a.add(0, new tzb());
        vl6 vl6Var = vl6.f;
        if (vl6Var != null) {
            String str2 = (String) vl6Var.d;
            arrayList4.remove(str2);
            arrayList4.add(Math.min(1, arrayList4.size()), str2);
        }
        int size6 = arrayList4.size();
        int i8 = 1;
        while (i2 < size6) {
            Object obj6 = arrayList4.get(i2);
            i2++;
            this.a.add(i8, new tzb(context, (String) obj6));
            i8++;
        }
        this.c = i8;
        this.a.add(i8, new tzb());
        this.b = 1;
        if (!TextUtils.isEmpty(wwc.e(context.getApplicationContext()))) {
            Locale localeF2 = wwc.f(wwc.e(context.getApplicationContext()));
            while (true) {
                if (i < this.a.size()) {
                    Locale locale4 = ((tzb) this.a.get(i)).b;
                    if (locale4 != null && wwc.b(wwc.d(localeF2), wwc.d(locale4))) {
                        this.b = i;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        this.d = -1;
    }

    public final void G() {
        vl6 vl6Var = vl6.f;
        if (vl6Var != null) {
            u85 u85Var = (u85) vl6Var.e;
            if (u85Var != null) {
                if (!u85Var.a) {
                    ((r0k) u85Var.e).b(u85Var.b);
                }
                u85Var.c();
                vl6Var.e = null;
            }
            vl6Var.R();
        }
        int i = this.d;
        if (i == -1) {
            return;
        }
        this.d = -1;
        a0c a0cVar = this.e;
        u85 u85Var2 = a0cVar.t;
        if (u85Var2 != null) {
            if (!u85Var2.a) {
                ((r0k) u85Var2.e).b(u85Var2.b);
            }
            u85Var2.c();
            a0cVar.t = null;
        }
        a0cVar.u = null;
        notifyItemChanged(i);
    }

    public final void H() {
        int i = this.d;
        if (i == -1) {
            return;
        }
        this.d = -1;
        a0c a0cVar = this.e;
        a0cVar.t = null;
        a0cVar.u = null;
        notifyItemChanged(i);
    }

    public final void I() {
        a0c a0cVar = this.e;
        if (a0cVar.getLifecycle().i.d(qcc.e)) {
            z77 z77VarU = sfe.U(a0cVar.getContext());
            rxh rxhVar = new rxh(2132021624);
            yzb yzbVar = new yzb((Object) a0cVar, (byte) 0);
            gkj gkjVar = new gkj(false, false);
            gkjVar.a = null;
            gkjVar.b = null;
            gkjVar.c = null;
            gkjVar.d = null;
            gkjVar.e = null;
            gkjVar.f = null;
            gkjVar.g = null;
            gkjVar.h = yzbVar;
            gkjVar.i = null;
            gkjVar.j = null;
            gkjVar.k = 2132020155;
            gkjVar.l = 0;
            gkjVar.m = 2132021625;
            gkjVar.n = true;
            gkjVar.o = rxhVar;
            z77VarU.getClass();
            z77VarU.b(gkjVar, ijm.b);
        }
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final long getItemId(int i) {
        return i;
    }

    public final int getItemViewType(int i) {
        return ((tzb) this.a.get(i)).b == null ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, androidx.appcompat.widget.AppCompatImageView, com.opera.android.custom_views.StylingImageView] */
    public final void onBindViewHolder(i iVar, final int i) {
        final tzb tzbVar = (tzb) this.a.get(i);
        View view = ((i) ((uzb) iVar)).itemView;
        if (tzbVar.b == null) {
            mn5.a(view).b.setText(i == 0 ? 2132019376 : 2132019375);
            return;
        }
        y83 y83VarD = y83.d(view);
        ((TextView) y83VarD.f).setText(tzbVar.c);
        ((TextView) y83VarD.c).setText(tzbVar.d);
        view.setTag(tzbVar);
        boolean z = i == this.d;
        ?? r4 = (StylingImageView) y83VarD.d;
        LinearLayout linearLayout = (LinearLayout) y83VarD.b;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) y83VarD.h;
        byte b = 2;
        if (z) {
            r4.c(f03.v(r4.getContext()));
            r4.setImageResource(2131232035);
            circularProgressIndicator.setVisibility(0);
            r4.setVisibility(0);
            linearLayout.setOnClickListener(new ks8(new g63(this, i, b), b));
            return;
        }
        r4.c(ColorStateList.valueOf(f03.q(r4.getContext())));
        r4.setImageResource(2131232018);
        final boolean z2 = i == this.b;
        r4.setVisibility(z2 ? 0 : 4);
        circularProgressIndicator.setVisibility(4);
        linearLayout.setOnClickListener(new ks8(new View.OnClickListener() { // from class: xzb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean zV;
                tzb tzbVar2 = tzbVar;
                String str = tzbVar2.a;
                zzb zzbVar = this.a;
                a0c a0cVar = zzbVar.e;
                if (z2) {
                    zzbVar.G();
                    a0cVar.g0();
                    return;
                }
                int i2 = zzbVar.d;
                int i3 = i;
                if (i3 == i2) {
                    return;
                }
                vl6 vl6Var = vl6.f;
                if (vl6Var != null && Objects.equals(str, (String) vl6Var.d)) {
                    a0cVar.g0();
                    return;
                }
                zzbVar.G();
                zzbVar.notifyItemChanged(zzbVar.b);
                zzbVar.b = i3;
                zzbVar.notifyItemChanged(i3);
                Context context = a0cVar.getContext();
                String strM = w8h.m(str);
                if (strM == null) {
                    zV = true;
                } else {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.setLocale(wwc.f(strM));
                    zV = w8h.v(context.createConfigurationContext(configuration).getResources(), strM);
                }
                if (zV) {
                    wwc.i(a0cVar.getContext().getApplicationContext(), str);
                    a0cVar.g0();
                    return;
                }
                Context context2 = a0cVar.getContext();
                String[] strArr = OperaApplication.K;
                r0k r0kVarK = ((OperaApplication) context2.getApplicationContext()).K();
                wci wciVar = new wci();
                ((ArrayList) wciVar.c).add(wwc.f(str));
                n9h n9hVar = new n9h(wciVar);
                a0cVar.s = mdb.b.nextInt() & 65535;
                zzbVar.d = i3;
                r0kVarK.i(n9hVar).addOnSuccessListener(new qo4(zzbVar, i3, tzbVar2, r0kVarK)).addOnFailureListener(new so4(zzbVar, i3, tzbVar2, (byte) 3));
            }
        }, b));
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        yq1 yq1Var;
        boolean z = i == 1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (z) {
            yq1Var = mn5.a(layoutInflaterFrom.inflate(2131559301, viewGroup, false)).b;
        } else {
            y83 y83VarE = y83.e(layoutInflaterFrom, viewGroup);
            AppCompatImageView appCompatImageView = (StylingImageView) y83VarE.d;
            appCompatImageView.setVisibility(8);
            vs5 vs5Var = new vs5(this, appCompatImageView, y83VarE, (byte) 2);
            dll dllVarS = q9n.s(appCompatImageView);
            if (dllVarS != null) {
                u8n.b(dllVarS, appCompatImageView, vs5Var);
            }
            yq1Var = (LinearLayout) y83VarE.b;
        }
        return new uzb(yq1Var);
    }
}
