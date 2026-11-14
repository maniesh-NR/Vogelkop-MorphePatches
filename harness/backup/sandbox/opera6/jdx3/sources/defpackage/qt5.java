package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class qt5 extends d {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public qt5(hnd hndVar) {
        this.a = (byte) 1;
        this.h = hndVar;
        this.b = new ArrayList();
        Context context = hndVar.i;
        this.c = LayoutInflater.from(context);
        this.d = o0g.T(2130970325, context);
        this.e = o0g.T(2130970334, context);
        this.f = o0g.T(2130970331, context);
        this.g = o0g.T(2130970330, context);
        G();
    }

    public qt5(rt5 rt5Var, rt5 rt5Var2, s2 s2Var) {
        this.a = (byte) 0;
        this.b = rt5Var;
        this.c = rt5Var2;
        this.d = s2Var;
        l08 l08Var = l08.a;
        this.e = l08Var;
        this.g = new yv4((byte) 3);
        this.h = new pde(null);
        this.f = l08Var;
    }

    public final void G() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        hnd hndVar = (hnd) this.h;
        arrayList.add(new fnd(hndVar.i.getString(2132019823)));
        ArrayList arrayList2 = hndVar.k;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new fnd((cod) obj));
        }
        notifyDataSetChanged();
    }

    public final void H(ArrayList arrayList) {
        this.e = arrayList;
        ehc ehcVarB = a.b();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j8f j8fVar = (j8f) obj;
            ehcVarB.add(new yt5(j8fVar.getTitle(), j8fVar.c(), j8fVar.d(), j8fVar.b()));
        }
        this.f = a.a(ehcVarB);
        notifyDataSetChanged();
        pde pdeVar = (pde) this.h;
        Iterator it = ((List) this.e).iterator();
        String str = null;
        String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                str = str2;
                break;
            }
            String strA = ((j8f) it.next()).a();
            if (strA == null) {
                break;
            }
            if (str2 == null) {
                str2 = strA;
            } else if (!str2.equals(strA)) {
                break;
            }
        }
        xf8.F0(pdeVar, str);
    }

    public final int getItemCount() {
        switch (this.a) {
            case 0:
                return ((List) this.f).size();
            default:
                return ((ArrayList) this.b).size();
        }
    }

    public final long getItemId(int i) {
        switch (this.a) {
            case 0:
                yv4 yv4Var = (yv4) this.g;
                Object obj = ((List) this.e).get(i);
                WeakHashMap weakHashMap = (WeakHashMap) yv4Var.c;
                Long l = (Long) weakHashMap.get(obj);
                if (l != null) {
                    return l.longValue();
                }
                long j = yv4Var.b;
                yv4Var.b = 1 + j;
                weakHashMap.put(obj, Long.valueOf(j));
                return j;
            default:
                return super.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        switch (this.a) {
            case 0:
                return 2131558619;
            default:
                return ((fnd) ((ArrayList) this.b).get(i)).b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.i r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt5.onBindViewHolder(androidx.recyclerview.widget.i, int):void");
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.a) {
            case 0:
                View view = (View) ((rt5) this.b).invoke(2131558619);
                int i2 = 2131362519;
                if (w1h.j(2131362519, view) != null) {
                    i2 = 2131363185;
                    AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131363185, view);
                    if (appCompatImageView != null) {
                        i2 = 2131363942;
                        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363942, view);
                        if (stylingTextView != null) {
                            i2 = 2131364000;
                            yq1 yq1Var = (StylingTextView) w1h.j(2131364000, view);
                            if (yq1Var != null) {
                                i2 = 2131363525;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, view);
                                if (stylingTextView2 != null) {
                                    or2 or2Var = new or2(view, (View) appCompatImageView, stylingTextView, (View) yq1Var, stylingTextView2, (byte) 5);
                                    return new xt5(or2Var, new wg5(this, (byte) 4), new cv2((Object) this, (Object) or2Var, (byte) 18));
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
                return null;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) this.c;
                if (i != 1) {
                    if (i == 2) {
                        return new gnd(this, layoutInflater.inflate(2131559079, viewGroup, false));
                    }
                    h9o.e();
                    return null;
                }
                View viewInflate = layoutInflater.inflate(2131559078, viewGroup, false);
                end endVar = new end(viewInflate);
                endVar.b = (TextView) viewInflate.findViewById(2131363603);
                return endVar;
        }
    }
}
