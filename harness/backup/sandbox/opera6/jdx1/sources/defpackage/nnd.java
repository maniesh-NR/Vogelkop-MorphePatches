package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nnd extends d {
    public final ArrayList a = new ArrayList();
    public final LayoutInflater b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public mnd g;
    public final int h;
    public final AccelerateDecelerateInterpolator i;
    public final /* synthetic */ ond j;

    public nnd(ond ondVar) {
        this.j = ondVar;
        Context context = ondVar.o;
        this.b = LayoutInflater.from(context);
        this.c = o0g.T(2130970325, context);
        this.d = o0g.T(2130970334, context);
        this.e = o0g.T(2130970331, context);
        this.f = o0g.T(2130970330, context);
        this.h = context.getResources().getInteger(2131492936);
        this.i = new AccelerateDecelerateInterpolator();
        J();
    }

    public final void G(int i, View view) {
        byte b = 1;
        tmd tmdVar = new tmd(i, view.getLayoutParams().height, view, b);
        tmdVar.setAnimationListener(new rmd(this, b));
        tmdVar.setDuration(this.h);
        tmdVar.setInterpolator(this.i);
        view.startAnimation(tmdVar);
    }

    public final Drawable H(cod codVar) {
        Uri uri = codVar.f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.j.o.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = codVar.n;
        return i != 1 ? i != 2 ? codVar.e() ? this.f : this.c : this.e : this.d;
    }

    public final void I() {
        ond ondVar = this.j;
        ArrayList arrayList = ondVar.n;
        arrayList.clear();
        ArrayList arrayList2 = ondVar.l;
        ArrayList arrayList3 = new ArrayList();
        ynd yndVarA = ondVar.j.a();
        if (yndVarA != null) {
            bod bodVar = ondVar.j.a;
            dod.b();
            for (cod codVar : Collections.unmodifiableList(bodVar.b)) {
                if (yndVarA.o(codVar)) {
                    arrayList3.add(codVar);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        notifyDataSetChanged();
    }

    public final void J() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        ond ondVar = this.j;
        ArrayList arrayList2 = ondVar.m;
        Context context = ondVar.o;
        ArrayList arrayList3 = ondVar.l;
        this.g = new mnd(ondVar.j, 1);
        ArrayList arrayList4 = ondVar.k;
        boolean z = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new mnd(ondVar.j, 3));
        } else {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new mnd((cod) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                cod codVar = (cod) obj2;
                if (!arrayList4.contains(codVar)) {
                    if (!z2) {
                        ondVar.j.getClass();
                        rnd rndVarB = cod.b();
                        String strJ = rndVarB != null ? rndVarB.j() : null;
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = context.getString(2132019846);
                        }
                        arrayList.add(new mnd(strJ, 2));
                        z2 = true;
                    }
                    arrayList.add(new mnd(codVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                cod codVar2 = (cod) obj3;
                cod codVar3 = ondVar.j;
                if (codVar3 != codVar2) {
                    if (!z) {
                        codVar3.getClass();
                        rnd rndVarB2 = cod.b();
                        String strK = rndVarB2 != null ? rndVarB2.k() : null;
                        if (TextUtils.isEmpty(strK)) {
                            strK = context.getString(2132019847);
                        }
                        arrayList.add(new mnd(strK, 2));
                        z = true;
                    }
                    arrayList.add(new mnd(codVar2, 4));
                }
            }
        }
        I();
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        return this.a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemViewType(int i) {
        mnd mndVar;
        if (i == 0) {
            mndVar = this.g;
        } else {
            mndVar = (mnd) this.a.get(i - 1);
        }
        return mndVar.b;
    }

    @Override // androidx.recyclerview.widget.d
    public final void onBindViewHolder(i iVar, int i) {
        ynd yndVarA;
        qnd qndVar;
        ArrayList arrayList = this.a;
        byte b = (i == 0 ? this.g : (mnd) arrayList.get(i - 1)).b;
        boolean z = true;
        mnd mndVar = i == 0 ? this.g : (mnd) arrayList.get(i - 1);
        ond ondVar = this.j;
        int i2 = 0;
        if (b == 1) {
            ondVar.w.put(((cod) mndVar.a).c, (e) iVar);
            f fVar = (f) iVar;
            View view = fVar.itemView;
            ond ondVar2 = fVar.h.j;
            if (ondVar2.T && Collections.unmodifiableList(ondVar2.j.v).size() > 1) {
                i2 = fVar.g;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            cod codVar = (cod) mndVar.a;
            fVar.U(codVar);
            fVar.f.setText(codVar.d);
            return;
        }
        if (b == 2) {
            lnd lndVar = (lnd) iVar;
            lndVar.getClass();
            lndVar.b.setText(mndVar.a.toString());
            return;
        }
        if (b != 3) {
            if (b != 4) {
                h9o.e();
                return;
            }
            knd kndVar = (knd) iVar;
            View view2 = kndVar.b;
            cod codVar2 = (cod) mndVar.a;
            kndVar.g = codVar2;
            ImageView imageView = kndVar.c;
            imageView.setVisibility(0);
            kndVar.d.setVisibility(4);
            nnd nndVar = kndVar.h;
            List listUnmodifiableList = Collections.unmodifiableList(nndVar.j.j.v);
            view2.setAlpha((listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == codVar2) ? kndVar.f : 1.0f);
            view2.setOnClickListener(new sma(kndVar, (byte) 28));
            imageView.setImageDrawable(nndVar.H(codVar2));
            kndVar.e.setText(codVar2.d);
            return;
        }
        ondVar.w.put(((cod) mndVar.a).c, (e) iVar);
        g gVar = (g) iVar;
        float f = gVar.l;
        View.OnClickListener onClickListener = gVar.n;
        ImageView imageView2 = gVar.g;
        View view3 = gVar.f;
        CheckBox checkBox = gVar.k;
        cod codVar3 = (cod) mndVar.a;
        nnd nndVar2 = gVar.o;
        ond ondVar3 = nndVar2.j;
        if (codVar3 == ondVar3.j && !Collections.unmodifiableList(codVar3.v).isEmpty()) {
            Iterator it = Collections.unmodifiableList(codVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cod codVar4 = (cod) it.next();
                if (!ondVar3.l.contains(codVar4)) {
                    codVar3 = codVar4;
                    break;
                }
            }
        }
        gVar.U(codVar3);
        imageView2.setImageDrawable(nndVar2.H(codVar3));
        gVar.i.setText(codVar3.d);
        checkBox.setVisibility(0);
        boolean zX = gVar.X(codVar3);
        boolean z2 = !ondVar3.n.contains(codVar3) && (!gVar.X(codVar3) || Collections.unmodifiableList(ondVar3.j.v).size() >= 2) && !(gVar.X(codVar3) && ((yndVarA = ondVar3.j.a()) == null || (qndVar = (qnd) yndVarA.x.get(codVar3.c)) == null || !qndVar.c));
        checkBox.setChecked(zX);
        gVar.h.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        gVar.c.setEnabled(z2 || zX);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = gVar.d;
        if (!z2 && !zX) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(onClickListener);
        checkBox.setOnClickListener(onClickListener);
        RelativeLayout relativeLayout = gVar.j;
        if (zX && !gVar.b.e()) {
            i2 = gVar.m;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i2;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || zX) ? 1.0f : f);
        checkBox.setAlpha((z2 || !zX) ? 1.0f : f);
    }

    @Override // androidx.recyclerview.widget.d
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.b;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(2131559069, viewGroup, false));
        }
        if (i == 2) {
            return new lnd(layoutInflater.inflate(2131559070, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(2131559072, viewGroup, false));
        }
        if (i == 4) {
            return new knd(this, layoutInflater.inflate(2131559068, viewGroup, false));
        }
        h9o.e();
        return null;
    }

    @Override // androidx.recyclerview.widget.d
    public final void onViewRecycled(i iVar) {
        super.onViewRecycled(iVar);
        this.j.w.values().remove(iVar);
    }
}
