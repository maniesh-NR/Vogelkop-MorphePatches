package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mq2 extends dej {
    public final dx3 c;
    public final ChromiumContent d;
    public final zy9 e;
    public final int f;
    public final iz9 g;
    public final List h;
    public final dt1 i;
    public final hp2 j;

    public mq2(dx3 dx3Var, mej mejVar, ChromiumContent chromiumContent, zy9 zy9Var, int i, iz9 iz9Var, List list) {
        super(mejVar);
        this.c = dx3Var;
        this.d = chromiumContent;
        this.e = zy9Var;
        this.f = i;
        this.g = iz9Var;
        this.h = list;
        this.i = new dt1();
        this.j = new hp2((byte) 13, false);
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        String str;
        hp2 hp2Var = this.j;
        hp2Var.getClass();
        hp2Var.b = SystemClock.elapsedRealtime();
        xj xjVar = new xj(this, new tw2(this, (byte) 12), (byte) 13);
        qp2 qp2Var = new qp2((byte) 1);
        a3j a3jVar = new a3j((byte) 4);
        dt1 dt1Var = this.i;
        dt1Var.J(qq2.class, xjVar, qp2Var, a3jVar);
        pt1 pt1VarD = pt1.d(LayoutInflater.from(context));
        yq1 yq1Var = (StylingTextView) pt1VarD.c;
        TextView textView = (TextView) pt1VarD.g;
        FrameLayout frameLayout = (FrameLayout) pt1VarD.b;
        RecyclerView recyclerView = (RecyclerView) pt1VarD.f;
        recyclerView.C0(new LinearLayoutManager(1, false));
        recyclerView.y0(dt1Var);
        recyclerView.m(new b5a(recyclerView, false, new u59(this, (byte) 14), 2130969329, false));
        MaterialButton materialButton = (OperaMaterialButton) pt1VarD.e;
        materialButton.setOnClickListener(new gf(this, (byte) 14));
        ArrayList arrayList = (ArrayList) dt1Var.d;
        int size = arrayList.size();
        MaterialButton materialButton2 = (OperaMaterialButton) pt1VarD.d;
        if (size == 1) {
            materialButton2.setVisibility(0);
            recyclerView.post(new q02(pt1VarD, (byte) 24));
        } else {
            materialButton2.setVisibility(8);
        }
        int i = this.f;
        if (i == 3) {
            textView.setText(context.getString(2132017754));
            materialButton.setText(frameLayout.getResources().getString(2132017852));
            return frameLayout;
        }
        if (i != 5) {
            return frameLayout;
        }
        if (arrayList.isEmpty()) {
            materialButton.setVisibility(4);
            textView.setText(context.getString(2132022383));
        } else {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                qq2 qq2Var = (qq2) obj;
                if (qq2Var == null) {
                    qq2Var = null;
                }
                if (qq2Var == null || qq2Var.a.e != 43) {
                    materialButton.setText(frameLayout.getResources().getString(2132017839));
                    textView.setText(context.getString(2132022083));
                    break;
                }
            }
            materialButton.setVisibility(4);
            textView.setText(context.getString(2132022383));
        }
        List list = this.h;
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (str = ((ru2) list.get(0)).g) == null || str.length() == 0) {
            yq1Var.setVisibility(8);
            return frameLayout;
        }
        yq1Var.setText(frameLayout.getResources().getString(2132021523, ((ru2) list.get(0)).g));
        yq1Var.setVisibility(0);
        return frameLayout;
    }

    public final void d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru2 ru2Var = (ru2) it.next();
            qq2 qq2Var = ru2Var.e == 46 ? null : new qq2(ru2Var);
            if (qq2Var != null) {
                arrayList.add(qq2Var);
            }
        }
        this.i.K(arrayList);
    }
}
