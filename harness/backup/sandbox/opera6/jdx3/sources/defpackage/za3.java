package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class za3 implements View.OnScrollChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ za3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ks3 ks3Var = (ks3) obj;
                View view2 = view;
                int i5 = i;
                int i6 = i2;
                int i7 = i3;
                int i8 = i4;
                ((ab3) ks3Var.g).onScrollChange(view2, i5, i6, i7, i8);
                ArrayList arrayList = (ArrayList) ks3Var.h;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    int i10 = i8;
                    int i11 = i7;
                    int i12 = i6;
                    int i13 = i5;
                    View view3 = view2;
                    ((View.OnScrollChangeListener) obj2).onScrollChange(view3, i13, i12, i11, i10);
                    view2 = view3;
                    i5 = i13;
                    i6 = i12;
                    i7 = i11;
                    i8 = i10;
                }
                break;
            case 1:
                ((x79) obj).O();
                break;
            case 2:
                noc nocVar = (noc) obj;
                if (i != i3) {
                    nocVar.a();
                    break;
                }
                break;
            default:
                vml.c(new mni(((uvi) obj).a, (byte) 3));
                break;
        }
    }
}
