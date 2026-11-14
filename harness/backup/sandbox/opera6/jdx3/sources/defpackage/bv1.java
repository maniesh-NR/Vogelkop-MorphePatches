package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillItem;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.ThemeSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class bv1 extends d {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public List d;
    public Object e;
    public Object f;

    public bv1(mu1 mu1Var) {
        this.a = (byte) 0;
        this.c = mu1Var;
        this.d = new ArrayList();
    }

    public bv1(wr2 wr2Var, boolean z) {
        this.a = (byte) 1;
        this.f = wr2Var;
        this.a = (byte) 1;
        this.e = wr2Var;
        this.c = new HashMap();
        this.d = Collections.EMPTY_LIST;
        this.b = z;
    }

    public final int G(String str) {
        for (int i = 0; i < this.d.size(); i++) {
            if (((AutofillItem) this.d.get(i)).a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final void H(String str) {
        int iG = G(str);
        if (iG < 0) {
            return;
        }
        ((HashMap) this.c).put(str, (AutofillItem) this.d.get(iG));
        ((wr2) this.e).u.c(Collections.singletonList(str));
        this.d.remove(iG);
        if (this.d.isEmpty()) {
            notifyItemRangeRemoved(0, 2);
        } else {
            notifyItemRemoved(iG);
        }
    }

    public final int getItemCount() {
        switch (this.a) {
            case 0:
                return ((ArrayList) this.d).size();
            default:
                return this.d.size() + (this.d.isEmpty() ? 1 : 2);
        }
    }

    public final int getItemViewType(int i) {
        switch (this.a) {
            case 1:
                if (i >= 0) {
                    if (!this.d.isEmpty()) {
                        if (i < this.d.size()) {
                            return 1;
                        }
                        if (i == this.d.size()) {
                        }
                    }
                    return 3;
                }
                if (i == 0) {
                    return -1;
                }
                return 2;
            default:
                return super.getItemViewType(i);
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        char c = 1;
        final byte b = 0;
        switch (this.a) {
            case 0:
                av1 av1Var = (av1) iVar;
                f7j f7jVar = (f7j) ((ArrayList) this.d).get(i);
                av1Var.c = f7jVar;
                ThemeSelector themeSelector = (ThemeSelector) av1Var.b.b;
                bv1 bv1Var = av1Var.d;
                themeSelector.a = null;
                themeSelector.setChecked(f7jVar == ((f7j) bv1Var.e));
                themeSelector.setContentDescription(f7jVar.toString());
                themeSelector.c.setText(f7jVar.a);
                av1Var.U(f7jVar, themeSelector);
                themeSelector.a = new xj(bv1Var, f7jVar, (byte) 12);
                break;
            default:
                ct2 ct2Var = (ct2) iVar;
                if (i >= 0) {
                    if (i >= this.d.size()) {
                        if (this.d.isEmpty() || i > this.d.size()) {
                            ((i) ct2Var).itemView.setOnClickListener(new gf((Object) this, (byte) 17));
                            break;
                        }
                    } else {
                        final vr2 vr2Var = (vr2) ct2Var;
                        AutofillItem autofillItem = (AutofillItem) this.d.get(i);
                        vr2Var.getClass();
                        final Address address = (Address) autofillItem;
                        vs vsVar = vr2Var.b;
                        CharSequence charSequence = address.b;
                        String strU = address.l;
                        String str = address.k;
                        if (!TextUtils.isEmpty(str)) {
                            if (!TextUtils.isEmpty(strU)) {
                                strU = sko.u(strU, ", ");
                            }
                            strU = sko.u(strU, str);
                        }
                        ((StylingTextView) vsVar.c).setText(charSequence);
                        ((StylingTextView) vsVar.e).setText(strU);
                        ((LayoutDirectionLinearLayout) vsVar.b).setOnClickListener(new View.OnClickListener() { // from class: ur2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b2 = b;
                                Address address2 = address;
                                vr2 vr2Var2 = vr2Var;
                                switch (b2) {
                                    case 0:
                                        vr2Var2.c.I0(address2);
                                        break;
                                    default:
                                        new xw((Object) vr2Var2.c, address2, (byte) 1).p(view);
                                        break;
                                }
                            }
                        });
                        ImageView imageView = (ImageView) vsVar.d;
                        final char c2 = c == true ? 1 : 0;
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: ur2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b2 = c2;
                                Address address2 = address;
                                vr2 vr2Var2 = vr2Var;
                                switch (b2) {
                                    case 0:
                                        vr2Var2.c.I0(address2);
                                        break;
                                    default:
                                        new xw((Object) vr2Var2.c, address2, (byte) 1).p(view);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.a) {
            case 0:
                View viewN = j7c.n(viewGroup, 2131559440, viewGroup, false);
                if (viewN != null) {
                    return new av1(this, new cq3((ThemeSelector) viewN, (byte) 6));
                }
                t3p.q("rootView");
                return null;
            default:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                if (i == 1) {
                    return new vr2((wr2) this.f, vs.e(layoutInflaterFrom, viewGroup), this.b);
                }
                if (i == 2) {
                    return new ct2(layoutInflaterFrom.inflate(2131559309, viewGroup, false));
                }
                if (i == 3) {
                    return new ct2(layoutInflaterFrom.inflate(2131558526, viewGroup, false));
                }
                hai.d();
                return null;
        }
    }

    public final void onViewRecycled(i iVar) {
        switch (this.a) {
            case 0:
                av1 av1Var = (av1) iVar;
                super.onViewRecycled(av1Var);
                av1Var.c = null;
                break;
            default:
                super.onViewRecycled(iVar);
                break;
        }
    }
}
