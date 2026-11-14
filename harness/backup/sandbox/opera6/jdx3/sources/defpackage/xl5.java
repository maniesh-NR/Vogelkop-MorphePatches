package defpackage;

import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/* loaded from: classes.dex */
public final class xl5 extends d implements hxl {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ am5 b;

    public xl5(am5 am5Var) {
        this.b = am5Var;
    }

    public final void G() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(this.b.s.u());
        Collections.sort(arrayList, new c9((byte) 9));
    }

    public final int getItemCount() {
        return this.a.size() + 1;
    }

    public final long getItemId(int i) {
        if (i == this.a.size()) {
            return -1L;
        }
        return ((fxl) r1.get(i)).a.a.hashCode();
    }

    public final int getItemViewType(int i) {
        return i == this.a.size() ? 1 : 0;
    }

    @Override // defpackage.hxl
    public final void i() {
    }

    public final void onBindViewHolder(i iVar, int i) {
        if (iVar.getItemViewType() == 0) {
            yl5 yl5Var = (yl5) iVar;
            fxl fxlVar = (fxl) this.a.get(i);
            TextView textView = yl5Var.d;
            Resources resources = ((i) yl5Var).itemView.getResources();
            StylingImageView stylingImageView = yl5Var.b;
            pwl pwlVar = fxlVar.a;
            stylingImageView.setImageResource("mobile".equals(pwlVar.e) ? 2131232180 : 2131232065);
            TextView textView2 = yl5Var.c;
            String str = pwlVar.c;
            Date date = pwlVar.g;
            textView2.setText(str);
            if (fxlVar.b) {
                textView.setText(resources.getString(2132019116));
            } else if (DateUtils.isToday(date.getTime())) {
                textView.setText(resources.getString(2132019253));
            } else {
                textView.setText(aik.e(date));
            }
            yl5Var.g = pwlVar.a;
            yl5Var.e.setVisibility(0);
            yl5Var.f.setVisibility(8);
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new yl5(this.b, viewGroup);
        }
        zl5 zl5Var = new zl5(j7c.n(viewGroup, 2131558610, viewGroup, false));
        ((i) zl5Var).itemView.findViewById(2131362401).setOnClickListener(new n42((byte) 1));
        return zl5Var;
    }

    @Override // defpackage.hxl
    public final void x(int i) {
        G();
        notifyDataSetChanged();
    }

    @Override // defpackage.hxl
    public final void z() {
        G();
        notifyDataSetChanged();
    }
}
