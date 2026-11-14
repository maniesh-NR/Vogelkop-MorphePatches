package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import org.chromium.content.browser.picker.DateTimeSuggestion;

/* loaded from: classes.dex */
public final class th6 extends ArrayAdapter {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    public th6(Context context, String str) {
        super(context, 2131559195);
        this.b = str;
        addAll(ui6.B(false, true, str, ui6.o));
    }

    public th6(Context context, List list) {
        super(context, 2131558642, list);
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th6(ro9 ro9Var, Context context, Object[] objArr, za9 za9Var) {
        super(context, 2131559350, objArr);
        this.b = za9Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        switch (this.a) {
            case 1:
                za9 za9Var = (za9) this.b;
                return za9Var.a && za9Var.b;
            default:
                return super.areAllItemsEnabled();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        switch (this.a) {
            case 0:
                return super.getCount() + 1;
            default:
                return super.getCount();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                if (view == null) {
                    view = LayoutInflater.from(context).inflate(2131558642, viewGroup, false);
                }
                TextView textView = (TextView) view.findViewById(2131362499);
                TextView textView2 = (TextView) view.findViewById(2131362498);
                if (i == getCount() - 1) {
                    textView.setText(context.getText(2132018510));
                    textView2.setText("");
                } else {
                    DateTimeSuggestion dateTimeSuggestion = (DateTimeSuggestion) getItem(i);
                    textView.setText(dateTimeSuggestion.b);
                    textView2.setText(dateTimeSuggestion.c);
                }
                return view;
            case 1:
                View view2 = super.getView(i, view, viewGroup);
                za9 za9Var = (za9) obj;
                if (i == 0) {
                    z = za9Var.a;
                } else if (i != 1) {
                    za9Var.getClass();
                } else {
                    z = za9Var.b;
                }
                view2.setEnabled(z);
                return view2;
            default:
                if (view == null) {
                    view = j7c.n(viewGroup, 2131559195, viewGroup, false);
                }
                Context context2 = view.getContext();
                ?? r0 = (OperaListItem) view;
                Pair pair = (Pair) getItem(i);
                lag lagVar = (lag) pair.first;
                kag kagVar = (kag) pair.second;
                r0.B(new ylf());
                r0.z(new lxh(ui6.z(lagVar, kagVar)));
                String strS = ui6.S(context2, lagVar);
                r0.E(strS != null ? new qxh(strS) : null);
                r0.C(new qxh(ui6.R(context2, lagVar, kagVar, BrowserUtils.getHostString((String) obj))));
                r0.setTag(pair);
                return view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        switch (this.a) {
            case 1:
                za9 za9Var = (za9) this.b;
                if (i == 0) {
                    return za9Var.a;
                }
                if (i == 1) {
                    return za9Var.b;
                }
                za9Var.getClass();
                return false;
            default:
                return super.isEnabled(i);
        }
    }
}
