package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fr2 extends ArrayAdapter {
    public final int a;
    public final Drawable b;
    public final ArrayList c;
    public final /* synthetic */ mr2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr2(mr2 mr2Var, Context context) {
        super(context, 2131559350);
        this.d = mr2Var;
        this.a = fan.a(16.0f, context.getResources());
        this.b = sgb.F(2131231974, context);
        this.c = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gr2 getItem(int i) {
        return (gr2) this.c.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int b(String str) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.a(((gr2) arrayList.get(i)).a, str)) {
                return i;
            }
        }
        return 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(2131559350, viewGroup, false);
        }
        TextView textView = (TextView) view;
        gr2 item = getItem(i);
        if (Intrinsics.a(item.a, "ADD_BUTTON")) {
            xf8.r0(textView, 2132083321);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.b, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(this.a);
            textView.setTextColor(f03.C(context));
        } else {
            xf8.r0(textView, 2132083672);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setTextColor(f03.D(context));
            textView.setAllCaps(false);
        }
        textView.setText(item.b);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return true;
    }
}
