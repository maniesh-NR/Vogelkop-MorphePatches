package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhy7;", "Luq3;", "<init>", "()V", "image-editor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class hy7 extends uq3 {
    public static final /* synthetic */ int b = 0;
    public ywa a;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerViewInflate = layoutInflater.inflate(2131558925, viewGroup, false);
        if (recyclerViewInflate != null) {
            return recyclerViewInflate;
        }
        t3p.q("rootView");
        return null;
    }

    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        String str;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (view == null) {
            t3p.q("rootView");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 4.0f, view.getContext().getResources().getDisplayMetrics());
        view.getContext();
        recyclerView.C0(new GridLayoutManager(5, 0));
        recyclerView.t = true;
        String[] stringArray = view.getContext().getResources().getStringArray(2130903052);
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str2 : stringArray) {
            try {
                str = new String(Character.toChars(Integer.parseInt(str2.substring(2), CharsKt.checkRadix(16))));
            } catch (NumberFormatException unused) {
                str = "";
            }
            arrayList.add(str);
        }
        CountDownLatch countDownLatch = oz7.a;
        recyclerView.y0(new xol(arrayList, this));
        recyclerView.m(new ou1((byte) 1, iApplyDimension));
    }
}
